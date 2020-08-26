package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductAspect extends js.Object {
  /** The name of the aspect. */
  var aspectName: js.UndefOr[String] = js.native
  /** The name of the destination. Leave out to apply to all destinations. */
  var destinationName: js.UndefOr[String] = js.native
  /** Whether the aspect is required, excluded or should be validated. */
  var intention: js.UndefOr[String] = js.native
}

object ProductAspect {
  @scala.inline
  def apply(): ProductAspect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductAspect]
  }
  @scala.inline
  implicit class ProductAspectOps[Self <: ProductAspect] (val x: Self) extends AnyVal {
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
    def setAspectName(value: String): Self = this.set("aspectName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectName: Self = this.set("aspectName", js.undefined)
    @scala.inline
    def setDestinationName(value: String): Self = this.set("destinationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationName: Self = this.set("destinationName", js.undefined)
    @scala.inline
    def setIntention(value: String): Self = this.set("intention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntention: Self = this.set("intention", js.undefined)
  }
  
}

