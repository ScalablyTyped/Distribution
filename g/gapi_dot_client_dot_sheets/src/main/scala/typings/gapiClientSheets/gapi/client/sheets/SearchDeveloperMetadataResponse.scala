package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchDeveloperMetadataResponse extends js.Object {
  /** The metadata matching the criteria of the search request. */
  var matchedDeveloperMetadata: js.UndefOr[js.Array[MatchedDeveloperMetadata]] = js.native
}

object SearchDeveloperMetadataResponse {
  @scala.inline
  def apply(): SearchDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDeveloperMetadataResponse]
  }
  @scala.inline
  implicit class SearchDeveloperMetadataResponseOps[Self <: SearchDeveloperMetadataResponse] (val x: Self) extends AnyVal {
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
    def setMatchedDeveloperMetadataVarargs(value: MatchedDeveloperMetadata*): Self = this.set("matchedDeveloperMetadata", js.Array(value :_*))
    @scala.inline
    def setMatchedDeveloperMetadata(value: js.Array[MatchedDeveloperMetadata]): Self = this.set("matchedDeveloperMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchedDeveloperMetadata: Self = this.set("matchedDeveloperMetadata", js.undefined)
  }
  
}

