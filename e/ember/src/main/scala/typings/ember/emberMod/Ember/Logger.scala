package typings.ember.emberMod.Ember

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inside Ember-Metal, simply uses the methods from `imports.console`.
  * Override this to provide more robust logging functionality.
  */
@JSImport("ember", "Ember.Logger")
@js.native
object Logger extends js.Object {
  /**
    * If the value passed into `Ember.Logger.assert` is not truthy it will throw an error with a stack trace.
    */
  def assert(test: Boolean): Unit = js.native
  def assert(test: Boolean, message: String): Unit = js.native
  /**
    * Logs the arguments to the console in blue text.
    */
  def debug(args: js.Any*): Unit = js.native
  /**
    * Prints the arguments to the console with an error icon, red text and a stack trace.
    */
  def error(args: js.Any*): Unit = js.native
  /**
    * Logs the arguments to the console.
    */
  def info(args: js.Any*): Unit = js.native
  /**
    * Logs the arguments to the console.
    */
  def log(args: js.Any*): Unit = js.native
  /**
    * Prints the arguments to the console with a warning icon.
    */
  def warn(args: js.Any*): Unit = js.native
}

