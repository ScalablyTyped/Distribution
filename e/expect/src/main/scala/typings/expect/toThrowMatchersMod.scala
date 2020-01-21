package typings.expect

import typings.expect.typesMod.MatchersObject
import typings.expect.typesMod.RawMatcherFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect/build/toThrowMatchers", JSImport.Namespace)
@js.native
object toThrowMatchersMod extends js.Object {
  val default: MatchersObject = js.native
  def createMatcher(matcherName: String): RawMatcherFn = js.native
  def createMatcher(matcherName: String, fromPromise: Boolean): RawMatcherFn = js.native
}

