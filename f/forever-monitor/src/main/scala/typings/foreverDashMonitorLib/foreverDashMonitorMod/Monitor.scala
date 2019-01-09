package typings
package foreverDashMonitorLib.foreverDashMonitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forever-monitor", "Monitor")
@js.native
class Monitor protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  /**
    * @param script - Location of the target script to run.
    * @param [options] - Configuration for this instance.
    */
  def this(script: java.lang.String) = this()
  def this(script: js.Array[java.lang.String]) = this()
  def this(script: java.lang.String, options: Options) = this()
  def this(script: js.Array[java.lang.String], options: Options) = this()
  /**
    * @description Kills the ChildProcess object associated with this instance
    * @param [forceStop] - Value indicating whether short circuit forever auto-restart
    */
  def kill(): this.type = js.native
  def kill(forceStop: scala.Boolean): this.type = js.native
  /**
    * @param command - Command string to parse
    * @param args - Additional default arguments
    */
  def parseCommand(command: java.lang.String): foreverDashMonitorLib.foreverDashMonitorLibNumbers.`false` | foreverDashMonitorLib.Anon_ArgsCommand = js.native
  def parseCommand(command: java.lang.String, args: js.Array[java.lang.String]): foreverDashMonitorLib.foreverDashMonitorLibNumbers.`false` | foreverDashMonitorLib.Anon_ArgsCommand = js.native
  /**
    * @description Restarts the target script associated with this instance.
    */
  def restart(): this.type = js.native
  /**
    * @description Sends a message to a forked ChildProcess object associated with this instance
    */
  def send(): this.type = js.native
  def send(msg: js.Any): this.type = js.native
  /**
    * @description Start the process that this instance is configured for
    * @param [restart] - Value indicating whether this is a restart.
    */
  def start(): this.type = js.native
  def start(restart: scala.Boolean): this.type = js.native
  /**
    * @description Stops the target script associated with this instance. Prevents it from auto-respawning
    */
  def stop(): this.type = js.native
  /**
    * @description Tries to spawn the target Forever child process.
    */
  def trySpawn(): scala.Boolean = js.native
}

