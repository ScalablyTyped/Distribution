package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 控制台访问对象
  * @detail 全局对象。可用于提示信息，警告和错误记录。通过启动配置文件，可将日志定位到不同的设备，以便于跟踪。日志支持格式化输出，例如：,```JavaScript,console.log("%d + %d = %d", 100, 200, 100 + 200);,```,可以使用的格式化参数如下：,- %s - 字符串,- %d - 数字，包括整数和数字,- %j - 以 JSON 格式输出对象,- %% - 输出字符 '%' 本身
  */
object consoleMod {
  
  @JSImport("console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def add(cfg: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(cfg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def add(cfg: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(cfg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def add(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def alert(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  inline def alert(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def assert(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def assert(value: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def clickMouse(button: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clickMouse")(button.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clickMouse(button: String, dbclick: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clickMouse")(button.asInstanceOf[js.Any], dbclick.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def crit(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("crit")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  inline def crit(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("crit")(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def debug(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  inline def debug(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def dir(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dir")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def error(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  inline def error(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  @JSImport("console", "height")
  @js.native
  val height: Double = js.native
  
  inline def hideCursor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideCursor")().asInstanceOf[Unit]
  
  inline def info(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  inline def info(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def keyDown(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keyDown")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def keyDown(key: String, modifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keyDown")(key.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def keyDown(key: String, modifier: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keyDown")(key.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def keyTap(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keyTap")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def keyTap(key: String, modifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keyTap")(key.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def keyTap(key: String, modifier: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keyTap")(key.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def keyUp(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keyUp")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def keyUp(key: String, modifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keyUp")(key.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def keyUp(key: String, modifier: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keyUp")(key.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def log(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  inline def log(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  @JSImport("console", "loglevel")
  @js.native
  val loglevel: Double = js.native
  
  inline def mouseDown(button: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseDown")(button.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mouseUp(button: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseUp")(button.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def moveMouse(x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveMouse")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def moveTo(row: Double, column: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveTo")(row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notice(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notice")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  inline def notice(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notice")(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def print(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  inline def print(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def readLine(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readLine")().asInstanceOf[String]
  inline def readLine(msg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readLine")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def showCursor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showCursor")().asInstanceOf[Unit]
  
  inline def time(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[Unit]
  inline def time(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def timeElapse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeElapse")().asInstanceOf[Unit]
  inline def timeElapse(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeElapse")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def timeEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeEnd")().asInstanceOf[Unit]
  inline def timeEnd(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeEnd")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")().asInstanceOf[Unit]
  inline def trace(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def typeString(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("typeString")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warn(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  inline def warn(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  @JSImport("console", "width")
  @js.native
  val width: Double = js.native
}
