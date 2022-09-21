package typings.easyJsend

import typings.easyJsend.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Express {
  
  trait MakePartialInput extends StObject {
    
    var model: Any
    
    var opts: Limit
    
    var result: Any
    
    var search: js.Object
  }
  object MakePartialInput {
    
    inline def apply(model: Any, opts: Limit, result: Any, search: js.Object): MakePartialInput = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[MakePartialInput]
    }
    
    extension [Self <: MakePartialInput](x: Self) {
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setOpts(value: Limit): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: js.Object): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  trait PartialInput extends StObject {
    
    var count: Double
    
    var data: Any
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: Double
  }
  object PartialInput {
    
    inline def apply(count: Double, data: Any, offset: Double): PartialInput = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialInput]
    }
    
    extension [Self <: PartialInput](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    def error(err: Any): Unit = js.native
    def error(err: Any, status: Double): Unit = js.native
    
    def fail(data: Any): Unit = js.native
    def fail(data: Any, status: Double): Unit = js.native
    
    var makePartial: js.UndefOr[js.Function1[/* data */ MakePartialInput, Unit]] = js.native
    
    var partial: js.UndefOr[js.Function2[/* data */ PartialInput, /* status */ js.UndefOr[Double], Unit]] = js.native
    
    def success(): Unit = js.native
    def success(data: Any): Unit = js.native
    def success(data: Any, status: Double): Unit = js.native
    def success(data: Unit, status: Double): Unit = js.native
  }
}
