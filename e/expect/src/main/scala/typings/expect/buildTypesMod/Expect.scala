package typings.expect.buildTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expect.Anon_Actual
import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expect extends /* id */ StringDictionary[AsymmetricMatcher] {
  var not: StringDictionary[AsymmetricMatcher] = js.native
  def apply[T](actual: T): Matchers[T] = js.native
  def addSnapshotSerializer(arg0: js.Any): Unit = js.native
  def any(expectedObject: js.Any): AsymmetricMatcher = js.native
  def anything(): AsymmetricMatcher = js.native
  def arrayContaining(sample: js.Array[_]): AsymmetricMatcher = js.native
  def assertions(arg0: Double): Unit = js.native
  def extend(arg0: js.Any): Unit = js.native
  def extractExpectedAssertionsErrors(): js.Array[Anon_Actual] = js.native
  def getState(): MatcherState = js.native
  def hasAssertions(): Unit = js.native
  def objectContaining(sample: Record[String, _]): AsymmetricMatcher = js.native
  def setState(arg0: js.Any): Unit = js.native
  def stringContaining(expected: String): AsymmetricMatcher = js.native
  def stringMatching(expected: String): AsymmetricMatcher = js.native
  def stringMatching(expected: RegExp): AsymmetricMatcher = js.native
}

