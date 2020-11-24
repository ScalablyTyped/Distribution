package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSankeyConnectionInfoObject extends js.Object {
  
  /**
    * [descr:dxSankeyConnectionInfoObject.source]
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSankeyConnectionInfoObject.target]
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSankeyConnectionInfoObject.weight]
    */
  var weight: js.UndefOr[Double] = js.native
}
object dxSankeyConnectionInfoObject {
  
  @scala.inline
  def apply(): dxSankeyConnectionInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSankeyConnectionInfoObject]
  }
  
  @scala.inline
  implicit class dxSankeyConnectionInfoObjectOps[Self <: dxSankeyConnectionInfoObject] (val x: Self) extends AnyVal {
    
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
