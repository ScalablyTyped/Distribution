package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note holding the version of the provider&#39;s builder and the signature of
  * the provenance message in the build details occurrence.
  */
@js.native
trait Schema$Build extends js.Object {
  /**
    * Required. Immutable. Version of the builder which produced this build.
    */
  var builderVersion: js.UndefOr[String] = js.native
  /**
    * Signature of the build in occurrences pointing to this build note
    * containing build details.
    */
  var signature: js.UndefOr[Schema$BuildSignature] = js.native
}

object Schema$Build {
  @scala.inline
  def apply(builderVersion: String = null, signature: Schema$BuildSignature = null): Schema$Build = {
    val __obj = js.Dynamic.literal()
    if (builderVersion != null) __obj.updateDynamic("builderVersion")(builderVersion.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Build]
  }
}

