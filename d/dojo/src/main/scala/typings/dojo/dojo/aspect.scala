package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/aspect.html
  *
  * provides aspect oriented programming functionality, allowing for
  * one to add before, around, or after advice on existing methods.
  *
  */
@js.native
trait aspect extends js.Object {
  /**
    * The "after" export of the aspect module is a function that can be used to attach
    * "after" advice to a method. This function will be executed after the original method
    * is executed. By default the function will be called with a single argument, the return
    * value of the original method, or the the return value of the last executed advice (if a previous one exists).
    * The fourth (optional) argument can be set to true to so the function receives the original
    * arguments (from when the original method was called) rather than the return value.
    * If there are multiple "after" advisors, they are executed in the order they were registered.
    *
    * @param target This is the target object
    * @param methodName This is the name of the method to attach to.
    * @param advice This is function to be called after the original method
    * @param receiveArguments               OptionalIf this is set to true, the advice function receives the original arguments (from when the original mehtodwas called) rather than the return value of the original/previous method.
    */
  def after(target: js.Object, methodName: String, advice: js.Function): js.Any = js.native
  def after(target: js.Object, methodName: String, advice: js.Function, receiveArguments: Boolean): js.Any = js.native
  /**
    * The "around" export of the aspect module is a function that can be used to attach
    * "around" advice to a method. The advisor function is immediately executed when
    * the around() is called, is passed a single argument that is a function that can be
    * called to continue execution of the original method (or the next around advisor).
    * The advisor function should return a function, and this function will be called whenever
    * the method is called. It will be called with the arguments used to call the method.
    * Whatever this function returns will be returned as the result of the method call (unless after advise changes it).
    *
    * @param target This is the target object
    * @param methodName This is the name of the method to attach to.
    * @param advice This is function to be called around the original method
    */
  def around(target: js.Object, methodName: String, advice: js.Function): Unit = js.native
  /**
    * The "before" export of the aspect module is a function that can be used to attach
    * "before" advice to a method. This function will be executed before the original method
    * is executed. This function will be called with the arguments used to call the method.
    * This function may optionally return an array as the new arguments to use to call
    * the original method (or the previous, next-to-execute before advice, if one exists).
    * If the before method doesn't return anything (returns undefined) the original arguments
    * will be preserved.
    * If there are multiple "before" advisors, they are executed in the reverse order they were registered.
    *
    * @param target This is the target object
    * @param methodName This is the name of the method to attach to.
    * @param advice This is function to be called before the original method
    */
  def before(target: js.Object, methodName: String, advice: js.Function): Unit = js.native
}

