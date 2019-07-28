package typings.atGoogleDashCloudStorage

import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcChannelMod {
  type StopCallback = js.Function2[/* err */ Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
}
