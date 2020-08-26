package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeveloperMetadataResponse extends js.Object {
  /** The developer metadata that was created. */
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.native
}

object CreateDeveloperMetadataResponse {
  @scala.inline
  def apply(): CreateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeveloperMetadataResponse]
  }
  @scala.inline
  implicit class CreateDeveloperMetadataResponseOps[Self <: CreateDeveloperMetadataResponse] (val x: Self) extends AnyVal {
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
    def setDeveloperMetadata(value: DeveloperMetadata): Self = this.set("developerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperMetadata: Self = this.set("developerMetadata", js.undefined)
  }
  
}

