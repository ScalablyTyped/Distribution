package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Function")
@js.native
class Function ()
  extends StObject
     with typings.extjs.Ext.Function
/* static members */
object Function {
  
  @JSGlobal("Ext.Function")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Create an alias to the provided method property with name methodName of object
    * @param object Object/Function
    * @param methodName String
    * @returns Function aliasFn
    */
  @scala.inline
  def alias(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")().asInstanceOf[js.Any]
  @scala.inline
  def alias(`object`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def alias(`object`: js.Any, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def alias(`object`: Unit, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Create a new function from the provided fn change this to the provided scope optionally overrides arguments for the
    * @param fn Function The function to delegate.
    * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the default global environment object (usually the browser window).
    * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
    * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position
    * @returns Function The new function
    */
  @scala.inline
  def bind(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")().asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: js.Any, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: js.Any, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: js.Any, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: js.Any, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: js.Any, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: js.Any, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: Unit, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: Unit, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: Unit, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: Unit, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def bind(fn: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def clone(method: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(method.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Creates a delegate function optionally with a bound scope which when called buffers the execution of the passed fu
    * @param fn Function The function to invoke on a buffered timer.
    * @param buffer Number The number of milliseconds by which to buffer the invocation of the function.
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
    * @param args Array Override arguments for the call. Defaults to the arguments passed by the caller.
    * @returns Function A function which invokes the passed function after buffering for the specified time.
    */
  @scala.inline
  def createBuffered(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")().asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: js.Any, buffer: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: js.Any, buffer: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: js.Any, buffer: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: js.Any, buffer: Double, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: js.Any, buffer: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: js.Any, buffer: Unit, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: js.Any, buffer: Unit, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: Unit, buffer: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: Unit, buffer: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: Unit, buffer: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: Unit, buffer: Double, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: Unit, buffer: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: Unit, buffer: Unit, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createBuffered(fn: Unit, buffer: Unit, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Creates a delegate callback which when called executes after a specific delay
    * @param fn Function The function which will be called on a delay when the returned function is called. Optionally, a replacement (or additional) argument list may be specified.
    * @param delay Number The number of milliseconds to defer execution by whenever called.
    * @param scope Object The scope (this reference) used by the function at execution time.
    * @param args Array Override arguments for the call. (Defaults to the arguments passed by the caller)
    * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
    * @returns Function A function which, when called, executes the original function after the specified delay.
    */
  @scala.inline
  def createDelayed(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")().asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Double, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Double, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Unit, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Unit, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Unit, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: js.Any, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Double, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Double, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Double, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Unit, scope: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Unit, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Creates an interceptor function
    * @param origFn Function The original function.
    * @param newFn Function The function to call before the original
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the browser window.
    * @param returnValue Object The value to return if the passed function return false.
    * @returns Function The new function
    */
  @scala.inline
  def createInterceptor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")().asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: js.Any, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: js.Any, newFn: js.Any, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: js.Any, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: js.Any, newFn: Unit, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: js.Any, newFn: Unit, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: Unit, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: Unit, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: Unit, newFn: js.Any, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: Unit, newFn: js.Any, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: Unit, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: Unit, newFn: Unit, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createInterceptor(origFn: Unit, newFn: Unit, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Create a combined function call sequence of the original function  the passed function
    * @param originalFn Function The original function.
    * @param newFn Function The function to sequence
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the default global environment object (usually the browser window).
    * @returns Function The new function
    */
  @scala.inline
  def createSequence(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")().asInstanceOf[js.Any]
  @scala.inline
  def createSequence(originalFn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createSequence(originalFn: js.Any, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createSequence(originalFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createSequence(originalFn: js.Any, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createSequence(originalFn: Unit, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createSequence(originalFn: Unit, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createSequence(originalFn: Unit, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Creates a throttled version of the passed function which when called repeatedly and rapidly invokes the passed func
    * @param fn Function The function to execute at a regular time interval.
    * @param interval Number The interval in milliseconds on which the passed function is executed.
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
    * @returns Function A function which invokes the passed function at the specified interval.
    */
  @scala.inline
  def createThrottled(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")().asInstanceOf[js.Any]
  @scala.inline
  def createThrottled(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createThrottled(fn: js.Any, interval: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createThrottled(fn: js.Any, interval: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createThrottled(fn: js.Any, interval: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createThrottled(fn: Unit, interval: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createThrottled(fn: Unit, interval: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createThrottled(fn: Unit, interval: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Calls this function after the number of millseconds specified optionally in a specific scope
    * @param fn Function The function to defer.
    * @param millis Number The number of milliseconds for the setTimeout call (if less than or equal to 0 the function is executed immediately)
    * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the browser window.
    * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
    * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position
    * @returns Number The timeout id that can be used with clearTimeout
    */
  @scala.inline
  def defer(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Double, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Double, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Double, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Double, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Unit, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Unit, scope: js.Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Unit, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Unit, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: js.Any, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Double, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Double, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Double, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Double, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Double, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Unit, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Unit, scope: js.Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Unit, scope: js.Any, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Unit, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def defer(fn: Unit, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] A very commonly used method throughout the framework
    * @param setter Function
    * @returns Function flexSetter
    */
  @scala.inline
  def flexSetter(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flexSetter")().asInstanceOf[js.Any]
  @scala.inline
  def flexSetter(setter: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flexSetter")(setter.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Adds behavior to an existing method that is executed after the original behavior of the function
    * @param object Object The target object
    * @param methodName String Name of the method to override
    * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
    * @param scope Object The scope to execute the interceptor function. Defaults to the object.
    * @returns Function The new function just created.
    */
  @scala.inline
  def interceptAfter(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")().asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: js.Any, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: js.Any, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: js.Any, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: js.Any, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: Unit, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: Unit, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: Unit, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptAfter(`object`: Unit, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Adds behavior to an existing method that is executed before the original behavior of the function
    * @param object Object The target object
    * @param methodName String Name of the method to override
    * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
    * @param scope Object The scope to execute the interceptor function. Defaults to the object.
    * @returns Function The new function just created.
    */
  @scala.inline
  def interceptBefore(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")().asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: js.Any, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: js.Any, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: js.Any, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: js.Any, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: Unit, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: Unit, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: Unit, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def interceptBefore(`object`: Unit, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Create a new function from the provided fn the arguments of which are pre set to args
    * @param fn Function The original function
    * @param args Array The arguments to pass to new callback
    * @param scope Object The scope (this reference) in which the function is executed.
    * @returns Function The new callback function
    */
  @scala.inline
  def pass(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pass")().asInstanceOf[js.Any]
  @scala.inline
  def pass(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def pass(fn: js.Any, args: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def pass(fn: js.Any, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def pass(fn: js.Any, args: typings.extjs.Ext.Array, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def pass(fn: Unit, args: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def pass(fn: Unit, args: typings.extjs.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def pass(fn: Unit, args: typings.extjs.Ext.Array, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
