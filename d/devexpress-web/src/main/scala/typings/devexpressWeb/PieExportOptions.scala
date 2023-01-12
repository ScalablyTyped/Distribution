package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Pie dashboard item is exported.
  */
trait PieExportOptions extends StObject {
  
  /** @deprecated The PieExportOptions.AutoArrangeContent property is obsolete now. Use the DashboardPdfExportOptions.PieAutoArrangeContent property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether dashboard item elements are arranged automatically on the exported page.
    */
  var AutoArrangeContent: Boolean
}
object PieExportOptions {
  
  inline def apply(AutoArrangeContent: Boolean): PieExportOptions = {
    val __obj = js.Dynamic.literal(AutoArrangeContent = AutoArrangeContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieExportOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoArrangeContent(value: Boolean): Self = StObject.set(x, "AutoArrangeContent", value.asInstanceOf[js.Any])
  }
}
