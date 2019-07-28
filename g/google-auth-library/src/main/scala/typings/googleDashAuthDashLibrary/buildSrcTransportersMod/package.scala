package typings.googleDashAuthDashLibrary

import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcTransportersMod {
  type BodyResponseCallback[T] = js.Function2[/* err */ Error | Null, /* res */ js.UndefOr[GaxiosResponse[T] | Null], Unit]
}
