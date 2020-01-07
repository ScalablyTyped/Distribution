package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RouteSpec holds the desired state of the Route (from the client).
  */
@js.native
trait Schema$RouteSpec extends js.Object {
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.native
  /**
    * Traffic specifies how to distribute traffic over a collection of Knative
    * Revisions and Configurations. Cloud Run currently supports a single
    * configurationName.
    */
  var traffic: js.UndefOr[js.Array[Schema$TrafficTarget]] = js.native
}

object Schema$RouteSpec {
  @scala.inline
  def apply(generation: Int | Double = null, traffic: js.Array[Schema$TrafficTarget] = null): Schema$RouteSpec = {
    val __obj = js.Dynamic.literal()
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (traffic != null) __obj.updateDynamic("traffic")(traffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RouteSpec]
  }
}

