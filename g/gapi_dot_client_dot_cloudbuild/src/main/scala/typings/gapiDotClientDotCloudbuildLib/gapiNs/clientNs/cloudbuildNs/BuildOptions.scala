package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptions extends js.Object {
  /** Requested verifiability options. */
  var requestedVerifyOption: js.UndefOr[java.lang.String] = js.undefined
  /** Requested hash for SourceProvenance. */
  var sourceProvenanceHash: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** SubstitutionOption to allow unmatch substitutions. */
  var substitutionOption: js.UndefOr[java.lang.String] = js.undefined
}

object BuildOptions {
  @scala.inline
  def apply(
    requestedVerifyOption: java.lang.String = null,
    sourceProvenanceHash: js.Array[java.lang.String] = null,
    substitutionOption: java.lang.String = null
  ): BuildOptions = {
    val __obj = js.Dynamic.literal()
    if (requestedVerifyOption != null) __obj.updateDynamic("requestedVerifyOption")(requestedVerifyOption)
    if (sourceProvenanceHash != null) __obj.updateDynamic("sourceProvenanceHash")(sourceProvenanceHash)
    if (substitutionOption != null) __obj.updateDynamic("substitutionOption")(substitutionOption)
    __obj.asInstanceOf[BuildOptions]
  }
}

