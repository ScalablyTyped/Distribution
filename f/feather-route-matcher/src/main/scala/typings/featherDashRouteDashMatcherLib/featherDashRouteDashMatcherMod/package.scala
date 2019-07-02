package typings
package featherDashRouteDashMatcherLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object featherDashRouteDashMatcherMod {
  type Matcher[T] = js.Function1[/* path */ java.lang.String, Match[T]]
  type RouteConfig[T] = org.scalablytyped.runtime.StringDictionary[T]
}
