package typings.exceljs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AutoFilter = java.lang.String | typings.exceljs.anon.From
  
  type Buffer = typings.std.ArrayBuffer
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - typings.std.Date
    - js.UndefOr[scala.Nothing]
    - typings.exceljs.mod.CellErrorValue
    - typings.exceljs.mod.CellRichTextValue
    - typings.exceljs.mod.CellHyperlinkValue
    - typings.exceljs.mod.CellFormulaValue
    - typings.exceljs.mod.CellSharedFormulaValue
  */
  type CellValue = js.UndefOr[
    typings.exceljs.mod._CellValue | scala.Null | scala.Double | java.lang.String | scala.Boolean | typings.std.Date
  ]
  
  type DefinedNamesModel = js.Array[typings.exceljs.mod.DefinedNamesRanges]
  
  // https://c2fo.io/fast-csv/docs/parsing/options
  type HeaderArray = js.Array[js.UndefOr[java.lang.String | scala.Null]]
  
  type HeaderTransformFunction = js.Function1[/* headers */ typings.exceljs.mod.HeaderArray, typings.exceljs.mod.HeaderArray]
  
  type QuoteColumnMap = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type QuoteColumns = scala.Boolean | js.Array[scala.Boolean] | typings.exceljs.mod.QuoteColumnMap
  
  type RowArray = js.Array[java.lang.String]
  
  type RowHashArray = js.Array[js.Tuple2[java.lang.String, js.Any]]
  
  type RowMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type RowTransformCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error | scala.Null], 
    /* row */ js.UndefOr[typings.exceljs.mod.Rows], 
    scala.Unit
  ]
  
  type RowValues = js.UndefOr[
    js.Array[typings.exceljs.mod.CellValue] | org.scalablytyped.runtime.StringDictionary[typings.exceljs.mod.CellValue] | scala.Null
  ]
  
  type Rows = typings.exceljs.mod.RowArray | typings.exceljs.mod.RowMap | typings.exceljs.mod.RowHashArray
  
  type WorksheetView = typings.exceljs.mod.WorksheetViewCommon with (typings.exceljs.mod.WorksheetViewNormal | typings.exceljs.mod.WorksheetViewFrozen | typings.exceljs.mod.WorksheetViewSplit)
}
