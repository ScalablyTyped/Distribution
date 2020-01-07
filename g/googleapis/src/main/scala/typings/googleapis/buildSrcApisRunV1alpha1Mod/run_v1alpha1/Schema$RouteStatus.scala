package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RouteStatus communicates the observed state of the Route (from the
  * controller).
  */
@js.native
trait Schema$RouteStatus extends js.Object {
  /**
    * Similar to domain, information on where the service is available on HTTP.
    */
  var address: js.UndefOr[Schema$Addressable] = js.native
  /**
    * Conditions communicates information about ongoing/complete reconciliation
    * processes that bring the &quot;spec&quot; inline with the observed state
    * of the world.
    */
  var conditions: js.UndefOr[js.Array[Schema$RouteCondition]] = js.native
  /**
    * Domain holds the top-level domain that will distribute traffic over the
    * provided targets. It generally has the form
    * https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * For Cloud Run, identifical to domain.
    */
  var domainInternal: js.UndefOr[String] = js.native
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the Route that was last
    * processed by the controller.  Clients polling for completed
    * reconciliation should poll until observedGeneration = metadata.generation
    * and the Ready condition&#39;s status is True or False.  Note that
    * providing a trafficTarget that only has a configurationName will result
    * in a Route that does not increment either its metadata.generation or its
    * observedGeneration, as new &quot;latest ready&quot; revisions from the
    * Configuration are processed without an update to the Route&#39;s spec.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
  /**
    * Traffic holds the configured traffic distribution. These entries will
    * always contain RevisionName references. When ConfigurationName appears in
    * the spec, this will hold the LatestReadyRevisionName that we last
    * observed.
    */
  var traffic: js.UndefOr[js.Array[Schema$TrafficTarget]] = js.native
}

object Schema$RouteStatus {
  @scala.inline
  def apply(
    address: Schema$Addressable = null,
    conditions: js.Array[Schema$RouteCondition] = null,
    domain: String = null,
    domainInternal: String = null,
    observedGeneration: Int | Double = null,
    traffic: js.Array[Schema$TrafficTarget] = null
  ): Schema$RouteStatus = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainInternal != null) __obj.updateDynamic("domainInternal")(domainInternal.asInstanceOf[js.Any])
    if (observedGeneration != null) __obj.updateDynamic("observedGeneration")(observedGeneration.asInstanceOf[js.Any])
    if (traffic != null) __obj.updateDynamic("traffic")(traffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RouteStatus]
  }
}

