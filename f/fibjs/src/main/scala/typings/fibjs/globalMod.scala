package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 全局对象，所有脚本均可以访问的基础对象
  * @detail 
  */
object globalMod {
  
  @JSImport("global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("global", "Buffer")
  @js.native
  open class Buffer ()
    extends StObject
       with ClassBuffer
  
  inline def GC(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GC")().asInstanceOf[Unit]
  
  @JSImport("global", "Int64")
  @js.native
  open class Int64 ()
    extends StObject
       with ClassInt64
  
  @JSImport("global", "Master")
  @js.native
  val Master: ClassWorker = js.native
  
  @JSImport("global", "argv")
  @js.native
  val argv: js.Array[Any] = js.native
  
  inline def clearHrInterval(t: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearHrInterval")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearImmediate(t: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearImmediate")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearInterval(t: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearTimeout(t: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object console {
    
    @JSImport("global", "console")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("global", "console.ALERT")
    @js.native
    val ALERT_ : /* 1 */ Double = js.native
    
    @JSImport("global", "console.CRIT")
    @js.native
    val CRIT_ : /* 2 */ Double = js.native
    
    @JSImport("global", "console.DEBUG")
    @js.native
    val DEBUG_ : /* 7 */ Double = js.native
    
    @JSImport("global", "console.ERROR")
    @js.native
    val ERROR_ : /* 3 */ Double = js.native
    
    @JSImport("global", "console.FATAL")
    @js.native
    val FATAL: /* 0 */ Double = js.native
    
    @JSImport("global", "console.INFO")
    @js.native
    val INFO_ : /* 6 */ Double = js.native
    
    @JSImport("global", "console.NOTICE")
    @js.native
    val NOTICE_ : /* 5 */ Double = js.native
    
    @JSImport("global", "console.NOTSET")
    @js.native
    val NOTSET: /* 10 */ Double = js.native
    
    @JSImport("global", "console.PRINT")
    @js.native
    val PRINT_ : /* 9 */ Double = js.native
    
    @JSImport("global", "console.WARN")
    @js.native
    val WARN_ : /* 4 */ Double = js.native
    
    inline def add(cfg: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(cfg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def add(cfg: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(cfg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def add(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def alert(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def alert(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def assert(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def assert(value: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def clickMouse(button: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clickMouse")(button.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def clickMouse(button: String, dbclick: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clickMouse")(button.asInstanceOf[js.Any], dbclick.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def crit(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("crit")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def crit(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("crit")(List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def debug(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def debug(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def dir(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dir")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def error(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def error(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    @JSImport("global", "console.height")
    @js.native
    val height: Double = js.native
    
    inline def hideCursor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideCursor")().asInstanceOf[Unit]
    
    inline def info(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def info(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
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
    inline def log(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    @JSImport("global", "console.loglevel")
    @js.native
    val loglevel: Double = js.native
    
    inline def mouseDown(button: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseDown")(button.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def mouseUp(button: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseUp")(button.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def moveMouse(x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveMouse")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def moveTo(row: Double, column: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveTo")(row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def notice(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notice")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def notice(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notice")(List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def print(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def print(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
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
    inline def warn(fmt: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    @JSImport("global", "console.width")
    @js.native
    val width: Double = js.native
  }
  
  @JSImport("global", "__dirname")
  @js.native
  val dirname: String = js.native
  
  @JSImport("global", "__filename")
  @js.native
  val filename: String = js.native
  
  @JSImport("global", "global")
  @js.native
  val global: js.Object = js.native
  
  object process {
    
    @JSImport("global", "process")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("global", "process.arch")
    @js.native
    val arch: String = js.native
    
    @JSImport("global", "process.argv")
    @js.native
    val argv: js.Array[Any] = js.native
    
    inline def chdir(directory: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chdir")(directory.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def cwd(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cwd")().asInstanceOf[String]
    
    @JSImport("global", "process.env")
    @js.native
    val env: js.Object = js.native
    
    @JSImport("global", "process.execArgv")
    @js.native
    val execArgv: js.Array[Any] = js.native
    
    @JSImport("global", "process.execPath")
    @js.native
    val execPath: String = js.native
    
    inline def exit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")().asInstanceOf[Unit]
    inline def exit(code: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("global", "process.exitCode")
    @js.native
    val exitCode: Double = js.native
    
    inline def hrtime(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hrtime")().asInstanceOf[js.Array[Any]]
    inline def hrtime(diff: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hrtime")(diff.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def memoryUsage(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryUsage")().asInstanceOf[js.Object]
    
    inline def nextTick(func: js.Function, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(List(func.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def open(command: String): ClassSubProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(command.asInstanceOf[js.Any]).asInstanceOf[ClassSubProcess]
    inline def open(command: String, args: js.Array[Any]): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
    inline def open(command: String, args: js.Array[Any], opts: js.Object): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
    inline def open(command: String, opts: js.Object): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(command.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
    
    @JSImport("global", "process.platform")
    @js.native
    val platform: String = js.native
    
    inline def run(command: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(command.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def run(command: String, args: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def run(command: String, args: js.Array[Any], opts: js.Object): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def run(command: String, opts: js.Object): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(command.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def start(command: String): ClassSubProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(command.asInstanceOf[js.Any]).asInstanceOf[ClassSubProcess]
    inline def start(command: String, args: js.Array[Any]): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
    inline def start(command: String, args: js.Array[Any], opts: js.Object): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
    inline def start(command: String, opts: js.Object): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(command.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
    
    @JSImport("global", "process.stderr")
    @js.native
    val stderr: ClassFile = js.native
    
    @JSImport("global", "process.stdin")
    @js.native
    val stdin: ClassFile = js.native
    
    @JSImport("global", "process.stdout")
    @js.native
    val stdout: ClassFile = js.native
    
    inline def umask(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("umask")().asInstanceOf[Double]
    inline def umask(mask: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("umask")(mask.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def umask(mask: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("umask")(mask.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def uptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uptime")().asInstanceOf[Double]
    
    @JSImport("global", "process.version")
    @js.native
    val version: String = js.native
    
    @JSImport("global", "process.versions")
    @js.native
    val versions: js.Object = js.native
  }
  
  inline def repl(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repl")().asInstanceOf[Unit]
  inline def repl(cmds: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repl")(cmds.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def repl(out: ClassStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repl")(out.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def repl(out: ClassStream, cmds: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repl")(out.asInstanceOf[js.Any], cmds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def require(id: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def run(fname: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(fname.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def run(fname: String, argv: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(fname.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setHrInterval(callback: js.Function, timeout: Double, args: Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setHrInterval")((List(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ClassTimer]
  
  inline def setImmediate(callback: js.Function, args: Any*): ClassTimer = ^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(List(callback.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ClassTimer]
  
  inline def setInterval(callback: js.Function, timeout: Double, args: Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")((List(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ClassTimer]
  
  inline def setTimeout(callback: js.Function, timeout: Double, args: Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")((List(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ClassTimer]
  inline def setTimeout(callback: js.Function, timeout: Unit, args: Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")((List(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ClassTimer]
}
