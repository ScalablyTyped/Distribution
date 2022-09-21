package typings.extjs.Ext.grid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITemplateColumn
  extends StObject
     with typings.extjs.Ext.grid.column.IColumn {
  
  /** [Method] When defined this will take precedence over the renderer config
    * @param value Object
    * @param meta Object
    * @param record Object
    */
  @JSName("defaultRenderer")
  var defaultRenderer_ITemplateColumn: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[Any], 
      /* meta */ js.UndefOr[Any], 
      /* record */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
}
object ITemplateColumn {
  
  inline def apply(): ITemplateColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateColumn]
  }
  
  extension [Self <: ITemplateColumn](x: Self) {
    
    inline def setDefaultRenderer(
      value: (/* value */ js.UndefOr[Any], /* meta */ js.UndefOr[Any], /* record */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "defaultRenderer", js.Any.fromFunction3(value))
    
    inline def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
  }
}
