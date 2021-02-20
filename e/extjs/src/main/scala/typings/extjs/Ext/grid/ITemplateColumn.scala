package typings.extjs.Ext.grid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITemplateColumn
  extends typings.extjs.Ext.grid.column.IColumn {
  
  /** [Method] When defined this will take precedence over the renderer config
    * @param value Object
    * @param meta Object
    * @param record Object
    */
  @JSName("defaultRenderer")
  var defaultRenderer_ITemplateColumn: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object ITemplateColumn {
  
  @scala.inline
  def apply(): ITemplateColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateColumn]
  }
  
  @scala.inline
  implicit class ITemplateColumnMutableBuilder[Self <: ITemplateColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRenderer(
      value: (/* value */ js.UndefOr[js.Any], /* meta */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "defaultRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
  }
}
