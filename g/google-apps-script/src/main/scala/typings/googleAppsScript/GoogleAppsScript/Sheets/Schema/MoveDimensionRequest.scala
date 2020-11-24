package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveDimensionRequest extends js.Object {
  
  var destinationIndex: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[DimensionRange] = js.native
}
object MoveDimensionRequest {
  
  @scala.inline
  def apply(): MoveDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveDimensionRequest]
  }
  
  @scala.inline
  implicit class MoveDimensionRequestOps[Self <: MoveDimensionRequest] (val x: Self) extends AnyVal {
    
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
    def setDestinationIndex(value: Double): Self = this.set("destinationIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationIndex: Self = this.set("destinationIndex", js.undefined)
    
    @scala.inline
    def setSource(value: DimensionRange): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
