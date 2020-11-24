package typings.easyXapiSupertest.NodeJS

import typings.easyXapiSupertest.anon.Ares
import typings.easyXapiSupertest.anon.HeapTotal
import typings.easyXapiSupertest.anon.Targetdefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Process extends EventEmitter {
  
  def abort(): Unit = js.native
  
  var arch: String = js.native
  
  var argv: js.Array[String] = js.native
  
  def chdir(directory: String): Unit = js.native
  
  var config: Targetdefaults = js.native
  
  def cwd(): String = js.native
  
  var env: js.Any = js.native
  
  var execPath: String = js.native
  
  def exit(): Unit = js.native
  def exit(code: Double): Unit = js.native
  
  def getgid(): Double = js.native
  
  def getuid(): Double = js.native
  
  def hrtime(): js.Array[Double] = js.native
  def hrtime(time: js.Array[Double]): js.Array[Double] = js.native
  
  def kill(pid: Double): Unit = js.native
  def kill(pid: Double, signal: String): Unit = js.native
  
  def memoryUsage(): HeapTotal = js.native
  
  def nextTick(callback: js.Function): Unit = js.native
  
  var pid: Double = js.native
  
  var platform: String = js.native
  
  // Worker
  var send: js.UndefOr[js.Function2[/* message */ js.Any, /* sendHandle */ js.UndefOr[js.Any], Unit]] = js.native
  
  def setgid(id: String): Unit = js.native
  def setgid(id: Double): Unit = js.native
  
  def setuid(id: String): Unit = js.native
  def setuid(id: Double): Unit = js.native
  
  var stderr: WritableStream = js.native
  
  var stdin: ReadableStream = js.native
  
  var stdout: WritableStream = js.native
  
  var title: String = js.native
  
  def umask(): Double = js.native
  def umask(mask: Double): Double = js.native
  
  def uptime(): Double = js.native
  
  var version: String = js.native
  
  var versions: Ares = js.native
}
