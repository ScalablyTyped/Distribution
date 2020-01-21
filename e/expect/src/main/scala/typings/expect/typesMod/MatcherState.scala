package typings.expect.typesMod

import typings.expect.AnonIterableEquality
import typings.expect.TypeofjestMatcherUtils
import typings.jestTypes.configMod.Path
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherState extends js.Object {
  var assertionCalls: Double = js.native
  var currentTestName: js.UndefOr[String] = js.native
  var dontThrow: js.UndefOr[js.Function0[Unit]] = js.native
  var error: js.UndefOr[Error] = js.native
  var expand: js.UndefOr[Boolean] = js.native
  var expectedAssertionsNumber: js.UndefOr[Double] = js.native
  var isExpectingAssertions: js.UndefOr[Boolean] = js.native
  var isNot: Boolean = js.native
  var promise: String = js.native
  var suppressedErrors: js.Array[Error] = js.native
  var testPath: js.UndefOr[Path] = js.native
  var utils: TypeofjestMatcherUtils with AnonIterableEquality = js.native
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester]): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean = js.native
}

