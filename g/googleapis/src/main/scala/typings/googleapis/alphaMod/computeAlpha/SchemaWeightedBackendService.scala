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
  def apply(): SchemaWeightedBackendService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWeightedBackendService]
  }
  @scala.inline
  implicit class SchemaWeightedBackendServiceOps[Self <: SchemaWeightedBackendService] (val x: Self) extends AnyVal {
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
    def setBackendService(value: String): Self = this.set("backendService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackendService: Self = this.set("backendService", js.undefined)
    @scala.inline
    def setHeaderAction(value: SchemaHttpHeaderAction): Self = this.set("headerAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderAction: Self = this.set("headerAction", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

