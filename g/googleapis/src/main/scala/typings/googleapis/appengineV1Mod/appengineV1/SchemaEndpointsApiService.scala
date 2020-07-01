package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Endpoints (https://cloud.google.com/endpoints) configuration. The
  * Endpoints API Service provides tooling for serving Open API and gRPC
  * endpoints via an NGINX proxy. Only valid for App Engine Flexible
  * environment deployments.The fields here refer to the name and configuration
  * ID of a &quot;service&quot; resource in the Service Management API
  * (https://cloud.google.com/service-management/overview).
  */
@js.native
trait SchemaEndpointsApiService extends js.Object {
  /**
    * Endpoints service configuration ID as specified by the Service Management
    * API. For example &quot;2016-09-19r1&quot;.By default, the rollout
    * strategy for Endpoints is RolloutStrategy.FIXED. This means that
    * Endpoints starts up with a particular configuration ID. When a new
    * configuration is rolled out, Endpoints must be given the new
    * configuration ID. The config_id field is used to give the configuration
    * ID and is required in this case.Endpoints also has a rollout strategy
    * called RolloutStrategy.MANAGED. When using this, Endpoints fetches the
    * latest configuration and does not need the configuration ID. In this
    * case, config_id must be omitted.
    */
  var configId: js.UndefOr[String] = js.native
  /**
    * Enable or disable trace sampling. By default, this is set to false for
    * enabled.
    */
  var disableTraceSampling: js.UndefOr[Boolean] = js.native
  /**
    * Endpoints service name which is the name of the &quot;service&quot;
    * resource in the Service Management API. For example
    * &quot;myapi.endpoints.myproject.cloud.goog&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Endpoints rollout strategy. If FIXED, config_id must be specified. If
    * MANAGED, config_id must be omitted.
    */
  var rolloutStrategy: js.UndefOr[String] = js.native
}

object SchemaEndpointsApiService {
  @scala.inline
  def apply(
    configId: String = null,
    disableTraceSampling: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    rolloutStrategy: String = null
  ): SchemaEndpointsApiService = {
    val __obj = js.Dynamic.literal()
    if (configId != null) __obj.updateDynamic("configId")(configId.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTraceSampling)) __obj.updateDynamic("disableTraceSampling")(disableTraceSampling.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rolloutStrategy != null) __obj.updateDynamic("rolloutStrategy")(rolloutStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEndpointsApiService]
  }
}

