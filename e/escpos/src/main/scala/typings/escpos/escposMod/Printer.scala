package typings.escpos.escposMod

import typings.escpos.Anon_A
import typings.escpos.Anon_Align
import typings.escpos.Anon_AlignCENTER
import typings.escpos.Anon_Encoding
import typings.escpos.Anon_Mode
import typings.escpos.escposNumbers.`0`
import typings.escpos.escposNumbers.`1`
import typings.escpos.escposNumbers.`2`
import typings.escpos.escposStrings.A
import typings.escpos.escposStrings.B
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escpos", "Printer")
@js.native
class Printer protected () extends js.Object {
  def this(adapter: Adapter) = this()
  def this(adapter: Adapter, options: Anon_Encoding) = this()
  def align(align: TXT_ALIGN): Printer = js.native
  def barcode(code: String, `type`: BARCODE_TYPE): Printer = js.native
  def barcode(code: String, `type`: BARCODE_TYPE, options: Anon_A): Printer = js.native
  /**
    * Printer Buzzer (Beep sound)
    */
  def beep(numberOfBuzzer: Double, time: Double): Printer = js.native
  /**
    * Send pulse to kick the cash drawer
    *
    * @default 2
    */
  def cashdraw(): Printer = js.native
  def cashdraw(pin: Double): Printer = js.native
  def close(): Printer = js.native
  def close(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Printer = js.native
  def close(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit], options: js.Any): Printer = js.native
  /**
    * Select between two print color modes, if your printer supports it
    * @param color - 0 for primary color (black) 1 for secondary color (red)
    */
  @JSName("color")
  def color_0(color: `0`): Printer = js.native
  @JSName("color")
  def color_1(color: `1`): Printer = js.native
  /**
    * Carrier feed and tabs.
    */
  def control(ctrl: FEED_CONTROL_TYPE): Printer = js.native
  /**
    * Cut paper.
    *
    * *** Cut will flush buffer to printer ***
    *
    * @param part If true, PAPER_PART_CUT, else PAPER_FULL_CUT
    * @param feed
    */
  def cut(): Printer = js.native
  def cut(part: Boolean): Printer = js.native
  def cut(part: Boolean, feed: Double): Printer = js.native
  /**
    * Draw a horizontal line with EOL
    *
    * Example:
    * `-------` 48x
    */
  def drawLine(): Printer = js.native
  /**
    * Set default encoding
    * @default `GB18030` (Chinese)
    */
  def encode(encoding: String): Printer = js.native
  /**
    * Print blank lines
    */
  def feed(): Printer = js.native
  def feed(n: Double): Printer = js.native
  /**
    * Send data to hardware and flush buffer
    */
  def flush(): Printer = js.native
  def flush(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Printer = js.native
  /**
    * @default 'A'
    */
  @JSName("font")
  def font_A(family: A): Printer = js.native
  @JSName("font")
  def font_B(family: B): Printer = js.native
  def hardware(hw: String): Printer = js.native
  def image(image: Image, density: BITMAP_FORMAT_TYPE): Printer = js.native
  /**
    * Set line spacing
    */
  def lineSpace(): Printer = js.native
  def lineSpace(n: Double): Printer = js.native
  def marginBottom(size: Double): Printer = js.native
  def marginLeft(size: Double): Printer = js.native
  def marginRight(size: Double): Printer = js.native
  /**
    * Set printer model to recognize model-specific commands.
    * Supported models: [ null, 'qsprinter' ]
    *
    * For generic printers, set model to null
    */
  def model(_model: String): Printer = js.native
  def newLine(): Printer = js.native
  /**
    * Print raw
    */
  def print(content: js.Any): Printer = js.native
  /**
    * Print raw with EOL
    */
  def println(content: js.Any): Printer = js.native
  /**
    * Print text
    */
  def pureText(content: String): Printer = js.native
  def pureText(content: String, encoding: String): Printer = js.native
  def qrcode(code: String, version: Double, level: QRCODE_LEVEL, size: Double): Printer = js.native
  def qrimage(content: String): Printer = js.native
  def qrimage(
    content: String,
    callback: js.Function2[/* error */ Error | Null, /* printer */ js.UndefOr[this.type], Unit]
  ): Printer = js.native
  def qrimage(content: String, options: Anon_Mode): Printer = js.native
  def qrimage(
    content: String,
    options: Anon_Mode,
    callback: js.Function2[/* error */ Error | Null, /* printer */ js.UndefOr[this.type], Unit]
  ): Printer = js.native
  def raster(image: Image): Printer = js.native
  def raster(image: Image, mode: String): Printer = js.native
  def size(width: `1`, height: `2`): Printer = js.native
  def size(width: `2`, height: `1`): Printer = js.native
  /**
    * Set text size
    *
    * 1 is for regular size, and 2 is twice the standard size.
    *
    * @default `1`
    */
  @JSName("size")
  def size_1(width: `1`, height: `1`): Printer = js.native
  @JSName("size")
  def size_2(width: `2`, height: `2`): Printer = js.native
  /**
    * Set character spacing
    */
  def spacing(): Printer = js.native
  def spacing(n: Double): Printer = js.native
  def style(`type`: TXT_STYLE): Printer = js.native
  /**
    * Print list of string with EOL
    */
  def table(data: js.Array[String]): Printer = js.native
  def table(data: js.Array[String], encoding: String): Printer = js.native
  def tableCustom(data: Anon_Align): Printer = js.native
  def tableCustom(data: Anon_AlignCENTER): Printer = js.native
  def tableCustom(data: Anon_AlignCENTER, encoding: String): Printer = js.native
  def tableCustom(data: Anon_Align, encoding: String): Printer = js.native
  /**
    * Print text with EOL
    */
  def text(content: String): Printer = js.native
  def text(content: String, encoding: String): Printer = js.native
}

/* static members */
@JSImport("escpos", "Printer")
@js.native
object Printer extends js.Object {
  def create(device: Adapter): js.Promise[Printer] = js.native
}

