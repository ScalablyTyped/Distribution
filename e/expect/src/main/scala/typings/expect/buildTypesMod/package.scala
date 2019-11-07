package typings.expect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Record

  type AsymmetricMatcher = Record[String, js.Any]
  type AsyncExpectationResult = js.Promise[SyncExpectationResult]
  type ExpectationResult = SyncExpectationResult | AsyncExpectationResult
  type MatchersObject = StringDictionary[RawMatcherFn]
  type PromiseMatcherFn = js.Function1[/* actual */ js.Any, js.Promise[Unit]]
  type Tester = js.Function2[/* a */ js.Any, /* b */ js.Any, js.UndefOr[Boolean]]
  type ThrowingMatcherFn = js.Function1[/* actual */ js.Any, Unit]
}
