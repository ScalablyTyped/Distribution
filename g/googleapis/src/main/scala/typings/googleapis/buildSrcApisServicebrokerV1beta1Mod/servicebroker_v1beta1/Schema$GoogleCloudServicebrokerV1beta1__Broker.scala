package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Broker represents a consumable collection of Service Registry catalogs
  * exposed as an OSB Broker.
  */
@js.native
trait Schema$GoogleCloudServicebrokerV1beta1__Broker extends js.Object {
  /**
    * Output only. Timestamp for when the broker was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Name of the broker in the format:
    * &lt;projects&gt;/&lt;project-id&gt;/brokers/&lt;broker&gt;. This allows
    * for multiple brokers per project which can be used to enable having
    * custom brokers per GKE cluster, for example.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User friendly title of the broker. Limited to 1024 characters. Requests
    * with longer titles will be rejected.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Output only. URL of the broker OSB-compliant endpoint, for example:
    * https://servicebroker.googleapis.com/projects/&lt;project&gt;/brokers/&lt;broker&gt;
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudServicebrokerV1beta1__Broker {
  @scala.inline
  def apply(createTime: String = null, name: String = null, title: String = null, url: String = null): Schema$GoogleCloudServicebrokerV1beta1__Broker = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudServicebrokerV1beta1__Broker]
  }
}

