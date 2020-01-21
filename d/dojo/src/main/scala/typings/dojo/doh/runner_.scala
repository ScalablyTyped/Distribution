package typings.dojo.doh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/doh/runner.html
  *
  * Functions for registering and running automated tests.
  *
  */
@js.native
trait runner_ extends js.Object {
  /**
    *
    */
  var debug: js.Object = js.native
  /**
    *
    */
  var error: js.Object = js.native
  /**
    *
    */
  var isBrowser: Boolean = js.native
  /**
    *
    */
  var registerUrl: js.Object = js.native
  /**
    *
    */
  var robot: js.Object = js.native
  /**
    *
    * @param canceller
    */
  def Deferred(canceller: js.Any): Unit = js.native
  /**
    * are the passed expected and actual objects/values deeply
    * equivalent?
    *
    * @param expected
    * @param actual
    * @param hint               Optional
    * @param doNotThrow
    */
  def assertEqual(expected: js.Object, actual: js.Object, hint: String, doNotThrow: js.Any): Unit = js.native
  /**
    * Test for a certain error to be thrown by the given function.
    *
    * @param expectedError
    * @param scope
    * @param functionName
    * @param args
    * @param hint               Optional
    */
  def assertError(expectedError: js.Object, scope: js.Object, functionName: String, args: js.Array[_], hint: String): Unit = js.native
  /**
    * is the passed item "falsey"?
    *
    * @param condition
    * @param hint               Optional
    */
  def assertFalse(condition: js.Object, hint: String): Unit = js.native
  /**
    * are the passed notexpected and actual objects/values deeply
    * not equivalent?
    *
    * @param notExpected
    * @param actual
    * @param hint               Optional
    */
  def assertNotEqual(notExpected: js.Object, actual: js.Object, hint: String): Unit = js.native
  /**
    * is the passed item "truthy"?
    *
    * @param condition
    * @param hint               Optional
    */
  def assertTrue(condition: js.Object, hint: String): Unit = js.native
  /**
    * Test for a certain error to be thrown by the given function.
    *
    * @param expectedError
    * @param scope
    * @param functionName
    * @param args
    * @param hint               Optional
    */
  def e(expectedError: js.Object, scope: js.Object, functionName: String, args: js.Array[_], hint: String): Unit = js.native
  /**
    * is the passed item "falsey"?
    *
    * @param condition
    * @param hint               Optional
    */
  def f(condition: js.Object, hint: String): Unit = js.native
  /**
    * are the passed expected and actual objects/values deeply
    * equivalent?
    *
    * @param expected
    * @param actual
    * @param hint               Optional
    * @param doNotThrow
    */
  def is(expected: js.Object, actual: js.Object, hint: String, doNotThrow: js.Any): Unit = js.native
  /**
    * are the passed notexpected and actual objects/values deeply
    * not equivalent?
    *
    * @param notExpected
    * @param actual
    * @param hint               Optional
    */
  def isNot(notExpected: js.Object, actual: js.Object, hint: String): Unit = js.native
  /**
    * halt test run. Can be resumed.
    *
    */
  def pause(): Unit = js.native
  /**
    *
    * @param a1
    * @param a2
    * @param a3
    * @param a4
    * @param a5
    */
  def register(a1: js.Any, a2: js.Any, a3: js.Any, a4: js.Any, a5: js.Any): Unit = js.native
  /**
    * Deprecated.    Won't work unless you manually load dojox.testing.DocTest, and likely not even then.
    * Gets all the doctests from the given module and register each of them as a single test case here.
    *
    * @param module dojox/dgauges/components/utils
    */
  def registerDocTests(module: js.Any): Unit = js.native
  /**
    * Deprecated.  Use doh.register(group/type, tests, setUp, tearDown) instead
    *
    * @param group
    * @param tests
    * @param setUp
    * @param tearDown
    * @param type
    */
  def registerGroup(group: String, tests: js.Array[_], setUp: js.Function, tearDown: js.Function, `type`: String): Unit = js.native
  /**
    * Deprecated.  Use doh.register(group/type, tests, setUp, tearDown) instead
    *
    * @param group
    * @param tests
    * @param setUp
    * @param tearDown
    * @param type
    */
  def registerGroup(group: String, tests: js.Function, setUp: js.Function, tearDown: js.Function, `type`: String): Unit = js.native
  /**
    * Deprecated.  Use doh.register(group/type, tests, setUp, tearDown) instead
    *
    * @param group
    * @param tests
    * @param setUp
    * @param tearDown
    * @param type
    */
  def registerGroup(group: String, tests: js.Object, setUp: js.Function, tearDown: js.Function, `type`: String): Unit = js.native
  /**
    * Deprecated.  Use doh.register(group/type, test) instead
    *
    * @param group
    * @param test
    * @param type
    */
  def registerTest(group: String, test: js.Array[_], `type`: String): Unit = js.native
  /**
    * Deprecated.  Use doh.register(group/type, test) instead
    *
    * @param group
    * @param test
    * @param type
    */
  def registerTest(group: String, test: js.Function, `type`: String): Unit = js.native
  /**
    * Deprecated.  Use doh.register(group/type, test) instead
    *
    * @param group
    * @param test
    * @param type
    */
  def registerTest(group: String, test: js.Object, `type`: String): Unit = js.native
  /**
    * Deprecated.  Use doh.register(group, ns) instead
    *
    * @param group
    * @param ns
    */
  def registerTestNs(group: String, ns: js.Object): Unit = js.native
  /**
    * Adds a test type and associates a function used to initialize each test of the given type
    *
    * @param name The name of the type.
    * @param initProc Type specific test initializer; called after the test object is created.
    */
  def registerTestType(name: String, initProc: js.Function): Unit = js.native
  /**
    * Deprecated.  Use doh.register(group/type, testArr) instead
    *
    * @param group
    * @param testArr
    * @param type
    */
  def registerTests(group: String, testArr: js.Array[_], `type`: String): Unit = js.native
  /**
    *
    */
  def run(): Unit = js.native
  /**
    * runs the specified test group
    *
    * @param groupName
    * @param idx
    */
  def runGroup(groupName: String, idx: Double): Unit = js.native
  /**
    *
    */
  def runOnLoad(): Unit = js.native
  /**
    *
    */
  def showLogPage(): Unit = js.native
  /**
    *
    */
  def showPerfTestsPage(): Unit = js.native
  /**
    *
    */
  def showTestPage(): Unit = js.native
  /**
    * is the passed item "truthy"?
    *
    * @param condition
    * @param hint               Optional
    */
  def t(condition: js.Object, hint: String): Unit = js.native
  /**
    *
    */
  def togglePaused(): Unit = js.native
  /**
    *
    */
  def toggleRunAll(): Unit = js.native
}

