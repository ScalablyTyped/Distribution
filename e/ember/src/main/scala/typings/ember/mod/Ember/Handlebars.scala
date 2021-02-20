package typings.ember.mod.Ember

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Handlebars {
  
  @JSImport("ember", "Ember.Handlebars.Compiler")
  @js.native
  class Compiler () extends StObject
  
  @JSImport("ember", "Ember.Handlebars.Exception")
  @js.native
  def Exception(message: java.lang.String): Unit = js.native
  
  @JSImport("ember", "Ember.Handlebars.JavaScriptCompiler")
  @js.native
  class JavaScriptCompiler () extends StObject
  
  @JSImport("ember", "Ember.Handlebars.K")
  @js.native
  def K(): js.Any = js.native
  
  @JSImport("ember", "Ember.Handlebars.SafeString")
  @js.native
  class SafeString protected ()
    extends typings.emberTemplate.handlebarsMod.SafeString {
    def this(str: java.lang.String) = this()
  }
  
  @JSImport("ember", "Ember.Handlebars.compile")
  @js.native
  def compile(environment: js.Any): js.Any = js.native
  @JSImport("ember", "Ember.Handlebars.compile")
  @js.native
  def compile(
    environment: js.Any,
    options: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    asObject: js.Any
  ): js.Any = js.native
  @JSImport("ember", "Ember.Handlebars.compile")
  @js.native
  def compile(environment: js.Any, options: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
  @JSImport("ember", "Ember.Handlebars.compile")
  @js.native
  def compile(environment: js.Any, options: js.UndefOr[scala.Nothing], context: js.Any, asObject: js.Any): js.Any = js.native
  @JSImport("ember", "Ember.Handlebars.compile")
  @js.native
  def compile(environment: js.Any, options: js.Any): js.Any = js.native
  @JSImport("ember", "Ember.Handlebars.compile")
  @js.native
  def compile(environment: js.Any, options: js.Any, context: js.UndefOr[scala.Nothing], asObject: js.Any): js.Any = js.native
  @JSImport("ember", "Ember.Handlebars.compile")
  @js.native
  def compile(environment: js.Any, options: js.Any, context: js.Any): js.Any = js.native
  @JSImport("ember", "Ember.Handlebars.compile")
  @js.native
  def compile(environment: js.Any, options: js.Any, context: js.Any, asObject: js.Any): js.Any = js.native
  @JSImport("ember", "Ember.Handlebars.compile")
  @js.native
  def compile(string: java.lang.String): js.Function1[/* repeated */ js.Any, _] = js.native
  
  @JSImport("ember", "Ember.Handlebars.createFrame")
  @js.native
  def createFrame(objec: js.Any): js.Any = js.native
  
  @JSImport("ember", "Ember.Handlebars.log")
  @js.native
  def log(level: java.lang.String, str: java.lang.String): Unit = js.native
  
  /**
    * Inside Ember-Metal, simply uses the methods from `imports.console`.
    * Override this to provide more robust logging functionality.
    */
  /* was `typeof Logger` */
  object logger {
    
    /**
      * If the value passed into `Ember.Logger.assert` is not truthy it will throw an error with a stack trace.
      */
    @JSImport("ember", "Ember.Handlebars.logger.assert")
    @js.native
    def assert(test: Boolean): Unit = js.native
    @JSImport("ember", "Ember.Handlebars.logger.assert")
    @js.native
    def assert(test: Boolean, message: java.lang.String): Unit = js.native
    
    /**
      * Logs the arguments to the console in blue text.
      */
    @JSImport("ember", "Ember.Handlebars.logger.debug")
    @js.native
    def debug(args: js.Any*): Unit = js.native
    
    /**
      * Prints the arguments to the console with an error icon, red text and a stack trace.
      */
    @JSImport("ember", "Ember.Handlebars.logger.error")
    @js.native
    def error(args: js.Any*): Unit = js.native
    
    /**
      * Logs the arguments to the console.
      */
    @JSImport("ember", "Ember.Handlebars.logger.info")
    @js.native
    def info(args: js.Any*): Unit = js.native
    
    /**
      * Logs the arguments to the console.
      */
    @JSImport("ember", "Ember.Handlebars.logger.log")
    @js.native
    def log(args: js.Any*): Unit = js.native
    
    /**
      * Prints the arguments to the console with a warning icon.
      */
    @JSImport("ember", "Ember.Handlebars.logger.warn")
    @js.native
    def warn(args: js.Any*): Unit = js.native
  }
  
  @JSImport("ember", "Ember.Handlebars.parse")
  @js.native
  def parse(string: java.lang.String): js.Any = js.native
  
  @JSImport("ember", "Ember.Handlebars.precompile")
  @js.native
  def precompile(string: java.lang.String, options: js.Any): Unit = js.native
  
  @JSImport("ember", "Ember.Handlebars.print")
  @js.native
  def print(ast: js.Any): Unit = js.native
  
  @JSImport("ember", "Ember.Handlebars.registerHelper")
  @js.native
  def registerHelper(name: java.lang.String, helper: js.Any): Unit = js.native
  
  @JSImport("ember", "Ember.Handlebars.registerPartial")
  @js.native
  def registerPartial(name: java.lang.String, str: js.Any): Unit = js.native
}
