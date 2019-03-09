package typings
package dvLib.dvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dv", "ZXing")
@js.native
class ZXing () extends js.Object {
  def this(image: Image) = this()
  /**
  	 * denotes the decoded binary data of the barcode before conversion into another character encoding.
  	 */
  val buffer: nodeLib.Buffer = js.native
  /**
  	 * denotes the stringified data read from the barcode.
  	 */
  val data: java.lang.String = js.native
  /**
  	 * List of barcodes the reader tries to find. It's specified as an object and missing properties account as false
  	 */
  var formats: Barcodeformat = js.native
  /**
  	 * Accessor for the input image this barcode reader operates on.
  	 */
  var image: Image = js.native
  /**
  	 * denotes the points in pixels which were used by the barcode reader to detect the barcode.
  	 */
  val points: js.Array[Point] = js.native
  /**
  	 * If try harder is enabled, the barcode reader spends more time trying to find a barcode (optimize for accuracy, not speed).
  	 */
  var tryHarder: scala.Boolean = js.native
  /**
  	 * enotes the barcodes type.
  	 */
  val `type`: dvLib.dvLibStrings.None | dvLib.dvLibStrings.QR_CODE | dvLib.dvLibStrings.DATA_MATRIX | dvLib.dvLibStrings.PDF_417 | dvLib.dvLibStrings.UPC_E | dvLib.dvLibStrings.UPC_A | dvLib.dvLibStrings.EAN_8 | dvLib.dvLibStrings.EAN_13 | dvLib.dvLibStrings.CODE_128 | dvLib.dvLibStrings.CODE_39 | dvLib.dvLibStrings.ITF | dvLib.dvLibStrings.AZTEC = js.native
  /**
  	 * Returns the first barcode found as an object with the following format:
  	 */
  def findCode(): BarCode = js.native
}

