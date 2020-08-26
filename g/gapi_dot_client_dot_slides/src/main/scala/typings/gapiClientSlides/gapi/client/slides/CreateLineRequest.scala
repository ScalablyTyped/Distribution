package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLineRequest extends js.Object {
  /** The element properties for the line. */
  var elementProperties: js.UndefOr[PageElementProperties] = js.native
  /** The category of line to be created. */
  var lineCategory: js.UndefOr[String] = js.native
  /**
    * A user-supplied object ID.
    *
    * If you specify an ID, it must be unique among all pages and page elements
    * in the presentation. The ID must start with an alphanumeric character or an
    * underscore (matches regex `[a-zA-Z0-9_]`); remaining characters
    * may include those as well as a hyphen or colon (matches regex
    * `[a-zA-Z0-9_-:]`).
    * The length of the ID must not be less than 5 or greater than 50.
    *
    * If you don't specify an ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
}

object CreateLineRequest {
  @scala.inline
  def apply(): CreateLineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLineRequest]
  }
  @scala.inline
  implicit class CreateLineRequestOps[Self <: CreateLineRequest] (val x: Self) extends AnyVal {
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
    def setElementProperties(value: PageElementProperties): Self = this.set("elementProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementProperties: Self = this.set("elementProperties", js.undefined)
    @scala.inline
    def setLineCategory(value: String): Self = this.set("lineCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCategory: Self = this.set("lineCategory", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
  
}

