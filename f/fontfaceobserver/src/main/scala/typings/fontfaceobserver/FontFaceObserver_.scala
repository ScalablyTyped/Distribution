package typings.fontfaceobserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceObserver_ extends js.Object {
  /**
    * Starts observing the loading of the specified font. Immediately returns a new Promise that resolves when the font is available and rejected when the font is not available.
    * @param testString If your font doesn't contain latin characters you can pass a custom test string.
    * @param timeout The default timeout for giving up on font loading is 3 seconds. You can increase or decrease this by passing a number of milliseconds.
    */
  def load(): js.Promise[Unit] = js.native
  def load(testString: js.UndefOr[scala.Nothing], timeout: Double): js.Promise[Unit] = js.native
  def load(testString: String): js.Promise[Unit] = js.native
  def load(testString: String, timeout: Double): js.Promise[Unit] = js.native
  def load(testString: Null, timeout: Double): js.Promise[Unit] = js.native
}

