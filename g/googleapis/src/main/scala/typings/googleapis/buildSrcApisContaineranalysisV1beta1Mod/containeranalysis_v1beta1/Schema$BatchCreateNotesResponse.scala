package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for creating notes in batch.
  */
@js.native
trait Schema$BatchCreateNotesResponse extends js.Object {
  /**
    * The notes that were created.
    */
  var notes: js.UndefOr[js.Array[Schema$Note]] = js.native
}

object Schema$BatchCreateNotesResponse {
  @scala.inline
  def apply(notes: js.Array[Schema$Note] = null): Schema$BatchCreateNotesResponse = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchCreateNotesResponse]
  }
}

