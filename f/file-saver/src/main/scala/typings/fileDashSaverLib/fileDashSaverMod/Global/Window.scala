package typings
package fileDashSaverLib.fileDashSaverMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  @JSName("saveAs")
  var saveAs_Original: js.Function3[
    /* data */ stdLib.Blob | java.lang.String, 
    /* filename */ js.UndefOr[java.lang.String], 
    /* disableAutoBOM */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ] = js.native
  def saveAs(data: java.lang.String): scala.Unit = js.native
  def saveAs(data: java.lang.String, filename: java.lang.String): scala.Unit = js.native
  def saveAs(data: java.lang.String, filename: java.lang.String, disableAutoBOM: scala.Boolean): scala.Unit = js.native
  def saveAs(data: stdLib.Blob): scala.Unit = js.native
  def saveAs(data: stdLib.Blob, filename: java.lang.String): scala.Unit = js.native
  def saveAs(data: stdLib.Blob, filename: java.lang.String, disableAutoBOM: scala.Boolean): scala.Unit = js.native
}

