package typings.extjs.Ext.grid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INumberColumn
  extends typings.extjs.Ext.grid.column.IColumn {
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
}
object INumberColumn {
  
  @scala.inline
  def apply(): INumberColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumberColumn]
  }
  
  @scala.inline
  implicit class INumberColumnMutableBuilder[Self <: INumberColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
