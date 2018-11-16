package typings
package espruinoLib

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
trait Graphics
  extends /**
     * 
     * @return  
     */
ScalablyTyped.runtime.Instantiable0[Graphics] {
  /**
       * <p>Clear the LCD with the Background Color</p>
       * 
       * @url http://www.espruino.com/Reference#l_Graphics_clear
       */
  def clear(): scala.Unit = js.native
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
  def createArrayBuffer(width: scala.Double, height: scala.Double, bpp: scala.Double, options: js.Any): Graphics = js.native
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
  def createCallback(width: scala.Double, height: scala.Double, bpp: scala.Double, callback: js.Any): Graphics = js.native
  /**
       * <p>Create a Graphics object that renders to SDL window (Linux-based devices only)</p>
       * 
       * @param width 
       * @param height 
       * @return  
       * @url http://www.espruino.com/Reference#l_Graphics_createSDL
       */
  def createSDL(width: scala.Double, height: scala.Double): Graphics = js.native
  /**
       * <p>Draw an unfilled circle 1px wide in the Foreground Color</p>
       * 
       * @param x 
       * @param y 
       * @param rad 
       * @url http://www.espruino.com/Reference#l_Graphics_drawCircle
       */
  def drawCircle(x: scala.Double, y: scala.Double, rad: scala.Double): scala.Unit = js.native
  /**
       * <p>Draw an image at the specified position. If the image is 1 bit, the graphics foreground/background colours will be used. Otherwise color data will be copied as-is. Bitmaps are rendered MSB-first</p>
       * 
       * @param image 
       * @param x 
       * @param y 
       * @url http://www.espruino.com/Reference#l_Graphics_drawImage
       */
  def drawImage(image: js.Any, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
       * <p>Draw a line between x1,y1 and x2,y2 in the current foreground color</p>
       * 
       * @param x1 
       * @param y1 
       * @param x2 
       * @param y2 
       * @url http://www.espruino.com/Reference#l_Graphics_drawLine
       */
  def drawLine(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Unit = js.native
  /**
       * <p>Draw an unfilled rectangle 1px wide in the Foreground Color</p>
       * 
       * @param x1 
       * @param y1 
       * @param x2 
       * @param y2 
       * @url http://www.espruino.com/Reference#l_Graphics_drawRect
       */
  def drawRect(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Unit = js.native
  /**
       * <p>Draw a string of text in the current font</p>
       * 
       * @param str 
       * @param x 
       * @param y 
       * @url http://www.espruino.com/Reference#l_Graphics_drawString
       */
  def drawString(str: js.Any, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
       * <p>Draw a filled circle in the Foreground Color</p>
       * 
       * @param x 
       * @param y 
       * @param rad 
       * @url http://www.espruino.com/Reference#l_Graphics_fillCircle
       */
  def fillCircle(x: scala.Double, y: scala.Double, rad: scala.Double): scala.Unit = js.native
  /**
       * <p>Draw a filled polygon in the current foreground color</p>
       * 
       * @param poly 
       * @url http://www.espruino.com/Reference#l_Graphics_fillPoly
       */
  def fillPoly(poly: js.Any): scala.Unit = js.native
  /**
       * <p>Fill a rectangular area in the Foreground Color</p>
       * 
       * @param x1 
       * @param y1 
       * @param x2 
       * @param y2 
       * @url http://www.espruino.com/Reference#l_Graphics_fillRect
       */
  def fillRect(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Unit = js.native
  /**
       * <p>Get the background color to use for subsequent drawing operations</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_Graphics_getBgColor
       */
  def getBgColor(): scala.Double = js.native
  /**
       * <p>Get the color to use for subsequent drawing operations</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_Graphics_getColor
       */
  def getColor(): scala.Double = js.native
  /**
       * <p>The height of the LCD</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_Graphics_getHeight
       */
  def getHeight(): scala.Double = js.native
  /**
       * <p>Return the area of the Graphics canvas that has been modified, and optionally clear
       * the modified area to 0.</p>
       * <p>For instance if <code>g.setPixel(10,20)</code> was called, this would return <code>{x1:10, y1:20, x2:10, y2:20}</code></p>
       * 
       * @param reset 
       * @return  
       * @url http://www.espruino.com/Reference#l_Graphics_getModified
       */
  def getModified(reset: scala.Boolean): js.Any = js.native
  /**
       * <p>Get a pixel&#39;s color</p>
       * 
       * @param x 
       * @param y 
       * @return  
       * @url http://www.espruino.com/Reference#l_Graphics_getPixel
       */
  def getPixel(x: scala.Double, y: scala.Double): scala.Double = js.native
  /**
       * <p>The width of the LCD</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_Graphics_getWidth
       */
  def getWidth(): scala.Double = js.native
  /**
       * <p>Draw a line from the last position of lineTo or moveTo to this position</p>
       * 
       * @param x 
       * @param y 
       * @url http://www.espruino.com/Reference#l_Graphics_lineTo
       */
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
       * <p>Move the cursor to a position - see lineTo</p>
       * 
       * @param x 
       * @param y 
       * @url http://www.espruino.com/Reference#l_Graphics_moveTo
       */
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
       * <p>Set the background color to use for subsequent drawing operations</p>
       * 
       * @param r 
       * @param g 
       * @param b 
       * @url http://www.espruino.com/Reference#l_Graphics_setBgColor
       */
  def setBgColor(r: js.Any, g: js.Any, b: js.Any): scala.Unit = js.native
  /**
       * <p>Set the color to use for subsequent drawing operations</p>
       * 
       * @param r 
       * @param g 
       * @param b 
       * @url http://www.espruino.com/Reference#l_Graphics_setColor
       */
  def setColor(r: js.Any, g: js.Any, b: js.Any): scala.Unit = js.native
  /**
       * <p>Make subsequent calls to <code>drawString</code> use the built-in 4x6 pixel bitmapped Font</p>
       * 
       * @url http://www.espruino.com/Reference#l_Graphics_setFontBitmap
       */
  def setFontBitmap(): scala.Unit = js.native
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
  def setFontCustom(bitmap: js.Any, firstChar: scala.Double, width: js.Any, height: scala.Double): scala.Unit = js.native
  /**
       * <p>Make subsequent calls to <code>drawString</code> use a Vector Font of the given height</p>
       * 
       * @param size 
       * @url http://www.espruino.com/Reference#l_Graphics_setFontVector
       */
  def setFontVector(size: scala.Double): scala.Unit = js.native
  /**
       * <p>Set a pixel&#39;s color</p>
       * 
       * @param x 
       * @param y 
       * @param col 
       * @url http://www.espruino.com/Reference#l_Graphics_setPixel
       */
  def setPixel(x: scala.Double, y: scala.Double, col: js.Any): scala.Unit = js.native
  /**
       * <p>Set the current rotation of the graphics device.</p>
       * 
       * @param rotation 
       * @param reflect 
       * @url http://www.espruino.com/Reference#l_Graphics_setRotation
       */
  def setRotation(rotation: scala.Double, reflect: scala.Boolean): scala.Unit = js.native
  /**
       * <p>Return the size in pixels of a string of text in the current font</p>
       * 
       * @param str 
       * @return  
       * @url http://www.espruino.com/Reference#l_Graphics_stringWidth
       */
  def stringWidth(str: js.Any): scala.Double = js.native
}

