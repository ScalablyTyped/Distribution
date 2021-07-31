package typings.docxTemplates.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def BUILT_IN_COMMANDS: js.Tuple12[
typings.docxTemplates.docxTemplatesStrings.QUERY, 
typings.docxTemplates.docxTemplatesStrings.CMD_NODE, 
typings.docxTemplates.docxTemplatesStrings.ALIAS, 
typings.docxTemplates.docxTemplatesStrings.FOR, 
typings.docxTemplates.docxTemplatesStrings.`END-FOR`, 
typings.docxTemplates.docxTemplatesStrings.IF, 
typings.docxTemplates.docxTemplatesStrings.`END-IF`, 
typings.docxTemplates.docxTemplatesStrings.INS, 
typings.docxTemplates.docxTemplatesStrings.EXEC, 
typings.docxTemplates.docxTemplatesStrings.IMAGE, 
typings.docxTemplates.docxTemplatesStrings.LINK, 
typings.docxTemplates.docxTemplatesStrings.HTML] = typings.docxTemplates.typesMod.^.asInstanceOf[js.Dynamic].selectDynamic("BUILT_IN_COMMANDS").asInstanceOf[js.Tuple12[
typings.docxTemplates.docxTemplatesStrings.QUERY, 
typings.docxTemplates.docxTemplatesStrings.CMD_NODE, 
typings.docxTemplates.docxTemplatesStrings.ALIAS, 
typings.docxTemplates.docxTemplatesStrings.FOR, 
typings.docxTemplates.docxTemplatesStrings.`END-FOR`, 
typings.docxTemplates.docxTemplatesStrings.IF, 
typings.docxTemplates.docxTemplatesStrings.`END-IF`, 
typings.docxTemplates.docxTemplatesStrings.INS, 
typings.docxTemplates.docxTemplatesStrings.EXEC, 
typings.docxTemplates.docxTemplatesStrings.IMAGE, 
typings.docxTemplates.docxTemplatesStrings.LINK, 
typings.docxTemplates.docxTemplatesStrings.HTML]]

@scala.inline
def ImageExtensions: js.Tuple5[
typings.docxTemplates.docxTemplatesStrings.Dotpng, 
typings.docxTemplates.docxTemplatesStrings.Dotgif, 
typings.docxTemplates.docxTemplatesStrings.Dotjpg, 
typings.docxTemplates.docxTemplatesStrings.Dotjpeg, 
typings.docxTemplates.docxTemplatesStrings.Dotsvg] = typings.docxTemplates.typesMod.^.asInstanceOf[js.Dynamic].selectDynamic("ImageExtensions").asInstanceOf[js.Tuple5[
typings.docxTemplates.docxTemplatesStrings.Dotpng, 
typings.docxTemplates.docxTemplatesStrings.Dotgif, 
typings.docxTemplates.docxTemplatesStrings.Dotjpg, 
typings.docxTemplates.docxTemplatesStrings.Dotjpeg, 
typings.docxTemplates.docxTemplatesStrings.Dotsvg]]

type ErrorHandler = js.Function2[/* e */ typings.std.Error, /* raw_code */ js.UndefOr[java.lang.String], js.Any]

type Htmls = org.scalablytyped.runtime.StringDictionary[java.lang.String]

type Images = org.scalablytyped.runtime.StringDictionary[typings.docxTemplates.typesMod.Image]

type Links = org.scalablytyped.runtime.StringDictionary[typings.docxTemplates.typesMod.Link]

type Query = java.lang.String

type QueryResolver = js.Function2[
/* query */ js.UndefOr[typings.docxTemplates.typesMod.Query], 
/* queryVars */ js.Any, 
typings.docxTemplates.typesMod.ReportData | js.Promise[typings.docxTemplates.typesMod.ReportData]]

type ReportData = js.Any

type RunJSFunc = js.Function1[/* o */ typings.docxTemplates.anon.Ctx, typings.docxTemplates.anon.ModifiedSandbox]

type VarValue = js.Any
