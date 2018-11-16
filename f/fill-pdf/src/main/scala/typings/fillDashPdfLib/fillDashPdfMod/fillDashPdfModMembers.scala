package typings
package fillDashPdfLib.fillDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fill-pdf", JSImport.Namespace)
@js.native
object fillDashPdfModMembers extends js.Object {
  def generateFdf(data: FormData): nodeLib.Buffer = js.native
  def generatePdf(data: FormData, templatePath: java.lang.String, extendArgs: js.Array[java.lang.String]): scala.Unit = js.native
  def generatePdf(
    data: FormData,
    templatePath: java.lang.String,
    extendArgs: js.Array[java.lang.String],
    callback: js.Function2[/* err */ nodeLib.Error, /* output */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
}

