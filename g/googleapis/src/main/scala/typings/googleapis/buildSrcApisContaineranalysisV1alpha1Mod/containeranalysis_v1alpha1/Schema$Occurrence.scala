package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Occurrence` includes information about analysis occurrences for an image.
  */
@js.native
trait Schema$Occurrence extends js.Object {
  /**
    * Describes an attestation of an artifact.
    */
  var attestation: js.UndefOr[Schema$Attestation] = js.native
  /**
    * Build details for a verifiable build.
    */
  var buildDetails: js.UndefOr[Schema$BuildDetails] = js.native
  /**
    * Output only. The time this `Occurrence` was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Describes the deployment of an artifact on a runtime.
    */
  var deployment: js.UndefOr[Schema$Deployment] = js.native
  /**
    * Describes how this resource derives from the basis in the associated
    * note.
    */
  var derivedImage: js.UndefOr[Schema$Derived] = js.native
  /**
    * Describes the initial scan status for this resource.
    */
  var discovered: js.UndefOr[Schema$Discovered] = js.native
  /**
    * Describes the installation of a package on the linked resource.
    */
  var installation: js.UndefOr[Schema$Installation] = js.native
  /**
    * Output only. This explicitly denotes which of the `Occurrence` details
    * are specified. This field can be used as a filter in list requests.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the `Occurrence` in the form
    * &quot;projects/{project_id}/occurrences/{OCCURRENCE_ID}&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An analysis note associated with this image, in the form
    * &quot;providers/{provider_id}/notes/{NOTE_ID}&quot; This field can be
    * used as a filter in list requests.
    */
  var noteName: js.UndefOr[String] = js.native
  /**
    * A description of actions that can be taken to remedy the `Note`
    */
  var remediation: js.UndefOr[String] = js.native
  /**
    * The resource for which the `Occurrence` applies.
    */
  var resource: js.UndefOr[Schema$Resource] = js.native
  /**
    * The unique URL of the image or the container for which the `Occurrence`
    * applies. For example, https://gcr.io/project/image@sha256:foo This field
    * can be used as a filter in list requests.
    */
  var resourceUrl: js.UndefOr[String] = js.native
  /**
    * Output only. The time this `Occurrence` was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Details of a security vulnerability note.
    */
  var vulnerabilityDetails: js.UndefOr[Schema$VulnerabilityDetails] = js.native
}

object Schema$Occurrence {
  @scala.inline
  def apply(
    attestation: Schema$Attestation = null,
    buildDetails: Schema$BuildDetails = null,
    createTime: String = null,
    deployment: Schema$Deployment = null,
    derivedImage: Schema$Derived = null,
    discovered: Schema$Discovered = null,
    installation: Schema$Installation = null,
    kind: String = null,
    name: String = null,
    noteName: String = null,
    remediation: String = null,
    resource: Schema$Resource = null,
    resourceUrl: String = null,
    updateTime: String = null,
    vulnerabilityDetails: Schema$VulnerabilityDetails = null
  ): Schema$Occurrence = {
    val __obj = js.Dynamic.literal()
    if (attestation != null) __obj.updateDynamic("attestation")(attestation.asInstanceOf[js.Any])
    if (buildDetails != null) __obj.updateDynamic("buildDetails")(buildDetails.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    if (derivedImage != null) __obj.updateDynamic("derivedImage")(derivedImage.asInstanceOf[js.Any])
    if (discovered != null) __obj.updateDynamic("discovered")(discovered.asInstanceOf[js.Any])
    if (installation != null) __obj.updateDynamic("installation")(installation.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noteName != null) __obj.updateDynamic("noteName")(noteName.asInstanceOf[js.Any])
    if (remediation != null) __obj.updateDynamic("remediation")(remediation.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (resourceUrl != null) __obj.updateDynamic("resourceUrl")(resourceUrl.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (vulnerabilityDetails != null) __obj.updateDynamic("vulnerabilityDetails")(vulnerabilityDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Occurrence]
  }
}

