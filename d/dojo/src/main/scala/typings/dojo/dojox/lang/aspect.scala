package typings.dojo.dojox.lang

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/aspect.html
  *
  *
  */
@js.native
trait aspect extends js.Object {
  /**
    * Attach AOP-style advices to a method.
    * Attaches AOP-style advices to a method. Can attach several
    * advices at once and operate on several methods of an object.
    * The latter is achieved when a RegExp is specified as
    * a method name, or an array of strings and regular expressions
    * is used. In this case all functional methods that
    * satisfy the RegExp condition are processed. This function
    * returns a handle, which can be used to unadvise, or null,
    * if advising has failed.
    *
    * This function is a convenience wrapper for
    * dojox.lang.aspect.adviseRaw().
    *
    * @param obj A source object for the advised function. Cannot be a DOM node.If this object is a constructor, its prototype is advised.
    * @param method A string name of the function in obj. In case of RegExp allmethods of obj matching the regular expression are advised.
    * @param advice An object, which defines advises, or a function, whichreturns such object, or an array of previous items.The advice object can define following member functions:before, around, afterReturning, afterThrowing, after.If the function is supplied, it is called with a contextobject once per call to create a temporary advice object, whichis destroyed after the processing. The temporary advice objectcan implement a destroy() method, if it wants to be called whennot needed.
    */
  def advise(obj: js.Object, method: String, advice: js.Array[_]): Unit = js.native
  /**
    * Attach AOP-style advices to a method.
    * Attaches AOP-style advices to a method. Can attach several
    * advices at once and operate on several methods of an object.
    * The latter is achieved when a RegExp is specified as
    * a method name, or an array of strings and regular expressions
    * is used. In this case all functional methods that
    * satisfy the RegExp condition are processed. This function
    * returns a handle, which can be used to unadvise, or null,
    * if advising has failed.
    *
    * This function is a convenience wrapper for
    * dojox.lang.aspect.adviseRaw().
    *
    * @param obj A source object for the advised function. Cannot be a DOM node.If this object is a constructor, its prototype is advised.
    * @param method A string name of the function in obj. In case of RegExp allmethods of obj matching the regular expression are advised.
    * @param advice An object, which defines advises, or a function, whichreturns such object, or an array of previous items.The advice object can define following member functions:before, around, afterReturning, afterThrowing, after.If the function is supplied, it is called with a contextobject once per call to create a temporary advice object, whichis destroyed after the processing. The temporary advice objectcan implement a destroy() method, if it wants to be called whennot needed.
    */
  def advise(obj: js.Object, method: String, advice: js.Function): Unit = js.native
  /**
    * Attach AOP-style advices to a method.
    * Attaches AOP-style advices to a method. Can attach several
    * advices at once and operate on several methods of an object.
    * The latter is achieved when a RegExp is specified as
    * a method name, or an array of strings and regular expressions
    * is used. In this case all functional methods that
    * satisfy the RegExp condition are processed. This function
    * returns a handle, which can be used to unadvise, or null,
    * if advising has failed.
    *
    * This function is a convenience wrapper for
    * dojox.lang.aspect.adviseRaw().
    *
    * @param obj A source object for the advised function. Cannot be a DOM node.If this object is a constructor, its prototype is advised.
    * @param method A string name of the function in obj. In case of RegExp allmethods of obj matching the regular expression are advised.
    * @param advice An object, which defines advises, or a function, whichreturns such object, or an array of previous items.The advice object can define following member functions:before, around, afterReturning, afterThrowing, after.If the function is supplied, it is called with a contextobject once per call to create a temporary advice object, whichis destroyed after the processing. The temporary advice objectcan implement a destroy() method, if it wants to be called whennot needed.
    */
  def advise(obj: js.Object, method: String, advice: js.Object): Unit = js.native
  /**
    * Attach AOP-style advices to a method.
    * Attaches AOP-style advices to a method. Can attach several
    * advices at once and operate on several methods of an object.
    * The latter is achieved when a RegExp is specified as
    * a method name, or an array of strings and regular expressions
    * is used. In this case all functional methods that
    * satisfy the RegExp condition are processed. This function
    * returns a handle, which can be used to unadvise, or null,
    * if advising has failed.
    *
    * This function is a convenience wrapper for
    * dojox.lang.aspect.adviseRaw().
    *
    * @param obj A source object for the advised function. Cannot be a DOM node.If this object is a constructor, its prototype is advised.
    * @param method A string name of the function in obj. In case of RegExp allmethods of obj matching the regular expression are advised.
    * @param advice An object, which defines advises, or a function, whichreturns such object, or an array of previous items.The advice object can define following member functions:before, around, afterReturning, afterThrowing, after.If the function is supplied, it is called with a contextobject once per call to create a temporary advice object, whichis destroyed after the processing. The temporary advice objectcan implement a destroy() method, if it wants to be called whennot needed.
    */
  def advise(obj: js.Object, method: js.Array[_], advice: js.Array[_]): Unit = js.native
  /**
    * Attach AOP-style advices to a method.
    * Attaches AOP-style advices to a method. Can attach several
    * advices at once and operate on several methods of an object.
    * The latter is achieved when a RegExp is specified as
    * a method name, or an array of strings and regular expressions
    * is used. In this case all functional methods that
    * satisfy the RegExp condition are processed. This function
    * returns a handle, which can be used to unadvise, or null,
    * if advising has failed.
    *
    * This function is a convenience wrapper for
    * dojox.lang.aspect.adviseRaw().
    *
    * @param obj A source object for the advised function. Cannot be a DOM node.If this object is a constructor, its prototype is advised.
    * @param method A string name of the function in obj. In case of RegExp allmethods of obj matching the regular expression are advised.
    * @param advice An object, which defines advises, or a function, whichreturns such object, or an array of previous items.The advice object can define following member functions:before, around, afterReturning, afterThrowing, after.If the function is supplied, it is called with a contextobject once per call to create a temporary advice object, whichis destroyed after the processing. The temporary advice objectcan implement a destroy() method, if it wants to be called whennot needed.
    */
  def advise(obj: js.Object, method: js.Array[_], advice: js.Function): Unit = js.native
  /**
    * Attach AOP-style advices to a method.
    * Attaches AOP-style advices to a method. Can attach several
    * advices at once and operate on several methods of an object.
    * The latter is achieved when a RegExp is specified as
    * a method name, or an array of strings and regular expressions
    * is used. In this case all functional methods that
    * satisfy the RegExp condition are processed. This function
    * returns a handle, which can be used to unadvise, or null,
    * if advising has failed.
    *
    * This function is a convenience wrapper for
    * dojox.lang.aspect.adviseRaw().
    *
    * @param obj A source object for the advised function. Cannot be a DOM node.If this object is a constructor, its prototype is advised.
    * @param method A string name of the function in obj. In case of RegExp allmethods of obj matching the regular expression are advised.
    * @param advice An object, which defines advises, or a function, whichreturns such object, or an array of previous items.The advice object can define following member functions:before, around, afterReturning, afterThrowing, after.If the function is supplied, it is called with a contextobject once per call to create a temporary advice object, whichis destroyed after the processing. The temporary advice objectcan implement a destroy() method, if it wants to be called whennot needed.
    */
  def advise(obj: js.Object, method: js.Array[_], advice: js.Object): Unit = js.native
  /**
    * Attach AOP-style advices to a method.
    * Attaches AOP-style advices to a method. Can attach several
    * advices at once and operate on several methods of an object.
    * The latter is achieved when a RegExp is specified as
    * a method name, or an array of strings and regular expressions
    * is used. In this case all functional methods that
    * satisfy the RegExp condition are processed. This function
    * returns a handle, which can be used to unadvise, or null,
    * if advising has failed.
    *
    * This function is a convenience wrapper for
    * dojox.lang.aspect.adviseRaw().
    *
    * @param obj A source object for the advised function. Cannot be a DOM node.If this object is a constructor, its prototype is advised.
    * @param method A string name of the function in obj. In case of RegExp allmethods of obj matching the regular expression are advised.
    * @param advice An object, which defines advises, or a function, whichreturns such object, or an array of previous items.The advice object can define following member functions:before, around, afterReturning, afterThrowing, after.If the function is supplied, it is called with a contextobject once per call to create a temporary advice object, whichis destroyed after the processing. The temporary advice objectcan implement a destroy() method, if it wants to be called whennot needed.
    */
  def advise(obj: js.Object, method: RegExp, advice: js.Array[_]): Unit = js.native
  /**
    * Attach AOP-style advices to a method.
    * Attaches AOP-style advices to a method. Can attach several
    * advices at once and operate on several methods of an object.
    * The latter is achieved when a RegExp is specified as
    * a method name, or an array of strings and regular expressions
    * is used. In this case all functional methods that
    * satisfy the RegExp condition are processed. This function
    * returns a handle, which can be used to unadvise, or null,
    * if advising has failed.
    *
    * This function is a convenience wrapper for
    * dojox.lang.aspect.adviseRaw().
    *
    * @param obj A source object for the advised function. Cannot be a DOM node.If this object is a constructor, its prototype is advised.
    * @param method A string name of the function in obj. In case of RegExp allmethods of obj matching the regular expression are advised.
    * @param advice An object, which defines advises, or a function, whichreturns such object, or an array of previous items.The advice object can define following member functions:before, around, afterReturning, afterThrowing, after.If the function is supplied, it is called with a contextobject once per call to create a temporary advice object, whichis destroyed after the processing. The temporary advice objectcan implement a destroy() method, if it wants to be called whennot needed.
    */
  def advise(obj: js.Object, method: RegExp, advice: js.Function): Unit = js.native
  /**
    * Attach AOP-style advices to a method.
    * Attaches AOP-style advices to a method. Can attach several
    * advices at once and operate on several methods of an object.
    * The latter is achieved when a RegExp is specified as
    * a method name, or an array of strings and regular expressions
    * is used. In this case all functional methods that
    * satisfy the RegExp condition are processed. This function
    * returns a handle, which can be used to unadvise, or null,
    * if advising has failed.
    *
    * This function is a convenience wrapper for
    * dojox.lang.aspect.adviseRaw().
    *
    * @param obj A source object for the advised function. Cannot be a DOM node.If this object is a constructor, its prototype is advised.
    * @param method A string name of the function in obj. In case of RegExp allmethods of obj matching the regular expression are advised.
    * @param advice An object, which defines advises, or a function, whichreturns such object, or an array of previous items.The advice object can define following member functions:before, around, afterReturning, afterThrowing, after.If the function is supplied, it is called with a contextobject once per call to create a temporary advice object, whichis destroyed after the processing. The temporary advice objectcan implement a destroy() method, if it wants to be called whennot needed.
    */
  def advise(obj: js.Object, method: RegExp, advice: js.Object): Unit = js.native
  /**
    * Attach AOP-style advices to methods.
    * Attaches AOP-style advices to object's methods. Can attach several
    * advices at once and operate on several methods of the object.
    * The latter is achieved when a RegExp is specified as
    * a method name. In this case all functional methods that
    * satisfy the RegExp condition are processed. This function
    * returns a handle, which can be used to unadvise, or null,
    * if advising has failed.
    *
    * @param obj A source object for the advised function.Cannot be a DOM node.
    * @param methods An array of method names (strings) to be advised.
    * @param advices An array of advices represented by objects or functions thatreturn such objects on demand during the event processing.The advice object can define following member functions:before, around, afterReturning, afterThrowing, after.If the function is supplied, it is called with a contextobject once per call to create a temporary advice object, whichis destroyed after the processing. The temporary advice objectcan implement a destroy() method, if it wants to be called whennot needed.
    */
  def adviseRaw(obj: js.Object, methods: js.Array[_], advices: js.Array[_]): Unit = js.native
  /**
    * Returns the context information for the advice in effect.
    *
    */
  def getContext(): Unit = js.native
  /**
    * Returns the context stack, which reflects executing advices
    * up to this point. The array is ordered from oldest to newest.
    * In order to get the active context use dojox.lang.aspect.getContext().
    *
    */
  def getContextStack(): Unit = js.native
  /**
    * Call the original function (or the next level around advice) in an around advice code.
    * Calls the original function (or the next level around advice).
    * Accepts and passes on any number of arguments, and returns a value.
    * This function is valid only in the content of around calls.
    *
    */
  def proceed(): Unit = js.native
  /**
    * Detach previously attached AOP-style advices.
    *
    * @param handle The object returned by dojox.lang.aspect.advise().
    */
  def unadvise(handle: js.Object): Unit = js.native
}

@JSGlobal("dojox.lang.aspect")
@js.native
object aspect extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/aspect/cflow.html
    *
    * Returns true if the context stack contains a context for a given
    * instance that satisfies a given method name criteria.
    *
    * @param instance An instance to be matched. If null, any context will be examined.Otherwise the context should belong to this instance.
    * @param method       OptionalAn optional pattern to be matched against a method name. Can be a string,a RegExp object or an array of strings and RegExp objects.If it is omitted, any name will satisfy the criteria.
    */
  @js.native
  trait cflow extends js.Object {
    def apply(instance: js.Object): Unit = js.native
    def apply(instance: js.Object, method: String): Unit = js.native
    def apply(instance: js.Object, method: js.Array[_]): Unit = js.native
    def apply(instance: js.Object, method: RegExp): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/aspect/memoizerGuard.html
    *
    * Invalidates the memoizer's cache (see dojox.lang.aspect.memoizer)
    * after calling certain methods.
    *
    * @param method       OptionalOptional method's name to be guarded: only cache forthis method will be invalidated on call. Can be a stringor an array of method names. If omitted the whole cachewill be invalidated.
    */
  @js.native
  trait memoizerGuard extends js.Object {
    def apply(): Unit = js.native
    def apply(method: String): Unit = js.native
    def apply(method: js.Array[_]): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/aspect/counter.html
    *
    * Returns an object, which can be used to count calls to methods.
    *
    */
  type counter = js.Function0[Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/aspect/memoizer.html
    *
    * Returns an object, which can be used to count calls to methods.
    *
    * @param keyMaker       Optionalthe function, which takes method's arguments and returns a key,which can be used to index the result.
    */
  type memoizer = js.Function1[/* keyMaker */ js.UndefOr[js.Function], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/aspect/profiler.html
    *
    * Returns an object, which can be used to time calls to methods.
    *
    * @param title       OptionalThe optional name of the profile section.
    */
  type profiler = js.Function1[/* title */ js.UndefOr[String], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/aspect/timer.html
    *
    * Returns an object, which can be used to time calls to methods.
    *
    * @param name       OptionalThe optional unique name of the timer.
    */
  type timer = js.Function1[/* name */ js.UndefOr[String], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/aspect/tracer.html
    *
    * Returns an object, which can be used to trace calls with Firebug's console.
    * Prints argument, a return value, or an exception.
    *
    * @param grouping The flag to group output. If true, indents embedded console messages.
    */
  type tracer = js.Function1[/* grouping */ Boolean, Unit]
}

