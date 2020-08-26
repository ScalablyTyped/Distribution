package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotationsdata extends js.Object {
  /** A list of Annotation Data. */
  var items: js.UndefOr[js.Array[Annotationdata]] = js.native
  /** Resource type */
  var kind: js.UndefOr[String] = js.native
  /** Token to pass in for pagination for the next page. This will not be present if this request does not have more results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The total number of volume annotations found. */
  var totalItems: js.UndefOr[Double] = js.native
}

object Annotationsdata {
  @scala.inline
  def apply(): Annotationsdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotationsdata]
  }
  @scala.inline
  implicit class AnnotationsdataOps[Self <: Annotationsdata] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Annotationdata*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Annotationdata]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
  
}

