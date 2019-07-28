package typings.featherDashRouteDashMatcher

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object featherDashRouteDashMatcherMod {
  type Matcher[T] = js.Function1[/* path */ String, Match[T]]
  type RouteConfig[T] = StringDictionary[T]
}
