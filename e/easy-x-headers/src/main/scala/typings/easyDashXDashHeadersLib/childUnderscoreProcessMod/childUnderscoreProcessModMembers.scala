package typings
package easyDashXDashHeadersLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", JSImport.Namespace)
@js.native
object childUnderscoreProcessModMembers extends js.Object {
  def exec(command: java.lang.String): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ easyDashXDashHeadersLib.Buffer, 
      /* stderr */ easyDashXDashHeadersLib.Buffer, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def exec(command: java.lang.String, options: easyDashXDashHeadersLib.Anon_CustomFds): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: easyDashXDashHeadersLib.Anon_CustomFds,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ easyDashXDashHeadersLib.Buffer, 
      /* stderr */ easyDashXDashHeadersLib.Buffer, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFile(file: java.lang.String): ChildProcess = js.native
  def execFile(file: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ easyDashXDashHeadersLib.Buffer, 
      /* stderr */ easyDashXDashHeadersLib.Buffer, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: easyDashXDashHeadersLib.Anon_CustomFdsCwd
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: easyDashXDashHeadersLib.Anon_CustomFdsCwd,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ easyDashXDashHeadersLib.Buffer, 
      /* stderr */ easyDashXDashHeadersLib.Buffer, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ easyDashXDashHeadersLib.Buffer, 
      /* stderr */ easyDashXDashHeadersLib.Buffer, 
      scala.Unit
    ]
  ): ChildProcess = js.native
  def execFileSync(command: java.lang.String): ChildProcess = js.native
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: easyDashXDashHeadersLib.Anon_CwdEncoding
  ): ChildProcess = js.native
  def execSync(command: java.lang.String): ChildProcess = js.native
  def execSync(command: java.lang.String, options: easyDashXDashHeadersLib.Anon_CwdEncoding): ChildProcess = js.native
  def fork(modulePath: java.lang.String): ChildProcess = js.native
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  def fork(
    modulePath: java.lang.String,
    args: js.Array[java.lang.String],
    options: easyDashXDashHeadersLib.Anon_Cwd
  ): ChildProcess = js.native
  def spawn(command: java.lang.String): ChildProcess = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: easyDashXDashHeadersLib.Anon_Custom
  ): ChildProcess = js.native
}

