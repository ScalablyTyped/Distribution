package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceResponseItem extends js.Object {
  /** The list of service end points on the resource. */
  var endpoints: js.UndefOr[stdLib.Record[java.lang.String, js.Array[scala.Double]]] = js.undefined
  /** The full URL of the resource. */
  var resource: js.UndefOr[java.lang.String] = js.undefined
}

object ListResourceResponseItem {
  @scala.inline
  def apply(
    endpoints: stdLib.Record[java.lang.String, js.Array[scala.Double]] = null,
    resource: java.lang.String = null
  ): ListResourceResponseItem = {
    val __obj = js.Dynamic.literal()
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[ListResourceResponseItem]
  }
}

