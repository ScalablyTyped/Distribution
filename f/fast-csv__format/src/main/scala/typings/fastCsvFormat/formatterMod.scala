package typings.fastCsvFormat

import typings.fastCsvFormat.formatterOptionsMod.FormatterOptions
import typings.fastCsvFormat.typesMod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/format/build/src/formatter", JSImport.Namespace)
@js.native
object formatterMod extends js.Object {
  @js.native
  class FieldFormatter[I /* <: Row */, O /* <: Row */] protected ()
    extends typings.fastCsvFormat.fieldFormatterMod.FieldFormatter[I, O] {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
  }
  
  @js.native
  class RowFormatter[I /* <: Row */, O /* <: Row */] protected ()
    extends typings.fastCsvFormat.rowFormatterMod.RowFormatter[I, O] {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
  }
  
  /* static members */
  @js.native
  object RowFormatter extends js.Object {
    var createTransform: js.Any = js.native
    var gatherHeaders: js.Any = js.native
    var isHashArray: js.Any = js.native
  }
  
}

