package typings.fastDashCsv

import typings.fastDashCsv.buildSrcFormatterCsvFormatterStreamMod.default
import typings.fastDashCsv.buildSrcFormatterFormatterOptionsMod.FormatterOptionsArgs
import typings.fastDashCsv.buildSrcFormatterTypesMod.Row
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/formatter", JSImport.Namespace)
@js.native
object buildSrcFormatterMod extends js.Object {
  @js.native
  class CsvFormatterStream protected () extends default {
    def this(formatterOptions: typings.fastDashCsv.buildSrcFormatterFormatterOptionsMod.FormatterOptions) = this()
  }
  
  @js.native
  class FormatterOptions ()
    extends typings.fastDashCsv.buildSrcFormatterFormatterOptionsMod.FormatterOptions {
    def this(opts: FormatterOptionsArgs) = this()
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
}

