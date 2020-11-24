package typings.extjs.Ext.container

import typings.extjs.Ext.panel.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IButtonGroup extends IPanel {
  
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[String] = js.native
  
  /** [Method] private
    * @param component Object
    */
  @JSName("onBeforeAdd")
  var onBeforeAdd_IButtonGroup: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], Unit]] = js.native
}
object IButtonGroup {
  
  @scala.inline
  def apply(): IButtonGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonGroup]
  }
  
  @scala.inline
  implicit class IButtonGroupOps[Self <: IButtonGroup] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDefaultButtonUI(value: String): Self = this.set("defaultButtonUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultButtonUI: Self = this.set("defaultButtonUI", js.undefined)
    
    @scala.inline
    def setOnBeforeAdd(value: /* component */ js.UndefOr[js.Any] => Unit): Self = this.set("onBeforeAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeAdd: Self = this.set("onBeforeAdd", js.undefined)
  }
}
