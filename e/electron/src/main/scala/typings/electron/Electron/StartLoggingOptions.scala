package typings.electron.Electron

import typings.electron.electronStrings.default
import typings.electron.electronStrings.everything
import typings.electron.electronStrings.includeSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartLoggingOptions extends StObject {
  
  /**
    * What kinds of data should be captured. By default, only metadata about requests
    * will be captured. Setting this to `includeSensitive` will include cookies and
    * authentication data. Setting it to `everything` will include all bytes
    * transferred on sockets. Can be `default`, `includeSensitive` or `everything`.
    */
  var captureMode: js.UndefOr[default | includeSensitive | everything] = js.native
  
  /**
    * When the log grows beyond this size, logging will automatically stop. Defaults
    * to unlimited.
    */
  var maxFileSize: js.UndefOr[Double] = js.native
}
object StartLoggingOptions {
  
  @scala.inline
  def apply(): StartLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartLoggingOptions]
  }
  
  @scala.inline
  implicit class StartLoggingOptionsMutableBuilder[Self <: StartLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureMode(value: default | includeSensitive | everything): Self = StObject.set(x, "captureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureModeUndefined: Self = StObject.set(x, "captureMode", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
  }
}
