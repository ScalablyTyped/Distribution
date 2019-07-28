package typings.exceljs.exceljsMod

import typings.exceljs.exceljsMod.streamNs.xlsxNs.WorkbookWriterOptions
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("exceljs", "stream")
@js.native
object streamNs extends js.Object {
  @JSName("xlsx")
  @js.native
  object xlsxNs extends js.Object {
    @js.native
    class WorkbookWriter protected () extends Workbook {
      def this(options: WorkbookWriterOptions) = this()
    }
    
    trait WorkbookWriterOptions extends js.Object {
      /**
      			 * 	If stream not specified, this field specifies the path to a file to write the XLSX workbook to.
      			 */
      var filename: js.UndefOr[String] = js.undefined
      /**
      			 * Specifies a writable stream to write the XLSX workbook to.
      			 */
      var stream: js.UndefOr[Stream] = js.undefined
      /**
      			 * 	Specifies whether to use shared strings in the workbook. Default is false
      			 */
      var useSharedStrings: js.UndefOr[Boolean] = js.undefined
      /**
      			 * Specifies whether to add style information to the workbook.
      			 * Styles can add some performance overhead. Default is false
      			 */
      var useStyles: js.UndefOr[Boolean] = js.undefined
    }
    
  }
  
}

