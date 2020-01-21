package typings.emberMocha.mod

import typings.emberMocha.mochaAfterEach
import typings.emberMocha.mochaBeforeEach
import typings.mocha.Mocha_.AsyncFunc
import typings.mocha.Mocha_.Func
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestHooks extends js.Object {
  @JSName("afterEach")
  var afterEach_Original: mochaAfterEach = js.native
  @JSName("beforeEach")
  var beforeEach_Original: mochaBeforeEach = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def afterEach(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def afterEach(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def afterEach(name: String): Unit = js.native
  def afterEach(name: String, fn: AsyncFunc): Unit = js.native
  def afterEach(name: String, fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def beforeEach(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def beforeEach(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def beforeEach(name: String): Unit = js.native
  def beforeEach(name: String, fn: AsyncFunc): Unit = js.native
  def beforeEach(name: String, fn: Func): Unit = js.native
}

