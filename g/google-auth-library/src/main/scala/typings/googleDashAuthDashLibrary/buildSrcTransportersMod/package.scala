package typings.googleDashAuthDashLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcTransportersMod {
  import typings.gaxios.buildSrcCommonMod.GaxiosResponse
  import typings.std.Error

  type BodyResponseCallback[T] = js.Function2[/* err */ Error | Null, /* res */ js.UndefOr[GaxiosResponse[T] | Null], Unit]
}
