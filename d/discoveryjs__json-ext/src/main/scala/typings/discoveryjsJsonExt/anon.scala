package typings.discoveryjsJsonExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Async extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var continueOnCircular: js.UndefOr[Boolean] = js.undefined
  }
  object Async {
    
    inline def apply(): Async = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Async]
    }
    
    extension [Self <: Async](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setContinueOnCircular(value: Boolean): Self = StObject.set(x, "continueOnCircular", value.asInstanceOf[js.Any])
      
      inline def setContinueOnCircularUndefined: Self = StObject.set(x, "continueOnCircular", js.undefined)
    }
  }
  
  trait Circular extends StObject {
    
    var async: js.Array[Any]
    
    var circular: js.Array[Any]
    
    var duplicate: js.Array[Any]
    
    var minLength: Double
  }
  object Circular {
    
    inline def apply(async: js.Array[Any], circular: js.Array[Any], duplicate: js.Array[Any], minLength: Double): Circular = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], duplicate = duplicate.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[Circular]
    }
    
    extension [Self <: Circular](x: Self) {
      
      inline def setAsync(value: js.Array[Any]): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncVarargs(value: Any*): Self = StObject.set(x, "async", js.Array(value*))
      
      inline def setCircular(value: js.Array[Any]): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularVarargs(value: Any*): Self = StObject.set(x, "circular", js.Array(value*))
      
      inline def setDuplicate(value: js.Array[Any]): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
      
      inline def setDuplicateVarargs(value: Any*): Self = StObject.set(x, "duplicate", js.Array(value*))
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    }
  }
}
