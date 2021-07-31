package typings.escpos.mod

import typings.escpos.anon.Encoding
import typings.escpos.escposNumbers.`1`
import typings.escpos.escposNumbers.`2`
import typings.escpos.escposNumbers.`3`
import typings.escpos.escposNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escpos", "Screen")
@js.native
class Screen protected () extends StObject {
  def this(adapter: Adapter) = this()
  def this(adapter: Adapter, options: Encoding) = this()
  
  /**
    * Set status confirmation for DTR signal
    */
  def DTR(n: Boolean): Screen = js.native
  
  /**
    * Sets display screen blank interval.
    */
  def blink(step: Double): Screen = js.native
  
  /**
    * Sets the brightness of the fluorescent character display tube.
    */
  @JSName("brightness")
  def brightness_1(level: `1`): Screen = js.native
  @JSName("brightness")
  def brightness_2(level: `2`): Screen = js.native
  @JSName("brightness")
  def brightness_3(level: `3`): Screen = js.native
  @JSName("brightness")
  def brightness_4(level: `4`): Screen = js.native
  
  def clear(): Screen = js.native
  def clear(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  def clearLine(): Screen = js.native
  def clearLine(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  def close(): Screen = js.native
  def close(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  def close(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit], options: js.Any): Screen = js.native
  def close(callback: Unit, options: js.Any): Screen = js.native
  
  /**
    * Turn cursor display mode on/off.
    */
  def cursor(display: Boolean): Screen = js.native
  
  /**
    * Displays the time counter at the right side of the bottom line.
    */
  def displayTimer(): Screen = js.native
  
  def encode(encoding: String): Screen = js.native
  
  /**
    * Send data to hardware and flush buffer
    */
  def flush(): Screen = js.native
  def flush(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  /**
    * Selects horizontal scroll mode as the display screen mode.
    */
  def horizontalScroll(): Screen = js.native
  def horizontalScroll(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  /**
    * Moves the cursor.
    */
  def move(n: Double, m: Double): Screen = js.native
  
  def moveBottom(): Screen = js.native
  def moveBottom(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  def moveDown(): Screen = js.native
  def moveDown(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  def moveHome(): Screen = js.native
  def moveHome(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  def moveLeft(): Screen = js.native
  def moveLeft(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  def moveMaxLeft(): Screen = js.native
  def moveMaxLeft(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  def moveMaxRight(): Screen = js.native
  def moveMaxRight(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  def moveRight(): Screen = js.native
  def moveRight(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  def moveUp(): Screen = js.native
  def moveUp(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  /**
    * Selects overwrite mode as the screen display mode.
    */
  def overwrite(): Screen = js.native
  def overwrite(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
  
  /**
    * Print raw
    */
  def print(content: String): Screen = js.native
  
  /**
    * Selects or cancels reverse display of the characters received after this command
    */
  def reverse(n: Boolean): Screen = js.native
  
  /**
    * Print text
    */
  def text(content: String, encoding: String): Screen = js.native
  
  /**
    * Sets the counter time and displays it in the bottom right of the screen.
    */
  def timer(hour: Double, minute: Double): Screen = js.native
  
  /**
    * Selects vertical scroll mode as the screen display mode.
    */
  def verticalScroll(): Screen = js.native
  def verticalScroll(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Screen = js.native
}
/* static members */
object Screen {
  
  @JSImport("escpos", "Screen")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(device: Adapter): js.Promise[Screen] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(device.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Screen]]
}
