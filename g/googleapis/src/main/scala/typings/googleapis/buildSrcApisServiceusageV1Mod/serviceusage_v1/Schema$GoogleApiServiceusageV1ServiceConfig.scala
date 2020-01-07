package typings.googleapis.buildSrcApisServiceusageV1Mod.serviceusage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration of the service.
  */
@js.native
trait Schema$GoogleApiServiceusageV1ServiceConfig extends js.Object {
  /**
    * A list of API interfaces exported by this service. Contains only the
    * names, versions, and method names of the interfaces.
    */
  var apis: js.UndefOr[js.Array[Schema$Api]] = js.native
  /**
    * Auth configuration. Contains only the OAuth rules.
    */
  var authentication: js.UndefOr[Schema$Authentication] = js.native
  /**
    * Additional API documentation. Contains only the summary and the
    * documentation URL.
    */
  var documentation: js.UndefOr[Schema$Documentation] = js.native
  /**
    * Configuration for network endpoints. Contains only the names and aliases
    * of the endpoints.
    */
  var endpoints: js.UndefOr[js.Array[Schema$Endpoint]] = js.native
  /**
    * The DNS address at which this service is available.  An example DNS
    * address would be: `calendar.googleapis.com`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Quota configuration.
    */
  var quota: js.UndefOr[Schema$Quota] = js.native
  /**
    * The product title for this service.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Configuration controlling usage of this service.
    */
  var usage: js.UndefOr[Schema$Usage] = js.native
}

object Schema$GoogleApiServiceusageV1ServiceConfig {
  @scala.inline
  def apply(
    apis: js.Array[Schema$Api] = null,
    authentication: Schema$Authentication = null,
    documentation: Schema$Documentation = null,
    endpoints: js.Array[Schema$Endpoint] = null,
    name: String = null,
    quota: Schema$Quota = null,
    title: String = null,
    usage: Schema$Usage = null
  ): Schema$GoogleApiServiceusageV1ServiceConfig = {
    val __obj = js.Dynamic.literal()
    if (apis != null) __obj.updateDynamic("apis")(apis.asInstanceOf[js.Any])
    if (authentication != null) __obj.updateDynamic("authentication")(authentication.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (quota != null) __obj.updateDynamic("quota")(quota.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleApiServiceusageV1ServiceConfig]
  }
}

