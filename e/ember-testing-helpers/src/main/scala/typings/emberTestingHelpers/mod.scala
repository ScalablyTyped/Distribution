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
    inline def andThen[T](callback: js.Function1[/* repeated */ Any, T]): Promise[T] = js.Dynamic.global.applyDynamic("andThen")(callback.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/click.js
    inline def click(selector: String): WaitResult[Unit] = js.Dynamic.global.applyDynamic("click")(selector.asInstanceOf[js.Any]).asInstanceOf[WaitResult[Unit]]
    inline def click(selector: String, context: js.Object): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("click")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_path.js
    inline def currentPath(): String = js.Dynamic.global.applyDynamic("currentPath")().asInstanceOf[String]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_route_name.js
    inline def currentRouteName(): String = js.Dynamic.global.applyDynamic("currentRouteName")().asInstanceOf[String]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_url.js
    inline def currentURL(): String = js.Dynamic.global.applyDynamic("currentURL")().asInstanceOf[String]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/fill_in.js
    inline def fillIn(selector: String, context: js.Object, text: String): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("fillIn")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    inline def fillIn(selector: String, text: String): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("fillIn")(selector.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/find.js
    inline def find(selector: String): JQuery[Node] = js.Dynamic.global.applyDynamic("find")(selector.asInstanceOf[js.Any]).asInstanceOf[JQuery[Node]]
    inline def find(selector: String, context: js.Object): JQuery[Node] = (js.Dynamic.global.applyDynamic("find")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[JQuery[Node]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/find_with_assert.js
    inline def findWithAssert(selector: String): JQuery[Node] = js.Dynamic.global.applyDynamic("findWithAssert")(selector.asInstanceOf[js.Any]).asInstanceOf[JQuery[Node]]
    inline def findWithAssert(selector: String, context: js.Object): JQuery[Node] = (js.Dynamic.global.applyDynamic("findWithAssert")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[JQuery[Node]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/key_event.js
    inline def keyEvent(selector: String, `type`: KeyEventType, keyCode: Double): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("keyEvent")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], keyCode.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/pause_test.js
    inline def pauseTest(): Promise[js.Object] = js.Dynamic.global.applyDynamic("pauseTest")().asInstanceOf[Promise[js.Object]]
    
    inline def resumeTest(): Unit = js.Dynamic.global.applyDynamic("resumeTest")().asInstanceOf[Unit]
    
    inline def triggerEvent(selector: String, context: js.Object, `type`: String): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("triggerEvent")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/trigger_event.js
    inline def triggerEvent(selector: String, context: js.Object, `type`: String, options: js.Object): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("triggerEvent")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    inline def triggerEvent(selector: String, `type`: String): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("triggerEvent")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    inline def triggerEvent(selector: String, `type`: String, options: js.Object): WaitResult[Unit] = (js.Dynamic.global.applyDynamic("triggerEvent")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WaitResult[Unit]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/visit.js
    inline def visit[T](route: String): WaitResult[Unit] = js.Dynamic.global.applyDynamic("visit")(route.asInstanceOf[js.Any]).asInstanceOf[WaitResult[Unit]]
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/wait.js
    inline def wait_[T](value: T): WaitResult[T] = js.Dynamic.global.applyDynamic("wait")(value.asInstanceOf[js.Any]).asInstanceOf[WaitResult[T]]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emberTestingHelpers.emberTestingHelpersStrings.keydown
    - typings.emberTestingHelpers.emberTestingHelpersStrings.keyup
    - typings.emberTestingHelpers.emberTestingHelpersStrings.keypress
  */
  trait KeyEventType extends StObject
  object KeyEventType {
    
    inline def keydown: typings.emberTestingHelpers.emberTestingHelpersStrings.keydown = "keydown".asInstanceOf[typings.emberTestingHelpers.emberTestingHelpersStrings.keydown]
    
    inline def keypress: typings.emberTestingHelpers.emberTestingHelpersStrings.keypress = "keypress".asInstanceOf[typings.emberTestingHelpers.emberTestingHelpersStrings.keypress]
    
    inline def keyup: typings.emberTestingHelpers.emberTestingHelpersStrings.keyup = "keyup".asInstanceOf[typings.emberTestingHelpers.emberTestingHelpersStrings.keyup]
  }
  
  type WaitResult[T] = Promise[T]
}
