package typings.extjs.Ext.grid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDateColumn
  extends StObject
     with typings.extjs.Ext.grid.column.IColumn {
  
  /** [Method] When defined this will take precedence over the renderer config
    * @param value Object
    */
  @JSName("defaultRenderer")
  var defaultRenderer_IDateColumn: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
}
object IDateColumn {
  
  inline def apply(): IDateColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDateColumn] (val x: Self) extends AnyVal {
    
    inline def setDefaultRenderer(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "defaultRenderer", js.Any.fromFunction1(value))
    
    inline def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
