package typings.exceljs.exceljsMod

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
    val __obj = js.Dynamic.literal(category = category, company = company, contentStatus = contentStatus, created = created, creator = creator, definedNames = definedNames, description = description, keywords = keywords, language = language, lastModifiedBy = lastModifiedBy, lastPrinted = lastPrinted, manager = manager, media = media, modified = modified, properties = properties, revision = revision, sheets = sheets, subject = subject, themes = themes, title = title, views = views, worksheets = worksheets)
  
    __obj.asInstanceOf[WorkbookModel]
  }
}

