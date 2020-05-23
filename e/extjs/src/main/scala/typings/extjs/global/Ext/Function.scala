package typings.extjs.global.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Function")
@js.native
class Function ()
  extends typings.extjs.Ext.Function

/* static members */
@JSGlobal("Ext.Function")
@js.native
object Function extends js.Object {
  /** [Method] Create an alias to the provided method property with name methodName of object
    * @param object Object/Function
    * @param methodName String
    * @returns Function aliasFn
    */
  def alias(): js.Any = js.native
  def alias(`object`: js.Any): js.Any = js.native
  def alias(`object`: js.Any, methodName: java.lang.String): js.Any = js.native
  /** [Method] Create a new function from the provided fn change this to the provided scope optionally overrides arguments for the
    * @param fn Function The function to delegate.
    * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the default global environment object (usually the browser window).
    * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
    * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position
    * @returns Function The new function
    */
  def bind(): js.Any = js.native
  def bind(fn: js.Any): js.Any = js.native
  def bind(fn: js.Any, scope: js.Any): js.Any = js.native
  def bind(fn: js.Any, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
  def bind(fn: js.Any, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = js.native
  def clone(method: js.Any): js.Any = js.native
  /** [Method] Creates a delegate function optionally with a bound scope which when called buffers the execution of the passed fu
    * @param fn Function The function to invoke on a buffered timer.
    * @param buffer Number The number of milliseconds by which to buffer the invocation of the function.
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
    * @param args Array Override arguments for the call. Defaults to the arguments passed by the caller.
    * @returns Function A function which invokes the passed function after buffering for the specified time.
    */
  def createBuffered(): js.Any = js.native
  def createBuffered(fn: js.Any): js.Any = js.native
  def createBuffered(fn: js.Any, buffer: Double): js.Any = js.native
  def createBuffered(fn: js.Any, buffer: Double, scope: js.Any): js.Any = js.native
  def createBuffered(fn: js.Any, buffer: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
  /** [Method] Creates a delegate callback which when called executes after a specific delay
    * @param fn Function The function which will be called on a delay when the returned function is called. Optionally, a replacement (or additional) argument list may be specified.
    * @param delay Number The number of milliseconds to defer execution by whenever called.
    * @param scope Object The scope (this reference) used by the function at execution time.
    * @param args Array Override arguments for the call. (Defaults to the arguments passed by the caller)
    * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
    * @returns Function A function which, when called, executes the original function after the specified delay.
    */
  def createDelayed(): js.Any = js.native
  def createDelayed(fn: js.Any): js.Any = js.native
  def createDelayed(fn: js.Any, delay: Double): js.Any = js.native
  def createDelayed(fn: js.Any, delay: Double, scope: js.Any): js.Any = js.native
  def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
  def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = js.native
  /** [Method] Creates an interceptor function
    * @param origFn Function The original function.
    * @param newFn Function The function to call before the original
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the browser window.
    * @param returnValue Object The value to return if the passed function return false.
    * @returns Function The new function
    */
  def createInterceptor(): js.Any = js.native
  def createInterceptor(origFn: js.Any): js.Any = js.native
  def createInterceptor(origFn: js.Any, newFn: js.Any): js.Any = js.native
  def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = js.native
  def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any, returnValue: js.Any): js.Any = js.native
  /** [Method] Create a combined function call sequence of the original function  the passed function
    * @param originalFn Function The original function.
    * @param newFn Function The function to sequence
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the default global environment object (usually the browser window).
    * @returns Function The new function
    */
  def createSequence(): js.Any = js.native
  def createSequence(originalFn: js.Any): js.Any = js.native
  def createSequence(originalFn: js.Any, newFn: js.Any): js.Any = js.native
  def createSequence(originalFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Creates a throttled version of the passed function which when called repeatedly and rapidly invokes the passed func
    * @param fn Function The function to execute at a regular time interval.
    * @param interval Number The interval in milliseconds on which the passed function is executed.
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
    * @returns Function A function which invokes the passed function at the specified interval.
    */
  def createThrottled(): js.Any = js.native
  def createThrottled(fn: js.Any): js.Any = js.native
  def createThrottled(fn: js.Any, interval: Double): js.Any = js.native
  def createThrottled(fn: js.Any, interval: Double, scope: js.Any): js.Any = js.native
  /** [Method] Calls this function after the number of millseconds specified optionally in a specific scope
    * @param fn Function The function to defer.
    * @param millis Number The number of milliseconds for the setTimeout call (if less than or equal to 0 the function is executed immediately)
    * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the browser window.
    * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
    * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position
    * @returns Number The timeout id that can be used with clearTimeout
    */
  def defer(): Double = js.native
  def defer(fn: js.Any): Double = js.native
  def defer(fn: js.Any, millis: Double): Double = js.native
  def defer(fn: js.Any, millis: Double, scope: js.Any): Double = js.native
  def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array): Double = js.native
  def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = js.native
  /** [Method] A very commonly used method throughout the framework
    * @param setter Function
    * @returns Function flexSetter
    */
  def flexSetter(): js.Any = js.native
  def flexSetter(setter: js.Any): js.Any = js.native
  /** [Method] Adds behavior to an existing method that is executed after the original behavior of the function
    * @param object Object The target object
    * @param methodName String Name of the method to override
    * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
    * @param scope Object The scope to execute the interceptor function. Defaults to the object.
    * @returns Function The new function just created.
    */
  def interceptAfter(): js.Any = js.native
  def interceptAfter(`object`: js.Any): js.Any = js.native
  def interceptAfter(`object`: js.Any, methodName: java.lang.String): js.Any = js.native
  def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = js.native
  def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Adds behavior to an existing method that is executed before the original behavior of the function
    * @param object Object The target object
    * @param methodName String Name of the method to override
    * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
    * @param scope Object The scope to execute the interceptor function. Defaults to the object.
    * @returns Function The new function just created.
    */
  def interceptBefore(): js.Any = js.native
  def interceptBefore(`object`: js.Any): js.Any = js.native
  def interceptBefore(`object`: js.Any, methodName: java.lang.String): js.Any = js.native
  def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = js.native
  def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Create a new function from the provided fn the arguments of which are pre set to args
    * @param fn Function The original function
    * @param args Array The arguments to pass to new callback
    * @param scope Object The scope (this reference) in which the function is executed.
    * @returns Function The new callback function
    */
  def pass(): js.Any = js.native
  def pass(fn: js.Any): js.Any = js.native
  def pass(fn: js.Any, args: typings.extjs.Ext.Array): js.Any = js.native
  def pass(fn: js.Any, args: typings.extjs.Ext.Array, scope: js.Any): js.Any = js.native
}

