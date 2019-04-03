package typings
package followDashRedirectsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object followDashRedirectsMod {
  type Override[T, U] = (stdLib.Pick[T, stdLib.Exclude[java.lang.String, java.lang.String]]) with U
  type WrappedScheme[T /* <: Scheme[_, _, _] */] = Override[T, RedirectScheme[js.Any, js.Any, js.Any]]
}
