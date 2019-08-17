package typings.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcNotificationMod {
  import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
  import typings.atGoogleDashCloudCommon.buildSrcUtilMod.ResponseBody
  import typings.std.Error

  type DeleteNotificationCallback = js.Function2[/* err */ Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
  type GetNotificationCallback = js.Function3[
    /* err */ Error | Null, 
    /* notification */ js.UndefOr[Notification | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetNotificationMetadataCallback = js.Function3[
    /* err */ Error | Null, 
    /* metadata */ js.UndefOr[ResponseBody], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetNotificationMetadataResponse = js.Tuple2[ResponseBody, Metadata]
  type GetNotificationResponse = js.Tuple2[Notification, Metadata]
}
