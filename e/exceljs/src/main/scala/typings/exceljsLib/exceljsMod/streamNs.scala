package typings
package exceljsLib.exceljsMod

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
    class WorkbookWriter protected ()
      extends exceljsLib.exceljsMod.Workbook {
      def this(options: WorkbookWriterOptions) = this()
    }
    
    
    trait WorkbookWriterOptions extends js.Object {
      /**
      			 * 	If stream not specified, this field specifies the path to a file to write the XLSX workbook to.
      			 */
      var filename: js.UndefOr[java.lang.String] = js.undefined
      /**
      			 * Specifies a writable stream to write the XLSX workbook to.
      			 */
      var stream: js.UndefOr[nodeLib.streamMod.Stream] = js.undefined
      /**
      			 * 	Specifies whether to use shared strings in the workbook. Default is false
      			 */
      var useSharedStrings: js.UndefOr[scala.Boolean] = js.undefined
      /**
      			 * Specifies whether to add style information to the workbook.
      			 * Styles can add some performance overhead. Default is false
      			 */
      var useStyles: js.UndefOr[scala.Boolean] = js.undefined
    }
    
  }
  
}

