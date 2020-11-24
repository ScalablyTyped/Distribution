package typings.emberTestingHelpers.mod

import typings.jquery.JQuery
import typings.rsvp.mod.default.Promise
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/and_then.js
  def andThen[T](callback: js.Function1[/* repeated */ js.Any, T]): Promise[T] = js.native
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/click.js
  def click(selector: String): WaitResult[Unit] = js.native
  def click(selector: String, context: js.Object): WaitResult[Unit] = js.native
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_path.js
  def currentPath(): String = js.native
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_route_name.js
  def currentRouteName(): String = js.native
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_url.js
  def currentURL(): String = js.native
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/fill_in.js
  def fillIn(selector: String, context: js.Object, text: String): WaitResult[Unit] = js.native
  def fillIn(selector: String, text: String): WaitResult[Unit] = js.native
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/find.js
  def find(selector: String): JQuery[Node] = js.native
  def find(selector: String, context: js.Object): JQuery[Node] = js.native
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/find_with_assert.js
  def findWithAssert(selector: String): JQuery[Node] = js.native
  def findWithAssert(selector: String, context: js.Object): JQuery[Node] = js.native
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/key_event.js
  def keyEvent(selector: String, `type`: KeyEventType, keyCode: Double): WaitResult[Unit] = js.native
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/pause_test.js
  def pauseTest(): Promise[js.Object] = js.native
  
  def resumeTest(): Unit = js.native
  
  def triggerEvent(selector: String, context: js.Object, `type`: String): WaitResult[Unit] = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/trigger_event.js
  def triggerEvent(selector: String, context: js.Object, `type`: String, options: js.Object): WaitResult[Unit] = js.native
  def triggerEvent(selector: String, `type`: String): WaitResult[Unit] = js.native
  def triggerEvent(selector: String, `type`: String, options: js.Object): WaitResult[Unit] = js.native
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/visit.js
  def visit[T](route: String): WaitResult[Unit] = js.native
  
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/wait.js
  def wait[T](value: T): WaitResult[T] = js.native
}
