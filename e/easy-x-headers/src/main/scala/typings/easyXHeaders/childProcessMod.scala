package typings.easyXHeaders

import typings.easyXHeaders.eventsMod.EventEmitter
import typings.easyXHeaders.streamMod.Readable
import typings.easyXHeaders.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", JSImport.Namespace)
@js.native
object childProcessMod extends js.Object {
  @js.native
  trait ChildProcess extends EventEmitter {
    var pid: Double = js.native
    var stderr: Readable = js.native
    var stdin: Writable = js.native
    var stdout: Readable = js.native
    def disconnect(): Unit = js.native
    def kill(): Unit = js.native
    def kill(signal: String): Unit = js.native
    def send(message: js.Any): Unit = js.native
    def send(message: js.Any, sendHandle: js.Any): Unit = js.native
  }
  
  def exec(command: String): ChildProcess = js.native
  def exec(
    command: String,
    callback: js.Function3[
      /* error */ Error, 
      /* stdout */ typings.node.Buffer, 
      /* stderr */ typings.node.Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(command: String, options: AnonCustomFds): ChildProcess = js.native
  def exec(
    command: String,
    options: AnonCustomFds,
    callback: js.Function3[
      /* error */ Error, 
      /* stdout */ typings.node.Buffer, 
      /* stderr */ typings.node.Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(file: String): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String]): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    callback: js.Function3[
      /* error */ Error, 
      /* stdout */ typings.node.Buffer, 
      /* stderr */ typings.node.Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String], options: AnonCwd): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: AnonCwd,
    callback: js.Function3[
      /* error */ Error, 
      /* stdout */ typings.node.Buffer, 
      /* stderr */ typings.node.Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    callback: js.Function3[
      /* error */ Error, 
      /* stdout */ typings.node.Buffer, 
      /* stderr */ typings.node.Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFileSync(command: String): ChildProcess = js.native
  def execFileSync(command: String, args: js.Array[String]): ChildProcess = js.native
  def execFileSync(command: String, args: js.Array[String], options: AnonEnv): ChildProcess = js.native
  def execSync(command: String): ChildProcess = js.native
  def execSync(command: String, options: AnonEnv): ChildProcess = js.native
  def fork(modulePath: String): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String]): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String], options: AnonEncoding): ChildProcess = js.native
  def spawn(command: String): ChildProcess = js.native
  def spawn(command: String, args: js.Array[String]): ChildProcess = js.native
  def spawn(command: String, args: js.Array[String], options: AnonCustom): ChildProcess = js.native
}

