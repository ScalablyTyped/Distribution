package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigurationSpec holds the desired state of the Configuration (from the
  * client).
  */
@js.native
trait Schema$ConfigurationSpec extends js.Object {
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.native
  /**
    * RevisionTemplate holds the latest specification for the Revision to be
    * stamped out. The template references the container image, and may also
    * include labels and annotations that should be attached to the Revision.
    * To correlate a Revision, and/or to force a Revision to be created when
    * the spec doesn&#39;t otherwise change, a nonce label may be provided in
    * the template metadata. For more details, see:
    * https://github.com/knative/serving/blob/master/docs/client-conventions.md#associate-modifications-with-revisions
    * Cloud Run does not currently support referencing a build that is
    * responsible for materializing the container image from source.
    */
  var revisionTemplate: js.UndefOr[Schema$RevisionTemplate] = js.native
}

object Schema$ConfigurationSpec {
  @scala.inline
  def apply(generation: Int | Double = null, revisionTemplate: Schema$RevisionTemplate = null): Schema$ConfigurationSpec = {
    val __obj = js.Dynamic.literal()
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (revisionTemplate != null) __obj.updateDynamic("revisionTemplate")(revisionTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConfigurationSpec]
  }
}

