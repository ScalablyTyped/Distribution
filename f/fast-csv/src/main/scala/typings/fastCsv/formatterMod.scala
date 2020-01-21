package typings.fastCsv

import typings.fastCsv.csvFormatterStreamMod.default
import typings.fastCsv.formatterOptionsMod.FormatterOptionsArgs
import typings.fastCsv.typesMod.Row
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/formatter", JSImport.Namespace)
@js.native
object formatterMod extends js.Object {
  @js.native
  class CsvFormatterStream protected () extends default {
    def this(formatterOptions: typings.fastCsv.formatterOptionsMod.FormatterOptions) = this()
  }
  
  @js.native
  class FieldFormatter protected ()
    extends typings.fastCsv.formatterFormatterMod.FieldFormatter {
    def this(formatterOptions: typings.fastCsv.formatterOptionsMod.FormatterOptions) = this()
  }
  
  @js.native
  class FormatterOptions ()
    extends typings.fastCsv.formatterOptionsMod.FormatterOptions {
    def this(opts: FormatterOptionsArgs) = this()
  }
  
  @js.native
  class RowFormatter protected ()
    extends typings.fastCsv.formatterFormatterMod.RowFormatter {
    def this(formatterOptions: typings.fastCsv.formatterOptionsMod.FormatterOptions) = this()
  }
  
  def format(): default = js.native
  def format(options: FormatterOptionsArgs): default = js.native
  def write(rows: js.Array[Row]): default = js.native
  def write(rows: js.Array[Row], options: FormatterOptionsArgs): default = js.native
  def writeToBuffer(rows: js.Array[Row]): js.Promise[Buffer] = js.native
  def writeToBuffer(rows: js.Array[Row], opts: FormatterOptionsArgs): js.Promise[Buffer] = js.native
  def writeToPath(path: String, rows: js.Array[Row]): WriteStream = js.native
  def writeToPath(path: String, rows: js.Array[Row], options: FormatterOptionsArgs): WriteStream = js.native
  def writeToStream[T /* <: WritableStream */](ws: T, rows: js.Array[Row]): T = js.native
  def writeToStream[T /* <: WritableStream */](ws: T, rows: js.Array[Row], options: FormatterOptionsArgs): T = js.native
  def writeToString(rows: js.Array[Row]): js.Promise[String] = js.native
  def writeToString(rows: js.Array[Row], options: FormatterOptionsArgs): js.Promise[String] = js.native
  /* static members */
  @js.native
  object RowFormatter extends js.Object {
    var createTransform: js.Any = js.native
    var gatherHeaders: js.Any = js.native
    var isHashArray: js.Any = js.native
  }
  
}

