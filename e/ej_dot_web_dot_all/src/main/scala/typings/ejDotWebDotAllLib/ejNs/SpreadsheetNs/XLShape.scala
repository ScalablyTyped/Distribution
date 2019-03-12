package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLShape extends js.Object {
  /** This method is used to set a picture in the Spreadsheet.
    * @param {string} Pass the range of the cell.
    * @param {string} Pass the path of the specified image.
    * @param {number} Optional. Pass the width of the image that you want to set.
    * @param {number} Optional. Pass the height of the image that you want to set.
    * @param {number} Optional. Pass the top of the image that you want to set.
    * @param {number} Optional. Pass the left of the image that you want to set.
    * @returns {string}
    */
  def setPicture(
    range: java.lang.String,
    url: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    top: scala.Double,
    left: scala.Double
  ): java.lang.String
}

object XLShape {
  @scala.inline
  def apply(
    setPicture: (java.lang.String, java.lang.String, scala.Double, scala.Double, scala.Double, scala.Double) => java.lang.String
  ): XLShape = {
    val __obj = js.Dynamic.literal(setPicture = js.Any.fromFunction6(setPicture))
  
    __obj.asInstanceOf[XLShape]
  }
}

