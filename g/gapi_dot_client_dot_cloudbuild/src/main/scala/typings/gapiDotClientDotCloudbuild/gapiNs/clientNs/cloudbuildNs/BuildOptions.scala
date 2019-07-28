package typings.gapiDotClientDotCloudbuild.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptions extends js.Object {
  /** Requested verifiability options. */
  var requestedVerifyOption: js.UndefOr[String] = js.undefined
  /** Requested hash for SourceProvenance. */
  var sourceProvenanceHash: js.UndefOr[js.Array[String]] = js.undefined
  /** SubstitutionOption to allow unmatch substitutions. */
  var substitutionOption: js.UndefOr[String] = js.undefined
}

object BuildOptions {
  @scala.inline
  def apply(
    requestedVerifyOption: String = null,
    sourceProvenanceHash: js.Array[String] = null,
    substitutionOption: String = null
  ): BuildOptions = {
    val __obj = js.Dynamic.literal()
    if (requestedVerifyOption != null) __obj.updateDynamic("requestedVerifyOption")(requestedVerifyOption)
    if (sourceProvenanceHash != null) __obj.updateDynamic("sourceProvenanceHash")(sourceProvenanceHash)
    if (substitutionOption != null) __obj.updateDynamic("substitutionOption")(substitutionOption)
    __obj.asInstanceOf[BuildOptions]
  }
}

