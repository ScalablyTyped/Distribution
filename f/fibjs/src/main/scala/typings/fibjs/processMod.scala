package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 进程处理模块，用以管理当前进程的资源
  * @detail 引用方法：,```JavaScript,var process = require('process');,```,,## 进程事件,process 模块对象是 EventEmitter 的实例，可以通过注册事件监听器响应进程级别的事件。,,### beforeExit 事件,**当 fibjs 的任务已经为空，并且没有额外的工作被添加进来，事件 `beforeExit` 会被触发**,```JavaScript,process.on('beforeExit', exitCode => {});,```,正常情况下，如果没有额外的工作被添加到任务队列，fibjs 进程会结束。但是如果 `beforeExit` 事件绑定的监听器的回调函数中，启动了一个新的任务，比如开启一个 fiber，那么 fibjs 进程会继续运行。,,process.exitCode 作为唯一的参数值传递给 `beforeExit` 事件监听器的回调函数。如果进程由于显式的原因而将要终止，例如直接调用 process.exit 或抛出未捕获的异常，`beforeExit`事件不会被触发。,,### exit 事件,**当 fibjs 退出时，事件 `exit` 会被触发，一旦所有与 `exit` 事件绑定的监听器执行完成，进程会终止**,```JavaScript,process.on('exit', exitCode => {});,```,`exit` 事件监听器的回调函数，只有一个入参，这个参数的值可以是 process.exitCode 的属性值，或者是调用 process.exit 方法时传入的 `exitCode` 值。,,### Signal 事件,**当 fibjs 进程接收到一个信号时，会触发信号事件，目前支持的信号有 SIGINT 和 SIGTERM。每个事件名称，以信号名称的大写表示 (比如事件'SIGINT' 对应信号 SIGINT)。**,,信号事件不同于其它进程事件，信号事件是抢占的，当信号发生时，无论当前在 io 操作，还是 JavaScript 运算，都会尽快触发相应事件。比如你可以用下面的代码，中断当前应用，并输出运行状态：,```JavaScript,var coroutine = require('coroutine');,,process.on('SIGINT', () => {,   coroutine.fibers.forEach(f => console.error("Fiber %d:\n%s", f.id, f.stack));,   process.exit();,});,```,信号名称及其意义如下：,* SIGINT：在终端运行时，可以被所有平台支持，通常可以通过 CTRL+C 触发。,* SIGTERM：当进程被 kill 时触发此信号。Windows 下不支持。
  */
object processMod {
  
  @JSImport("process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("process", "arch")
  @js.native
  val arch: String = js.native
  
  @JSImport("process", "argv")
  @js.native
  val argv: js.Array[js.Any] = js.native
  
  @scala.inline
  def chdir(directory: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chdir")(directory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def cwd(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cwd")().asInstanceOf[String]
  
  @JSImport("process", "env")
  @js.native
  val env: js.Object = js.native
  
  @JSImport("process", "execArgv")
  @js.native
  val execArgv: js.Array[js.Any] = js.native
  
  @JSImport("process", "execPath")
  @js.native
  val execPath: String = js.native
  
  @scala.inline
  def exit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")().asInstanceOf[Unit]
  @scala.inline
  def exit(code: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("process", "exitCode")
  @js.native
  val exitCode: Double = js.native
  
  @scala.inline
  def hrtime(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hrtime")().asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def hrtime(diff: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hrtime")(diff.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def memoryUsage(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryUsage")().asInstanceOf[js.Object]
  
  @scala.inline
  def nextTick(func: js.Function, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def open(command: String): ClassSubProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(command.asInstanceOf[js.Any]).asInstanceOf[ClassSubProcess]
  @scala.inline
  def open(command: String, args: js.Array[js.Any]): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
  @scala.inline
  def open(command: String, args: js.Array[js.Any], opts: js.Object): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
  @scala.inline
  def open(command: String, opts: js.Object): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(command.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
  
  @JSImport("process", "platform")
  @js.native
  val platform: String = js.native
  
  @scala.inline
  def run(command: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(command.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def run(command: String, args: js.Array[js.Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def run(command: String, args: js.Array[js.Any], opts: js.Object): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def run(command: String, opts: js.Object): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(command.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def start(command: String): ClassSubProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(command.asInstanceOf[js.Any]).asInstanceOf[ClassSubProcess]
  @scala.inline
  def start(command: String, args: js.Array[js.Any]): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
  @scala.inline
  def start(command: String, args: js.Array[js.Any], opts: js.Object): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
  @scala.inline
  def start(command: String, opts: js.Object): ClassSubProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(command.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClassSubProcess]
  
  @JSImport("process", "stderr")
  @js.native
  val stderr: ClassFile = js.native
  
  @JSImport("process", "stdin")
  @js.native
  val stdin: ClassFile = js.native
  
  @JSImport("process", "stdout")
  @js.native
  val stdout: ClassFile = js.native
  
  @scala.inline
  def umask(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("umask")().asInstanceOf[Double]
  @scala.inline
  def umask(mask: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("umask")(mask.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def umask(mask: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("umask")(mask.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def uptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uptime")().asInstanceOf[Double]
  
  @JSImport("process", "version")
  @js.native
  val version: String = js.native
  
  @JSImport("process", "versions")
  @js.native
  val versions: js.Object = js.native
}
