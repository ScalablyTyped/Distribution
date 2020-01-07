package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Revision is an immutable snapshot of code and configuration.  A revision
  * references a container image. Revisions are created by updates to a
  * Configuration.  Cloud Run does not currently support referencing a build
  * that is responsible for materializing the container image from source.  See
  * also:
  * https://github.com/knative/serving/blob/master/docs/spec/overview.md#revision
  */
@js.native
trait Schema$Revision extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * The kind of this resource, in this case &quot;Revision&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Revision, including name, namespace,
    * labels, and annotations.
    */
  var metadata: js.UndefOr[Schema$ObjectMeta] = js.native
  /**
    * Spec holds the desired state of the Revision (from the client).
    */
  var spec: js.UndefOr[Schema$RevisionSpec] = js.native
  /**
    * Status communicates the observed state of the Revision (from the
    * controller).
    */
  var status: js.UndefOr[Schema$RevisionStatus] = js.native
}

object Schema$Revision {
  @scala.inline
  def apply(
    apiVersion: String = null,
    kind: String = null,
    metadata: Schema$ObjectMeta = null,
    spec: Schema$RevisionSpec = null,
    status: Schema$RevisionStatus = null
  ): Schema$Revision = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Revision]
  }
}

