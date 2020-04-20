package typings.feflowCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  /**
    * Print trace level log, The Color is gray
    * @param desc log detail
    */
  def debug(desc: String): Unit
  /**
    * Print trace level log, The Color is red
    * @param desc log detail
    */
  def error(desc: String): Unit
  /**
    * Print trace level log, The Color is red
    * @param desc log detail
    */
  def fatal(desc: String): Unit
  /**
    * Print trace level log, The Color is green
    * @param desc log detail
    */
  def info(desc: String): Unit
  /**
    * Print trace level log, The Color is gray
    * @param desc log detail
    */
  def trace(desc: String): Unit
  /**
    * Print trace level log, The Color is yellow
    * @param desc log detail
    */
  def warn(desc: String): Unit
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
}

