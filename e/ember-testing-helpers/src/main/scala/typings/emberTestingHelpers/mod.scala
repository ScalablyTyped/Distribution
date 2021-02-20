package typings.emberTestingHelpers

import typings.jquery.JQuery
import typings.rsvp.mod.default.Promise
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/and_then.js
    @JSGlobal("andThen")
    @js.native
    def andThen[T](callback: js.Function1[/* repeated */ js.Any, T]): Promise[T] = js.native
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/click.js
    @JSGlobal("click")
    @js.native
    def click(selector: String): WaitResult[Unit] = js.native
    @JSGlobal("click")
    @js.native
    def click(selector: String, context: js.Object): WaitResult[Unit] = js.native
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_path.js
    @JSGlobal("currentPath")
    @js.native
    def currentPath(): String = js.native
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_route_name.js
    @JSGlobal("currentRouteName")
    @js.native
    def currentRouteName(): String = js.native
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_url.js
    @JSGlobal("currentURL")
    @js.native
    def currentURL(): String = js.native
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/fill_in.js
    @JSGlobal("fillIn")
    @js.native
    def fillIn(selector: String, context: js.Object, text: String): WaitResult[Unit] = js.native
    @JSGlobal("fillIn")
    @js.native
    def fillIn(selector: String, text: String): WaitResult[Unit] = js.native
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/find.js
    @JSGlobal("find")
    @js.native
    def find(selector: String): JQuery[Node] = js.native
    @JSGlobal("find")
    @js.native
    def find(selector: String, context: js.Object): JQuery[Node] = js.native
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/find_with_assert.js
    @JSGlobal("findWithAssert")
    @js.native
    def findWithAssert(selector: String): JQuery[Node] = js.native
    @JSGlobal("findWithAssert")
    @js.native
    def findWithAssert(selector: String, context: js.Object): JQuery[Node] = js.native
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/key_event.js
    @JSGlobal("keyEvent")
    @js.native
    def keyEvent(selector: String, `type`: KeyEventType, keyCode: Double): WaitResult[Unit] = js.native
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/pause_test.js
    @JSGlobal("pauseTest")
    @js.native
    def pauseTest(): Promise[js.Object] = js.native
    
    @JSGlobal("resumeTest")
    @js.native
    def resumeTest(): Unit = js.native
    
    @JSGlobal("triggerEvent")
    @js.native
    def triggerEvent(selector: String, context: js.Object, `type`: String): WaitResult[Unit] = js.native
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/trigger_event.js
    @JSGlobal("triggerEvent")
    @js.native
    def triggerEvent(selector: String, context: js.Object, `type`: String, options: js.Object): WaitResult[Unit] = js.native
    @JSGlobal("triggerEvent")
    @js.native
    def triggerEvent(selector: String, `type`: String): WaitResult[Unit] = js.native
    @JSGlobal("triggerEvent")
    @js.native
    def triggerEvent(selector: String, `type`: String, options: js.Object): WaitResult[Unit] = js.native
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/visit.js
    @JSGlobal("visit")
    @js.native
    def visit[T](route: String): WaitResult[Unit] = js.native
    
    // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/wait.js
    @JSGlobal("wait")
    @js.native
    def wait_[T](value: T): WaitResult[T] = js.native
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
