package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportAll extends StObject {
  
  var exportAll: js.UndefOr[String] = js.native
  
  var exportSelectedRows: js.UndefOr[String] = js.native
  
  var exportTo: js.UndefOr[String] = js.native
}
object ExportAll {
  
  @scala.inline
  def apply(): ExportAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportAll]
  }
  
  @scala.inline
  implicit class ExportAllMutableBuilder[Self <: ExportAll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportAll(value: String): Self = StObject.set(x, "exportAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAllUndefined: Self = StObject.set(x, "exportAll", js.undefined)
    
    @scala.inline
    def setExportSelectedRows(value: String): Self = StObject.set(x, "exportSelectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportSelectedRowsUndefined: Self = StObject.set(x, "exportSelectedRows", js.undefined)
    
    @scala.inline
    def setExportTo(value: String): Self = StObject.set(x, "exportTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportToUndefined: Self = StObject.set(x, "exportTo", js.undefined)
  }
}
