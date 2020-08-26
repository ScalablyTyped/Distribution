package typings.easyXHeaders

import typings.easyXHeaders.anon.Custom
import typings.easyXHeaders.anon.CustomFds
import typings.easyXHeaders.anon.Cwd
import typings.easyXHeaders.anon.Encoding
import typings.easyXHeaders.anon.Env
import typings.easyXHeaders.eventsMod.EventEmitter
import typings.easyXHeaders.streamMod.Readable
import typings.easyXHeaders.streamMod.Writable
import typings.node.Buffer
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
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def exec(command: String, options: CustomFds): ChildProcess = js.native
  def exec(
    command: String,
    options: CustomFds,
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(file: String): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(file: String, args: js.UndefOr[scala.Nothing], options: Cwd): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: Cwd,
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String]): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String], options: Cwd): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: Cwd,
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFileSync(command: String): ChildProcess = js.native
  def execFileSync(command: String, args: js.UndefOr[scala.Nothing], options: Env): ChildProcess = js.native
  def execFileSync(command: String, args: js.Array[String]): ChildProcess = js.native
  def execFileSync(command: String, args: js.Array[String], options: Env): ChildProcess = js.native
  def execSync(command: String): ChildProcess = js.native
  def execSync(command: String, options: Env): ChildProcess = js.native
  def fork(modulePath: String): ChildProcess = js.native
  def fork(modulePath: String, args: js.UndefOr[scala.Nothing], options: Encoding): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String]): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String], options: Encoding): ChildProcess = js.native
  def spawn(command: String): ChildProcess = js.native
  def spawn(command: String, args: js.UndefOr[scala.Nothing], options: Custom): ChildProcess = js.native
  def spawn(command: String, args: js.Array[String]): ChildProcess = js.native
  def spawn(command: String, args: js.Array[String], options: Custom): ChildProcess = js.native
}

