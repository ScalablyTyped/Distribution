package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartBarColumnAnnotations extends ChartAnnotations {
  
  var alwaysOutside: js.UndefOr[Boolean] = js.native
}
object ChartBarColumnAnnotations {
  
  @scala.inline
  def apply(): ChartBarColumnAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBarColumnAnnotations]
  }
  
  @scala.inline
  implicit class ChartBarColumnAnnotationsOps[Self <: ChartBarColumnAnnotations] (val x: Self) extends AnyVal {
    
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
    def setAlwaysOutside(value: Boolean): Self = this.set("alwaysOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysOutside: Self = this.set("alwaysOutside", js.undefined)
  }
}
