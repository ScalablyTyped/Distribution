package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var producerNotificationChannel: js.UndefOr[String] = js.native
  /**
    * Requirements that must be satisfied before a consumer project can use the
    * service. Each requirement is of the form <service.name>/<requirement-id>;
    * for example 'serviceusage.googleapis.com/billing-enabled'.
    */
  var requirements: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of usage rules that apply to individual API methods.
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[UsageRule]] = js.native
}

object Usage {
  @scala.inline
  def apply(): Usage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Usage]
  }
  @scala.inline
  implicit class UsageOps[Self <: Usage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProducerNotificationChannel(value: String): Self = this.set("producerNotificationChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducerNotificationChannel: Self = this.set("producerNotificationChannel", js.undefined)
    @scala.inline
    def setRequirementsVarargs(value: String*): Self = this.set("requirements", js.Array(value :_*))
    @scala.inline
    def setRequirements(value: js.Array[String]): Self = this.set("requirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequirements: Self = this.set("requirements", js.undefined)
    @scala.inline
    def setRulesVarargs(value: UsageRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[UsageRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

