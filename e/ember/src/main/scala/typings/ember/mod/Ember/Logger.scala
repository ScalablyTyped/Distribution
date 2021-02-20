package typings.ember.mod.Ember

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inside Ember-Metal, simply uses the methods from `imports.console`.
  * Override this to provide more robust logging functionality.
  */
object Logger {
  
  /**
    * If the value passed into `Ember.Logger.assert` is not truthy it will throw an error with a stack trace.
    */
  @JSImport("ember", "Ember.Logger.assert")
  @js.native
  def assert(test: Boolean): Unit = js.native
  @JSImport("ember", "Ember.Logger.assert")
  @js.native
  def assert(test: Boolean, message: java.lang.String): Unit = js.native
  
  /**
    * Logs the arguments to the console in blue text.
    */
  @JSImport("ember", "Ember.Logger.debug")
  @js.native
  def debug(args: js.Any*): Unit = js.native
  
  /**
    * Prints the arguments to the console with an error icon, red text and a stack trace.
    */
  @JSImport("ember", "Ember.Logger.error")
  @js.native
  def error(args: js.Any*): Unit = js.native
  
  /**
    * Logs the arguments to the console.
    */
  @JSImport("ember", "Ember.Logger.info")
  @js.native
  def info(args: js.Any*): Unit = js.native
  
  /**
    * Logs the arguments to the console.
    */
  @JSImport("ember", "Ember.Logger.log")
  @js.native
  def log(args: js.Any*): Unit = js.native
  
  /**
    * Prints the arguments to the console with a warning icon.
    */
  @JSImport("ember", "Ember.Logger.warn")
  @js.native
  def warn(args: js.Any*): Unit = js.native
}
