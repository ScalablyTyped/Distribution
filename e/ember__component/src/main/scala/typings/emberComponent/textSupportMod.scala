package typings.emberComponent

import org.scalablytyped.runtime.Shortcut
import typings.emberComponent.targetActionSupportMod.TargetActionSupport
import typings.emberComponent.targetActionSupportMod.TriggerActionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textSupportMod extends Shortcut {
  
  @JSImport("@ember/component/-private/text-support", JSImport.Default)
  @js.native
  val default: typings.emberObject.mixinMod.default[TextSupport, typings.emberObject.mod.default] = js.native
  
  /**
    * `TextSupport` is a shared mixin used by both `Ember.TextField` and
    * `Ember.TextArea`. `TextSupport` adds a number of methods that allow you to
    * specify a controller action to invoke when a certain event is fired on your
    * text field or textarea. The specifed controller action would get the current
    * value of the field passed in as the only argument unless the value of
    * the field is empty. In that case, the instance of the field itself is passed
    * in as the only argument.
    */
  @js.native
  trait TextSupport extends TargetActionSupport {
    
    var action: String = js.native
    
    var bubbles: Boolean = js.native
    
    def cancel(event: js.Function): Unit = js.native
    
    def focusIn(event: js.Function): Unit = js.native
    
    def focusOut(event: js.Function): Unit = js.native
    
    def insertNewLine(event: js.Function): Unit = js.native
    
    def keyPress(event: js.Function): Unit = js.native
    
    var onEvent: String = js.native
  }
  object TextSupport {
    
    @scala.inline
    def apply(
      action: String,
      bubbles: Boolean,
      cancel: js.Function => Unit,
      focusIn: js.Function => Unit,
      focusOut: js.Function => Unit,
      insertNewLine: js.Function => Unit,
      keyPress: js.Function => Unit,
      onEvent: String,
      triggerAction: TriggerActionOptions => Boolean
    ): TextSupport = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancel = js.Any.fromFunction1(cancel), focusIn = js.Any.fromFunction1(focusIn), focusOut = js.Any.fromFunction1(focusOut), insertNewLine = js.Any.fromFunction1(insertNewLine), keyPress = js.Any.fromFunction1(keyPress), onEvent = onEvent.asInstanceOf[js.Any], triggerAction = js.Any.fromFunction1(triggerAction))
      __obj.asInstanceOf[TextSupport]
    }
    
    @scala.inline
    implicit class TextSupportMutableBuilder[Self <: TextSupport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancel(value: js.Function => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusIn(value: js.Function => Unit): Self = StObject.set(x, "focusIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusOut(value: js.Function => Unit): Self = StObject.set(x, "focusOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertNewLine(value: js.Function => Unit): Self = StObject.set(x, "insertNewLine", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyPress(value: js.Function => Unit): Self = StObject.set(x, "keyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEvent(value: String): Self = StObject.set(x, "onEvent", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = typings.emberObject.mixinMod.default[TextSupport, typings.emberObject.mod.default]
  
  /* This means you don't have to write `default`, but can instead just say `textSupportMod.foo` */
  override def _to: typings.emberObject.mixinMod.default[TextSupport, typings.emberObject.mod.default] = default
}
