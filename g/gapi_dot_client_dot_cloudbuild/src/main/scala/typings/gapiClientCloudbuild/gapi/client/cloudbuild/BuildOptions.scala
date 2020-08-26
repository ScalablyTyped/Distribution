package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptions extends js.Object {
  /** Requested verifiability options. */
  var requestedVerifyOption: js.UndefOr[String] = js.native
  /** Requested hash for SourceProvenance. */
  var sourceProvenanceHash: js.UndefOr[js.Array[String]] = js.native
  /** SubstitutionOption to allow unmatch substitutions. */
  var substitutionOption: js.UndefOr[String] = js.native
}

object BuildOptions {
  @scala.inline
  def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
  @scala.inline
  implicit class BuildOptionsOps[Self <: BuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequestedVerifyOption(value: String): Self = this.set("requestedVerifyOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedVerifyOption: Self = this.set("requestedVerifyOption", js.undefined)
    @scala.inline
    def setSourceProvenanceHashVarargs(value: String*): Self = this.set("sourceProvenanceHash", js.Array(value :_*))
    @scala.inline
    def setSourceProvenanceHash(value: js.Array[String]): Self = this.set("sourceProvenanceHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceProvenanceHash: Self = this.set("sourceProvenanceHash", js.undefined)
    @scala.inline
    def setSubstitutionOption(value: String): Self = this.set("substitutionOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutionOption: Self = this.set("substitutionOption", js.undefined)
  }
  
}

