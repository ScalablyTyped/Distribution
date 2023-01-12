package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Data contained in the Config file */
trait AppConfigData extends StObject {
  
  /** Upper limit of the range of ports that the back should listen on. */
  var backPortMax: Double
  
  /** Lower limit of the range of ports that the back should listen on. */
  var backPortMin: Double
  
  /** Path to the FlashPoint root folder (relative or absolute) */
  var flashpointPath: String
  
  /** Upper limit of the range of ports that the back image server should listen on. */
  var imagesPortMax: Double
  
  /** Lower limit of the range of ports that the back image server should listen on. */
  var imagesPortMin: Double
  
  /** Base URL of the server to do pastes of the Logs to. */
  var logsBaseUrl: String
  
  // Name of the Server process to run
  var server: String
  
  /**
    * If the Server should be started, and closed, together with this application.
    * The "server" is defined in "services.json".
    */
  var startServer: Boolean
  
  /** Whether to notify that launcher updates are available */
  var updatesEnabled: Boolean
  
  /** If the custom title bar should be used in MainWindow */
  var useCustomTitlebar: Boolean
}
object AppConfigData {
  
  inline def apply(
    backPortMax: Double,
    backPortMin: Double,
    flashpointPath: String,
    imagesPortMax: Double,
    imagesPortMin: Double,
    logsBaseUrl: String,
    server: String,
    startServer: Boolean,
    updatesEnabled: Boolean,
    useCustomTitlebar: Boolean
  ): AppConfigData = {
    val __obj = js.Dynamic.literal(backPortMax = backPortMax.asInstanceOf[js.Any], backPortMin = backPortMin.asInstanceOf[js.Any], flashpointPath = flashpointPath.asInstanceOf[js.Any], imagesPortMax = imagesPortMax.asInstanceOf[js.Any], imagesPortMin = imagesPortMin.asInstanceOf[js.Any], logsBaseUrl = logsBaseUrl.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], startServer = startServer.asInstanceOf[js.Any], updatesEnabled = updatesEnabled.asInstanceOf[js.Any], useCustomTitlebar = useCustomTitlebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppConfigData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppConfigData] (val x: Self) extends AnyVal {
    
    inline def setBackPortMax(value: Double): Self = StObject.set(x, "backPortMax", value.asInstanceOf[js.Any])
    
    inline def setBackPortMin(value: Double): Self = StObject.set(x, "backPortMin", value.asInstanceOf[js.Any])
    
    inline def setFlashpointPath(value: String): Self = StObject.set(x, "flashpointPath", value.asInstanceOf[js.Any])
    
    inline def setImagesPortMax(value: Double): Self = StObject.set(x, "imagesPortMax", value.asInstanceOf[js.Any])
    
    inline def setImagesPortMin(value: Double): Self = StObject.set(x, "imagesPortMin", value.asInstanceOf[js.Any])
    
    inline def setLogsBaseUrl(value: String): Self = StObject.set(x, "logsBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setStartServer(value: Boolean): Self = StObject.set(x, "startServer", value.asInstanceOf[js.Any])
    
    inline def setUpdatesEnabled(value: Boolean): Self = StObject.set(x, "updatesEnabled", value.asInstanceOf[js.Any])
    
    inline def setUseCustomTitlebar(value: Boolean): Self = StObject.set(x, "useCustomTitlebar", value.asInstanceOf[js.Any])
  }
}
