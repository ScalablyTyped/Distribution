package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>This class provides Graphics operations that can be applied to a surface.</p>
* <p>Use Graphics.createXXX to create a graphics object that renders in the way you want. See <a href="/Graphics">the Graphics page</a> for more information.</p>
* <p><strong>Note:</strong> On boards that contain an LCD, there is a built-in &#39;LCD&#39; object of type Graphics. For instance to draw a line you&#39;d type: <code>LCD.drawLine(0,0,100,100)</code></p>
* 
* @url http://www.espruino.com/Reference#Graphics
*/
@js.native
trait Graphics extends /**
  * 
  * @return  
  */
Instantiable0[Graphics] {
  /**
    * <p>Clear the LCD with the Background Color</p>
    * 
    * @url http://www.espruino.com/Reference#l_Graphics_clear
    */
  def clear(): Unit = js.native
  /**
    * <p>Create a Graphics object that renders to an Array Buffer. This will have a field called &#39;buffer&#39; that can get used to get at the buffer itself</p>
    * 
    * @param width 
    * @param height 
    * @param bpp 
    * @param options 
    * @return  
    * @url http://www.espruino.com/Reference#l_Graphics_createArrayBuffer
    */
  def createArrayBuffer(width: Double, height: Double, bpp: Double, options: js.Any): Graphics = js.native
  /**
    * <p>Create a Graphics object that renders by calling a JavaScript callback function to draw pixels</p>
    * 
    * @param width 
    * @param height 
    * @param bpp 
    * @param callback 
    * @return  
    * @url http://www.espruino.com/Reference#l_Graphics_createCallback
    */
  def createCallback(width: Double, height: Double, bpp: Double, callback: js.Any): Graphics = js.native
  /**
    * <p>Create a Graphics object that renders to SDL window (Linux-based devices only)</p>
    * 
    * @param width 
    * @param height 
    * @return  
    * @url http://www.espruino.com/Reference#l_Graphics_createSDL
    */
  def createSDL(width: Double, height: Double): Graphics = js.native
  /**
    * <p>Draw an unfilled circle 1px wide in the Foreground Color</p>
    * 
    * @param x 
    * @param y 
    * @param rad 
    * @url http://www.espruino.com/Reference#l_Graphics_drawCircle
    */
  def drawCircle(x: Double, y: Double, rad: Double): Unit = js.native
  /**
    * <p>Draw an image at the specified position. If the image is 1 bit, the graphics foreground/background colours will be used. Otherwise color data will be copied as-is. Bitmaps are rendered MSB-first</p>
    * 
    * @param image 
    * @param x 
    * @param y 
    * @url http://www.espruino.com/Reference#l_Graphics_drawImage
    */
  def drawImage(image: js.Any, x: Double, y: Double): Unit = js.native
  /**
    * <p>Draw a line between x1,y1 and x2,y2 in the current foreground color</p>
    * 
    * @param x1 
    * @param y1 
    * @param x2 
    * @param y2 
    * @url http://www.espruino.com/Reference#l_Graphics_drawLine
    */
  def drawLine(x1: Double, y1: Double, x2: Double, y2: Double): Unit = js.native
  /**
    * <p>Draw an unfilled rectangle 1px wide in the Foreground Color</p>
    * 
    * @param x1 
    * @param y1 
    * @param x2 
    * @param y2 
    * @url http://www.espruino.com/Reference#l_Graphics_drawRect
    */
  def drawRect(x1: Double, y1: Double, x2: Double, y2: Double): Unit = js.native
  /**
    * <p>Draw a string of text in the current font</p>
    * 
    * @param str 
    * @param x 
    * @param y 
    * @url http://www.espruino.com/Reference#l_Graphics_drawString
    */
  def drawString(str: js.Any, x: Double, y: Double): Unit = js.native
  /**
    * <p>Draw a filled circle in the Foreground Color</p>
    * 
    * @param x 
    * @param y 
    * @param rad 
    * @url http://www.espruino.com/Reference#l_Graphics_fillCircle
    */
  def fillCircle(x: Double, y: Double, rad: Double): Unit = js.native
  /**
    * <p>Draw a filled polygon in the current foreground color</p>
    * 
    * @param poly 
    * @url http://www.espruino.com/Reference#l_Graphics_fillPoly
    */
  def fillPoly(poly: js.Any): Unit = js.native
  /**
    * <p>Fill a rectangular area in the Foreground Color</p>
    * 
    * @param x1 
    * @param y1 
    * @param x2 
    * @param y2 
    * @url http://www.espruino.com/Reference#l_Graphics_fillRect
    */
  def fillRect(x1: Double, y1: Double, x2: Double, y2: Double): Unit = js.native
  /**
    * <p>Get the background color to use for subsequent drawing operations</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Graphics_getBgColor
    */
  def getBgColor(): Double = js.native
  /**
    * <p>Get the color to use for subsequent drawing operations</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Graphics_getColor
    */
  def getColor(): Double = js.native
  /**
    * <p>The height of the LCD</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Graphics_getHeight
    */
  def getHeight(): Double = js.native
  /**
    * <p>Return the area of the Graphics canvas that has been modified, and optionally clear
    * the modified area to 0.</p>
    * <p>For instance if <code>g.setPixel(10,20)</code> was called, this would return <code>{x1:10, y1:20, x2:10, y2:20}</code></p>
    * 
    * @param reset 
    * @return  
    * @url http://www.espruino.com/Reference#l_Graphics_getModified
    */
  def getModified(reset: Boolean): js.Any = js.native
  /**
    * <p>Get a pixel&#39;s color</p>
    * 
    * @param x 
    * @param y 
    * @return  
    * @url http://www.espruino.com/Reference#l_Graphics_getPixel
    */
  def getPixel(x: Double, y: Double): Double = js.native
  /**
    * <p>The width of the LCD</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Graphics_getWidth
    */
  def getWidth(): Double = js.native
  /**
    * <p>Draw a line from the last position of lineTo or moveTo to this position</p>
    * 
    * @param x 
    * @param y 
    * @url http://www.espruino.com/Reference#l_Graphics_lineTo
    */
  def lineTo(x: Double, y: Double): Unit = js.native
  /**
    * <p>Move the cursor to a position - see lineTo</p>
    * 
    * @param x 
    * @param y 
    * @url http://www.espruino.com/Reference#l_Graphics_moveTo
    */
  def moveTo(x: Double, y: Double): Unit = js.native
  /**
    * <p>Set the background color to use for subsequent drawing operations</p>
    * 
    * @param r 
    * @param g 
    * @param b 
    * @url http://www.espruino.com/Reference#l_Graphics_setBgColor
    */
  def setBgColor(r: js.Any, g: js.Any, b: js.Any): Unit = js.native
  /**
    * <p>Set the color to use for subsequent drawing operations</p>
    * 
    * @param r 
    * @param g 
    * @param b 
    * @url http://www.espruino.com/Reference#l_Graphics_setColor
    */
  def setColor(r: js.Any, g: js.Any, b: js.Any): Unit = js.native
  /**
    * <p>Make subsequent calls to <code>drawString</code> use the built-in 4x6 pixel bitmapped Font</p>
    * 
    * @url http://www.espruino.com/Reference#l_Graphics_setFontBitmap
    */
  def setFontBitmap(): Unit = js.native
  /**
    * <p>Make subsequent calls to <code>drawString</code> use a Custom Font of the given height. See the <a href="http://www.espruino.com/Fonts">Fonts page</a> for more
    * information about custom fonts and how to create them.</p>
    * 
    * @param bitmap 
    * @param firstChar 
    * @param width 
    * @param height 
    * @url http://www.espruino.com/Reference#l_Graphics_setFontCustom
    */
  def setFontCustom(bitmap: js.Any, firstChar: Double, width: js.Any, height: Double): Unit = js.native
  /**
    * <p>Make subsequent calls to <code>drawString</code> use a Vector Font of the given height</p>
    * 
    * @param size 
    * @url http://www.espruino.com/Reference#l_Graphics_setFontVector
    */
  def setFontVector(size: Double): Unit = js.native
  /**
    * <p>Set a pixel&#39;s color</p>
    * 
    * @param x 
    * @param y 
    * @param col 
    * @url http://www.espruino.com/Reference#l_Graphics_setPixel
    */
  def setPixel(x: Double, y: Double, col: js.Any): Unit = js.native
  /**
    * <p>Set the current rotation of the graphics device.</p>
    * 
    * @param rotation 
    * @param reflect 
    * @url http://www.espruino.com/Reference#l_Graphics_setRotation
    */
  def setRotation(rotation: Double, reflect: Boolean): Unit = js.native
  /**
    * <p>Return the size in pixels of a string of text in the current font</p>
    * 
    * @param str 
    * @return  
    * @url http://www.espruino.com/Reference#l_Graphics_stringWidth
    */
  def stringWidth(str: js.Any): Double = js.native
}

