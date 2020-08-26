package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Versions.ListVersions.
  */
@js.native
trait SchemaListVersionsResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The versions belonging to the requested service.
    */
  var versions: js.UndefOr[js.Array[SchemaVersion]] = js.native
}

object SchemaListVersionsResponse {
  @scala.inline
  def apply(): SchemaListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVersionsResponse]
  }
  @scala.inline
  implicit class SchemaListVersionsResponseOps[Self <: SchemaListVersionsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: SchemaVersion*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[SchemaVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

