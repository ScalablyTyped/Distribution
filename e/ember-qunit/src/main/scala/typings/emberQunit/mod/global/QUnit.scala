package typings.emberQunit.mod.global

import typings.emberTestHelpers.mod.TestContext
import typings.qunit.mod.global.Assert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QUnit extends js.Object {
  
  /**
    * Adds a test to exclusively run, preventing all other tests from running.
    *
    * Use this method to focus your test suite on a specific test. QUnit.only
    * will cause any other tests in your suite to be ignored.
    *
    * Note, that if more than one QUnit.only is present only the first instance
    * will run.
    *
    * This is an alternative to filtering tests to run in the HTML reporter. It
    * is especially useful when you use a console reporter or in a codebase
    * with a large set of long running tests.
    *
    * @param name Title of unit being tested
    * @param callback Function to close over assertions
    */
  def only(
    name: String,
    callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]
  ): Unit = js.native
  
  /**
    * Adds a test like object to be skipped.
    *
    * Use this method to replace QUnit.test() instead of commenting out entire
    * tests.
    *
    * This test's prototype will be listed on the suite as a skipped test,
    * ignoring the callback argument and the respective global and module's
    * hooks.
    *
    * @param name Title of unit being tested
    * @param callback Function to close over assertions
    */
  def skip(name: String): Unit = js.native
  def skip(
    name: String,
    callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]
  ): Unit = js.native
  
  /**
    * Add a test to run.
    *
    * Add a test to run using `QUnit.test()`.
    *
    * The `assert` argument to the callback contains all of QUnit's assertion
    * methods. Use this argument to call your test assertions.
    *
    * `QUnit.test()` can automatically handle the asynchronous resolution of a
    * Promise on your behalf if you return a thenable Promise as the result of
    * your callback function.
    *
    * @param name Title of unit being tested
    * @param callback Function to close over assertions
    */
  def test(
    name: String,
    callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]
  ): Unit = js.native
  
  /**
    * Use this method to test a unit of code which is still under development (in a “todo” state).
    * The test will pass as long as one failing assertion is present.
    *
    * If all assertions pass, then the test will fail signaling that `QUnit.todo` should
    * be replaced by `QUnit.test`.
    *
    * @param name Title of unit being tested
    * @param callback Function to close over assertions
    */
  def todo(
    name: String,
    callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit | js.Promise[Unit]]
  ): Unit = js.native
}
