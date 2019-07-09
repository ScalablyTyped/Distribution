package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcNotificationMod {
  type DeleteNotificationCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type GetNotificationCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* notification */ js.UndefOr[Notification | scala.Null], 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type GetNotificationMetadataCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* metadata */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcUtilMod.ResponseBody], 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type GetNotificationMetadataResponse = js.Tuple2[
    atGoogleDashCloudCommonLib.buildSrcUtilMod.ResponseBody, 
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata
  ]
  type GetNotificationResponse = js.Tuple2[Notification, atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
}
