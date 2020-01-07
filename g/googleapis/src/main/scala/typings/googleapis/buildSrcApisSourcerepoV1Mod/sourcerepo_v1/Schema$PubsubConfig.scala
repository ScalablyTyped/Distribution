package typings.googleapis.buildSrcApisSourcerepoV1Mod.sourcerepo_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration to publish a Cloud Pub/Sub message.
  */
@js.native
trait Schema$PubsubConfig extends js.Object {
  /**
    * The format of the Cloud Pub/Sub messages.
    */
  var messageFormat: js.UndefOr[String] = js.native
  /**
    * Email address of the service account used for publishing Cloud Pub/Sub
    * messages. This service account needs to be in the same project as the
    * PubsubConfig. When added, the caller needs to have
    * iam.serviceAccounts.actAs permission on this service account. If
    * unspecified, it defaults to the compute engine default service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  /**
    * A topic of Cloud Pub/Sub. Values are of the form
    * `projects/&lt;project&gt;/topics/&lt;topic&gt;`. The project needs to be
    * the same project as this config is in.
    */
  var topic: js.UndefOr[String] = js.native
}

object Schema$PubsubConfig {
  @scala.inline
  def apply(messageFormat: String = null, serviceAccountEmail: String = null, topic: String = null): Schema$PubsubConfig = {
    val __obj = js.Dynamic.literal()
    if (messageFormat != null) __obj.updateDynamic("messageFormat")(messageFormat.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PubsubConfig]
  }
}

