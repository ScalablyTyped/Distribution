package typings.fibjs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 操作系统与文件系统处理模块
  * @detail 使用方法：,```JavaScript,var os = require('os');,```
  */
object osMod {
  
  @JSImport("os", "EOL")
  @js.native
  val EOL: String = js.native
  
  @JSImport("os", "Service")
  @js.native
  class Service () extends ClassService
  
  @JSImport("os", "arch")
  @js.native
  def arch(): String = js.native
  
  @JSImport("os", "cpuNumbers")
  @js.native
  def cpuNumbers(): Double = js.native
  
  @JSImport("os", "cpus")
  @js.native
  def cpus(): js.Array[_] = js.native
  
  @JSImport("os", "dateAdd")
  @js.native
  def dateAdd(d: Date, num: Double, part: String): Date = js.native
  
  @JSImport("os", "endianness")
  @js.native
  def endianness(): String = js.native
  
  @JSImport("os", "execPath")
  @js.native
  val execPath: String = js.native
  
  @JSImport("os", "freemem")
  @js.native
  def freemem(): Double = js.native
  
  @JSImport("os", "homedir")
  @js.native
  def homedir(): String = js.native
  
  @JSImport("os", "hostname")
  @js.native
  def hostname(): String = js.native
  
  @JSImport("os", "loadavg")
  @js.native
  def loadavg(): js.Array[_] = js.native
  
  @JSImport("os", "memoryUsage")
  @js.native
  def memoryUsage(): js.Object = js.native
  
  @JSImport("os", "networkInterfaces")
  @js.native
  def networkInterfaces(): js.Object = js.native
  
  @JSImport("os", "openPrinter")
  @js.native
  def openPrinter(name: String): ClassBufferedStream = js.native
  
  @JSImport("os", "platform")
  @js.native
  def platform(): String = js.native
  
  @JSImport("os", "printerInfo")
  @js.native
  def printerInfo(): js.Array[_] = js.native
  
  @JSImport("os", "release")
  @js.native
  def release(): String = js.native
  
  @JSImport("os", "time")
  @js.native
  def time(): Date = js.native
  @JSImport("os", "time")
  @js.native
  def time(tmString: String): Date = js.native
  
  @JSImport("os", "timezone")
  @js.native
  val timezone: Double = js.native
  
  @JSImport("os", "tmpdir")
  @js.native
  def tmpdir(): String = js.native
  
  @JSImport("os", "totalmem")
  @js.native
  def totalmem(): Double = js.native
  
  @JSImport("os", "uptime")
  @js.native
  def uptime(): Double = js.native
  
  @JSImport("os", "userInfo")
  @js.native
  def userInfo(): js.Object = js.native
  @JSImport("os", "userInfo")
  @js.native
  def userInfo(options: js.Object): js.Object = js.native
  
  @JSImport("os", "type")
  @js.native
  def `type`(): String = js.native
}
