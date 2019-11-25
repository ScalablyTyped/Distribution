package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClinicalCondition extends js.Object {
  /**
    * The MedGen concept id associated with this gene.
    * Search for these IDs at http://www.ncbi.nlm.nih.gov/medgen/
    */
  var conceptId: js.UndefOr[String] = js.undefined
  /** The set of external IDs for this condition. */
  var externalIds: js.UndefOr[js.Array[ExternalId]] = js.undefined
  /** A set of names for the condition. */
  var names: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The OMIM id for this condition.
    * Search for these IDs at http://omim.org/
    */
  var omimId: js.UndefOr[String] = js.undefined
}

object ClinicalCondition {
  @scala.inline
  def apply(
    conceptId: String = null,
    externalIds: js.Array[ExternalId] = null,
    names: js.Array[String] = null,
    omimId: String = null
  ): ClinicalCondition = {
    val __obj = js.Dynamic.literal()
    if (conceptId != null) __obj.updateDynamic("conceptId")(conceptId.asInstanceOf[js.Any])
    if (externalIds != null) __obj.updateDynamic("externalIds")(externalIds.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (omimId != null) __obj.updateDynamic("omimId")(omimId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalCondition]
  }
}

