package typings.fastCsv.rowFormatterMod

import typings.fastCsv.formatterOptionsMod.FormatterOptions
import typings.fastCsv.typesMod.Row
import typings.fastCsv.typesMod.RowTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/formatter/formatter/RowFormatter", JSImport.Default)
@js.native
class default protected () extends RowFormatter {
  def this(formatterOptions: FormatterOptions) = this()
  /* CompleteClass */
  override var callTransformer: js.Any = js.native
  /* CompleteClass */
  override var checkHeaders: js.Any = js.native
  /* CompleteClass */
  override val fieldFormatter: js.Any = js.native
  /* CompleteClass */
  override var formatColumns: js.Any = js.native
  /* CompleteClass */
  override val formatterOptions: js.Any = js.native
  /* CompleteClass */
  override var gatherColumns: js.Any = js.native
  /* CompleteClass */
  override var hasWrittenHeaders: js.Any = js.native
  /* CompleteClass */
  override var headers: js.Any = js.native
  /* CompleteClass */
  override var rowCount: js.Any = js.native
  /* CompleteClass */
  override var shouldWriteHeaders: js.Any = js.native
  /* CompleteClass */
  override def finish(cb: RowFormatterCallback): Unit = js.native
  /* CompleteClass */
  override def format(row: Row, cb: RowFormatterCallback): Unit = js.native
  /* CompleteClass */
  override def rowTransform(transformFunction: RowTransformFunction): js.Any = js.native
}

/* static members */
@JSImport("fast-csv/build/src/formatter/formatter/RowFormatter", JSImport.Default)
@js.native
object default extends js.Object {
  var createTransform: js.Any = js.native
  var gatherHeaders: js.Any = js.native
  var isHashArray: js.Any = js.native
}

