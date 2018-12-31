package typings
package fontfaceobserverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FontFaceObserver")
@js.native
class FontFaceObserver protected () extends js.Object {
  /**
    * Creates a new FontFaceObserver.
    * @param fontFamilyName Name of the font family to observe.
    * @param variant Description of the font variant to observe. If a property is not present it will default to normal.
    */
  def this(fontFamilyName: java.lang.String) = this()
  def this(fontFamilyName: java.lang.String, variant: fontfaceobserverLib.FontFaceObserverNs.FontVariant) = this()
  /**
    * Starts observing the loading of the specified font. Immediately returns a new Promise that resolves when the font is available and rejected when the font is not available.
    * @param testString If your font doesn't contain latin characters you can pass a custom test string.
    * @param timeout The default timeout for giving up on font loading is 3 seconds. You can increase or decrease this by passing a number of milliseconds.
    */
  def load(): js.Promise[scala.Unit] = js.native
  def load(testString: java.lang.String): js.Promise[scala.Unit] = js.native
  def load(testString: java.lang.String, timeout: scala.Double): js.Promise[scala.Unit] = js.native
  def load(testString: scala.Null, timeout: scala.Double): js.Promise[scala.Unit] = js.native
}

