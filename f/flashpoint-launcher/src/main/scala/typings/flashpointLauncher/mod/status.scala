package typings.flashpointLauncher.mod

import typings.flashpointLauncher.flashpointLauncherStrings.devConsole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Collection of Status related API functions */
object status {
  
  @JSImport("flashpoint-launcher", "status")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the status in any Status State
    * @param key Element to view
    */
  inline def getStatus_devConsole(key: devConsole): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Update any status in the Status State
    * @param key Element to update
    * @param val Value to update element with
    */
  inline def setStatus_devConsole(key: devConsole, `val`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatus")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
