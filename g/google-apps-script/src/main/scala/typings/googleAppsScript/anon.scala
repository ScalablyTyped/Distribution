package typings.googleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Integer
import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CommentsOnly extends StObject {
    
    var commentsOnly: js.UndefOr[Boolean] = js.undefined
    
    var contentsOnly: js.UndefOr[Boolean] = js.undefined
    
    var formatOnly: js.UndefOr[Boolean] = js.undefined
    
    var skipFilteredRows: js.UndefOr[Boolean] = js.undefined
    
    var validationsOnly: js.UndefOr[Boolean] = js.undefined
  }
  object CommentsOnly {
    
    inline def apply(): CommentsOnly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentsOnly]
    }
    
    extension [Self <: CommentsOnly](x: Self) {
      
      inline def setCommentsOnly(value: Boolean): Self = StObject.set(x, "commentsOnly", value.asInstanceOf[js.Any])
      
      inline def setCommentsOnlyUndefined: Self = StObject.set(x, "commentsOnly", js.undefined)
      
      inline def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
      
      inline def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
      
      inline def setFormatOnly(value: Boolean): Self = StObject.set(x, "formatOnly", value.asInstanceOf[js.Any])
      
      inline def setFormatOnlyUndefined: Self = StObject.set(x, "formatOnly", js.undefined)
      
      inline def setSkipFilteredRows(value: Boolean): Self = StObject.set(x, "skipFilteredRows", value.asInstanceOf[js.Any])
      
      inline def setSkipFilteredRowsUndefined: Self = StObject.set(x, "skipFilteredRows", js.undefined)
      
      inline def setValidationsOnly(value: Boolean): Self = StObject.set(x, "validationsOnly", value.asInstanceOf[js.Any])
      
      inline def setValidationsOnlyUndefined: Self = StObject.set(x, "validationsOnly", js.undefined)
    }
  }
  
  trait ContentsOnly extends StObject {
    
    var contentsOnly: js.UndefOr[Boolean] = js.undefined
    
    var formatOnly: js.UndefOr[Boolean] = js.undefined
  }
  object ContentsOnly {
    
    inline def apply(): ContentsOnly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentsOnly]
    }
    
    extension [Self <: ContentsOnly](x: Self) {
      
      inline def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
      
      inline def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
      
      inline def setFormatOnly(value: Boolean): Self = StObject.set(x, "formatOnly", value.asInstanceOf[js.Any])
      
      inline def setFormatOnlyUndefined: Self = StObject.set(x, "formatOnly", js.undefined)
    }
  }
  
  trait FunctionName extends StObject {
    
    var functionName: String
    
    var name: String
  }
  object FunctionName {
    
    inline def apply(functionName: String, name: String): FunctionName = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionName]
    }
    
    extension [Self <: FunctionName](x: Self) {
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var max: js.UndefOr[Integer] = js.undefined
    
    var start: js.UndefOr[Integer] = js.undefined
  }
  object Max {
    
    inline def apply(): Max = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Integer): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setStart(value: Integer): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Template extends StObject {
    
    var template: js.UndefOr[Sheet] = js.undefined
  }
  object Template {
    
    inline def apply(): Template = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Template]
    }
    
    extension [Self <: Template](x: Self) {
      
      inline def setTemplate(value: Sheet): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
