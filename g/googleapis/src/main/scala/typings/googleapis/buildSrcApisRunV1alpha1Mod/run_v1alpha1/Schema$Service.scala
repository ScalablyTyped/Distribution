package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service acts as a top-level container that manages a set of Routes and
  * Configurations which implement a network service. Service exists to provide
  * a singular abstraction which can be access controlled, reasoned about, and
  * which encapsulates software lifecycle decisions such as rollout policy and
  * team resource ownership. Service acts only as an orchestrator of the
  * underlying Routes and Configurations (much as a kubernetes Deployment
  * orchestrates ReplicaSets).  The Service&#39;s controller will track the
  * statuses of its owned Configuration and Route, reflecting their statuses
  * and conditions as its own.  See also:
  * https://github.com/knative/serving/blob/master/docs/spec/overview.md#service
  */
@js.native
trait Schema$Service extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * The kind of resource, in this case &quot;Service&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Service, including name, namespace, labels,
    * and annotations.
    */
  var metadata: js.UndefOr[Schema$ObjectMeta] = js.native
  /**
    * Spec holds the desired state of the Service (from the client).
    */
  var spec: js.UndefOr[Schema$ServiceSpec] = js.native
  /**
    * Status communicates the observed state of the Service (from the
    * controller).
    */
  var status: js.UndefOr[Schema$ServiceStatus] = js.native
}

object Schema$Service {
  @scala.inline
  def apply(
    apiVersion: String = null,
    kind: String = null,
    metadata: Schema$ObjectMeta = null,
    spec: Schema$ServiceSpec = null,
    status: Schema$ServiceStatus = null
  ): Schema$Service = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Service]
  }
}

