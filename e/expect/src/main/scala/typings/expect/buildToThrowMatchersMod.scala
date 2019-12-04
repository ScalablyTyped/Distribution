package typings.expect

import typings.expect.buildTypesMod.MatchersObject
import typings.expect.buildTypesMod.RawMatcherFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect/build/toThrowMatchers", JSImport.Namespace)
@js.native
object buildToThrowMatchersMod extends js.Object {
  val default: MatchersObject = js.native
  def createMatcher(matcherName: String): RawMatcherFn = js.native
  def createMatcher(matcherName: String, fromPromise: Boolean): RawMatcherFn = js.native
}

