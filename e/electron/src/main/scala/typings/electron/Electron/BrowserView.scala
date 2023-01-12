package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserView extends StObject {
  
  /**
    * The `bounds` of this BrowserView instance as `Object`.
    *
    * @experimental
    */
  def getBounds(): Rectangle
  
  def setAutoResize(options: AutoResizeOptions): Unit
  
  /**
    * Examples of valid `color` values:
    *
    * * Hex
    *   * #fff (RGB)
    *   * #ffff (ARGB)
    *   * #ffffff (RRGGBB)
    *   * #ffffffff (AARRGGBB)
    * * RGB
    *   * rgb(([\d]+),\s*([\d]+),\s*([\d]+))
    *     * e.g. rgb(255, 255, 255)
    * * RGBA
    *   * rgba(([\d]+),\s*([\d]+),\s*([\d]+),\s*([\d.]+))
    *     * e.g. rgba(255, 255, 255, 1.0)
    * * HSL
    *   * hsl((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%)
    *     * e.g. hsl(200, 20%, 50%)
    * * HSLA
    *   * hsla((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%,\s*([\d.]+))
    *     * e.g. hsla(200, 20%, 50%, 0.5)
    * * Color name
    *   * Options are listed in SkParseColor.cpp
    *   * Similar to CSS Color Module Level 3 keywords, but case-sensitive.
    *     * e.g. `blueviolet` or `red`
    *
    * **Note:** Hex format with alpha takes `AARRGGBB` or `ARGB`, _not_ `RRGGBBA` or
    * `RGA`.
    *
    * @experimental
    */
  def setBackgroundColor(color: String): Unit
  
  /**
    * Resizes and moves the view to the supplied bounds relative to the window.
    *
    * @experimental
    */
  def setBounds(bounds: Rectangle): Unit
  
  /**
    * A `WebContents` object owned by this view.
    *
    * @experimental
    */
  var webContents: WebContents_
}
object BrowserView {
  
  inline def apply(
    getBounds: () => Rectangle,
    setAutoResize: AutoResizeOptions => Unit,
    setBackgroundColor: String => Unit,
    setBounds: Rectangle => Unit,
    webContents: WebContents_
  ): BrowserView = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), setAutoResize = js.Any.fromFunction1(setAutoResize), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setBounds = js.Any.fromFunction1(setBounds), webContents = webContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserView] (val x: Self) extends AnyVal {
    
    inline def setGetBounds(value: () => Rectangle): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    inline def setSetAutoResize(value: AutoResizeOptions => Unit): Self = StObject.set(x, "setAutoResize", js.Any.fromFunction1(value))
    
    inline def setSetBackgroundColor(value: String => Unit): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1(value))
    
    inline def setSetBounds(value: Rectangle => Unit): Self = StObject.set(x, "setBounds", js.Any.fromFunction1(value))
    
    inline def setWebContents(value: WebContents_): Self = StObject.set(x, "webContents", value.asInstanceOf[js.Any])
  }
}
