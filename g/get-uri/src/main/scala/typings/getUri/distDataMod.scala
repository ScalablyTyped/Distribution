package typings.getUri

import typings.getUri.mod.GetUriOptions
import typings.node.streamMod.Readable
import typings.node.urlMod.UrlWithStringQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDataMod {
  
  @JSImport("get-uri/dist/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: UrlWithStringQuery, param1: DataOptions): js.Promise[Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Readable]]
  
  trait DataOptions
    extends StObject
       with GetUriOptions {
    
    @JSName("cache")
    var cache_DataOptions: js.UndefOr[DataReadable] = js.undefined
  }
  object DataOptions {
    
    inline def apply(): DataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: DataReadable): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
  
  @js.native
  trait DataReadable extends Readable {
    
    var hash: js.UndefOr[String] = js.native
  }
}
