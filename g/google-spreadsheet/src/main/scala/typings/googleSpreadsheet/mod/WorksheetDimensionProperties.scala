package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetDimensionProperties extends StObject {
  
  /**
    * @see https://developers.google.com/sheets/api/reference/rest/v4/spreadsheets.developerMetadata#DeveloperMetadata
    */
  var developerMetadata: js.Array[DeveloperMetadata] = js.native
  
  var hiddenByFilter: Boolean = js.native
  
  var hiddenByUser: Boolean = js.native
  
  var pixelSize: Double = js.native
}
object WorksheetDimensionProperties {
  
  @scala.inline
  def apply(
    developerMetadata: js.Array[DeveloperMetadata],
    hiddenByFilter: Boolean,
    hiddenByUser: Boolean,
    pixelSize: Double
  ): WorksheetDimensionProperties = {
    val __obj = js.Dynamic.literal(developerMetadata = developerMetadata.asInstanceOf[js.Any], hiddenByFilter = hiddenByFilter.asInstanceOf[js.Any], hiddenByUser = hiddenByUser.asInstanceOf[js.Any], pixelSize = pixelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetDimensionProperties]
  }
  
  @scala.inline
  implicit class WorksheetDimensionPropertiesMutableBuilder[Self <: WorksheetDimensionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
    
    @scala.inline
    def setHiddenByFilter(value: Boolean): Self = StObject.set(x, "hiddenByFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenByUser(value: Boolean): Self = StObject.set(x, "hiddenByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
  }
}
