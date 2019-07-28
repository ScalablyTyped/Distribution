package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 进程处理模块，用以管理当前进程的资源
	* @detail 引用方法：,```JavaScript,var process = require('process');,```,,## 进程事件,process 模块对象是 EventEmitter 的实例，可以通过注册事件监听器响应进程级别的事件。,,### beforeExit 事件,**当 fibjs 的任务已经为空，并且没有额外的工作被添加进来，事件 `beforeExit` 会被触发**,```JavaScript,process.on('beforeExit', exitCode => {});,```,正常情况下，如果没有额外的工作被添加到任务队列，fibjs 进程会结束。但是如果 `beforeExit` 事件绑定的监听器的回调函数中，启动了一个新的任务，比如开启一个 fiber，那么 fibjs 进程会继续运行。,,process.exitCode 作为唯一的参数值传递给 `beforeExit` 事件监听器的回调函数。如果进程由于显式的原因而将要终止，例如直接调用 process.exit 或抛出未捕获的异常，`beforeExit`事件不会被触发。,,### exit 事件,**当 fibjs 退出时，事件 `exit` 会被触发，一旦所有与 `exit` 事件绑定的监听器执行完成，进程会终止**,```JavaScript,process.on('exit', exitCode => {});,```,`exit` 事件监听器的回调函数，只有一个入参，这个参数的值可以是 process.exitCode 的属性值，或者是调用 process.exit 方法时传入的 `exitCode` 值。,,### Signal 事件,**当 fibjs 进程接收到一个信号时，会触发信号事件，目前支持的信号有 SIGINT 和 SIGTERM。每个事件名称，以信号名称的大写表示 (比如事件'SIGINT' 对应信号 SIGINT)。**,,信号事件不同于其它进程事件，信号事件是抢占的，当信号发生时，无论当前在 io 操作，还是 JavaScript 运算，都会尽快触发相应事件。比如你可以用下面的代码，中断当前应用，并输出运行状态：,```JavaScript,var coroutine = require('coroutine');,,process.on('SIGINT', () => {,   coroutine.fibers.forEach(f => console.error("Fiber %d:\n%s", f.id, f.stack));,   process.exit();,});,```,信号名称及其意义如下：,* SIGINT：在终端运行时，可以被所有平台支持，通常可以通过 CTRL+C 触发。,* SIGTERM：当进程被 kill 时触发此信号。Windows 下不支持。
	*/
@JSImport("process", JSImport.Namespace)
@js.native
object processMod extends js.Object {
  val arch: String = js.native
  val argv: js.Array[js.Any] = js.native
  val env: js.Object = js.native
  val execArgv: js.Array[js.Any] = js.native
  val execPath: String = js.native
  val exitCode: Double = js.native
  val platform: String = js.native
  val stderr: Class_File = js.native
  val stdin: Class_File = js.native
  val stdout: Class_File = js.native
  val version: String = js.native
  val versions: js.Object = js.native
  def chdir(directory: String): Unit = js.native
  def cwd(): String = js.native
  def exit(): Unit = js.native
  def exit(code: Double): Unit = js.native
  def hrtime(): js.Array[_] = js.native
  def hrtime(diff: js.Array[_]): js.Array[_] = js.native
  def memoryUsage(): js.Object = js.native
  def nextTick(func: js.Function, args: js.Any*): Unit = js.native
  def open(command: String): Class_SubProcess = js.native
  def open(command: String, args: js.Array[_]): Class_SubProcess = js.native
  def open(command: String, args: js.Array[_], opts: js.Object): Class_SubProcess = js.native
  def open(command: String, opts: js.Object): Class_SubProcess = js.native
  def run(command: String): Double = js.native
  def run(command: String, args: js.Array[_]): Double = js.native
  def run(command: String, args: js.Array[_], opts: js.Object): Double = js.native
  def run(command: String, opts: js.Object): Double = js.native
  def start(command: String): Class_SubProcess = js.native
  def start(command: String, args: js.Array[_]): Class_SubProcess = js.native
  def start(command: String, args: js.Array[_], opts: js.Object): Class_SubProcess = js.native
  def start(command: String, opts: js.Object): Class_SubProcess = js.native
  def umask(): Double = js.native
  def umask(mask: String): Double = js.native
  def umask(mask: Double): Double = js.native
  def uptime(): Double = js.native
}

