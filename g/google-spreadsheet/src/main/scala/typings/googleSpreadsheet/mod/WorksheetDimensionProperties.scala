package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorksheetDimensionProperties extends StObject {
  
  /**
    * @see https://developers.google.com/sheets/api/reference/rest/v4/spreadsheets.developerMetadata#DeveloperMetadata
    */
  var developerMetadata: js.Array[DeveloperMetadata]
  
  var hiddenByFilter: Boolean
  
  var hiddenByUser: Boolean
  
  var pixelSize: Double
}
object WorksheetDimensionProperties {
  
  inline def apply(
    developerMetadata: js.Array[DeveloperMetadata],
    hiddenByFilter: Boolean,
    hiddenByUser: Boolean,
    pixelSize: Double
  ): WorksheetDimensionProperties = {
    val __obj = js.Dynamic.literal(developerMetadata = developerMetadata.asInstanceOf[js.Any], hiddenByFilter = hiddenByFilter.asInstanceOf[js.Any], hiddenByUser = hiddenByUser.asInstanceOf[js.Any], pixelSize = pixelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetDimensionProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorksheetDimensionProperties] (val x: Self) extends AnyVal {
    
    inline def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value*))
    
    inline def setHiddenByFilter(value: Boolean): Self = StObject.set(x, "hiddenByFilter", value.asInstanceOf[js.Any])
    
    inline def setHiddenByUser(value: Boolean): Self = StObject.set(x, "hiddenByUser", value.asInstanceOf[js.Any])
    
    inline def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
  }
}
