package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramConnector extends dxDiagramItem {
  
  /**
    * [descr:dxDiagramConnector.fromId]
    */
  var fromId: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxDiagramConnector.fromKey]
    */
  var fromKey: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxDiagramConnector.fromPointIndex]
    */
  var fromPointIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxDiagramConnector.points]
    */
  var points: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:dxDiagramConnector.texts]
    */
  var texts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [descr:dxDiagramConnector.toId]
    */
  var toId: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxDiagramConnector.toKey]
    */
  var toKey: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxDiagramConnector.toPointIndex]
    */
  var toPointIndex: js.UndefOr[Double] = js.native
}
object dxDiagramConnector {
  
  @scala.inline
  def apply(): dxDiagramConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramConnector]
  }
  
  @scala.inline
  implicit class dxDiagramConnectorOps[Self <: dxDiagramConnector] (val x: Self) extends AnyVal {
    
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
    def setFromId(value: String): Self = this.set("fromId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromId: Self = this.set("fromId", js.undefined)
    
    @scala.inline
    def setFromKey(value: js.Any): Self = this.set("fromKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromKey: Self = this.set("fromKey", js.undefined)
    
    @scala.inline
    def setFromPointIndex(value: Double): Self = this.set("fromPointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromPointIndex: Self = this.set("fromPointIndex", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: js.Any*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[_]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setTextsVarargs(value: String*): Self = this.set("texts", js.Array(value :_*))
    
    @scala.inline
    def setTexts(value: js.Array[String]): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
    
    @scala.inline
    def setToId(value: String): Self = this.set("toId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToId: Self = this.set("toId", js.undefined)
    
    @scala.inline
    def setToKey(value: js.Any): Self = this.set("toKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToKey: Self = this.set("toKey", js.undefined)
    
    @scala.inline
    def setToPointIndex(value: Double): Self = this.set("toPointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToPointIndex: Self = this.set("toPointIndex", js.undefined)
  }
}
