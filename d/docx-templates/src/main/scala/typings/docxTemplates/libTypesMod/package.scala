package typings.docxTemplates.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.docxTemplates.anon.Ctx
import typings.docxTemplates.anon.ModifiedSandbox
import typings.docxTemplates.docxTemplatesStrings.ALIAS
import typings.docxTemplates.docxTemplatesStrings.CMD_NODE
import typings.docxTemplates.docxTemplatesStrings.Dotgif
import typings.docxTemplates.docxTemplatesStrings.Dotjpeg
import typings.docxTemplates.docxTemplatesStrings.Dotjpg
import typings.docxTemplates.docxTemplatesStrings.Dotpng
import typings.docxTemplates.docxTemplatesStrings.Dotsvg
import typings.docxTemplates.docxTemplatesStrings.EXEC
import typings.docxTemplates.docxTemplatesStrings.FOR
import typings.docxTemplates.docxTemplatesStrings.HTML
import typings.docxTemplates.docxTemplatesStrings.IF
import typings.docxTemplates.docxTemplatesStrings.IMAGE
import typings.docxTemplates.docxTemplatesStrings.INS
import typings.docxTemplates.docxTemplatesStrings.LINK
import typings.docxTemplates.docxTemplatesStrings.QUERY
import typings.docxTemplates.docxTemplatesStrings.`END-FOR`
import typings.docxTemplates.docxTemplatesStrings.`END-IF`
import typings.docxTemplates.libTypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BUILT_IN_COMMANDS: js.Tuple12[QUERY, CMD_NODE, ALIAS, FOR, `END-FOR`, IF, `END-IF`, INS, EXEC, IMAGE, LINK, HTML] = ^.asInstanceOf[js.Dynamic].selectDynamic("BUILT_IN_COMMANDS").asInstanceOf[js.Tuple12[QUERY, CMD_NODE, ALIAS, FOR, `END-FOR`, IF, `END-IF`, INS, EXEC, IMAGE, LINK, HTML]]

inline def ImageExtensions: js.Tuple5[Dotpng, Dotgif, Dotjpg, Dotjpeg, Dotsvg] = ^.asInstanceOf[js.Dynamic].selectDynamic("ImageExtensions").asInstanceOf[js.Tuple5[Dotpng, Dotgif, Dotjpg, Dotjpeg, Dotsvg]]

type ErrorHandler = js.Function2[/* e */ js.Error, /* raw_code */ js.UndefOr[String], Any]

type Htmls = StringDictionary[String]

type Images = StringDictionary[Image]

type Links = StringDictionary[Link]

type QueryResolver = js.Function2[
/* query */ js.UndefOr[String], 
/* queryVars */ Any, 
ReportData | js.Promise[ReportData]]

type ReportData = Any

type RunJSFunc = js.Function1[/* o */ Ctx, ModifiedSandbox]

type VarValue = Any
