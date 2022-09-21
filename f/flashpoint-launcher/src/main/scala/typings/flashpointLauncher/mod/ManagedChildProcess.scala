package typings.flashpointLauncher.mod

import typings.flashpointLauncher.flashpointLauncherStrings.change
import typings.flashpointLauncher.flashpointLauncherStrings.exit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flashpoint-launcher", "ManagedChildProcess")
@js.native
open class ManagedChildProcess protected () extends StObject {
  def this(id: String, name: String, cwd: String, opts: ProcessOpts, info: ProcessInfo) = this()
  
  @JSName("emit")
  def emit_change(event: change, newState: ProcessState): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Double): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Double, signal: String): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Null, signal: String): Boolean = js.native
  
  /** Get the process ID (or -1 if the process is not running). */
  def getPid(): Double = js.native
  
  /** Get the time timestamp of when the process was started. */
  def getStartTime(): Double = js.native
  
  /** Get the state of the process. */
  def getState(): ProcessState = js.native
  
  /** ID of the process */
  var id: String = js.native
  
  /** Info this process was created with */
  var info: ProcessInfo = js.native
  
  /** Politely ask the child process to exit (if it is running). */
  def kill(): Unit = js.native
  
  /** Display name of the service. */
  val name: String = js.native
  
  /** Fires whenever the status of a process changes. */
  @JSName("on")
  def on_change(event: change, listener: js.Function1[/* newState */ ProcessState, Unit]): this.type = js.native
  /** Fires whenever the process exits */
  @JSName("on")
  def on_exit(event: exit, listener: js.Function2[/* code */ Double | Null, /* signal */ String | Null, Unit]): this.type = js.native
  
  /** Restart the managed child process (by killing the current, and spawning a new). */
  def restart(): Unit = js.native
  
  /** Spawn process and keep track on it. */
  def spawn(): Unit = js.native
  def spawn(auto: Boolean): Unit = js.native
}
