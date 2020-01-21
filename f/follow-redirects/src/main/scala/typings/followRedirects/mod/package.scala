package typings.followRedirects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Override[T, U] = (typings.std.Pick[T, typings.std.Exclude[java.lang.String, java.lang.String]]) with U
  type WrappedScheme[T /* <: typings.followRedirects.mod.Scheme[_, _, _] */] = typings.followRedirects.mod.Override[T, typings.followRedirects.mod.RedirectScheme[js.Any, js.Any, js.Any]]
}
