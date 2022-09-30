package typings.electron.global.Electron

import typings.electron.Electron.AutoResizeOptions
import typings.electron.Electron.BrowserViewConstructorOptions
import typings.electron.Electron.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.BrowserView")
@js.native
// Docs: https://electronjs.org/docs/api/browser-view
/**
  * BrowserView
  */
open class BrowserView ()
  extends StObject
     with typings.electron.Electron.BrowserView {
  def this(options: BrowserViewConstructorOptions) = this()
  
  /**
    * The `bounds` of this BrowserView instance as `Object`.
    *
    * @experimental
    */
  /* CompleteClass */
  override def getBounds(): Rectangle = js.native
  
  /* CompleteClass */
  override def setAutoResize(options: AutoResizeOptions): Unit = js.native
  
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
  /* CompleteClass */
  override def setBackgroundColor(color: String): Unit = js.native
  
  /**
    * Resizes and moves the view to the supplied bounds relative to the window.
    *
    * @experimental
    */
  /* CompleteClass */
  override def setBounds(bounds: Rectangle): Unit = js.native
  
  /**
    * A `WebContents` object owned by this view.
    *
    * @experimental
    */
  /* CompleteClass */
  var webContents: typings.electron.Electron.WebContents_ = js.native
}
