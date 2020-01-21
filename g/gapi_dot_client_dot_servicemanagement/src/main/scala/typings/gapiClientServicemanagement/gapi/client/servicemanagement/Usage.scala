package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Usage extends js.Object {
  /**
    * The full resource name of a channel used for sending notifications to the
    * service producer.
    *
    * Google Service Management currently only supports
    * [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification
    * channel. To use Google Cloud Pub/Sub as the channel, this must be the name
    * of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name format
    * documented in https://cloud.google.com/pubsub/docs/overview.
    */
  var producerNotificationChannel: js.UndefOr[String] = js.undefined
  /**
    * Requirements that must be satisfied before a consumer project can use the
    * service. Each requirement is of the form <service.name>/<requirement-id>;
    * for example 'serviceusage.googleapis.com/billing-enabled'.
    */
  var requirements: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A list of usage rules that apply to individual API methods.
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[UsageRule]] = js.undefined
}

object Usage {
  @scala.inline
  def apply(
    producerNotificationChannel: String = null,
    requirements: js.Array[String] = null,
    rules: js.Array[UsageRule] = null
  ): Usage = {
    val __obj = js.Dynamic.literal()
    if (producerNotificationChannel != null) __obj.updateDynamic("producerNotificationChannel")(producerNotificationChannel.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Usage]
  }
}

