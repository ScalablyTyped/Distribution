package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.TopicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherOptions extends js.Object {
  var batching: js.UndefOr[atGoogleDashCloudPubsubLib.Anon_MaxBytesMaxMessages] = js.undefined
}

object PublisherOptions {
  @scala.inline
  def apply(batching: atGoogleDashCloudPubsubLib.Anon_MaxBytesMaxMessages = null): PublisherOptions = {
    val __obj = js.Dynamic.literal()
    if (batching != null) __obj.updateDynamic("batching")(batching)
    __obj.asInstanceOf[PublisherOptions]
  }
}

