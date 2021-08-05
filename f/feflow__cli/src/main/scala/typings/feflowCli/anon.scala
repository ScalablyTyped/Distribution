package typings.feflowCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: js.Array[Double | String]
  }
  object _empty {
    
    inline def apply(_underscore: js.Array[Double | String]): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    extension [Self <: _empty](x: Self) {
      
      inline def set_underscore(value: js.Array[Double | String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      inline def set_underscoreVarargs(value: (Double | String)*): Self = StObject.set(x, "_", js.Array(value :_*))
    }
  }
}
