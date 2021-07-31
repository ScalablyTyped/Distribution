package typings.fastCsvFormat

import typings.fastCsvFormat.formatterOptionsMod.FormatterOptions
import typings.fastCsvFormat.typesMod.Row
import typings.fastCsvFormat.typesMod.RowArray
import typings.fastCsvFormat.typesMod.RowTransformFunction
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowFormatterMod {
  
  @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter")
  @js.native
  class RowFormatter[I /* <: Row */, O /* <: Row */] protected () extends StObject {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
    
    var _rowTransform: js.Any = js.native
    
    var callTransformer: js.Any = js.native
    
    var checkHeaders: js.Any = js.native
    
    val fieldFormatter: js.Any = js.native
    
    def finish(cb: RowFormatterCallback): Unit = js.native
    
    def format(row: I, cb: RowFormatterCallback): Unit = js.native
    
    var formatColumns: js.Any = js.native
    
    val formatterOptions: js.Any = js.native
    
    var gatherColumns: js.Any = js.native
    
    var hasWrittenHeaders: js.Any = js.native
    
    var headers: js.Any = js.native
    
    var rowCount: js.Any = js.native
    
    def rowTransform_=(transformFunction: RowTransformFunction[I, O]): Unit = js.native
    
    val shouldWriteHeaders: js.Any = js.native
  }
  /* static members */
  object RowFormatter {
    
    @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter.createTransform")
    @js.native
    def createTransform: js.Any = js.native
    @scala.inline
    def createTransform_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTransform")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter.gatherHeaders")
    @js.native
    def gatherHeaders: js.Any = js.native
    @scala.inline
    def gatherHeaders_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gatherHeaders")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter.isRowArray")
    @js.native
    def isRowArray: js.Any = js.native
    @scala.inline
    def isRowArray_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRowArray")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/format/build/src/formatter/RowFormatter", "RowFormatter.isRowHashArray")
    @js.native
    def isRowHashArray: js.Any = js.native
    @scala.inline
    def isRowHashArray_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRowHashArray")(x.asInstanceOf[js.Any])
  }
  
  type RowFormatterCallback = js.Function2[/* error */ Error | Null, /* data */ js.UndefOr[RowArray], Unit]
}
