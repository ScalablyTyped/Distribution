package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coords extends js.Object {
  var coords: js.UndefOr[Anon_Latitude] = js.undefined
  var proximity: js.UndefOr[java.lang.String] = js.undefined
   // Proximity
  var radius: js.UndefOr[scala.Double] = js.undefined
  // iOS
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Coords {
  @scala.inline
  def apply(
    coords: Anon_Latitude = null,
    proximity: java.lang.String = null,
    radius: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): Anon_Coords = {
    val __obj = js.Dynamic.literal()
    if (coords != null) __obj.updateDynamic("coords")(coords)
    if (proximity != null) __obj.updateDynamic("proximity")(proximity)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Coords]
  }
}

