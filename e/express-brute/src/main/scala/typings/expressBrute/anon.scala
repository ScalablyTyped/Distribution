package typings.expressBrute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Reset extends StObject {
    
    var reset: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], Unit]] = js.undefined
  }
  object Reset {
    
    @scala.inline
    def apply(): Reset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reset]
    }
    
    @scala.inline
    implicit class ResetMutableBuilder[Self <: Reset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReset(value: /* callback */ js.UndefOr[js.Function0[Unit]] => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    }
  }
}
