package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DuplicateWorksheetBasicProperties extends StObject {
  
  /**
    * @description
    * unique ID to use for new sheet
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * @description
    * where to insert the new sheet (zero-indexed)
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * @description
    * name/title for new sheet, must be unique within the document
    */
  var title: js.UndefOr[String] = js.undefined
}
object DuplicateWorksheetBasicProperties {
  
  inline def apply(): DuplicateWorksheetBasicProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateWorksheetBasicProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DuplicateWorksheetBasicProperties] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
