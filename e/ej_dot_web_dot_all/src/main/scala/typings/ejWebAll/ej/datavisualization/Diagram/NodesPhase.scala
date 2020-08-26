package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesPhase extends js.Object {
  /** Defines the header of the smaller regions
    * @Default {null}
    */
  var label: js.UndefOr[js.Any] = js.native
  /** Defines the line color of the splitter that splits adjacent phases.
    * @Default {#606060}
    */
  var lineColor: js.UndefOr[String] = js.native
  /** Sets the dash array that used to stroke the phase splitter
    * @Default {3,3}
    */
  var lineDashArray: js.UndefOr[String] = js.native
  /** Sets the lineWidth of the phase
    * @Default {1}
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /** Sets the unique identifier of the phase
    */
  var name: js.UndefOr[String] = js.native
  /** Sets the length of the smaller region(phase) of a swimlane
    * @Default {100}
    */
  var offset: js.UndefOr[Double] = js.native
  /** Sets the orientation of the phase
    * @Default {horizontal}
    */
  var orientation: js.UndefOr[String] = js.native
  /** Sets the type of the object as phase
    * @Default {phase}
    */
  var `type`: js.UndefOr[String] = js.native
}

object NodesPhase {
  @scala.inline
  def apply(): NodesPhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesPhase]
  }
  @scala.inline
  implicit class NodesPhaseOps[Self <: NodesPhase] (val x: Self) extends AnyVal {
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
    def setLabel(value: js.Any): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineDashArray(value: String): Self = this.set("lineDashArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDashArray: Self = this.set("lineDashArray", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

