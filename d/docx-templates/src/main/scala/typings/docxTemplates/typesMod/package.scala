package typings.docxTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ErrorHandler = js.Function2[/* e */ typings.std.Error, /* raw_code */ js.UndefOr[java.lang.String], js.Any]
  
  type Htmls = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type Images = org.scalablytyped.runtime.StringDictionary[typings.docxTemplates.typesMod.Image]
  
  type Links = org.scalablytyped.runtime.StringDictionary[typings.docxTemplates.typesMod.Link]
  
  type Query = java.lang.String
  
  type QueryResolver = js.Function2[
    /* query */ js.UndefOr[typings.docxTemplates.typesMod.Query], 
    /* queryVars */ js.Any, 
    typings.docxTemplates.typesMod.ReportData | js.Promise[typings.docxTemplates.typesMod.ReportData]
  ]
  
  type ReportData = js.Any
  
  type RunJSFunc = js.Function1[/* o */ typings.docxTemplates.anon.Ctx, typings.docxTemplates.anon.ModifiedSandbox]
  
  type VarValue = js.Any
}
