package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a detailed description of a `Note`.
  */
@js.native
trait Schema$Note extends js.Object {
  /**
    * A note describing a package hosted by various package managers.
    */
  @JSName("package")
  var _package: js.UndefOr[Schema$Package] = js.native
  /**
    * A note describing an attestation role.
    */
  var attestationAuthority: js.UndefOr[Schema$AttestationAuthority] = js.native
  /**
    * A note describing a base image.
    */
  var baseImage: js.UndefOr[Schema$Basis] = js.native
  /**
    * Build provenance type for a verifiable build.
    */
  var buildType: js.UndefOr[Schema$BuildType] = js.native
  /**
    * Output only. The time this note was created. This field can be used as a
    * filter in list requests.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * A note describing something that can be deployed.
    */
  var deployable: js.UndefOr[Schema$Deployable] = js.native
  /**
    * A note describing a provider/analysis type.
    */
  var discovery: js.UndefOr[Schema$Discovery] = js.native
  /**
    * Time of expiration for this note, null if note does not expire.
    */
  var expirationTime: js.UndefOr[String] = js.native
  /**
    * Output only. This explicitly denotes which kind of note is specified.
    * This field can be used as a filter in list requests.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A detailed description of this `Note`.
    */
  var longDescription: js.UndefOr[String] = js.native
  /**
    * The name of the note in the form
    * &quot;providers/{provider_id}/notes/{NOTE_ID}&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * URLs associated with this note
    */
  var relatedUrl: js.UndefOr[js.Array[Schema$RelatedUrl]] = js.native
  /**
    * A one sentence description of this `Note`.
    */
  var shortDescription: js.UndefOr[String] = js.native
  /**
    * Output only. The time this note was last updated. This field can be used
    * as a filter in list requests.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * A package vulnerability type of note.
    */
  var vulnerabilityType: js.UndefOr[Schema$VulnerabilityType] = js.native
}

object Schema$Note {
  @scala.inline
  def apply(
    _package: Schema$Package = null,
    attestationAuthority: Schema$AttestationAuthority = null,
    baseImage: Schema$Basis = null,
    buildType: Schema$BuildType = null,
    createTime: String = null,
    deployable: Schema$Deployable = null,
    discovery: Schema$Discovery = null,
    expirationTime: String = null,
    kind: String = null,
    longDescription: String = null,
    name: String = null,
    relatedUrl: js.Array[Schema$RelatedUrl] = null,
    shortDescription: String = null,
    updateTime: String = null,
    vulnerabilityType: Schema$VulnerabilityType = null
  ): Schema$Note = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (attestationAuthority != null) __obj.updateDynamic("attestationAuthority")(attestationAuthority.asInstanceOf[js.Any])
    if (baseImage != null) __obj.updateDynamic("baseImage")(baseImage.asInstanceOf[js.Any])
    if (buildType != null) __obj.updateDynamic("buildType")(buildType.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (deployable != null) __obj.updateDynamic("deployable")(deployable.asInstanceOf[js.Any])
    if (discovery != null) __obj.updateDynamic("discovery")(discovery.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (longDescription != null) __obj.updateDynamic("longDescription")(longDescription.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (relatedUrl != null) __obj.updateDynamic("relatedUrl")(relatedUrl.asInstanceOf[js.Any])
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (vulnerabilityType != null) __obj.updateDynamic("vulnerabilityType")(vulnerabilityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Note]
  }
}

