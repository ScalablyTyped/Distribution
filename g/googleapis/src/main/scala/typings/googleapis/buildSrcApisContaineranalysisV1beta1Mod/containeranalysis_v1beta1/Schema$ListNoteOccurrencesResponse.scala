package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing occurrences for a note.
  */
@js.native
trait Schema$ListNoteOccurrencesResponse extends js.Object {
  /**
    * Token to provide to skip to a particular spot in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The occurrences attached to the specified note.
    */
  var occurrences: js.UndefOr[js.Array[Schema$Occurrence]] = js.native
}

object Schema$ListNoteOccurrencesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, occurrences: js.Array[Schema$Occurrence] = null): Schema$ListNoteOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (occurrences != null) __obj.updateDynamic("occurrences")(occurrences.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListNoteOccurrencesResponse]
  }
}

