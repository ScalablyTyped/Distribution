package typings.fastCsv

import typings.fastCsv.fieldFormatterMod.default
import typings.fastCsv.formatterOptionsMod.FormatterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/formatter/formatter", JSImport.Namespace)
@js.native
object formatterFormatterMod extends js.Object {
  @js.native
  class FieldFormatter protected () extends default {
    def this(formatterOptions: FormatterOptions) = this()
  }
  
  @js.native
  class RowFormatter protected ()
    extends typings.fastCsv.rowFormatterMod.default {
    def this(formatterOptions: FormatterOptions) = this()
  }
  
  /* static members */
  @js.native
  object RowFormatter extends js.Object {
    var createTransform: js.Any = js.native
    var gatherHeaders: js.Any = js.native
    var isHashArray: js.Any = js.native
  }
  
}

