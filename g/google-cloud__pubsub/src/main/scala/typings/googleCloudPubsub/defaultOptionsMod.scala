package typings.googleCloudPubsub

import typings.googleCloudPubsub.anon.MaxDelayMillis
import typings.googleCloudPubsub.anon.MaxExtensionMinutes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/default-options", JSImport.Namespace)
@js.native
object defaultOptionsMod extends js.Object {
  @js.native
  object defaultOptions extends js.Object {
    var publish: MaxDelayMillis = js.native
    var subscription: MaxExtensionMinutes = js.native
  }
  
}

