package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of analysis that can be done for a resource.
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
  var attestationAuthority: js.UndefOr[Schema$Authority] = js.native
  /**
    * A note describing a base image.
    */
  var baseImage: js.UndefOr[Schema$Basis] = js.native
  /**
    * A note describing build provenance for a verifiable build.
    */
  var build: js.UndefOr[Schema$Build] = js.native
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
    * A note describing the initial analysis of a resource.
    */
  var discovery: js.UndefOr[Schema$Discovery] = js.native
  /**
    * Time of expiration for this note. Empty if note does not expire.
    */
  var expirationTime: js.UndefOr[String] = js.native
  /**
    * Output only. The type of analysis. This field can be used as a filter in
    * list requests.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A detailed description of this note.
    */
  var longDescription: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the note in the form of
    * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Other notes related to this note.
    */
  var relatedNoteNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * URLs associated with this note.
    */
  var relatedUrl: js.UndefOr[js.Array[Schema$RelatedUrl]] = js.native
  /**
    * A one sentence description of this note.
    */
  var shortDescription: js.UndefOr[String] = js.native
  /**
    * Output only. The time this note was last updated. This field can be used
    * as a filter in list requests.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * A note describing a package vulnerability.
    */
  var vulnerability: js.UndefOr[Schema$Vulnerability] = js.native
}

object Schema$Note {
  @scala.inline
  def apply(
    _package: Schema$Package = null,
    attestationAuthority: Schema$Authority = null,
    baseImage: Schema$Basis = null,
    build: Schema$Build = null,
    createTime: String = null,
    deployable: Schema$Deployable = null,
    discovery: Schema$Discovery = null,
    expirationTime: String = null,
    kind: String = null,
    longDescription: String = null,
    name: String = null,
    relatedNoteNames: js.Array[String] = null,
    relatedUrl: js.Array[Schema$RelatedUrl] = null,
    shortDescription: String = null,
    updateTime: String = null,
    vulnerability: Schema$Vulnerability = null
  ): Schema$Note = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (attestationAuthority != null) __obj.updateDynamic("attestationAuthority")(attestationAuthority.asInstanceOf[js.Any])
    if (baseImage != null) __obj.updateDynamic("baseImage")(baseImage.asInstanceOf[js.Any])
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (deployable != null) __obj.updateDynamic("deployable")(deployable.asInstanceOf[js.Any])
    if (discovery != null) __obj.updateDynamic("discovery")(discovery.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (longDescription != null) __obj.updateDynamic("longDescription")(longDescription.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (relatedNoteNames != null) __obj.updateDynamic("relatedNoteNames")(relatedNoteNames.asInstanceOf[js.Any])
    if (relatedUrl != null) __obj.updateDynamic("relatedUrl")(relatedUrl.asInstanceOf[js.Any])
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (vulnerability != null) __obj.updateDynamic("vulnerability")(vulnerability.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Note]
  }
}

