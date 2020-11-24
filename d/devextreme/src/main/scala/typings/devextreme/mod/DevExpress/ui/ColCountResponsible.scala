package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColCountResponsible extends js.Object {
  
  /**
    * [descr:ColCountResponsible.lg]
    */
  var lg: js.UndefOr[Double] = js.native
  
  /**
    * [descr:ColCountResponsible.md]
    */
  var md: js.UndefOr[Double] = js.native
  
  /**
    * [descr:ColCountResponsible.sm]
    */
  var sm: js.UndefOr[Double] = js.native
  
  /**
    * [descr:ColCountResponsible.xs]
    */
  var xs: js.UndefOr[Double] = js.native
}
object ColCountResponsible {
  
  @scala.inline
  def apply(): ColCountResponsible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColCountResponsible]
  }
  
  @scala.inline
  implicit class ColCountResponsibleOps[Self <: ColCountResponsible] (val x: Self) extends AnyVal {
    
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
    def setLg(value: Double): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    
    @scala.inline
    def setMd(value: Double): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    
    @scala.inline
    def setSm(value: Double): Self = this.set("sm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSm: Self = this.set("sm", js.undefined)
    
    @scala.inline
    def setXs(value: Double): Self = this.set("xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
  }
}
