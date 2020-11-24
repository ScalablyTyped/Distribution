package typings.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object browserAction {
  
  type ColorArray = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  
  /**
    * An array of four integers in the range [0,255] that make up the RGBA color of the badge. For example, opaque red is `[255, 0, 0, 255]`. Can also be a string with a CSS value, with opaque red being `#FF0000` or `#F00`.
    */
  type ColorValue = java.lang.String | typings.firefoxWebextBrowser.browser.browserAction.ColorArray | scala.Null
  
  /** Pixel data for an image. Must be an ImageData object (for example, from a `canvas` element). */
  type ImageDataType = typings.std.ImageData
}
