package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Publish the results of a DlpJob to a pub sub channel. Compatible with:
  * Inspect, Risk
  */
@js.native
trait Schema$GooglePrivacyDlpV2PublishToPubSub extends js.Object {
  /**
    * Cloud Pub/Sub topic to send notifications to. The topic must have given
    * publishing access rights to the DLP API service account executing the
    * long running DlpJob sending the notifications. Format is
    * projects/{project}/topics/{topic}.
    */
  var topic: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2PublishToPubSub {
  @scala.inline
  def apply(topic: String = null): Schema$GooglePrivacyDlpV2PublishToPubSub = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2PublishToPubSub]
  }
}

