package typings.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object notificationMod {
  
  type DeleteNotificationCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetNotificationCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* notification */ js.UndefOr[typings.googleCloudStorage.notificationMod.Notification | scala.Null], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetNotificationMetadataCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* metadata */ js.UndefOr[typings.googleCloudCommon.utilMod.ResponseBody], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetNotificationMetadataResponse = js.Tuple2[
    typings.googleCloudCommon.utilMod.ResponseBody, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type GetNotificationResponse = js.Tuple2[
    typings.googleCloudStorage.notificationMod.Notification, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
