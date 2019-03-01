package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportImageFormatStatic extends js.Object {
  /**
    * The GIF image format.
    */
  var Gif: java.lang.String
  /**
    * The JPG image format.
    */
  var Jpg: java.lang.String
  /**
    * The PNG image format.
    */
  var Png: java.lang.String
}

object DashboardExportImageFormatStatic {
  @scala.inline
  def apply(Gif: java.lang.String, Jpg: java.lang.String, Png: java.lang.String): DashboardExportImageFormatStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Gif")(Gif)
    __obj.updateDynamic("Jpg")(Jpg)
    __obj.updateDynamic("Png")(Png)
    __obj.asInstanceOf[DashboardExportImageFormatStatic]
  }
}

