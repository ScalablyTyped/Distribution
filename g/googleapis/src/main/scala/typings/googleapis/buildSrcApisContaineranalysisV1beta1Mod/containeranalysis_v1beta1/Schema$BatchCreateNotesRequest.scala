package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create notes in batch.
  */
@js.native
trait Schema$BatchCreateNotesRequest extends js.Object {
  /**
    * The notes to create. Max allowed length is 1000.
    */
  var notes: js.UndefOr[StringDictionary[Schema$Note]] = js.native
}

object Schema$BatchCreateNotesRequest {
  @scala.inline
  def apply(notes: StringDictionary[Schema$Note] = null): Schema$BatchCreateNotesRequest = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchCreateNotesRequest]
  }
}

