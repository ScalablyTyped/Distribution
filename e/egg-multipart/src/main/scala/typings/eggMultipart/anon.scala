package typings.eggMultipart

import typings.eggMultipart.mod.Context
import typings.eggMultipart.mod.MatchItem
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoFields extends StObject {
    
    var autoFields: js.UndefOr[Boolean] = js.native
    
    var cleanSchedule: js.UndefOr[ScheduleOptions] = js.native
    
    var defaultCharset: js.UndefOr[String] = js.native
    
    var fieldNameSize: js.UndefOr[Double] = js.native
    
    var fieldSize: js.UndefOr[String | Double] = js.native
    
    var fields: js.UndefOr[Double] = js.native
    
    var fileExtensions: js.UndefOr[js.Array[String]] = js.native
    
    var fileModeMatch: js.UndefOr[MatchItem | js.Array[MatchItem]] = js.native
    
    var fileSize: js.UndefOr[String | Double] = js.native
    
    var files: js.UndefOr[Double] = js.native
    
    var mode: js.UndefOr[String] = js.native
    
    var tmpdir: js.UndefOr[String] = js.native
    
    var whitelist: js.UndefOr[(js.Function1[/* filename */ String, Boolean]) | js.Array[String]] = js.native
  }
  object AutoFields {
    
    @scala.inline
    def apply(): AutoFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFields]
    }
    
    @scala.inline
    implicit class AutoFieldsMutableBuilder[Self <: AutoFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFields(value: Boolean): Self = StObject.set(x, "autoFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFieldsUndefined: Self = StObject.set(x, "autoFields", js.undefined)
      
      @scala.inline
      def setCleanSchedule(value: ScheduleOptions): Self = StObject.set(x, "cleanSchedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanScheduleUndefined: Self = StObject.set(x, "cleanSchedule", js.undefined)
      
      @scala.inline
      def setDefaultCharset(value: String): Self = StObject.set(x, "defaultCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCharsetUndefined: Self = StObject.set(x, "defaultCharset", js.undefined)
      
      @scala.inline
      def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      @scala.inline
      def setFieldSize(value: String | Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      @scala.inline
      def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFileExtensions(value: js.Array[String]): Self = StObject.set(x, "fileExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileExtensionsUndefined: Self = StObject.set(x, "fileExtensions", js.undefined)
      
      @scala.inline
      def setFileExtensionsVarargs(value: String*): Self = StObject.set(x, "fileExtensions", js.Array(value :_*))
      
      @scala.inline
      def setFileModeMatch(value: MatchItem | js.Array[MatchItem]): Self = StObject.set(x, "fileModeMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileModeMatchFunction1(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "fileModeMatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFileModeMatchUndefined: Self = StObject.set(x, "fileModeMatch", js.undefined)
      
      @scala.inline
      def setFileModeMatchVarargs(value: MatchItem*): Self = StObject.set(x, "fileModeMatch", js.Array(value :_*))
      
      @scala.inline
      def setFileSize(value: String | Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      @scala.inline
      def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setTmpdir(value: String): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpdirUndefined: Self = StObject.set(x, "tmpdir", js.undefined)
      
      @scala.inline
      def setWhitelist(value: (js.Function1[/* filename */ String, Boolean]) | js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "whitelist", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CurrentDate extends StObject {
    
    var currentDate: js.UndefOr[String | Double | Date] = js.native
    
    var endDate: js.UndefOr[String | Double | Date] = js.native
    
    var iterator: js.UndefOr[Boolean] = js.native
    
    var tz: js.UndefOr[String] = js.native
    
    var utc: js.UndefOr[Boolean] = js.native
  }
  object CurrentDate {
    
    @scala.inline
    def apply(): CurrentDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrentDate]
    }
    
    @scala.inline
    implicit class CurrentDateMutableBuilder[Self <: CurrentDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentDate(value: String | Double | Date): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      @scala.inline
      def setEndDate(value: String | Double | Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setIterator(value: Boolean): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIteratorUndefined: Self = StObject.set(x, "iterator", js.undefined)
      
      @scala.inline
      def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
      
      @scala.inline
      def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  @js.native
  trait FieldNameSize extends StObject {
    
    var fieldNameSize: js.UndefOr[Double] = js.native
    
    var fieldSize: js.UndefOr[Double] = js.native
    
    var fields: js.UndefOr[Double] = js.native
    
    var fileSize: js.UndefOr[Double] = js.native
    
    var files: js.UndefOr[Double] = js.native
    
    var headerPairs: js.UndefOr[Double] = js.native
    
    var parts: js.UndefOr[Double] = js.native
  }
  object FieldNameSize {
    
    @scala.inline
    def apply(): FieldNameSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNameSize]
    }
    
    @scala.inline
    implicit class FieldNameSizeMutableBuilder[Self <: FieldNameSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      @scala.inline
      def setFieldSize(value: Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      @scala.inline
      def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      @scala.inline
      def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setHeaderPairs(value: Double): Self = StObject.set(x, "headerPairs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPairsUndefined: Self = StObject.set(x, "headerPairs", js.undefined)
      
      @scala.inline
      def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    }
  }
}
