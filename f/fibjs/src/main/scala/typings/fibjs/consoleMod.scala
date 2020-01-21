package typings.fibjs

import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`10`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import typings.fibjs.fibjsNumbers.`3`
import typings.fibjs.fibjsNumbers.`4`
import typings.fibjs.fibjsNumbers.`5`
import typings.fibjs.fibjsNumbers.`6`
import typings.fibjs.fibjsNumbers.`7`
import typings.fibjs.fibjsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 控制台访问对象
	* @detail 全局对象。可用于提示信息，警告和错误记录。通过启动配置文件，可将日志定位到不同的设备，以便于跟踪。日志支持格式化输出，例如：,```JavaScript,console.log("%d + %d = %d", 100, 200, 100 + 200);,```,可以使用的格式化参数如下：,- %s - 字符串,- %d - 数字，包括整数和数字,- %j - 以 JSON 格式输出对象,- %% - 输出字符 '%' 本身
	*/
@JSImport("console", JSImport.Namespace)
@js.native
object consoleMod extends js.Object {
  @JSName("ALERT")
  val ALERT_ : `1` = js.native
  @JSName("CRIT")
  val CRIT_ : `2` = js.native
  @JSName("DEBUG")
  val DEBUG_ : `7` = js.native
  @JSName("ERROR")
  val ERROR_ : `3` = js.native
  val FATAL: `0` = js.native
  @JSName("INFO")
  val INFO_ : `6` = js.native
  @JSName("NOTICE")
  val NOTICE_ : `5` = js.native
  val NOTSET: `10` = js.native
  @JSName("PRINT")
  val PRINT_ : `9` = js.native
  @JSName("WARN")
  val WARN_ : `4` = js.native
  val height: Double = js.native
  val loglevel: Double = js.native
  val width: Double = js.native
  def add(cfg: js.Array[_]): Unit = js.native
  def add(cfg: js.Object): Unit = js.native
  def add(`type`: String): Unit = js.native
  def alert(args: js.Any*): Unit = js.native
  def alert(fmt: String, args: js.Any*): Unit = js.native
  def assert(value: js.Any): Unit = js.native
  def assert(value: js.Any, msg: String): Unit = js.native
  def clear(): Unit = js.native
  def clickMouse(button: String): Unit = js.native
  def clickMouse(button: String, dbclick: Boolean): Unit = js.native
  def crit(args: js.Any*): Unit = js.native
  def crit(fmt: String, args: js.Any*): Unit = js.native
  def debug(args: js.Any*): Unit = js.native
  def debug(fmt: String, args: js.Any*): Unit = js.native
  def dir(obj: js.Any): Unit = js.native
  def error(args: js.Any*): Unit = js.native
  def error(fmt: String, args: js.Any*): Unit = js.native
  def hideCursor(): Unit = js.native
  def info(args: js.Any*): Unit = js.native
  def info(fmt: String, args: js.Any*): Unit = js.native
  def keyDown(key: String): Unit = js.native
  def keyDown(key: String, modifier: String): Unit = js.native
  def keyDown(key: String, modifier: js.Array[_]): Unit = js.native
  def keyTap(key: String): Unit = js.native
  def keyTap(key: String, modifier: String): Unit = js.native
  def keyTap(key: String, modifier: js.Array[_]): Unit = js.native
  def keyUp(key: String): Unit = js.native
  def keyUp(key: String, modifier: String): Unit = js.native
  def keyUp(key: String, modifier: js.Array[_]): Unit = js.native
  def log(args: js.Any*): Unit = js.native
  def log(fmt: String, args: js.Any*): Unit = js.native
  def mouseDown(button: String): Unit = js.native
  def mouseUp(button: String): Unit = js.native
  def moveMouse(x: Double, y: Double): Unit = js.native
  def moveTo(row: Double, column: Double): Unit = js.native
  def notice(args: js.Any*): Unit = js.native
  def notice(fmt: String, args: js.Any*): Unit = js.native
  def print(args: js.Any*): Unit = js.native
  def print(fmt: String, args: js.Any*): Unit = js.native
  def readLine(): String = js.native
  def readLine(msg: String): String = js.native
  def reset(): Unit = js.native
  def showCursor(): Unit = js.native
  def time(): Unit = js.native
  def time(label: String): Unit = js.native
  def timeElapse(): Unit = js.native
  def timeElapse(label: String): Unit = js.native
  def timeEnd(): Unit = js.native
  def timeEnd(label: String): Unit = js.native
  def trace(): Unit = js.native
  def trace(label: String): Unit = js.native
  def typeString(text: String): Unit = js.native
  def warn(args: js.Any*): Unit = js.native
  def warn(fmt: String, args: js.Any*): Unit = js.native
}

