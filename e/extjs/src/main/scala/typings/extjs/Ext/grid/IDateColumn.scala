package typings.extjs.Ext.grid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateColumn
  extends typings.extjs.Ext.grid.column.IColumn {
  
  /** [Method] When defined this will take precedence over the renderer config
    * @param value Object
    */
  @JSName("defaultRenderer")
  var defaultRenderer_IDateColumn: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
}
object IDateColumn {
  
  @scala.inline
  def apply(): IDateColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateColumn]
  }
  
  @scala.inline
  implicit class IDateColumnMutableBuilder[Self <: IDateColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRenderer(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "defaultRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
