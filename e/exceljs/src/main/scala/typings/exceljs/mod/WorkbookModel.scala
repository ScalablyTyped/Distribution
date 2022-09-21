package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookModel extends StObject {
  
  var category: String
  
  var company: String
  
  var contentStatus: String
  
  var created: js.Date
  
  var creator: String
  
  var definedNames: DefinedNamesModel
  
  var description: String
  
  var keywords: String
  
  var language: String
  
  var lastModifiedBy: String
  
  var lastPrinted: js.Date
  
  var manager: String
  
  var media: js.Array[Media]
  
  var modified: js.Date
  
  var properties: WorkbookProperties
  
  var revision: js.Date
  
  var sheets: js.Array[WorksheetModel]
  
  var subject: String
  
  var themes: js.Array[String]
  
  var title: String
  
  var views: js.Array[WorkbookView]
  
  var worksheets: js.Array[Worksheet]
}
object WorkbookModel {
  
  inline def apply(
    category: String,
    company: String,
    contentStatus: String,
    created: js.Date,
    creator: String,
    definedNames: DefinedNamesModel,
    description: String,
    keywords: String,
    language: String,
    lastModifiedBy: String,
    lastPrinted: js.Date,
    manager: String,
    media: js.Array[Media],
    modified: js.Date,
    properties: WorkbookProperties,
    revision: js.Date,
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
  
  extension [Self <: WorkbookModel](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setContentStatus(value: String): Self = StObject.set(x, "contentStatus", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setDefinedNames(value: DefinedNamesModel): Self = StObject.set(x, "definedNames", value.asInstanceOf[js.Any])
    
    inline def setDefinedNamesVarargs(value: DefinedNamesRanges*): Self = StObject.set(x, "definedNames", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: String): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastPrinted(value: js.Date): Self = StObject.set(x, "lastPrinted", value.asInstanceOf[js.Any])
    
    inline def setManager(value: String): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: js.Array[Media]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaVarargs(value: Media*): Self = StObject.set(x, "media", js.Array(value*))
    
    inline def setModified(value: js.Date): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: WorkbookProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: js.Date): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setSheets(value: js.Array[WorksheetModel]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
    
    inline def setSheetsVarargs(value: WorksheetModel*): Self = StObject.set(x, "sheets", js.Array(value*))
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setThemes(value: js.Array[String]): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
    
    inline def setThemesVarargs(value: String*): Self = StObject.set(x, "themes", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setViews(value: js.Array[WorkbookView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsVarargs(value: WorkbookView*): Self = StObject.set(x, "views", js.Array(value*))
    
    inline def setWorksheets(value: js.Array[Worksheet]): Self = StObject.set(x, "worksheets", value.asInstanceOf[js.Any])
    
    inline def setWorksheetsVarargs(value: Worksheet*): Self = StObject.set(x, "worksheets", js.Array(value*))
  }
}
