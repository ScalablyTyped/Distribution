package typings.feflowCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: js.Array[Double | String] = js.native
  }
  object _empty {
    
    @scala.inline
    def apply(_underscore: js.Array[Double | String]): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit class _emptyMutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_underscore(value: js.Array[Double | String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_underscoreVarargs(value: (Double | String)*): Self = StObject.set(x, "_", js.Array(value :_*))
    }
  }
}
