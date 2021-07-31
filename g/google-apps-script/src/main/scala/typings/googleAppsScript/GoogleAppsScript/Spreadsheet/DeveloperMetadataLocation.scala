package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access developer metadata location information.
  */
trait DeveloperMetadataLocation extends StObject {
  
  def getColumn(): Range | Null
  
  def getLocationType(): DeveloperMetadataLocationType
  
  def getRow(): Range | Null
  
  def getSheet(): Sheet | Null
  
  def getSpreadsheet(): typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null
}
object DeveloperMetadataLocation {
  
  @scala.inline
  def apply(
    getColumn: () => Range | Null,
    getLocationType: () => DeveloperMetadataLocationType,
    getRow: () => Range | Null,
    getSheet: () => Sheet | Null,
    getSpreadsheet: () => typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null
  ): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal(getColumn = js.Any.fromFunction0(getColumn), getLocationType = js.Any.fromFunction0(getLocationType), getRow = js.Any.fromFunction0(getRow), getSheet = js.Any.fromFunction0(getSheet), getSpreadsheet = js.Any.fromFunction0(getSpreadsheet))
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
  
  @scala.inline
  implicit class DeveloperMetadataLocationMutableBuilder[Self <: DeveloperMetadataLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetColumn(value: () => Range | Null): Self = StObject.set(x, "getColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocationType(value: () => DeveloperMetadataLocationType): Self = StObject.set(x, "getLocationType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRow(value: () => Range | Null): Self = StObject.set(x, "getRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSheet(value: () => Sheet | Null): Self = StObject.set(x, "getSheet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSpreadsheet(value: () => typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null): Self = StObject.set(x, "getSpreadsheet", js.Any.fromFunction0(value))
  }
}
