package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryYAxisMinorGridLines extends js.Object {
  
  /** Patterns of dashes and gaps used to stroke the minor grid lines.
    * @Default {null}
    */
  var dashArray: js.UndefOr[String] = js.native
  
  /** Show/hides the minor grid lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** Width of the minorGridLines.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}
object PrimaryYAxisMinorGridLines {
  
  @scala.inline
  def apply(): PrimaryYAxisMinorGridLines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxisMinorGridLines]
  }
  
  @scala.inline
  implicit class PrimaryYAxisMinorGridLinesOps[Self <: PrimaryYAxisMinorGridLines] (val x: Self) extends AnyVal {
    
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
    def setDashArray(value: String): Self = this.set("dashArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashArray: Self = this.set("dashArray", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
