package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note holding the version of the provider&#39;s builder and the signature of
  * the provenance message in linked BuildDetails.
  */
@js.native
trait Schema$BuildType extends js.Object {
  /**
    * Version of the builder which produced this Note.
    */
  var builderVersion: js.UndefOr[String] = js.native
  /**
    * Signature of the build in Occurrences pointing to the Note containing
    * this `BuilderDetails`.
    */
  var signature: js.UndefOr[Schema$BuildSignature] = js.native
}

object Schema$BuildType {
  @scala.inline
  def apply(builderVersion: String = null, signature: Schema$BuildSignature = null): Schema$BuildType = {
    val __obj = js.Dynamic.literal()
    if (builderVersion != null) __obj.updateDynamic("builderVersion")(builderVersion.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildType]
  }
}

