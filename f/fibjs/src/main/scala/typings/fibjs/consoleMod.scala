package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 控制台访问对象
  * @detail 全局对象。可用于提示信息，警告和错误记录。通过启动配置文件，可将日志定位到不同的设备，以便于跟踪。日志支持格式化输出，例如：,```JavaScript,console.log("%d + %d = %d", 100, 200, 100 + 200);,```,可以使用的格式化参数如下：,- %s - 字符串,- %d - 数字，包括整数和数字,- %j - 以 JSON 格式输出对象,- %% - 输出字符 '%' 本身
  */
object consoleMod {
  
  @JSImport("console", "ALERT")
  @js.native
  val ALERT_ : /* 1 */ Double = js.native
  
  @JSImport("console", "CRIT")
  @js.native
  val CRIT_ : /* 2 */ Double = js.native
  
  @JSImport("console", "DEBUG")
  @js.native
  val DEBUG_ : /* 7 */ Double = js.native
  
  @JSImport("console", "ERROR")
  @js.native
  val ERROR_ : /* 3 */ Double = js.native
  
  @JSImport("console", "FATAL")
  @js.native
  val FATAL: /* 0 */ Double = js.native
  
  @JSImport("console", "INFO")
  @js.native
  val INFO_ : /* 6 */ Double = js.native
  
  @JSImport("console", "NOTICE")
  @js.native
  val NOTICE_ : /* 5 */ Double = js.native
  
  @JSImport("console", "NOTSET")
  @js.native
  val NOTSET: /* 10 */ Double = js.native
  
  @JSImport("console", "PRINT")
  @js.native
  val PRINT_ : /* 9 */ Double = js.native
  
  @JSImport("console", "WARN")
  @js.native
  val WARN_ : /* 4 */ Double = js.native
  
  @JSImport("console", "add")
  @js.native
  def add(cfg: js.Array[_]): Unit = js.native
  @JSImport("console", "add")
  @js.native
  def add(cfg: js.Object): Unit = js.native
  @JSImport("console", "add")
  @js.native
  def add(`type`: String): Unit = js.native
  
  @JSImport("console", "alert")
  @js.native
  def alert(args: js.Any*): Unit = js.native
  @JSImport("console", "alert")
  @js.native
  def alert(fmt: String, args: js.Any*): Unit = js.native
  
  @JSImport("console", "assert")
  @js.native
  def assert(value: js.Any): Unit = js.native
  @JSImport("console", "assert")
  @js.native
  def assert(value: js.Any, msg: String): Unit = js.native
  
  @JSImport("console", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("console", "clickMouse")
  @js.native
  def clickMouse(button: String): Unit = js.native
  @JSImport("console", "clickMouse")
  @js.native
  def clickMouse(button: String, dbclick: Boolean): Unit = js.native
  
  @JSImport("console", "crit")
  @js.native
  def crit(args: js.Any*): Unit = js.native
  @JSImport("console", "crit")
  @js.native
  def crit(fmt: String, args: js.Any*): Unit = js.native
  
  @JSImport("console", "debug")
  @js.native
  def debug(args: js.Any*): Unit = js.native
  @JSImport("console", "debug")
  @js.native
  def debug(fmt: String, args: js.Any*): Unit = js.native
  
  @JSImport("console", "dir")
  @js.native
  def dir(obj: js.Any): Unit = js.native
  
  @JSImport("console", "error")
  @js.native
  def error(args: js.Any*): Unit = js.native
  @JSImport("console", "error")
  @js.native
  def error(fmt: String, args: js.Any*): Unit = js.native
  
  @JSImport("console", "height")
  @js.native
  val height: Double = js.native
  
  @JSImport("console", "hideCursor")
  @js.native
  def hideCursor(): Unit = js.native
  
  @JSImport("console", "info")
  @js.native
  def info(args: js.Any*): Unit = js.native
  @JSImport("console", "info")
  @js.native
  def info(fmt: String, args: js.Any*): Unit = js.native
  
  @JSImport("console", "keyDown")
  @js.native
  def keyDown(key: String): Unit = js.native
  @JSImport("console", "keyDown")
  @js.native
  def keyDown(key: String, modifier: String): Unit = js.native
  @JSImport("console", "keyDown")
  @js.native
  def keyDown(key: String, modifier: js.Array[_]): Unit = js.native
  
  @JSImport("console", "keyTap")
  @js.native
  def keyTap(key: String): Unit = js.native
  @JSImport("console", "keyTap")
  @js.native
  def keyTap(key: String, modifier: String): Unit = js.native
  @JSImport("console", "keyTap")
  @js.native
  def keyTap(key: String, modifier: js.Array[_]): Unit = js.native
  
  @JSImport("console", "keyUp")
  @js.native
  def keyUp(key: String): Unit = js.native
  @JSImport("console", "keyUp")
  @js.native
  def keyUp(key: String, modifier: String): Unit = js.native
  @JSImport("console", "keyUp")
  @js.native
  def keyUp(key: String, modifier: js.Array[_]): Unit = js.native
  
  @JSImport("console", "log")
  @js.native
  def log(args: js.Any*): Unit = js.native
  @JSImport("console", "log")
  @js.native
  def log(fmt: String, args: js.Any*): Unit = js.native
  
  @JSImport("console", "loglevel")
  @js.native
  val loglevel: Double = js.native
  
  @JSImport("console", "mouseDown")
  @js.native
  def mouseDown(button: String): Unit = js.native
  
  @JSImport("console", "mouseUp")
  @js.native
  def mouseUp(button: String): Unit = js.native
  
  @JSImport("console", "moveMouse")
  @js.native
  def moveMouse(x: Double, y: Double): Unit = js.native
  
  @JSImport("console", "moveTo")
  @js.native
  def moveTo(row: Double, column: Double): Unit = js.native
  
  @JSImport("console", "notice")
  @js.native
  def notice(args: js.Any*): Unit = js.native
  @JSImport("console", "notice")
  @js.native
  def notice(fmt: String, args: js.Any*): Unit = js.native
  
  @JSImport("console", "print")
  @js.native
  def print(args: js.Any*): Unit = js.native
  @JSImport("console", "print")
  @js.native
  def print(fmt: String, args: js.Any*): Unit = js.native
  
  @JSImport("console", "readLine")
  @js.native
  def readLine(): String = js.native
  @JSImport("console", "readLine")
  @js.native
  def readLine(msg: String): String = js.native
  
  @JSImport("console", "reset")
  @js.native
  def reset(): Unit = js.native
  
  @JSImport("console", "showCursor")
  @js.native
  def showCursor(): Unit = js.native
  
  @JSImport("console", "time")
  @js.native
  def time(): Unit = js.native
  @JSImport("console", "time")
  @js.native
  def time(label: String): Unit = js.native
  
  @JSImport("console", "timeElapse")
  @js.native
  def timeElapse(): Unit = js.native
  @JSImport("console", "timeElapse")
  @js.native
  def timeElapse(label: String): Unit = js.native
  
  @JSImport("console", "timeEnd")
  @js.native
  def timeEnd(): Unit = js.native
  @JSImport("console", "timeEnd")
  @js.native
  def timeEnd(label: String): Unit = js.native
  
  @JSImport("console", "trace")
  @js.native
  def trace(): Unit = js.native
  @JSImport("console", "trace")
  @js.native
  def trace(label: String): Unit = js.native
  
  @JSImport("console", "typeString")
  @js.native
  def typeString(text: String): Unit = js.native
  
  @JSImport("console", "warn")
  @js.native
  def warn(args: js.Any*): Unit = js.native
  @JSImport("console", "warn")
  @js.native
  def warn(fmt: String, args: js.Any*): Unit = js.native
  
  @JSImport("console", "width")
  @js.native
  val width: Double = js.native
}
