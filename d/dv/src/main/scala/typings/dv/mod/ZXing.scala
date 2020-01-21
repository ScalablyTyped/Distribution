package typings.dv.mod

import typings.dv.dvStrings.AZTEC
import typings.dv.dvStrings.CODE_128
import typings.dv.dvStrings.CODE_39
import typings.dv.dvStrings.DATA_MATRIX
import typings.dv.dvStrings.EAN_13
import typings.dv.dvStrings.EAN_8
import typings.dv.dvStrings.ITF
import typings.dv.dvStrings.None
import typings.dv.dvStrings.PDF_417
import typings.dv.dvStrings.QR_CODE
import typings.dv.dvStrings.UPC_A
import typings.dv.dvStrings.UPC_E
import typings.node.Buffer
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
  val buffer: Buffer = js.native
  /**
  	 * denotes the stringified data read from the barcode.
  	 */
  val data: String = js.native
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
  var tryHarder: Boolean = js.native
  /**
  	 * enotes the barcodes type.
  	 */
  val `type`: None | QR_CODE | DATA_MATRIX | PDF_417 | UPC_E | UPC_A | EAN_8 | EAN_13 | CODE_128 | CODE_39 | ITF | AZTEC = js.native
  /**
  	 * Returns the first barcode found as an object with the following format:
  	 */
  def findCode(): BarCode = js.native
}

