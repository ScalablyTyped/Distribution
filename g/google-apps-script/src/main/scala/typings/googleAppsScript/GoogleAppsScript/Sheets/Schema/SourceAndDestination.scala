package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceAndDestination extends js.Object {
  
  var dimension: js.UndefOr[String] = js.native
  
  var fillLength: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[GridRange] = js.native
}
object SourceAndDestination {
  
  @scala.inline
  def apply(): SourceAndDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceAndDestination]
  }
  
  @scala.inline
  implicit class SourceAndDestinationOps[Self <: SourceAndDestination] (val x: Self) extends AnyVal {
    
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
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    
    @scala.inline
    def setFillLength(value: Double): Self = this.set("fillLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillLength: Self = this.set("fillLength", js.undefined)
    
    @scala.inline
    def setSource(value: GridRange): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
