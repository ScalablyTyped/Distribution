package typings.dojo.dojox.form

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/_HasDropDown.html
  *
  * This module defines Javascript language extensions.
  *
  */
@js.native
trait HasDropDown extends js.Object {
  /**
    * Clones objects (including DOM nodes) and all children.
    * Warning: do not clone cyclic structures.
    *
    * @param src The object to clone
    */
  def clone(src: js.Any): js.Any = js.native
  /**
    * Returns a new object which "looks" to obj for properties which it
    * does not have a value for. Optionally takes a bag of properties to
    * seed the returned object with initially.
    * This is a small implementation of the Boodman/Crockford delegation
    * pattern in JavaScript. An intermediate object constructor mediates
    * the prototype chain for the returned object, using it to delegate
    * down to obj for property lookup when object-local lookup fails.
    * This can be thought of similarly to ES4's "wrap", save that it does
    * not act on types but rather on pure objects.
    *
    * @param obj The object to delegate to for properties not found directly on thereturn object or in props.
    * @param props an object containing properties to assign to the returned object
    */
  def delegate(obj: js.Object, props: js.Array[js.Object]): js.Any = js.native
  /**
    * determine if an object supports a given method
    * useful for longer api chains where you have to test each object in
    * the chain. Useful for object and method detection.
    *
    * @param name Path to an object, in the form "A.B.C".
    * @param obj               OptionalObject to use as root of path. Defaults to'dojo.global'. Null may be passed.
    */
  def exists(name: String, obj: js.Object): Boolean = js.native
  /**
    * Adds all properties and methods of props to constructor's
    * prototype, making them available to all instances created with
    * constructor.
    *
    * @param ctor Target constructor to extend.
    * @param props One or more objects to mix into ctor.prototype
    */
  def extend(ctor: js.Object, props: js.Object): js.Object = js.native
  /**
    * Get a property from a dot-separated string, such as "A.B.C"
    * Useful for longer api chains where you have to test each object in
    * the chain, or when you have an object reference in string format.
    *
    * @param name Path to an property, in the form "A.B.C".
    * @param create               OptionalOptional. Defaults to false. If true, Objects will becreated at any point along the 'path' that is undefined.
    * @param context               OptionalOptional. Object to use as root of path. Defaults to'dojo.global'. Null may be passed.
    */
  def getObject(name: String, create: Boolean, context: js.Object): js.Any = js.native
  /**
    * Returns a function that will only ever execute in the a given scope.
    * This allows for easy use of object member functions
    * in callbacks and other places in which the "this" keyword may
    * otherwise not reference the expected scope.
    * Any number of default positional arguments may be passed as parameters
    * beyond "method".
    * Each of these values will be used to "placehold" (similar to curry)
    * for the hitched function.
    *
    * @param scope The scope to use when method executes. If method is a string,scope is also the object containing method.
    * @param method A function to be hitched to scope, or the name of the method inscope to be hitched.
    */
  def hitch(scope: js.Object, method: js.Array[String]): js.Any = js.native
  /**
    * Returns a function that will only ever execute in the a given scope.
    * This allows for easy use of object member functions
    * in callbacks and other places in which the "this" keyword may
    * otherwise not reference the expected scope.
    * Any number of default positional arguments may be passed as parameters
    * beyond "method".
    * Each of these values will be used to "placehold" (similar to curry)
    * for the hitched function.
    *
    * @param scope The scope to use when method executes. If method is a string,scope is also the object containing method.
    * @param method A function to be hitched to scope, or the name of the method inscope to be hitched.
    */
  def hitch(scope: js.Object, method: js.Function): js.Any = js.native
  /**
    * Returns true if it is a built-in function or some other kind of
    * oddball that should report as a function but doesn't
    *
    * @param it
    */
  def isAlien(it: js.Any): js.Any = js.native
  /**
    * Return true if it is an Array.
    * Does not work on Arrays created in other windows.
    *
    * @param it Item to test.
    */
  def isArray(it: js.Any): js.Any = js.native
  /**
    * similar to isArray() but more permissive
    * Doesn't strongly test for "arrayness".  Instead, settles for "isn't
    * a string or number and has a length property". Arguments objects
    * and DOM collections will return true when passed to
    * isArrayLike(), but will return false when passed to
    * isArray().
    *
    * @param it Item to test.
    */
  def isArrayLike(it: js.Any): js.Any = js.native
  /**
    * Return true if it is a Function
    *
    * @param it Item to test.
    */
  def isFunction(it: js.Any): Boolean = js.native
  /**
    * Returns true if it is a JavaScript object (or an Array, a Function
    * or null)
    *
    * @param it Item to test.
    */
  def isObject(it: js.Any): Boolean = js.native
  /**
    * Return true if it is a String
    *
    * @param it Item to test.
    */
  def isString(it: js.Any): Boolean = js.native
  /**
    * Copies/adds all properties of one or more sources to dest; returns dest.
    * All properties, including functions (sometimes termed "methods"), excluding any non-standard extensions
    * found in Object.prototype, are copied/added from sources to dest. sources are processed left to right.
    * The Javascript assignment operator is used to copy/add each property; therefore, by default, mixin
    * executes a so-called "shallow copy" and aggregate types are copied/added by reference.
    *
    * @param dest The object to which to copy/add all properties contained in source. If dest is falsy, thena new object is manufactured before copying/adding properties begins.
    * @param sources One of more objects from which to draw all properties to copy into dest. sources are processedleft-to-right and if more than one of these objects contain the same property name, the right-mostvalue "wins".
    */
  def mixin(dest: js.Object, sources: js.Array[js.Object]): js.Object = js.native
  /**
    * similar to hitch() except that the scope object is left to be
    * whatever the execution context eventually becomes.
    * Calling lang.partial is the functional equivalent of calling:
    *
    * lang.hitch(null, funcName, ...);
    *
    * @param method The function to "wrap"
    */
  def partial(method: String): js.Any = js.native
  /**
    * similar to hitch() except that the scope object is left to be
    * whatever the execution context eventually becomes.
    * Calling lang.partial is the functional equivalent of calling:
    *
    * lang.hitch(null, funcName, ...);
    *
    * @param method The function to "wrap"
    */
  def partial(method: js.Function): js.Any = js.native
  /**
    * Performs parameterized substitutions on a string. Throws an
    * exception if any parameter is unmatched.
    *
    * @param tmpl String to be used as a template.
    * @param map If an object, it is used as a dictionary to look up substitutions.If a function, it is called for every substitution with following parameters:a whole match, a name, an offset, and the whole templatestring (see https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Global_Objects/String/replacefor more details).
    * @param pattern               OptionalOptional regular expression objects that overrides the default pattern.Must be global and match one item. The default is: /{([^}]+)}/g,which matches patterns like that: "{xxx}", where "xxx" is any sequenceof characters, which doesn't include "}".
    */
  def replace(tmpl: String, map: js.Function, pattern: RegExp): String = js.native
  /**
    * Performs parameterized substitutions on a string. Throws an
    * exception if any parameter is unmatched.
    *
    * @param tmpl String to be used as a template.
    * @param map If an object, it is used as a dictionary to look up substitutions.If a function, it is called for every substitution with following parameters:a whole match, a name, an offset, and the whole templatestring (see https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Global_Objects/String/replacefor more details).
    * @param pattern               OptionalOptional regular expression objects that overrides the default pattern.Must be global and match one item. The default is: /{([^}]+)}/g,which matches patterns like that: "{xxx}", where "xxx" is any sequenceof characters, which doesn't include "}".
    */
  def replace(tmpl: String, map: js.Object, pattern: RegExp): String = js.native
  /**
    * Set a property from a dot-separated string, such as "A.B.C"
    * Useful for longer api chains where you have to test each object in
    * the chain, or when you have an object reference in string format.
    * Objects are created as needed along path. Returns the passed
    * value if setting is successful or undefined if not.
    *
    * @param name Path to a property, in the form "A.B.C".
    * @param value value or object to place at location given by name
    * @param context               OptionalOptional. Object to use as root of path. Defaults todojo.global.
    */
  def setObject(name: String, value: js.Any, context: js.Object): js.Any = js.native
  /**
    * Trims whitespace from both sides of the string
    * This version of trim() was selected for inclusion into the base due
    * to its compact size and relatively good performance
    * (see Steven Levithan's blog
    * Uses String.prototype.trim instead, if available.
    * The fastest but longest version of this function is located at
    * lang.string.trim()
    *
    * @param str String to be trimmed
    */
  def trim(str: String): String = js.native
}

