package typings.exceljs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookModel extends js.Object {
  var category: String = js.native
  var company: String = js.native
  var contentStatus: String = js.native
  var created: Date = js.native
  var creator: String = js.native
  var definedNames: DefinedNamesModel = js.native
  var description: String = js.native
  var keywords: String = js.native
  var language: String = js.native
  var lastModifiedBy: String = js.native
  var lastPrinted: Date = js.native
  var manager: String = js.native
  var media: js.Array[Media] = js.native
  var modified: Date = js.native
  var properties: WorkbookProperties = js.native
  var revision: Date = js.native
  var sheets: js.Array[WorksheetModel] = js.native
  var subject: String = js.native
  var themes: js.Array[String] = js.native
  var title: String = js.native
  var views: js.Array[WorkbookView] = js.native
  var worksheets: js.Array[Worksheet] = js.native
}

object WorkbookModel {
  @scala.inline
  def apply(
    category: String,
    company: String,
    contentStatus: String,
    created: Date,
    creator: String,
    definedNames: DefinedNamesModel,
    description: String,
    keywords: String,
    language: String,
    lastModifiedBy: String,
    lastPrinted: Date,
    manager: String,
    media: js.Array[Media],
    modified: Date,
    properties: WorkbookProperties,
    revision: Date,
    sheets: js.Array[WorksheetModel],
    subject: String,
    themes: js.Array[String],
    title: String,
    views: js.Array[WorkbookView],
    worksheets: js.Array[Worksheet]
  ): WorkbookModel = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], contentStatus = contentStatus.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], definedNames = definedNames.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastPrinted = lastPrinted.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], sheets = sheets.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], worksheets = worksheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookModel]
  }
  @scala.inline
  implicit class WorkbookModelOps[Self <: WorkbookModel] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentStatus(value: String): Self = this.set("contentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Date): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: String): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinedNamesVarargs(value: DefinedNamesRanges*): Self = this.set("definedNames", js.Array(value :_*))
    @scala.inline
    def setDefinedNames(value: DefinedNamesModel): Self = this.set("definedNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeywords(value: String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedBy(value: String): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastPrinted(value: Date): Self = this.set("lastPrinted", value.asInstanceOf[js.Any])
    @scala.inline
    def setManager(value: String): Self = this.set("manager", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaVarargs(value: Media*): Self = this.set("media", js.Array(value :_*))
    @scala.inline
    def setMedia(value: js.Array[Media]): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: Date): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: WorkbookProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Date): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setSheetsVarargs(value: WorksheetModel*): Self = this.set("sheets", js.Array(value :_*))
    @scala.inline
    def setSheets(value: js.Array[WorksheetModel]): Self = this.set("sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemesVarargs(value: String*): Self = this.set("themes", js.Array(value :_*))
    @scala.inline
    def setThemes(value: js.Array[String]): Self = this.set("themes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewsVarargs(value: WorkbookView*): Self = this.set("views", js.Array(value :_*))
    @scala.inline
    def setViews(value: js.Array[WorkbookView]): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorksheetsVarargs(value: Worksheet*): Self = this.set("worksheets", js.Array(value :_*))
    @scala.inline
    def setWorksheets(value: js.Array[Worksheet]): Self = this.set("worksheets", value.asInstanceOf[js.Any])
  }
  
}

