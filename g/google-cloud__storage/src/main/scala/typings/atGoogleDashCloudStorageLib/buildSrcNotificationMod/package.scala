package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcNotificationMod {
  type DeleteNotificationCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type GetNotificationCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* notification */ js.UndefOr[Notification | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type GetNotificationMetadataCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* metadata */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcUtilMod.ResponseBody], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type GetNotificationMetadataResponse = js.Tuple2[
    atGoogleDashCloudCommonLib.buildSrcUtilMod.ResponseBody, 
    requestLib.requestMod.requestNs.Response
  ]
  type GetNotificationResponse = js.Tuple2[Notification, requestLib.requestMod.requestNs.Response]
}
