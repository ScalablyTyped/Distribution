package typings
package flightplanLib.FlightplanInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends js.Object {
  var runtime: Host = js.native
  def awk(command: java.lang.String): CommandResult = js.native
  def awk(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def awk(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def cat(command: java.lang.String): CommandResult = js.native
  def cat(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def cat(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def cd(command: java.lang.String): CommandResult = js.native
  def cd(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def cd(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def chgrp(command: java.lang.String): CommandResult = js.native
  def chgrp(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def chgrp(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def chmod(command: java.lang.String): CommandResult = js.native
  def chmod(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def chmod(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def chown(command: java.lang.String): CommandResult = js.native
  def chown(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def chown(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def cp(command: java.lang.String): CommandResult = js.native
  def cp(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def cp(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def debug(message: java.lang.String): scala.Unit = js.native
  def echo(command: java.lang.String): CommandResult = js.native
  def echo(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def echo(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def exec(command: java.lang.String): CommandResult = js.native
  def exec(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def exec(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def failsafe(): scala.Unit = js.native
  def find(command: java.lang.String): CommandResult = js.native
  def find(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def find(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def ftp(command: java.lang.String): CommandResult = js.native
  def ftp(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def ftp(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def git(command: java.lang.String): CommandResult = js.native
  def git(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def git(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def grep(command: java.lang.String): CommandResult = js.native
  def grep(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def grep(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def groups(command: java.lang.String): CommandResult = js.native
  def groups(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def groups(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def hg(command: java.lang.String): CommandResult = js.native
  def hg(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def hg(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def hostname(command: java.lang.String): CommandResult = js.native
  def hostname(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def hostname(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def kill(command: java.lang.String): CommandResult = js.native
  def kill(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def kill(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def ln(command: java.lang.String): CommandResult = js.native
  def ln(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def ln(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def log(message: java.lang.String): scala.Unit = js.native
  def ls(command: java.lang.String): CommandResult = js.native
  def ls(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def ls(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def mkdir(command: java.lang.String): CommandResult = js.native
  def mkdir(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def mkdir(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def mv(command: java.lang.String): CommandResult = js.native
  def mv(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def mv(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def node(command: java.lang.String): CommandResult = js.native
  def node(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def node(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def npm(command: java.lang.String): CommandResult = js.native
  def npm(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def npm(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def prompt(message: java.lang.String): java.lang.String = js.native
  def prompt(message: java.lang.String, options: PromptOptions): java.lang.String = js.native
  def ps(command: java.lang.String): CommandResult = js.native
  def ps(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def ps(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def pwd(command: java.lang.String): CommandResult = js.native
  def pwd(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def pwd(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def rm(command: java.lang.String): CommandResult = js.native
  def rm(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def rm(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def rmdir(command: java.lang.String): CommandResult = js.native
  def rmdir(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def rmdir(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def rsync(command: java.lang.String): CommandResult = js.native
  def rsync(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def rsync(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def scp(command: java.lang.String): CommandResult = js.native
  def scp(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def scp(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def sed(command: java.lang.String): CommandResult = js.native
  def sed(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def sed(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def silent(): scala.Unit = js.native
  def sudo(command: java.lang.String): CommandResult = js.native
  def sudo(command: java.lang.String, options: SudoOptions): CommandResult = js.native
  def svn(command: java.lang.String): CommandResult = js.native
  def svn(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def svn(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def tail(command: java.lang.String): CommandResult = js.native
  def tail(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def tail(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def tar(command: java.lang.String): CommandResult = js.native
  def tar(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def tar(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def touch(command: java.lang.String): CommandResult = js.native
  def touch(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def touch(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def transfer(files: CommandResult, remoteDir: java.lang.String): js.Array[CommandResult] = js.native
  def transfer(files: CommandResult, remoteDir: java.lang.String, options: CommandOptions): js.Array[CommandResult] = js.native
  def transfer(files: js.Array[CommandResult | java.lang.String], remoteDir: java.lang.String): js.Array[CommandResult] = js.native
  def transfer(
    files: js.Array[CommandResult | java.lang.String],
    remoteDir: java.lang.String,
    options: CommandOptions
  ): js.Array[CommandResult] = js.native
  def unzip(command: java.lang.String): CommandResult = js.native
  def unzip(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def unzip(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def verbose(): scala.Unit = js.native
  def waitFor(fn: js.Function1[/* done */ js.Function1[/* result */ js.Any, scala.Unit], scala.Unit]): js.Any = js.native
  def whoami(command: java.lang.String): CommandResult = js.native
  def whoami(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def whoami(command: java.lang.String, options: CommandOptions): CommandResult = js.native
  def `with`(command: java.lang.String, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def `with`(command: java.lang.String, options: CommandOptions, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def `with`(options: CommandOptions, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def zip(command: java.lang.String): CommandResult = js.native
  def zip(command: java.lang.String, options: flightplanLib.Anon_Exec): CommandResult = js.native
  def zip(command: java.lang.String, options: CommandOptions): CommandResult = js.native
}

