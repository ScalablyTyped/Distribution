package typings.atGoogleDashCloudPubsub

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.IDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageRetentionDuration extends js.Object {
  var messageRetentionDuration: js.UndefOr[IDuration | Double] = js.undefined
  var pushEndpoint: js.UndefOr[String] = js.undefined
}

object Anon_MessageRetentionDuration {
  @scala.inline
  def apply(messageRetentionDuration: IDuration | Double = null, pushEndpoint: String = null): Anon_MessageRetentionDuration = {
    val __obj = js.Dynamic.literal()
    if (messageRetentionDuration != null) __obj.updateDynamic("messageRetentionDuration")(messageRetentionDuration.asInstanceOf[js.Any])
    if (pushEndpoint != null) __obj.updateDynamic("pushEndpoint")(pushEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MessageRetentionDuration]
  }
}

