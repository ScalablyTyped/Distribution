package typings.electronLoadDevtool

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("electron-load-devtool", JSImport.Namespace)
  @js.native
  val ^ : ElectronLoadDevtool = js.native
  
  @js.native
  trait ElectronLoadDevtool extends StObject {
    
    def apply(devtoolId: String): Unit = js.native
    def apply(devtoolId: String, options: ElectronLoadDevtoolOptions): Unit = js.native
    
    var ANGULARJS_BATARANG: String = js.native
    
    var BACKBONE_DEBUGGER: String = js.native
    
    var EMBER_INSPECTOR: String = js.native
    
    var JQUERY_DEBUGGER: String = js.native
    
    var REACT_DEVELOPER_TOOLS: String = js.native
    
    var REDUX_DEVTOOLS: String = js.native
    
    var VUEJS_DEVTOOLS: String = js.native
    
    var VUEJS_DEVTOOLS_BETA: String = js.native
  }
  
  trait ElectronLoadDevtoolOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var profile: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object ElectronLoadDevtoolOptions {
    
    @scala.inline
    def apply(): ElectronLoadDevtoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElectronLoadDevtoolOptions]
    }
    
    @scala.inline
    implicit class ElectronLoadDevtoolOptionsMutableBuilder[Self <: ElectronLoadDevtoolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type _To = ElectronLoadDevtool
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ElectronLoadDevtool = ^
}
