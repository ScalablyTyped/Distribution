package typings.flightplan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Exec extends StObject {
    
    var exec: js.Any = js.native
  }
  object Exec {
    
    @scala.inline
    def apply(exec: js.Any): Exec = {
      val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exec]
    }
    
    @scala.inline
    implicit class ExecMutableBuilder[Self <: Exec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExec(value: js.Any): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    }
  }
}
