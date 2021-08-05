package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify developer metadata. To create new developer metadata use Range.addDeveloperMetadata(key), Sheet.addDeveloperMetadata(key), or Spreadsheet.addDeveloperMetadata(key).
  */
trait DeveloperMetadata extends StObject {
  
  def getId(): Integer
  
  def getKey(): String
  
  def getLocation(): DeveloperMetadataLocation
  
  def getValue(): String | Null
  
  def getVisibility(): DeveloperMetadataVisibility
  
  def moveToColumn(column: Range): DeveloperMetadata
  
  def moveToRow(row: Range): DeveloperMetadata
  
  def moveToSheet(sheet: Sheet): DeveloperMetadata
  
  def moveToSpreadsheet(): DeveloperMetadata
  
  def remove(): Unit
  
  def setKey(key: String): DeveloperMetadata
  
  def setValue(value: String): DeveloperMetadata
  
  def setVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadata
}
object DeveloperMetadata {
  
  inline def apply(
    getId: () => Integer,
    getKey: () => String,
    getLocation: () => DeveloperMetadataLocation,
    getValue: () => String | Null,
    getVisibility: () => DeveloperMetadataVisibility,
    moveToColumn: Range => DeveloperMetadata,
    moveToRow: Range => DeveloperMetadata,
    moveToSheet: Sheet => DeveloperMetadata,
    moveToSpreadsheet: () => DeveloperMetadata,
    remove: () => Unit,
    setKey: String => DeveloperMetadata,
    setValue: String => DeveloperMetadata,
    setVisibility: DeveloperMetadataVisibility => DeveloperMetadata
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getKey = js.Any.fromFunction0(getKey), getLocation = js.Any.fromFunction0(getLocation), getValue = js.Any.fromFunction0(getValue), getVisibility = js.Any.fromFunction0(getVisibility), moveToColumn = js.Any.fromFunction1(moveToColumn), moveToRow = js.Any.fromFunction1(moveToRow), moveToSheet = js.Any.fromFunction1(moveToSheet), moveToSpreadsheet = js.Any.fromFunction0(moveToSpreadsheet), remove = js.Any.fromFunction0(remove), setKey = js.Any.fromFunction1(setKey), setValue = js.Any.fromFunction1(setValue), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[DeveloperMetadata]
  }
  
  extension [Self <: DeveloperMetadata](x: Self) {
    
    inline def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetKey(value: () => String): Self = StObject.set(x, "getKey", js.Any.fromFunction0(value))
    
    inline def setGetLocation(value: () => DeveloperMetadataLocation): Self = StObject.set(x, "getLocation", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => String | Null): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetVisibility(value: () => DeveloperMetadataVisibility): Self = StObject.set(x, "getVisibility", js.Any.fromFunction0(value))
    
    inline def setMoveToColumn(value: Range => DeveloperMetadata): Self = StObject.set(x, "moveToColumn", js.Any.fromFunction1(value))
    
    inline def setMoveToRow(value: Range => DeveloperMetadata): Self = StObject.set(x, "moveToRow", js.Any.fromFunction1(value))
    
    inline def setMoveToSheet(value: Sheet => DeveloperMetadata): Self = StObject.set(x, "moveToSheet", js.Any.fromFunction1(value))
    
    inline def setMoveToSpreadsheet(value: () => DeveloperMetadata): Self = StObject.set(x, "moveToSpreadsheet", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSetKey(value: String => DeveloperMetadata): Self = StObject.set(x, "setKey", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: String => DeveloperMetadata): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetVisibility(value: DeveloperMetadataVisibility => DeveloperMetadata): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1(value))
  }
}
