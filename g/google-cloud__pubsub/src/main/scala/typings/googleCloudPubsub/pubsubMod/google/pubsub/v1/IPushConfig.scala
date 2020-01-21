package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.PushConfig.IOidcToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PushConfig. */
trait IPushConfig extends js.Object {
  /** PushConfig attributes */
  var attributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  /** PushConfig oidcToken */
  var oidcToken: js.UndefOr[IOidcToken | Null] = js.undefined
  /** PushConfig pushEndpoint */
  var pushEndpoint: js.UndefOr[String | Null] = js.undefined
}

object IPushConfig {
  @scala.inline
  def apply(
    attributes: StringDictionary[String] = null,
    oidcToken: IOidcToken = null,
    pushEndpoint: String = null
  ): IPushConfig = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (oidcToken != null) __obj.updateDynamic("oidcToken")(oidcToken.asInstanceOf[js.Any])
    if (pushEndpoint != null) __obj.updateDynamic("pushEndpoint")(pushEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPushConfig]
  }
}

