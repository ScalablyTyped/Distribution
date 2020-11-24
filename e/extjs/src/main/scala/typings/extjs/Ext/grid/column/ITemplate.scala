package typings.extjs.Ext.grid.column

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITemplate extends IColumn {
  
  /** [Method] When defined this will take precedence over the renderer config
    * @param value Object
    * @param meta Object
    * @param record Object
    */
  @JSName("defaultRenderer")
  var defaultRenderer_ITemplate: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object ITemplate {
  
  @scala.inline
  def apply(): ITemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplate]
  }
  
  @scala.inline
  implicit class ITemplateOps[Self <: ITemplate] (val x: Self) extends AnyVal {
    
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
    def setDefaultRenderer(
      value: (/* value */ js.UndefOr[js.Any], /* meta */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("defaultRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDefaultRenderer: Self = this.set("defaultRenderer", js.undefined)
  }
}
