package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def setPicture(range: String, url: String, width: Double, height: Double, top: Double, left: Double): String = js.native
}
object XLShape {
  
  @scala.inline
  def apply(setPicture: (String, String, Double, Double, Double, Double) => String): XLShape = {
    val __obj = js.Dynamic.literal(setPicture = js.Any.fromFunction6(setPicture))
    __obj.asInstanceOf[XLShape]
  }
  
  @scala.inline
  implicit class XLShapeOps[Self <: XLShape] (val x: Self) extends AnyVal {
    
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
    def setSetPicture(value: (String, String, Double, Double, Double, Double) => String): Self = this.set("setPicture", js.Any.fromFunction6(value))
  }
}
