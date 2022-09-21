package typings.eggMultipart

import typings.eggMultipart.mod.Context
import typings.eggMultipart.mod.MatchItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoFields extends StObject {
    
    var autoFields: js.UndefOr[Boolean] = js.undefined
    
    var cleanSchedule: js.UndefOr[ScheduleOptions] = js.undefined
    
    var defaultCharset: js.UndefOr[String] = js.undefined
    
    var fieldNameSize: js.UndefOr[Double] = js.undefined
    
    var fieldSize: js.UndefOr[String | Double] = js.undefined
    
    var fields: js.UndefOr[Double] = js.undefined
    
    var fileExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var fileModeMatch: js.UndefOr[MatchItem | js.Array[MatchItem]] = js.undefined
    
    var fileSize: js.UndefOr[String | Double] = js.undefined
    
    var files: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var tmpdir: js.UndefOr[String] = js.undefined
    
    var whitelist: js.UndefOr[(js.Function1[/* filename */ String, Boolean]) | js.Array[String]] = js.undefined
  }
  object AutoFields {
    
    inline def apply(): AutoFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFields]
    }
    
    extension [Self <: AutoFields](x: Self) {
      
      inline def setAutoFields(value: Boolean): Self = StObject.set(x, "autoFields", value.asInstanceOf[js.Any])
      
      inline def setAutoFieldsUndefined: Self = StObject.set(x, "autoFields", js.undefined)
      
      inline def setCleanSchedule(value: ScheduleOptions): Self = StObject.set(x, "cleanSchedule", value.asInstanceOf[js.Any])
      
      inline def setCleanScheduleUndefined: Self = StObject.set(x, "cleanSchedule", js.undefined)
      
      inline def setDefaultCharset(value: String): Self = StObject.set(x, "defaultCharset", value.asInstanceOf[js.Any])
      
      inline def setDefaultCharsetUndefined: Self = StObject.set(x, "defaultCharset", js.undefined)
      
      inline def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      inline def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      inline def setFieldSize(value: String | Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      inline def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      inline def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFileExtensions(value: js.Array[String]): Self = StObject.set(x, "fileExtensions", value.asInstanceOf[js.Any])
      
      inline def setFileExtensionsUndefined: Self = StObject.set(x, "fileExtensions", js.undefined)
      
      inline def setFileExtensionsVarargs(value: String*): Self = StObject.set(x, "fileExtensions", js.Array(value*))
      
      inline def setFileModeMatch(value: MatchItem | js.Array[MatchItem]): Self = StObject.set(x, "fileModeMatch", value.asInstanceOf[js.Any])
      
      inline def setFileModeMatchFunction1(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "fileModeMatch", js.Any.fromFunction1(value))
      
      inline def setFileModeMatchUndefined: Self = StObject.set(x, "fileModeMatch", js.undefined)
      
      inline def setFileModeMatchVarargs(value: MatchItem*): Self = StObject.set(x, "fileModeMatch", js.Array(value*))
      
      inline def setFileSize(value: String | Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      inline def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTmpdir(value: String): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      inline def setTmpdirUndefined: Self = StObject.set(x, "tmpdir", js.undefined)
      
      inline def setWhitelist(value: (js.Function1[/* filename */ String, Boolean]) | js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "whitelist", js.Any.fromFunction1(value))
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value*))
    }
  }
  
  trait CurrentDate extends StObject {
    
    var currentDate: js.UndefOr[String | Double | js.Date] = js.undefined
    
    var endDate: js.UndefOr[String | Double | js.Date] = js.undefined
    
    var iterator: js.UndefOr[Boolean] = js.undefined
    
    var tz: js.UndefOr[String] = js.undefined
    
    var utc: js.UndefOr[Boolean] = js.undefined
  }
  object CurrentDate {
    
    inline def apply(): CurrentDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrentDate]
    }
    
    extension [Self <: CurrentDate](x: Self) {
      
      inline def setCurrentDate(value: String | Double | js.Date): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      inline def setEndDate(value: String | Double | js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setIterator(value: Boolean): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
      
      inline def setIteratorUndefined: Self = StObject.set(x, "iterator", js.undefined)
      
      inline def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      inline def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
      
      inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  trait FieldNameSize extends StObject {
    
    var fieldNameSize: js.UndefOr[Double] = js.undefined
    
    var fieldSize: js.UndefOr[Double] = js.undefined
    
    var fields: js.UndefOr[Double] = js.undefined
    
    var fileSize: js.UndefOr[Double] = js.undefined
    
    var files: js.UndefOr[Double] = js.undefined
    
    var headerPairs: js.UndefOr[Double] = js.undefined
    
    var parts: js.UndefOr[Double] = js.undefined
  }
  object FieldNameSize {
    
    inline def apply(): FieldNameSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNameSize]
    }
    
    extension [Self <: FieldNameSize](x: Self) {
      
      inline def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      inline def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      inline def setFieldSize(value: Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      inline def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      inline def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      inline def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setHeaderPairs(value: Double): Self = StObject.set(x, "headerPairs", value.asInstanceOf[js.Any])
      
      inline def setHeaderPairsUndefined: Self = StObject.set(x, "headerPairs", js.undefined)
      
      inline def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    }
  }
}
