package typings.fibjs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 操作系统与文件系统处理模块
  * @detail 使用方法：,```JavaScript,var os = require('os');,```
  */
object osMod {
  
  @JSImport("os", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("os", "EOL")
  @js.native
  val EOL: String = js.native
  
  @JSImport("os", "Service")
  @js.native
  class Service ()
    extends StObject
       with ClassService
  
  inline def arch(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arch")().asInstanceOf[String]
  
  inline def cpuNumbers(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuNumbers")().asInstanceOf[Double]
  
  inline def cpus(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cpus")().asInstanceOf[js.Array[js.Any]]
  
  inline def dateAdd(d: Date, num: Double, part: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("dateAdd")(d.asInstanceOf[js.Any], num.asInstanceOf[js.Any], part.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def endianness(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("endianness")().asInstanceOf[String]
  
  @JSImport("os", "execPath")
  @js.native
  val execPath: String = js.native
  
  inline def freemem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("freemem")().asInstanceOf[Double]
  
  inline def homedir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("homedir")().asInstanceOf[String]
  
  inline def hostname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hostname")().asInstanceOf[String]
  
  inline def loadavg(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadavg")().asInstanceOf[js.Array[js.Any]]
  
  inline def memoryUsage(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryUsage")().asInstanceOf[js.Object]
  
  inline def networkInterfaces(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("networkInterfaces")().asInstanceOf[js.Object]
  
  inline def openPrinter(name: String): ClassBufferedStream = ^.asInstanceOf[js.Dynamic].applyDynamic("openPrinter")(name.asInstanceOf[js.Any]).asInstanceOf[ClassBufferedStream]
  
  inline def platform(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("platform")().asInstanceOf[String]
  
  inline def printerInfo(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("printerInfo")().asInstanceOf[js.Array[js.Any]]
  
  inline def release(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("release")().asInstanceOf[String]
  
  inline def time(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[Date]
  inline def time(tmString: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(tmString.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @JSImport("os", "timezone")
  @js.native
  val timezone: Double = js.native
  
  inline def tmpdir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpdir")().asInstanceOf[String]
  
  inline def totalmem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("totalmem")().asInstanceOf[Double]
  
  inline def `type`(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")().asInstanceOf[String]
  
  inline def uptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uptime")().asInstanceOf[Double]
  
  inline def userInfo(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("userInfo")().asInstanceOf[js.Object]
  inline def userInfo(options: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("userInfo")(options.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
