package typings.forms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined forms.forms.WidgetParameters & {  rows :number | undefined,   cols :number | undefined} */
@js.native
trait WidgetParametersrowsnumbe extends js.Object {
  
  /** Custom classes to add to the rendered widget. */
  var classes: js.UndefOr[js.Array[String]] = js.native
  
  var cols: js.UndefOr[Double] = js.native
  
  /** Custom classes to add to the choices label when applicable (multipleRadio and multipleCheckbox) */
  var labelClasses: js.UndefOr[js.Array[String]] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  /** A string representing the widget type, e.g. 'text' or 'checkbox' */
  var `type`: js.UndefOr[String] = js.native
}
object WidgetParametersrowsnumbe {
  
  @scala.inline
  def apply(): WidgetParametersrowsnumbe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetParametersrowsnumbe]
  }
  
  @scala.inline
  implicit class WidgetParametersrowsnumbeOps[Self <: WidgetParametersrowsnumbe] (val x: Self) extends AnyVal {
    
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
    def setClassesVarargs(value: String*): Self = this.set("classes", js.Array(value :_*))
    
    @scala.inline
    def setClasses(value: js.Array[String]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setLabelClassesVarargs(value: String*): Self = this.set("labelClasses", js.Array(value :_*))
    
    @scala.inline
    def setLabelClasses(value: js.Array[String]): Self = this.set("labelClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelClasses: Self = this.set("labelClasses", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
