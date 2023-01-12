package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxFileManagerDetailsColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  /**
    * Configures the columns.
    */
  var columns: js.UndefOr[js.Array[dxFileManagerDetailsColumn | String]] = js.undefined
}
object Columns {
  
  inline def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: js.Array[dxFileManagerDetailsColumn | String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: (dxFileManagerDetailsColumn | String)*): Self = StObject.set(x, "columns", js.Array(value*))
  }
}
