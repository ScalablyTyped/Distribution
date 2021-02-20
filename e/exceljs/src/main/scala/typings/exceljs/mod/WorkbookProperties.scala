package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookProperties extends StObject {
  
  /**
  	 * Set workbook dates to 1904 date system
  	 */
  var date1904: Boolean = js.native
}
object WorkbookProperties {
  
  @scala.inline
  def apply(date1904: Boolean): WorkbookProperties = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookProperties]
  }
  
  @scala.inline
  implicit class WorkbookPropertiesMutableBuilder[Self <: WorkbookProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate1904(value: Boolean): Self = StObject.set(x, "date1904", value.asInstanceOf[js.Any])
  }
}
