package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightOrientation extends js.Object {
  var height: scala.Double
  var orientation: scala.Double
  var uri: java.lang.String
  var width: scala.Double
}

object Anon_HeightOrientation {
  @scala.inline
  def apply(height: scala.Double, orientation: scala.Double, uri: java.lang.String, width: scala.Double): Anon_HeightOrientation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("orientation")(orientation)
    __obj.updateDynamic("uri")(uri)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_HeightOrientation]
  }
}

