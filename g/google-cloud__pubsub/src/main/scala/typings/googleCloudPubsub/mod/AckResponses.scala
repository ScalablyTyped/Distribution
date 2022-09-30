package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.googleCloudPubsubStrings.FAILED_PRECONDITION
import typings.googleCloudPubsub.googleCloudPubsubStrings.INVALID
import typings.googleCloudPubsub.googleCloudPubsubStrings.OTHER
import typings.googleCloudPubsub.googleCloudPubsubStrings.PERMISSION_DENIED
import typings.googleCloudPubsub.googleCloudPubsubStrings.SUCCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AckResponses {
  
  @JSImport("@google-cloud/pubsub", "AckResponses")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/pubsub", "AckResponses.FailedPrecondition")
  @js.native
  def FailedPrecondition: FAILED_PRECONDITION = js.native
  inline def FailedPrecondition_=(x: FAILED_PRECONDITION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FailedPrecondition")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/pubsub", "AckResponses.Invalid")
  @js.native
  def Invalid: INVALID = js.native
  inline def Invalid_=(x: INVALID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invalid")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/pubsub", "AckResponses.Other")
  @js.native
  def Other: OTHER = js.native
  inline def Other_=(x: OTHER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Other")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/pubsub", "AckResponses.PermissionDenied")
  @js.native
  def PermissionDenied: PERMISSION_DENIED = js.native
  inline def PermissionDenied_=(x: PERMISSION_DENIED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PermissionDenied")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/pubsub", "AckResponses.Success")
  @js.native
  def Success: SUCCESS = js.native
  inline def Success_=(x: SUCCESS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
}
