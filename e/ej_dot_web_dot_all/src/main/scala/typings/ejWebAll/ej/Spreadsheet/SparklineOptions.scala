package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineOptions extends js.Object {
  
  /** Pass the high point color to create sparkline
    */
  var highPointColor: js.UndefOr[String] = js.native
  
  /** Pass the marker settings object to create sparkline
    */
  var markerSettings: js.UndefOr[js.Any] = js.native
  
  /** Pass the negative point color to create sparkline
    */
  var negativePointColor: js.UndefOr[String] = js.native
  
  /** Pass the start point color to create sparkline
    */
  var startPointColor: js.UndefOr[String] = js.native
}
object SparklineOptions {
  
  @scala.inline
  def apply(): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineOptions]
  }
  
  @scala.inline
  implicit class SparklineOptionsOps[Self <: SparklineOptions] (val x: Self) extends AnyVal {
    
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
    def setHighPointColor(value: String): Self = this.set("highPointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighPointColor: Self = this.set("highPointColor", js.undefined)
    
    @scala.inline
    def setMarkerSettings(value: js.Any): Self = this.set("markerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerSettings: Self = this.set("markerSettings", js.undefined)
    
    @scala.inline
    def setNegativePointColor(value: String): Self = this.set("negativePointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativePointColor: Self = this.set("negativePointColor", js.undefined)
    
    @scala.inline
    def setStartPointColor(value: String): Self = this.set("startPointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPointColor: Self = this.set("startPointColor", js.undefined)
  }
}
