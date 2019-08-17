package typings.featherDashRouteDashMatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object featherDashRouteDashMatcherMod {
  import org.scalablytyped.runtime.StringDictionary

  type Matcher[T] = js.Function1[/* path */ String, Match[T]]
  type RouteConfig[T] = StringDictionary[T]
}
