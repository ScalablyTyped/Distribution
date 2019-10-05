package typings.dymoDashLabelDashFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dymo.label.framework.addPrinterUri")
@js.native
object addPrinterUri extends js.Object {
  /**
  	 * Undocumented, removed, see http://developers.dymo.com/2013/08/14/dymo-sdk-qa/#comment-27119
  	 */
  def apply(printerUri: String): Unit = js.native
  def apply(printerUri: String, location: String): Unit = js.native
  def apply(printerUri: String, location: String, successCallback: AddPrinterUriCallback): Unit = js.native
  def apply(
    printerUri: String,
    location: String,
    successCallback: AddPrinterUriCallback,
    errorCallback: AddPrinterUriCallback
  ): Unit = js.native
}

