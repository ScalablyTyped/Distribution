package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTypeFilter extends js.Object {
  /**
    * The types of media items to be included. This field should be populated
    * with only one media type. If you specify multiple media types, it results
    * in an error.
    */
  var mediaTypes: js.UndefOr[js.Array[String]] = js.native
}

object MediaTypeFilter {
  @scala.inline
  def apply(): MediaTypeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTypeFilter]
  }
  @scala.inline
  implicit class MediaTypeFilterOps[Self <: MediaTypeFilter] (val x: Self) extends AnyVal {
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
    def setMediaTypesVarargs(value: String*): Self = this.set("mediaTypes", js.Array(value :_*))
    @scala.inline
    def setMediaTypes(value: js.Array[String]): Self = this.set("mediaTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaTypes: Self = this.set("mediaTypes", js.undefined)
  }
  
}

