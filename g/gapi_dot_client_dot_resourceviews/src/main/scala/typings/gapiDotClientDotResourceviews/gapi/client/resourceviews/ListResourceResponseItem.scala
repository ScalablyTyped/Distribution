package typings.gapiDotClientDotResourceviews.gapi.client.resourceviews

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceResponseItem extends js.Object {
  /** The list of service end points on the resource. */
  var endpoints: js.UndefOr[Record[String, js.Array[Double]]] = js.undefined
  /** The full URL of the resource. */
  var resource: js.UndefOr[String] = js.undefined
}

object ListResourceResponseItem {
  @scala.inline
  def apply(endpoints: Record[String, js.Array[Double]] = null, resource: String = null): ListResourceResponseItem = {
    val __obj = js.Dynamic.literal()
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceResponseItem]
  }
}

