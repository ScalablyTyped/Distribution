package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for adding a note to a given proposal.
  */
@js.native
trait Schema$AddNoteRequest extends js.Object {
  /**
    * Details of the note to add.
    */
  var note: js.UndefOr[Schema$Note] = js.native
}

object Schema$AddNoteRequest {
  @scala.inline
  def apply(note: Schema$Note = null): Schema$AddNoteRequest = {
    val __obj = js.Dynamic.literal()
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddNoteRequest]
  }
}

