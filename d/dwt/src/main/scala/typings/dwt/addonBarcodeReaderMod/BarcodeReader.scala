package typings.dwt.addonBarcodeReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarcodeReader extends js.Object {
  
  /**
    * Read an image in the buffer and try to locate and decode barcode(s) on it.
    * @param index Specify the image to decode.
    */
  def decode(index: Double): js.Promise[TextResults] = js.native
  
  /**
    * Return the current runtime settings or the settings of the specified built-in template.
    * @param template Specify a built-in template.
    */
  def getRuntimeSettings(): js.Promise[RuntimeSettings] = js.native
  def getRuntimeSettings(template: String): js.Promise[RuntimeSettings] = js.native
  
  /**
    * Set up the barcode reader with advanced settings.
    * @param settings The runtime setting in the form of a string.
    */
  def initRuntimeSettingsWithString(settings: String): js.Promise[RuntimeSettings] = js.native
  
  /**
    * Reset all runtime settings to default values.
    */
  def resetRuntimeSettings(): js.Promise[RuntimeSettings] = js.native
  
  /**
    * Update the runtime settings with a given object or use the string "speed", "balance", or "coverage" to use our preset settings. The default setting is "coverage".
    * @param settings Specify the runtime settings.
    */
  def updateRuntimeSettings(settings: RuntimeSettings): js.Promise[RuntimeSettings] = js.native
}
