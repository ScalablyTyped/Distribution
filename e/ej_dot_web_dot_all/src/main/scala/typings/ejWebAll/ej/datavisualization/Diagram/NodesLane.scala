package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesLane extends js.Object {
  
  /** Allows to maintain additional information about lane
    * @Default {{}}
    */
  var addInfo: js.UndefOr[js.Any] = js.native
  
  /** An array of objects where each object represents a child node of the lane
    * @Default {[]}
    */
  var children: js.UndefOr[js.Array[_]] = js.native
  
  /** This property allows you to customize lanes appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Defines the fill color of the lane
    * @Default {white}
    */
  var fillColor: js.UndefOr[String] = js.native
  
  /** Defines the header of the lane
    * @Default {{ text: Function, fontSize: 11 }}
    */
  var header: js.UndefOr[js.Any] = js.native
  
  /** Defines the height of lane
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Defines the object as a lane
    * @Default {false}
    */
  var isLane: js.UndefOr[Boolean] = js.native
  
  /** Sets the unique identifier of the lane
    */
  var name: js.UndefOr[String] = js.native
  
  /** Sets the orientation of the lane.
    * @Default {vertical}
    */
  var orientation: js.UndefOr[String] = js.native
  
  /** Defines the width of lane
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
  
  /** Defines the z-index of the lane
    * @Default {0}
    */
  var zorder: js.UndefOr[Double] = js.native
}
object NodesLane {
  
  @scala.inline
  def apply(): NodesLane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesLane]
  }
  
  @scala.inline
  implicit class NodesLaneOps[Self <: NodesLane] (val x: Self) extends AnyVal {
    
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
    def setAddInfo(value: js.Any): Self = this.set("addInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddInfo: Self = this.set("addInfo", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: js.Any*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[_]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsLane(value: Boolean): Self = this.set("isLane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLane: Self = this.set("isLane", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZorder(value: Double): Self = this.set("zorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZorder: Self = this.set("zorder", js.undefined)
  }
}
