package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lat extends js.Object {
  /** Location's latitude. */
  var lat: js.UndefOr[scala.Double] = js.undefined
  /** Location's longitude. */
  var lng: js.UndefOr[scala.Double] = js.undefined
  /** Location name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Location's viewport span. Can be used when rendering a map preview. */
  var span: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Lat {
  @scala.inline
  def apply(
    lat: scala.Int | scala.Double = null,
    lng: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    span: java.lang.String = null
  ): Anon_Lat = {
    val __obj = js.Dynamic.literal()
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (span != null) __obj.updateDynamic("span")(span)
    __obj.asInstanceOf[Anon_Lat]
  }
}

