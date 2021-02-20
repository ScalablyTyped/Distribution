package typings.globalNpm

import org.scalablytyped.runtime.Shortcut
import typings.npm.mod.NPM.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("global-npm", JSImport.Namespace)
  @js.native
  val ^ : GlobalNPM with Static = js.native
  
  @js.native
  trait GlobalNPM extends StObject {
    
    var GLOBAL_NPM_BIN: String = js.native
    
    var GLOBAL_NPM_PATH: String = js.native
  }
  object GlobalNPM {
    
    @scala.inline
    def apply(GLOBAL_NPM_BIN: String, GLOBAL_NPM_PATH: String): GlobalNPM = {
      val __obj = js.Dynamic.literal(GLOBAL_NPM_BIN = GLOBAL_NPM_BIN.asInstanceOf[js.Any], GLOBAL_NPM_PATH = GLOBAL_NPM_PATH.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalNPM]
    }
    
    @scala.inline
    implicit class GlobalNPMMutableBuilder[Self <: GlobalNPM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGLOBAL_NPM_BIN(value: String): Self = StObject.set(x, "GLOBAL_NPM_BIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGLOBAL_NPM_PATH(value: String): Self = StObject.set(x, "GLOBAL_NPM_PATH", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = GlobalNPM with Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GlobalNPM with Static = ^
}
