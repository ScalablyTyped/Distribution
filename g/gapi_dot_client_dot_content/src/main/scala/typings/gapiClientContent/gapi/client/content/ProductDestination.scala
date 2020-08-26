package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductDestination extends js.Object {
  /** The name of the destination. */
  var destinationName: js.UndefOr[String] = js.native
  /** Whether the destination is required, excluded or should be validated. */
  var intention: js.UndefOr[String] = js.native
}

object ProductDestination {
  @scala.inline
  def apply(): ProductDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductDestination]
  }
  @scala.inline
  implicit class ProductDestinationOps[Self <: ProductDestination] (val x: Self) extends AnyVal {
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
    def setDestinationName(value: String): Self = this.set("destinationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationName: Self = this.set("destinationName", js.undefined)
    @scala.inline
    def setIntention(value: String): Self = this.set("intention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntention: Self = this.set("intention", js.undefined)
  }
  
}

