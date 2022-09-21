package typings.fastCsvFormat

import typings.fastCsvFormat.formatterOptionsMod.FormatterOptions
import typings.fastCsvFormat.typesMod.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  @JSImport("@fast-csv/format/build/src/formatter", "FieldFormatter")
  @js.native
  open class FieldFormatter[I /* <: Row */, O /* <: Row */] protected ()
    extends typings.fastCsvFormat.fieldFormatterMod.FieldFormatter[I, O] {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
  }
  
  @JSImport("@fast-csv/format/build/src/formatter", "RowFormatter")
  @js.native
  open class RowFormatter[I /* <: Row */, O /* <: Row */] protected ()
    extends typings.fastCsvFormat.rowFormatterMod.RowFormatter[I, O] {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
  }
  /* static members */
  object RowFormatter {
    
    @JSImport("@fast-csv/format/build/src/formatter", "RowFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/format/build/src/formatter", "RowFormatter.createTransform")
    @js.native
    def createTransform: Any = js.native
    inline def createTransform_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTransform")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/format/build/src/formatter", "RowFormatter.gatherHeaders")
    @js.native
    def gatherHeaders: Any = js.native
    inline def gatherHeaders_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gatherHeaders")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/format/build/src/formatter", "RowFormatter.isRowArray")
    @js.native
    def isRowArray: Any = js.native
    inline def isRowArray_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRowArray")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/format/build/src/formatter", "RowFormatter.isRowHashArray")
    @js.native
    def isRowHashArray: Any = js.native
    inline def isRowHashArray_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRowHashArray")(x.asInstanceOf[js.Any])
  }
}
