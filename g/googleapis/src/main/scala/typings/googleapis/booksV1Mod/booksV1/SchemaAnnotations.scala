package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAnnotations extends js.Object {
  /**
    * A list of annotations.
    */
  var items: js.UndefOr[js.Array[SchemaAnnotation]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token to pass in for pagination for the next page. This will not be
    * present if this request does not have more results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Total number of annotations found. This may be greater than the number of
    * notes returned in this response if results have been paginated.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object SchemaAnnotations {
  @scala.inline
  def apply(): SchemaAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotations]
  }
  @scala.inline
  implicit class SchemaAnnotationsOps[Self <: SchemaAnnotations] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaAnnotation*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaAnnotation]): Self = this.set("items", value.asInstanceOf[js.Any])
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

