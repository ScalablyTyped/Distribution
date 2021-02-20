package typings.emberObject

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionHandlerMod extends Shortcut {
  
  @JSImport("@ember/object/-private/action-handler", JSImport.Default)
  @js.native
  val default: typings.emberObject.mixinMod.default[ActionHandler, typings.emberObject.mod.default] = js.native
  
  /**
    * Ember.ActionHandler is available on some familiar classes including Ember.Route,
    * Ember.Component, and Ember.Controller. (Internally the mixin is used by Ember.CoreView,
    * Ember.ControllerMixin, and Ember.Route and available to the above classes through inheritance.)
    */
  @js.native
  trait ActionHandler extends StObject {
    
    /**
      * The collection of functions, keyed by name, available on this ActionHandler as action targets.
      */
    var actions: ActionsHash = js.native
    
    /**
      * Triggers a named action on the ActionHandler. Any parameters supplied after the actionName
      * string will be passed as arguments to the action target function.
      *
      * If the ActionHandler has its target property set, actions may bubble to the target.
      * Bubbling happens when an actionName can not be found in the ActionHandler's actions
      * hash or if the action target function returns true.
      */
    def send(actionName: String, args: js.Any*): Unit = js.native
  }
  object ActionHandler {
    
    @scala.inline
    def apply(actions: ActionsHash, send: (String, /* repeated */ js.Any) => Unit): ActionHandler = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], send = js.Any.fromFunction2(send))
      __obj.asInstanceOf[ActionHandler]
    }
    
    @scala.inline
    implicit class ActionHandlerMutableBuilder[Self <: ActionHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: ActionsHash): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSend(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    }
  }
  
  type ActionsHash = StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  
  type _To = typings.emberObject.mixinMod.default[ActionHandler, typings.emberObject.mod.default]
  
  /* This means you don't have to write `default`, but can instead just say `actionHandlerMod.foo` */
  override def _to: typings.emberObject.mixinMod.default[ActionHandler, typings.emberObject.mod.default] = default
}
