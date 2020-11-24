package typings.feflowCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends js.Object {
  
  /**
    * Print trace level log, The Color is gray
    * @param desc log detail
    */
  def debug(desc: String): Unit = js.native
  
  /**
    * Print trace level log, The Color is red
    * @param desc log detail
    */
  def error(desc: String): Unit = js.native
  
  /**
    * Print trace level log, The Color is red
    * @param desc log detail
    */
  def fatal(desc: String): Unit = js.native
  
  /**
    * Print trace level log, The Color is green
    * @param desc log detail
    */
  def info(desc: String): Unit = js.native
  
  /**
    * Print trace level log, The Color is gray
    * @param desc log detail
    */
  def trace(desc: String): Unit = js.native
  
  /**
    * Print trace level log, The Color is yellow
    * @param desc log detail
    */
  def warn(desc: String): Unit = js.native
}
object Logger {
  
  @scala.inline
  def apply(
    debug: String => Unit,
    error: String => Unit,
    fatal: String => Unit,
    info: String => Unit,
    trace: String => Unit,
    warn: String => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDebug(value: String => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: String => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFatal(value: String => Unit): Self = this.set("fatal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: String => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrace(value: String => Unit): Self = this.set("trace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: String => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
}
