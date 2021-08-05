package typings.exceljs.mod

import typings.exceljs.exceljsStrings.normal
import typings.exceljs.exceljsStrings.pageBreakPreview
import typings.exceljs.exceljsStrings.pageLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorksheetViewNormal extends StObject {
  
  /**
  	 * Controls the view state
  	 */
  var state: normal
  
  /**
  	 * Presentation style
  	 */
  var style: pageBreakPreview | pageLayout
}
object WorksheetViewNormal {
  
  inline def apply(style: pageBreakPreview | pageLayout): WorksheetViewNormal = {
    val __obj = js.Dynamic.literal(state = "normal", style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewNormal]
  }
  
  extension [Self <: WorksheetViewNormal](x: Self) {
    
    inline def setState(value: normal): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: pageBreakPreview | pageLayout): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
