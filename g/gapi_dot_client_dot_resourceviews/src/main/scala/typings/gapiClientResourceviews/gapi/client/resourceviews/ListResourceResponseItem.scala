package typings.gapiClientResourceviews.gapi.client.resourceviews

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceResponseItem extends js.Object {
  /** The list of service end points on the resource. */
  var endpoints: js.UndefOr[Record[String, js.Array[Double]]] = js.native
  /** The full URL of the resource. */
  var resource: js.UndefOr[String] = js.native
}

object ListResourceResponseItem {
  @scala.inline
  def apply(): ListResourceResponseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceResponseItem]
  }
  @scala.inline
  implicit class ListResourceResponseItemOps[Self <: ListResourceResponseItem] (val x: Self) extends AnyVal {
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
    def setEndpoints(value: Record[String, js.Array[Double]]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

