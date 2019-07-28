package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportImageFormatStatic extends js.Object {
  /**
    * The GIF image format.
    */
  var Gif: String
  /**
    * The JPG image format.
    */
  var Jpg: String
  /**
    * The PNG image format.
    */
  var Png: String
}

object DashboardExportImageFormatStatic {
  @scala.inline
  def apply(Gif: String, Jpg: String, Png: String): DashboardExportImageFormatStatic = {
    val __obj = js.Dynamic.literal(Gif = Gif, Jpg = Jpg, Png = Png)
  
    __obj.asInstanceOf[DashboardExportImageFormatStatic]
  }
}

