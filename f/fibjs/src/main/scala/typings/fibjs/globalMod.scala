package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 全局对象，所有脚本均可以访问的基础对象
  * @detail 
  */
object globalMod {
  
  @JSImport("global", "Buffer")
  @js.native
  class Buffer () extends ClassBuffer
  
  @JSImport("global", "GC")
  @js.native
  def GC(): Unit = js.native
  
  @JSImport("global", "Int64")
  @js.native
  class Int64 () extends ClassInt64
  
  @JSImport("global", "Master")
  @js.native
  val Master: ClassWorker = js.native
  
  @JSImport("global", "argv")
  @js.native
  val argv: js.Array[js.Any] = js.native
  
  @JSImport("global", "clearHrInterval")
  @js.native
  def clearHrInterval(t: js.Any): Unit = js.native
  
  @JSImport("global", "clearImmediate")
  @js.native
  def clearImmediate(t: js.Any): Unit = js.native
  
  @JSImport("global", "clearInterval")
  @js.native
  def clearInterval(t: js.Any): Unit = js.native
  
  @JSImport("global", "clearTimeout")
  @js.native
  def clearTimeout(t: js.Any): Unit = js.native
  
  object console {
    
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
    
    @JSImport("global", "console.add")
    @js.native
    def add(cfg: js.Array[_]): Unit = js.native
    @JSImport("global", "console.add")
    @js.native
    def add(cfg: js.Object): Unit = js.native
    @JSImport("global", "console.add")
    @js.native
    def add(`type`: String): Unit = js.native
    
    @JSImport("global", "console.alert")
    @js.native
    def alert(args: js.Any*): Unit = js.native
    @JSImport("global", "console.alert")
    @js.native
    def alert(fmt: String, args: js.Any*): Unit = js.native
    
    @JSImport("global", "console.assert")
    @js.native
    def assert(value: js.Any): Unit = js.native
    @JSImport("global", "console.assert")
    @js.native
    def assert(value: js.Any, msg: String): Unit = js.native
    
    @JSImport("global", "console.clear")
    @js.native
    def clear(): Unit = js.native
    
    @JSImport("global", "console.clickMouse")
    @js.native
    def clickMouse(button: String): Unit = js.native
    @JSImport("global", "console.clickMouse")
    @js.native
    def clickMouse(button: String, dbclick: Boolean): Unit = js.native
    
    @JSImport("global", "console.crit")
    @js.native
    def crit(args: js.Any*): Unit = js.native
    @JSImport("global", "console.crit")
    @js.native
    def crit(fmt: String, args: js.Any*): Unit = js.native
    
    @JSImport("global", "console.debug")
    @js.native
    def debug(args: js.Any*): Unit = js.native
    @JSImport("global", "console.debug")
    @js.native
    def debug(fmt: String, args: js.Any*): Unit = js.native
    
    @JSImport("global", "console.dir")
    @js.native
    def dir(obj: js.Any): Unit = js.native
    
    @JSImport("global", "console.error")
    @js.native
    def error(args: js.Any*): Unit = js.native
    @JSImport("global", "console.error")
    @js.native
    def error(fmt: String, args: js.Any*): Unit = js.native
    
    @JSImport("global", "console.height")
    @js.native
    val height: Double = js.native
    
    @JSImport("global", "console.hideCursor")
    @js.native
    def hideCursor(): Unit = js.native
    
    @JSImport("global", "console.info")
    @js.native
    def info(args: js.Any*): Unit = js.native
    @JSImport("global", "console.info")
    @js.native
    def info(fmt: String, args: js.Any*): Unit = js.native
    
    @JSImport("global", "console.keyDown")
    @js.native
    def keyDown(key: String): Unit = js.native
    @JSImport("global", "console.keyDown")
    @js.native
    def keyDown(key: String, modifier: String): Unit = js.native
    @JSImport("global", "console.keyDown")
    @js.native
    def keyDown(key: String, modifier: js.Array[_]): Unit = js.native
    
    @JSImport("global", "console.keyTap")
    @js.native
    def keyTap(key: String): Unit = js.native
    @JSImport("global", "console.keyTap")
    @js.native
    def keyTap(key: String, modifier: String): Unit = js.native
    @JSImport("global", "console.keyTap")
    @js.native
    def keyTap(key: String, modifier: js.Array[_]): Unit = js.native
    
    @JSImport("global", "console.keyUp")
    @js.native
    def keyUp(key: String): Unit = js.native
    @JSImport("global", "console.keyUp")
    @js.native
    def keyUp(key: String, modifier: String): Unit = js.native
    @JSImport("global", "console.keyUp")
    @js.native
    def keyUp(key: String, modifier: js.Array[_]): Unit = js.native
    
    @JSImport("global", "console.log")
    @js.native
    def log(args: js.Any*): Unit = js.native
    @JSImport("global", "console.log")
    @js.native
    def log(fmt: String, args: js.Any*): Unit = js.native
    
    @JSImport("global", "console.loglevel")
    @js.native
    val loglevel: Double = js.native
    
    @JSImport("global", "console.mouseDown")
    @js.native
    def mouseDown(button: String): Unit = js.native
    
    @JSImport("global", "console.mouseUp")
    @js.native
    def mouseUp(button: String): Unit = js.native
    
    @JSImport("global", "console.moveMouse")
    @js.native
    def moveMouse(x: Double, y: Double): Unit = js.native
    
    @JSImport("global", "console.moveTo")
    @js.native
    def moveTo(row: Double, column: Double): Unit = js.native
    
    @JSImport("global", "console.notice")
    @js.native
    def notice(args: js.Any*): Unit = js.native
    @JSImport("global", "console.notice")
    @js.native
    def notice(fmt: String, args: js.Any*): Unit = js.native
    
    @JSImport("global", "console.print")
    @js.native
    def print(args: js.Any*): Unit = js.native
    @JSImport("global", "console.print")
    @js.native
    def print(fmt: String, args: js.Any*): Unit = js.native
    
    @JSImport("global", "console.readLine")
    @js.native
    def readLine(): String = js.native
    @JSImport("global", "console.readLine")
    @js.native
    def readLine(msg: String): String = js.native
    
    @JSImport("global", "console.reset")
    @js.native
    def reset(): Unit = js.native
    
    @JSImport("global", "console.showCursor")
    @js.native
    def showCursor(): Unit = js.native
    
    @JSImport("global", "console.time")
    @js.native
    def time(): Unit = js.native
    @JSImport("global", "console.time")
    @js.native
    def time(label: String): Unit = js.native
    
    @JSImport("global", "console.timeElapse")
    @js.native
    def timeElapse(): Unit = js.native
    @JSImport("global", "console.timeElapse")
    @js.native
    def timeElapse(label: String): Unit = js.native
    
    @JSImport("global", "console.timeEnd")
    @js.native
    def timeEnd(): Unit = js.native
    @JSImport("global", "console.timeEnd")
    @js.native
    def timeEnd(label: String): Unit = js.native
    
    @JSImport("global", "console.trace")
    @js.native
    def trace(): Unit = js.native
    @JSImport("global", "console.trace")
    @js.native
    def trace(label: String): Unit = js.native
    
    @JSImport("global", "console.typeString")
    @js.native
    def typeString(text: String): Unit = js.native
    
    @JSImport("global", "console.warn")
    @js.native
    def warn(args: js.Any*): Unit = js.native
    @JSImport("global", "console.warn")
    @js.native
    def warn(fmt: String, args: js.Any*): Unit = js.native
    
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
    
    @JSImport("global", "process.arch")
    @js.native
    val arch: String = js.native
    
    @JSImport("global", "process.argv")
    @js.native
    val argv: js.Array[js.Any] = js.native
    
    @JSImport("global", "process.chdir")
    @js.native
    def chdir(directory: String): Unit = js.native
    
    @JSImport("global", "process.cwd")
    @js.native
    def cwd(): String = js.native
    
    @JSImport("global", "process.env")
    @js.native
    val env: js.Object = js.native
    
    @JSImport("global", "process.execArgv")
    @js.native
    val execArgv: js.Array[js.Any] = js.native
    
    @JSImport("global", "process.execPath")
    @js.native
    val execPath: String = js.native
    
    @JSImport("global", "process.exit")
    @js.native
    def exit(): Unit = js.native
    @JSImport("global", "process.exit")
    @js.native
    def exit(code: Double): Unit = js.native
    
    @JSImport("global", "process.exitCode")
    @js.native
    val exitCode: Double = js.native
    
    @JSImport("global", "process.hrtime")
    @js.native
    def hrtime(): js.Array[_] = js.native
    @JSImport("global", "process.hrtime")
    @js.native
    def hrtime(diff: js.Array[_]): js.Array[_] = js.native
    
    @JSImport("global", "process.memoryUsage")
    @js.native
    def memoryUsage(): js.Object = js.native
    
    @JSImport("global", "process.nextTick")
    @js.native
    def nextTick(func: js.Function, args: js.Any*): Unit = js.native
    
    @JSImport("global", "process.open")
    @js.native
    def open(command: String): ClassSubProcess = js.native
    @JSImport("global", "process.open")
    @js.native
    def open(command: String, args: js.Array[_]): ClassSubProcess = js.native
    @JSImport("global", "process.open")
    @js.native
    def open(command: String, args: js.Array[_], opts: js.Object): ClassSubProcess = js.native
    @JSImport("global", "process.open")
    @js.native
    def open(command: String, opts: js.Object): ClassSubProcess = js.native
    
    @JSImport("global", "process.platform")
    @js.native
    val platform: String = js.native
    
    @JSImport("global", "process.run")
    @js.native
    def run(command: String): Double = js.native
    @JSImport("global", "process.run")
    @js.native
    def run(command: String, args: js.Array[_]): Double = js.native
    @JSImport("global", "process.run")
    @js.native
    def run(command: String, args: js.Array[_], opts: js.Object): Double = js.native
    @JSImport("global", "process.run")
    @js.native
    def run(command: String, opts: js.Object): Double = js.native
    
    @JSImport("global", "process.start")
    @js.native
    def start(command: String): ClassSubProcess = js.native
    @JSImport("global", "process.start")
    @js.native
    def start(command: String, args: js.Array[_]): ClassSubProcess = js.native
    @JSImport("global", "process.start")
    @js.native
    def start(command: String, args: js.Array[_], opts: js.Object): ClassSubProcess = js.native
    @JSImport("global", "process.start")
    @js.native
    def start(command: String, opts: js.Object): ClassSubProcess = js.native
    
    @JSImport("global", "process.stderr")
    @js.native
    val stderr: ClassFile = js.native
    
    @JSImport("global", "process.stdin")
    @js.native
    val stdin: ClassFile = js.native
    
    @JSImport("global", "process.stdout")
    @js.native
    val stdout: ClassFile = js.native
    
    @JSImport("global", "process.umask")
    @js.native
    def umask(): Double = js.native
    @JSImport("global", "process.umask")
    @js.native
    def umask(mask: String): Double = js.native
    @JSImport("global", "process.umask")
    @js.native
    def umask(mask: Double): Double = js.native
    
    @JSImport("global", "process.uptime")
    @js.native
    def uptime(): Double = js.native
    
    @JSImport("global", "process.version")
    @js.native
    val version: String = js.native
    
    @JSImport("global", "process.versions")
    @js.native
    val versions: js.Object = js.native
  }
  
  @JSImport("global", "repl")
  @js.native
  def repl(): Unit = js.native
  @JSImport("global", "repl")
  @js.native
  def repl(cmds: js.Array[_]): Unit = js.native
  @JSImport("global", "repl")
  @js.native
  def repl(out: ClassStream): Unit = js.native
  @JSImport("global", "repl")
  @js.native
  def repl(out: ClassStream, cmds: js.Array[_]): Unit = js.native
  
  @JSImport("global", "require")
  @js.native
  def require(id: String): js.Any = js.native
  
  @JSImport("global", "run")
  @js.native
  def run(fname: String): Unit = js.native
  @JSImport("global", "run")
  @js.native
  def run(fname: String, argv: js.Array[_]): Unit = js.native
  
  @JSImport("global", "setHrInterval")
  @js.native
  def setHrInterval(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = js.native
  
  @JSImport("global", "setImmediate")
  @js.native
  def setImmediate(callback: js.Function, args: js.Any*): ClassTimer = js.native
  
  @JSImport("global", "setInterval")
  @js.native
  def setInterval(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = js.native
  
  @JSImport("global", "setTimeout")
  @js.native
  def setTimeout(callback: js.Function, timeout: js.UndefOr[scala.Nothing], args: js.Any*): ClassTimer = js.native
  @JSImport("global", "setTimeout")
  @js.native
  def setTimeout(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = js.native
}
