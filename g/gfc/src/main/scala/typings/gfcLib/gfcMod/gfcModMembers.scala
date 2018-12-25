package typings
package gfcLib.gfcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gfc", JSImport.Namespace)
@js.native
object gfcModMembers extends js.Object {
  def apply(): js.Promise[gfcLib.Anon_Stdout] = js.native
  def apply(cwd: java.lang.String): js.Promise[gfcLib.Anon_Stdout] = js.native
  def apply(
    cwd: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    cwd: java.lang.String,
    options: gfcLib.gfcMod.gitFirstCommitNs.Options[gfcLib.gfcMod.gitFirstCommitNs.ExecOptionsWithEncoding]
  ): js.Promise[gfcLib.Anon_Stdout] = js.native
  def apply(
    cwd: java.lang.String,
    options: gfcLib.gfcMod.gitFirstCommitNs.Options[gfcLib.gfcMod.gitFirstCommitNs.ExecOptionsWithEncoding],
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    options: gfcLib.gfcMod.gitFirstCommitNs.Options[gfcLib.gfcMod.gitFirstCommitNs.ExecOptionsWithEncoding]
  ): js.Promise[gfcLib.Anon_Stdout] = js.native
  def sync(): java.lang.String | nodeLib.Buffer = js.native
  def sync(cwd: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  def sync(
    cwd: java.lang.String,
    options: gfcLib.gfcMod.gitFirstCommitNs.Options[nodeLib.childUnderscoreProcessMod.ExecSyncOptions]
  ): java.lang.String | nodeLib.Buffer = js.native
  def sync(options: gfcLib.gfcMod.gitFirstCommitNs.Options[nodeLib.childUnderscoreProcessMod.ExecSyncOptions]): java.lang.String | nodeLib.Buffer = js.native
}

