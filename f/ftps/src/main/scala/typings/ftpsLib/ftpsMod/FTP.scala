package typings
package ftpsLib.ftpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FTP extends js.Object {
  def addFile(localPath: java.lang.String, remotePath: java.lang.String): FTP = js.native
  def cat(path: java.lang.String): FTP = js.native
  def cd(directory: java.lang.String): FTP = js.native
  // Helpers
  def escapeshell(cmd: java.lang.String): java.lang.String = js.native
  def exec(cmdsOrCallback: FTPCallbackFunction): js.Any = js.native
  def exec(cmdsOrCallback: FTPCallbackFunction, callback: FTPCallbackFunction): js.Any = js.native
  def exec(cmdsOrCallback: java.lang.String): js.Any = js.native
  def exec(cmdsOrCallback: java.lang.String, callback: FTPCallbackFunction): js.Any = js.native
  def exec(cmdsOrCallback: js.Array[java.lang.String]): js.Any = js.native
  def exec(cmdsOrCallback: js.Array[java.lang.String], callback: FTPCallbackFunction): js.Any = js.native
  def execAsStream(cmds: java.lang.String): js.Any = js.native
  def execAsStream(cmds: js.Array[java.lang.String]): js.Any = js.native
  def get(remotePath: java.lang.String, localPath: java.lang.String): FTP = js.native
  def getFile(remotePath: java.lang.String, localPath: java.lang.String): FTP = js.native
  def ls(): FTP = js.native
  def mirror(options: MirrorOptions): FTP = js.native
  def move(from: java.lang.String, to: java.lang.String): FTP = js.native
  def mv(from: java.lang.String, to: java.lang.String): FTP = js.native
  def put(localPath: java.lang.String, remotePath: java.lang.String): FTP = js.native
  def pwd(): FTP = js.native
  def raw(cmd: java.lang.String): FTP = js.native
  def remove(paths: java.lang.String*): FTP = js.native
  def rm(paths: java.lang.String*): FTP = js.native
  def rmdir(paths: java.lang.String*): FTP = js.native
}

