package typings.easyDashXapiDashSupertest.childUnderscoreProcessMod

import typings.easyDashXapiDashSupertest.Anon_Custom
import typings.easyDashXapiDashSupertest.Anon_CustomFds
import typings.easyDashXapiDashSupertest.Anon_CustomFdsCwd
import typings.easyDashXapiDashSupertest.Anon_Cwd
import typings.easyDashXapiDashSupertest.Anon_CwdEncoding
import typings.easyDashXapiDashSupertest.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def exec(command: String): ChildProcess = js.native
  def exec(
    command: String,
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def exec(command: String, options: Anon_CustomFds): ChildProcess = js.native
  def exec(
    command: String,
    options: Anon_CustomFds,
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(file: String): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String]): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String], options: Anon_CustomFdsCwd): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: Anon_CustomFdsCwd,
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    callback: js.Function3[/* error */ Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFileSync(command: String): ChildProcess = js.native
  def execFileSync(command: String, args: js.Array[String]): ChildProcess = js.native
  def execFileSync(command: String, args: js.Array[String], options: Anon_CwdEncoding): ChildProcess = js.native
  def execSync(command: String): ChildProcess = js.native
  def execSync(command: String, options: Anon_CwdEncoding): ChildProcess = js.native
  def fork(modulePath: String): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String]): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String], options: Anon_Cwd): ChildProcess = js.native
  def spawn(command: String): ChildProcess = js.native
  def spawn(command: String, args: js.Array[String]): ChildProcess = js.native
  def spawn(command: String, args: js.Array[String], options: Anon_Custom): ChildProcess = js.native
}

