package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration represents the &quot;floating HEAD&quot; of a linear history
  * of Revisions, and optionally how the containers those revisions reference
  * are built. Users create new Revisions by updating the Configuration&#39;s
  * spec. The &quot;latest created&quot; revision&#39;s name is available under
  * status, as is the &quot;latest ready&quot; revision&#39;s name. See also:
  * https://github.com/knative/serving/blob/master/docs/spec/overview.md#configuration
  */
@js.native
trait Schema$Configuration extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * The kind of resource, in this case always &quot;Configuration&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Configuration, including name, namespace,
    * labels, and annotations.
    */
  var metadata: js.UndefOr[Schema$ObjectMeta] = js.native
  /**
    * Spec holds the desired state of the Configuration (from the client).
    */
  var spec: js.UndefOr[Schema$ConfigurationSpec] = js.native
  /**
    * Status communicates the observed state of the Configuration (from the
    * controller).
    */
  var status: js.UndefOr[Schema$ConfigurationStatus] = js.native
}

object Schema$Configuration {
  @scala.inline
  def apply(
    apiVersion: String = null,
    kind: String = null,
    metadata: Schema$ObjectMeta = null,
    spec: Schema$ConfigurationSpec = null,
    status: Schema$ConfigurationStatus = null
  ): Schema$Configuration = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Configuration]
  }
}

