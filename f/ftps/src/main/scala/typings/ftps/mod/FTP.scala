package typings.ftps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FTP extends js.Object {
  
  def addFile(localPath: String, remotePath: String): FTP = js.native
  
  def cat(path: String): FTP = js.native
  
  def cd(directory: String): FTP = js.native
  
  // Helpers
  def escapeshell(cmd: String): String = js.native
  
  def exec(cmdsOrCallback: String): js.Any = js.native
  def exec(cmdsOrCallback: String, callback: FTPCallbackFunction): js.Any = js.native
  def exec(cmdsOrCallback: js.Array[String]): js.Any = js.native
  def exec(cmdsOrCallback: js.Array[String], callback: FTPCallbackFunction): js.Any = js.native
  def exec(cmdsOrCallback: FTPCallbackFunction): js.Any = js.native
  def exec(cmdsOrCallback: FTPCallbackFunction, callback: FTPCallbackFunction): js.Any = js.native
  
  def execAsStream(cmds: String): js.Any = js.native
  def execAsStream(cmds: js.Array[String]): js.Any = js.native
  
  def get(remotePath: String, localPath: String): FTP = js.native
  
  def getFile(remotePath: String, localPath: String): FTP = js.native
  
  def ls(): FTP = js.native
  
  def mirror(options: MirrorOptions): FTP = js.native
  
  def move(from: String, to: String): FTP = js.native
  
  def mv(from: String, to: String): FTP = js.native
  
  def put(localPath: String, remotePath: String): FTP = js.native
  
  def pwd(): FTP = js.native
  
  def raw(cmd: String): FTP = js.native
  
  def remove(paths: String*): FTP = js.native
  
  def rm(paths: String*): FTP = js.native
  
  def rmdir(paths: String*): FTP = js.native
}
