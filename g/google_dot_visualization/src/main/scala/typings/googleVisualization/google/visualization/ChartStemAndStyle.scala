package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartStemAndStyle extends js.Object {
  
  var stem: js.UndefOr[ChartStem] = js.native
  
  var style: js.UndefOr[String] = js.native
}
object ChartStemAndStyle {
  
  @scala.inline
  def apply(): ChartStemAndStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartStemAndStyle]
  }
  
  @scala.inline
  implicit class ChartStemAndStyleOps[Self <: ChartStemAndStyle] (val x: Self) extends AnyVal {
    
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
    def setStem(value: ChartStem): Self = this.set("stem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStem: Self = this.set("stem", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
