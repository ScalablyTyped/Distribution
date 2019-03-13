package typings
package eggDashLoggerLib.eggDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg-logger", "EggLoggers")
@js.native
class EggLoggers protected ()
  extends stdLib.Map[java.lang.String, Logger[LoggerOptions]]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def this(options: EggLoggersOptions) = this()
  /**
    * Disable console logger
    */
  def disableConsole(): scala.Unit = js.native
  /**
    * reload all logger
    */
  def reload(): scala.Unit = js.native
}

