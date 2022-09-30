package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.subscriberMod.AckResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/pubsub", "AckError")
@js.native
open class AckError protected ()
  extends typings.googleCloudPubsub.subscriptionMod.AckError {
  def this(errorCode: AckResponse) = this()
  def this(errorCode: AckResponse, message: String) = this()
}
