package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagingBase extends StObject {
  
  /**
    * Enables paging.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the page to be displayed using a zero-based index.
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}
object PagingBase {
  
  inline def apply(): PagingBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagingBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagingBase] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
