package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In contrast to a single BackendService in  HttpRouteAction to which all
  * matching traffic is directed to, WeightedBackendService allows traffic to
  * be split across multiple BackendServices. The volume of traffic for each
  * BackendService is proportional to the weight specified in each
  * WeightedBackendService
  */
@js.native
trait SchemaWeightedBackendService extends js.Object {
  /**
    * The full or partial URL to the default BackendService resource. Before
    * forwarding the request to backendService, the loadbalancer applies any
    * relevant headerActions specified as part of this backendServiceWeight.
    */
  var backendService: js.UndefOr[String] = js.native
  /**
    * Specifies changes to request and response headers that need to take
    * effect for the selected backendService. headerAction specified here take
    * effect before headerAction in the enclosing HttpRouteRule, PathMatcher
    * and UrlMap.
    */
  var headerAction: js.UndefOr[SchemaHttpHeaderAction] = js.native
  /**
    * Specifies the fraction of traffic sent to backendService, computed as
    * weight / (sum of all weightedBackendService weights in routeAction) . The
    * selection of a backend service is determined only for new traffic. Once a
    * user&#39;s request has been directed to a backendService, subsequent
    * requests will be sent to the same backendService as determined by the
    * BackendService&#39;s session affinity policy. The value must be between 0
    * and 1000
    */
  var weight: js.UndefOr[Double] = js.native
}

object SchemaWeightedBackendService {
  @scala.inline
  def apply(
    backendService: String = null,
    headerAction: SchemaHttpHeaderAction = null,
    weight: js.UndefOr[Double] = js.undefined
  ): SchemaWeightedBackendService = {
    val __obj = js.Dynamic.literal()
    if (backendService != null) __obj.updateDynamic("backendService")(backendService.asInstanceOf[js.Any])
    if (headerAction != null) __obj.updateDynamic("headerAction")(headerAction.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWeightedBackendService]
  }
}

