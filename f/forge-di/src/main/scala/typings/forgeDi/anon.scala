package typings.forgeDi

import typings.forgeDi.modeMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<forge-di.forge-di/dist/framework/Dependency.default> */
  @js.native
  trait Partialdefault extends StObject {
    
    var hint: js.UndefOr[String] = js.native
    
    var mode: js.UndefOr[Mode] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object Partialdefault {
    
    @scala.inline
    def apply(): Partialdefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialdefault]
    }
    
    @scala.inline
    implicit class PartialdefaultMutableBuilder[Self <: Partialdefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
