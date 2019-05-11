package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageRetentionDuration extends js.Object {
  var messageRetentionDuration: js.UndefOr[
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDuration | scala.Double
  ] = js.undefined
  var pushEndpoint: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MessageRetentionDuration {
  @scala.inline
  def apply(
    messageRetentionDuration: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDuration | scala.Double = null,
    pushEndpoint: java.lang.String = null
  ): Anon_MessageRetentionDuration = {
    val __obj = js.Dynamic.literal()
    if (messageRetentionDuration != null) __obj.updateDynamic("messageRetentionDuration")(messageRetentionDuration.asInstanceOf[js.Any])
    if (pushEndpoint != null) __obj.updateDynamic("pushEndpoint")(pushEndpoint)
    __obj.asInstanceOf[Anon_MessageRetentionDuration]
  }
}

