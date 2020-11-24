package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access the text rotation settings for a cell.
  */
@js.native
trait TextRotation extends js.Object {
  
  def getDegrees(): Integer = js.native
  
  def isVertical(): Boolean = js.native
}
object TextRotation {
  
  @scala.inline
  def apply(getDegrees: () => Integer, isVertical: () => Boolean): TextRotation = {
    val __obj = js.Dynamic.literal(getDegrees = js.Any.fromFunction0(getDegrees), isVertical = js.Any.fromFunction0(isVertical))
    __obj.asInstanceOf[TextRotation]
  }
  
  @scala.inline
  implicit class TextRotationOps[Self <: TextRotation] (val x: Self) extends AnyVal {
    
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
    def setGetDegrees(value: () => Integer): Self = this.set("getDegrees", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVertical(value: () => Boolean): Self = this.set("isVertical", js.Any.fromFunction0(value))
  }
}
