package typings.eggLogger.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg-logger", "EggLoggers")
@js.native
class EggLoggers protected ()
  extends Map[String, Logger[LoggerOptions]]
     with /* key */ StringDictionary[js.Any] {
  def this(options: EggLoggersOptions) = this()
  
  /**
    * Disable console logger
    */
  def disableConsole(): Unit = js.native
  
  /**
    * reload all logger
    */
  def reload(): Unit = js.native
}
