package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClinicalCondition extends js.Object {
  /**
    * The MedGen concept id associated with this gene.
    * Search for these IDs at http://www.ncbi.nlm.nih.gov/medgen/
    */
  var conceptId: js.UndefOr[String] = js.native
  /** The set of external IDs for this condition. */
  var externalIds: js.UndefOr[js.Array[ExternalId]] = js.native
  /** A set of names for the condition. */
  var names: js.UndefOr[js.Array[String]] = js.native
  /**
    * The OMIM id for this condition.
    * Search for these IDs at http://omim.org/
    */
  var omimId: js.UndefOr[String] = js.native
}

object ClinicalCondition {
  @scala.inline
  def apply(): ClinicalCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalCondition]
  }
  @scala.inline
  implicit class ClinicalConditionOps[Self <: ClinicalCondition] (val x: Self) extends AnyVal {
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
    def setConceptId(value: String): Self = this.set("conceptId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConceptId: Self = this.set("conceptId", js.undefined)
    @scala.inline
    def setExternalIdsVarargs(value: ExternalId*): Self = this.set("externalIds", js.Array(value :_*))
    @scala.inline
    def setExternalIds(value: js.Array[ExternalId]): Self = this.set("externalIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalIds: Self = this.set("externalIds", js.undefined)
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    @scala.inline
    def setOmimId(value: String): Self = this.set("omimId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmimId: Self = this.set("omimId", js.undefined)
  }
  
}

