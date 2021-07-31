package typings.emberTestingHelpers

import typings.jquery.JQuery
import typings.rsvp.mod.default.Promise
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/and_then.js
    @scala.inline
    def andThen[T](callback: js.Function1[/* repeated */ js.Any, T]): Promise[T] = js.Dynamic.global.applyDynamic("andThen")(callback.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/click.js
    @scala.inline
    def click(selector: String): WaitResult[Unit] = js.Dynamic.global.applyDynamic("click")(selector.asInstanceOf[js.Any]).asInstanceOf[WaitResult[Unit]]
    @scala.inline
    def click(selector: String, context: js.Object): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("click")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_path.js
    @scala.inline
    def currentPath(): String = js.Dynamic.global.applyDynamic("currentPath")().asInstanceOf[String]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_route_name.js
    @scala.inline
    def currentRouteName(): String = js.Dynamic.global.applyDynamic("currentRouteName")().asInstanceOf[String]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_url.js
    @scala.inline
    def currentURL(): String = js.Dynamic.global.applyDynamic("currentURL")().asInstanceOf[String]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/fill_in.js
    @scala.inline
    def fillIn(selector: String, context: js.Object, text: String): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("fillIn")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    @scala.inline
    def fillIn(selector: String, text: String): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("fillIn")(selector.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/find.js
    @scala.inline
    def find(selector: String): JQuery[Node] = js.Dynamic.global.applyDynamic("find")(selector.asInstanceOf[js.Any]).asInstanceOf[JQuery[Node]]
    @scala.inline
    def find(selector: String, context: js.Object): JQuery[Node] = (js.Dynamic.global.applyDynamic("find")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[JQuery[Node]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/find_with_assert.js
    @scala.inline
    def findWithAssert(selector: String): JQuery[Node] = js.Dynamic.global.applyDynamic("findWithAssert")(selector.asInstanceOf[js.Any]).asInstanceOf[JQuery[Node]]
    @scala.inline
    def findWithAssert(selector: String, context: js.Object): JQuery[Node] = (js.Dynamic.global.applyDynamic("findWithAssert")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[JQuery[Node]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/key_event.js
    @scala.inline
    def keyEvent(selector: String, `type`: KeyEventType, keyCode: Double): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("keyEvent")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], keyCode.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/pause_test.js
    @scala.inline
    def pauseTest(): Promise[js.Object] = js.Dynamic.global.applyDynamic("pauseTest")().asInstanceOf[Promise[js.Object]]
    
    @scala.inline
    def resumeTest(): Unit = js.Dynamic.global.applyDynamic("resumeTest")().asInstanceOf[Unit]
    
    @scala.inline
    def triggerEvent(selector: String, context: js.Object, `type`: String): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("triggerEvent")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/trigger_event.js
    @scala.inline
    def triggerEvent(selector: String, context: js.Object, `type`: String, options: js.Object): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("triggerEvent")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    @scala.inline
    def triggerEvent(selector: String, `type`: String): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("triggerEvent")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    @scala.inline
    def triggerEvent(selector: String, `type`: String, options: js.Object): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("triggerEvent")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/visit.js
    @scala.inline
    def visit[T](route: String): WaitResult[Unit] = js.Dynamic.global.applyDynamic("visit")(route.asInstanceOf[js.Any]).asInstanceOf[WaitResult[Unit]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/wait.js
    @scala.inline
    def wait_[T](value: T): WaitResult[T] = js.Dynamic.global.applyDynamic("wait")(value.asInstanceOf[js.Any]).asInstanceOf[WaitResult[T]]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emberTestingHelpers.emberTestingHelpersStrings.keydown
    - typings.emberTestingHelpers.emberTestingHelpersStrings.keyup
    - typings.emberTestingHelpers.emberTestingHelpersStrings.keypress
  */
  trait KeyEventType extends StObject
  object KeyEventType {
    
    @scala.inline
    def keydown: typings.emberTestingHelpers.emberTestingHelpersStrings.keydown = "keydown".asInstanceOf[typings.emberTestingHelpers.emberTestingHelpersStrings.keydown]
    
    @scala.inline
    def keypress: typings.emberTestingHelpers.emberTestingHelpersStrings.keypress = "keypress".asInstanceOf[typings.emberTestingHelpers.emberTestingHelpersStrings.keypress]
    
    @scala.inline
    def keyup: typings.emberTestingHelpers.emberTestingHelpersStrings.keyup = "keyup".asInstanceOf[typings.emberTestingHelpers.emberTestingHelpersStrings.keyup]
  }
  
  type WaitResult[T] = Promise[T]
}
