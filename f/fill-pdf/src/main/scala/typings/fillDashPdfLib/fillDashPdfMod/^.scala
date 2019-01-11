package typings
package fillDashPdfLib.fillDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fill-pdf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generateFdf(data: fillDashPdfLib.fillDashPdfMod.FormData): nodeLib.Buffer = js.native
  def generatePdf(
    data: fillDashPdfLib.fillDashPdfMod.FormData,
    templatePath: java.lang.String,
    extendArgs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def generatePdf(
    data: fillDashPdfLib.fillDashPdfMod.FormData,
    templatePath: java.lang.String,
    extendArgs: js.Array[java.lang.String],
    callback: js.Function2[/* err */ nodeLib.Error, /* output */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
}

