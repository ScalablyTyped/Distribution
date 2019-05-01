package typings
package emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/and_then.js
  def andThen[T](callback: js.Function1[/* repeated */ js.Any, T]): rsvpLib.rsvpMod.defaultNs.Promise[T] = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/click.js
  def click(selector: java.lang.String): emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.WaitResult[scala.Unit] = js.native
  def click(selector: java.lang.String, context: js.Object): emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.WaitResult[scala.Unit] = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_path.js
  def currentPath(): java.lang.String = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_route_name.js
  def currentRouteName(): java.lang.String = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/current_url.js
  def currentURL(): java.lang.String = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/fill_in.js
  def fillIn(selector: java.lang.String, context: js.Object, text: java.lang.String): emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.WaitResult[scala.Unit] = js.native
  def fillIn(selector: java.lang.String, text: java.lang.String): emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.WaitResult[scala.Unit] = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/find.js
  def find(selector: java.lang.String): jqueryLib.JQuery[stdLib.Node] = js.native
  def find(selector: java.lang.String, context: js.Object): jqueryLib.JQuery[stdLib.Node] = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/find_with_assert.js
  def findWithAssert(selector: java.lang.String): jqueryLib.JQuery[stdLib.Node] = js.native
  def findWithAssert(selector: java.lang.String, context: js.Object): jqueryLib.JQuery[stdLib.Node] = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/key_event.js
  def keyEvent(
    selector: java.lang.String,
    `type`: emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.KeyEventType,
    keyCode: scala.Double
  ): emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.WaitResult[scala.Unit] = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/pause_test.js
  def pauseTest(): rsvpLib.rsvpMod.defaultNs.Promise[js.Object] = js.native
  def resumeTest(): scala.Unit = js.native
  def triggerEvent(selector: java.lang.String, context: js.Object, `type`: java.lang.String): emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.WaitResult[scala.Unit] = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/trigger_event.js
  def triggerEvent(selector: java.lang.String, context: js.Object, `type`: java.lang.String, options: js.Object): emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.WaitResult[scala.Unit] = js.native
  def triggerEvent(selector: java.lang.String, `type`: java.lang.String): emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.WaitResult[scala.Unit] = js.native
  def triggerEvent(selector: java.lang.String, `type`: java.lang.String, options: js.Object): emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.WaitResult[scala.Unit] = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/visit.js
  def visit[T](route: java.lang.String): emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.WaitResult[scala.Unit] = js.native
  // https://github.com/emberjs/ember.js/blob/master/packages/ember-testing/lib/helpers/wait.js
  def wait[T](value: T): emberDashTestingDashHelpersLib.emberDashTestingDashHelpersMod.WaitResult[T] = js.native
}

