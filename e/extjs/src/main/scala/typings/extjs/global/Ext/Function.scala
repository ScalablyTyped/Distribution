package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Function")
@js.native
open class Function ()
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
  inline def alias(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")().asInstanceOf[Any]
  inline def alias(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def alias(`object`: Any, methodName: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def alias(`object`: Unit, methodName: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Create a new function from the provided fn change this to the provided scope optionally overrides arguments for the
    * @param fn Function The function to delegate.
    * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the default global environment object (usually the browser window).
    * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
    * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position
    * @returns Function The new function
    */
  inline def bind(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")().asInstanceOf[Any]
  inline def bind(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def bind(fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Any, scope: Any, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Any, scope: Any, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Any, scope: Any, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Any, scope: Unit, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Any, scope: Unit, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Any, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Unit, scope: Any, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Unit, scope: Any, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Unit, scope: Any, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Unit, scope: Unit, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Unit, scope: Unit, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bind(fn: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def clone(method: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(method.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Creates a delegate function optionally with a bound scope which when called buffers the execution of the passed fu
    * @param fn Function The function to invoke on a buffered timer.
    * @param buffer Number The number of milliseconds by which to buffer the invocation of the function.
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
    * @param args Array Override arguments for the call. Defaults to the arguments passed by the caller.
    * @returns Function A function which invokes the passed function after buffering for the specified time.
    */
  inline def createBuffered(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")().asInstanceOf[Any]
  inline def createBuffered(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createBuffered(fn: Any, buffer: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Any, buffer: Double, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Any, buffer: Double, scope: Any, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Any, buffer: Double, scope: Unit, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Any, buffer: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Any, buffer: Unit, scope: Any, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Any, buffer: Unit, scope: Unit, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Unit, buffer: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Unit, buffer: Double, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Unit, buffer: Double, scope: Any, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Unit, buffer: Double, scope: Unit, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Unit, buffer: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Unit, buffer: Unit, scope: Any, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createBuffered(fn: Unit, buffer: Unit, scope: Unit, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Creates a delegate callback which when called executes after a specific delay
    * @param fn Function The function which will be called on a delay when the returned function is called. Optionally, a replacement (or additional) argument list may be specified.
    * @param delay Number The number of milliseconds to defer execution by whenever called.
    * @param scope Object The scope (this reference) used by the function at execution time.
    * @param args Array Override arguments for the call. (Defaults to the arguments passed by the caller)
    * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
    * @returns Function A function which, when called, executes the original function after the specified delay.
    */
  inline def createDelayed(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")().asInstanceOf[Any]
  inline def createDelayed(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Double, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Double, scope: Any, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Double, scope: Any, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Double, scope: Any, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Double, scope: Unit, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Double, scope: Unit, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Unit, scope: Any, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Unit, scope: Any, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Unit, scope: Any, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Unit, scope: Unit, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Any, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Double, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Double, scope: Any, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Double, scope: Any, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Double, scope: Any, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Double, scope: Unit, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Double, scope: Unit, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Unit, scope: Any, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Unit, scope: Any, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Unit, scope: Any, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: Unit, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Creates an interceptor function
    * @param origFn Function The original function.
    * @param newFn Function The function to call before the original
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the browser window.
    * @param returnValue Object The value to return if the passed function return false.
    * @returns Function The new function
    */
  inline def createInterceptor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")().asInstanceOf[Any]
  inline def createInterceptor(origFn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createInterceptor(origFn: Any, newFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Any, newFn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Any, newFn: Any, scope: Any, returnValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Any, newFn: Any, scope: Unit, returnValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Any, newFn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Any, newFn: Unit, scope: Any, returnValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Any, newFn: Unit, scope: Unit, returnValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Unit, newFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Unit, newFn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Unit, newFn: Any, scope: Any, returnValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Unit, newFn: Any, scope: Unit, returnValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Unit, newFn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Unit, newFn: Unit, scope: Any, returnValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createInterceptor(origFn: Unit, newFn: Unit, scope: Unit, returnValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Create a combined function call sequence of the original function  the passed function
    * @param originalFn Function The original function.
    * @param newFn Function The function to sequence
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the default global environment object (usually the browser window).
    * @returns Function The new function
    */
  inline def createSequence(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")().asInstanceOf[Any]
  inline def createSequence(originalFn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createSequence(originalFn: Any, newFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createSequence(originalFn: Any, newFn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createSequence(originalFn: Any, newFn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createSequence(originalFn: Unit, newFn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createSequence(originalFn: Unit, newFn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createSequence(originalFn: Unit, newFn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Creates a throttled version of the passed function which when called repeatedly and rapidly invokes the passed func
    * @param fn Function The function to execute at a regular time interval.
    * @param interval Number The interval in milliseconds on which the passed function is executed.
    * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
    * @returns Function A function which invokes the passed function at the specified interval.
    */
  inline def createThrottled(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")().asInstanceOf[Any]
  inline def createThrottled(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createThrottled(fn: Any, interval: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createThrottled(fn: Any, interval: Double, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createThrottled(fn: Any, interval: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createThrottled(fn: Unit, interval: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createThrottled(fn: Unit, interval: Double, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createThrottled(fn: Unit, interval: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Calls this function after the number of millseconds specified optionally in a specific scope
    * @param fn Function The function to defer.
    * @param millis Number The number of milliseconds for the setTimeout call (if less than or equal to 0 the function is executed immediately)
    * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the browser window.
    * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
    * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position
    * @returns Number The timeout id that can be used with clearTimeout
    */
  inline def defer(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Double]
  inline def defer(fn: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Double, scope: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Double, scope: Any, args: Unit, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Double, scope: Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Double, scope: Any, args: typings.extjs.Ext.Array, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Double, scope: Unit, args: Unit, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Double, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Unit, scope: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Unit, scope: Any, args: Unit, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Unit, scope: Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Unit, scope: Any, args: typings.extjs.Ext.Array, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Unit, scope: Unit, args: Unit, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Any, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Double, scope: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Double, scope: Any, args: Unit, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Double, scope: Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Double, scope: Any, args: typings.extjs.Ext.Array, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Double, scope: Unit, args: Unit, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Double, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Double, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Unit, scope: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Unit, scope: Any, args: Unit, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Unit, scope: Any, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Unit, scope: Any, args: typings.extjs.Ext.Array, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Unit, scope: Unit, args: Unit, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defer(fn: Unit, millis: Unit, scope: Unit, args: typings.extjs.Ext.Array, appendArgs: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] A very commonly used method throughout the framework
    * @param setter Function
    * @returns Function flexSetter
    */
  inline def flexSetter(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flexSetter")().asInstanceOf[Any]
  inline def flexSetter(setter: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flexSetter")(setter.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Adds behavior to an existing method that is executed after the original behavior of the function
    * @param object Object The target object
    * @param methodName String Name of the method to override
    * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
    * @param scope Object The scope to execute the interceptor function. Defaults to the object.
    * @returns Function The new function just created.
    */
  inline def interceptAfter(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")().asInstanceOf[Any]
  inline def interceptAfter(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def interceptAfter(`object`: Any, methodName: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Any, methodName: java.lang.String, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Any, methodName: java.lang.String, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Any, methodName: java.lang.String, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Any, methodName: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Any, methodName: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Any, methodName: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Unit, methodName: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Unit, methodName: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Unit, methodName: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptAfter(`object`: Unit, methodName: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Adds behavior to an existing method that is executed before the original behavior of the function
    * @param object Object The target object
    * @param methodName String Name of the method to override
    * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
    * @param scope Object The scope to execute the interceptor function. Defaults to the object.
    * @returns Function The new function just created.
    */
  inline def interceptBefore(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")().asInstanceOf[Any]
  inline def interceptBefore(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def interceptBefore(`object`: Any, methodName: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Any, methodName: java.lang.String, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Any, methodName: java.lang.String, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Any, methodName: java.lang.String, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Any, methodName: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Any, methodName: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Any, methodName: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Unit, methodName: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Unit, methodName: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Unit, methodName: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def interceptBefore(`object`: Unit, methodName: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Create a new function from the provided fn the arguments of which are pre set to args
    * @param fn Function The original function
    * @param args Array The arguments to pass to new callback
    * @param scope Object The scope (this reference) in which the function is executed.
    * @returns Function The new callback function
    */
  inline def pass(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pass")().asInstanceOf[Any]
  inline def pass(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def pass(fn: Any, args: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def pass(fn: Any, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def pass(fn: Any, args: typings.extjs.Ext.Array, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def pass(fn: Unit, args: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def pass(fn: Unit, args: typings.extjs.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def pass(fn: Unit, args: typings.extjs.Ext.Array, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
}
