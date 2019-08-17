package typings.followDashRedirects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object followDashRedirectsMod {
  import typings.std.Exclude
  import typings.std.Pick

  type Override[T, U] = (Pick[T, Exclude[String, String]]) with U
  type WrappedScheme[T /* <: Scheme[_, _, _] */] = Override[T, RedirectScheme[js.Any, js.Any, js.Any]]
}
