package typings.exceljs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookModel extends js.Object {
  var category: String
  var company: String
  var contentStatus: String
  var created: Date
  var creator: String
  var definedNames: DefinedNamesModel
  var description: String
  var keywords: String
  var language: String
  var lastModifiedBy: String
  var lastPrinted: Date
  var manager: String
  var media: js.Array[Media]
  var modified: Date
  var properties: WorkbookProperties
  var revision: Date
  var sheets: js.Array[WorksheetModel]
  var subject: String
  var themes: js.Array[String]
  var title: String
  var views: js.Array[WorkbookView]
  var worksheets: js.Array[Worksheet]
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
}

