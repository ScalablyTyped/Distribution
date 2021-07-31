package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxFileManagerDetailsColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var columns: js.UndefOr[js.Array[dxFileManagerDetailsColumn | String]] = js.undefined
}
object `3` {
  
  @scala.inline
  def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[dxFileManagerDetailsColumn | String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (dxFileManagerDetailsColumn | String)*): Self = StObject.set(x, "columns", js.Array(value :_*))
  }
}
