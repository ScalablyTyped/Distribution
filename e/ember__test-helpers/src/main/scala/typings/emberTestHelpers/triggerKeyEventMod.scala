package typings.emberTestHelpers

import typings.emberTestHelpers.mod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerKeyEventMod {
  
  @JSImport("@ember/test-helpers/dom/trigger-key-event", JSImport.Default)
  @js.native
  def default(target: Target, eventType: KeyEvent, key: String): js.Promise[Unit] = js.native
  @JSImport("@ember/test-helpers/dom/trigger-key-event", JSImport.Default)
  @js.native
  def default(target: Target, eventType: KeyEvent, key: String, modifiers: KeyModifiers): js.Promise[Unit] = js.native
  @JSImport("@ember/test-helpers/dom/trigger-key-event", JSImport.Default)
  @js.native
  def default(target: Target, eventType: KeyEvent, key: Double): js.Promise[Unit] = js.native
  @JSImport("@ember/test-helpers/dom/trigger-key-event", JSImport.Default)
  @js.native
  def default(target: Target, eventType: KeyEvent, key: Double, modifiers: KeyModifiers): js.Promise[Unit] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.emberTestHelpers.emberTestHelpersStrings.keydown
    - typings.emberTestHelpers.emberTestHelpersStrings.keyup
    - typings.emberTestHelpers.emberTestHelpersStrings.keypress
  */
  trait KeyEvent extends StObject
  object KeyEvent {
    
    @scala.inline
    def keydown: typings.emberTestHelpers.emberTestHelpersStrings.keydown = "keydown".asInstanceOf[typings.emberTestHelpers.emberTestHelpersStrings.keydown]
    
    @scala.inline
    def keypress: typings.emberTestHelpers.emberTestHelpersStrings.keypress = "keypress".asInstanceOf[typings.emberTestHelpers.emberTestHelpersStrings.keypress]
    
    @scala.inline
    def keyup: typings.emberTestHelpers.emberTestHelpersStrings.keyup = "keyup".asInstanceOf[typings.emberTestHelpers.emberTestHelpersStrings.keyup]
  }
  
  @js.native
  trait KeyModifiers extends StObject {
    
    var altKey: js.UndefOr[Boolean] = js.native
    
    var ctrlKey: js.UndefOr[Boolean] = js.native
    
    var metaKey: js.UndefOr[Boolean] = js.native
    
    var shiftKey: js.UndefOr[Boolean] = js.native
  }
  object KeyModifiers {
    
    @scala.inline
    def apply(): KeyModifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyModifiers]
    }
    
    @scala.inline
    implicit class KeyModifiersMutableBuilder[Self <: KeyModifiers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    }
  }
}
