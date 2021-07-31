package typings.forgeDi

import typings.forgeDi.modeMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependencyMod {
  
  trait Dependency extends StObject {
    
    var hint: String
    
    var mode: Mode
    
    var name: String
  }
  object Dependency {
    
    @scala.inline
    def apply(hint: String, mode: Mode, name: String): Dependency = {
      val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependency]
    }
    
    @scala.inline
    implicit class DependencyMutableBuilder[Self <: Dependency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
