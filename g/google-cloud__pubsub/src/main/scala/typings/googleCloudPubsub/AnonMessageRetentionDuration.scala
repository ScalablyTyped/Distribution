package typings.googleCloudPubsub

import typings.googleCloudPubsub.pubsubMod.google.protobuf.IDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageRetentionDuration extends js.Object {
  var messageRetentionDuration: js.UndefOr[IDuration | Double] = js.undefined
  var pushEndpoint: js.UndefOr[String] = js.undefined
}

object AnonMessageRetentionDuration {
  @scala.inline
  def apply(messageRetentionDuration: IDuration | Double = null, pushEndpoint: String = null): AnonMessageRetentionDuration = {
    val __obj = js.Dynamic.literal()
    if (messageRetentionDuration != null) __obj.updateDynamic("messageRetentionDuration")(messageRetentionDuration.asInstanceOf[js.Any])
    if (pushEndpoint != null) __obj.updateDynamic("pushEndpoint")(pushEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageRetentionDuration]
  }
}

