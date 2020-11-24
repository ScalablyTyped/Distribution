package typings.eggMultipart.anon

import typings.eggMultipart.ScheduleOptions
import typings.eggMultipart.mod.Context
import typings.eggMultipart.mod.MatchItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFields extends js.Object {
  
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
  implicit class AutoFieldsOps[Self <: AutoFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoFields(value: Boolean): Self = this.set("autoFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFields: Self = this.set("autoFields", js.undefined)
    
    @scala.inline
    def setCleanSchedule(value: ScheduleOptions): Self = this.set("cleanSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanSchedule: Self = this.set("cleanSchedule", js.undefined)
    
    @scala.inline
    def setDefaultCharset(value: String): Self = this.set("defaultCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCharset: Self = this.set("defaultCharset", js.undefined)
    
    @scala.inline
    def setFieldNameSize(value: Double): Self = this.set("fieldNameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldNameSize: Self = this.set("fieldNameSize", js.undefined)
    
    @scala.inline
    def setFieldSize(value: String | Double): Self = this.set("fieldSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldSize: Self = this.set("fieldSize", js.undefined)
    
    @scala.inline
    def setFields(value: Double): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFileExtensionsVarargs(value: String*): Self = this.set("fileExtensions", js.Array(value :_*))
    
    @scala.inline
    def setFileExtensions(value: js.Array[String]): Self = this.set("fileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileExtensions: Self = this.set("fileExtensions", js.undefined)
    
    @scala.inline
    def setFileModeMatchVarargs(value: MatchItem*): Self = this.set("fileModeMatch", js.Array(value :_*))
    
    @scala.inline
    def setFileModeMatchFunction1(value: /* ctx */ Context => Boolean): Self = this.set("fileModeMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFileModeMatch(value: MatchItem | js.Array[MatchItem]): Self = this.set("fileModeMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileModeMatch: Self = this.set("fileModeMatch", js.undefined)
    
    @scala.inline
    def setFileSize(value: String | Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    
    @scala.inline
    def setFiles(value: Double): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setTmpdir(value: String): Self = this.set("tmpdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTmpdir: Self = this.set("tmpdir", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistFunction1(value: /* filename */ String => Boolean): Self = this.set("whitelist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhitelist(value: (js.Function1[/* filename */ String, Boolean]) | js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}
