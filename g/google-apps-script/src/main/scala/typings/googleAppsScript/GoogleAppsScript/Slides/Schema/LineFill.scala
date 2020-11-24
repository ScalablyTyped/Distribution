package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineFill extends js.Object {
  
  var solidFill: js.UndefOr[SolidFill] = js.native
}
object LineFill {
  
  @scala.inline
  def apply(): LineFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineFill]
  }
  
  @scala.inline
  implicit class LineFillOps[Self <: LineFill] (val x: Self) extends AnyVal {
    
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
    def setSolidFill(value: SolidFill): Self = this.set("solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolidFill: Self = this.set("solidFill", js.undefined)
  }
}
