package typings.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcChannelMod {
  import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
  import typings.std.Error

  type StopCallback = js.Function2[/* err */ Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
}
