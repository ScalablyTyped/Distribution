package typings
package easyDashXapiDashSupertestLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def exec(command: java.lang.String): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ easyDashXapiDashSupertestLib.Buffer, 
      /* stderr */ easyDashXapiDashSupertestLib.Buffer, 
      scala.Unit
    ]
  ): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(command: java.lang.String, options: easyDashXapiDashSupertestLib.Anon_CustomFds): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: easyDashXapiDashSupertestLib.Anon_CustomFds,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ easyDashXapiDashSupertestLib.Buffer, 
      /* stderr */ easyDashXapiDashSupertestLib.Buffer, 
      scala.Unit
    ]
  ): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(file: java.lang.String): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(file: java.lang.String, args: js.Array[java.lang.String]): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ easyDashXapiDashSupertestLib.Buffer, 
      /* stderr */ easyDashXapiDashSupertestLib.Buffer, 
      scala.Unit
    ]
  ): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: easyDashXapiDashSupertestLib.Anon_CustomFdsCwd
  ): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: easyDashXapiDashSupertestLib.Anon_CustomFdsCwd,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ easyDashXapiDashSupertestLib.Buffer, 
      /* stderr */ easyDashXapiDashSupertestLib.Buffer, 
      scala.Unit
    ]
  ): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* stdout */ easyDashXapiDashSupertestLib.Buffer, 
      /* stderr */ easyDashXapiDashSupertestLib.Buffer, 
      scala.Unit
    ]
  ): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFileSync(command: java.lang.String): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: easyDashXapiDashSupertestLib.Anon_CwdEncoding
  ): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execSync(command: java.lang.String): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execSync(command: java.lang.String, options: easyDashXapiDashSupertestLib.Anon_CwdEncoding): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def fork(modulePath: java.lang.String): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def fork(
    modulePath: java.lang.String,
    args: js.Array[java.lang.String],
    options: easyDashXapiDashSupertestLib.Anon_Cwd
  ): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(command: java.lang.String): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: easyDashXapiDashSupertestLib.Anon_Custom
  ): easyDashXapiDashSupertestLib.childUnderscoreProcessMod.ChildProcess = js.native
}

