package typings.durandal

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurandalSystemModule extends js.Object {
  
  /**
    * Uses require.js to obtain a module. This function returns a promise which resolves with the module instance.
    * @param {string} moduleId The id of the module to load.
    * @returns {Promise} A promise for the loaded module.
    */
  def acquire(moduleId: String): DurandalPromise[_] = js.native
  /**
    * Uses require.js to obtain multiple modules. This function returns a promise which resolves with the module instances in an array.
    * @param {string} moduleIds* The ids of the modules to load.
    * @returns {Promise} A promise for the loaded module.
    */
  def acquire(moduleIds: String*): DurandalPromise[js.Array[_]] = js.native
  /**
    * Uses require.js to obtain an array of modules. This function returns a promise which resolves with the modules instances in an array.
    * @param {string[]} moduleIds The ids of the modules to load.
    * @returns {Promise} A promise for the loaded module.
    */
  def acquire(modules: js.Array[String]): DurandalPromise[js.Array[_]] = js.native
  
  /**
    * Asserts a condition by throwing an error if the condition fails.
    * @param {boolean} condition The condition to check.
    * @param {string} message The message to report in the error if the condition check fails.
    */
  def assert(condition: Boolean, message: String): Unit = js.native
  
  /**
    * Gets/Sets whether or not Durandal is in debug mode.
    * @param {boolean} [enable] Turns on/off debugging.
    * @returns {boolean} Whether or not Durandal is current debugging.
    */
  def debug(): Boolean = js.native
  def debug(enable: Boolean): Boolean = js.native
  
  /**
    * Creates a deferred object which can be used to create a promise. Optionally pass a function action to perform which will be passed an object used in resolving the promise.
    * @param {function} [action] The action to defer. You will be passed the deferred object as a parameter.
    * @returns {Deferred} The deferred object.
    */
  def defer[T](): DurandalDeferred[T] = js.native
  def defer[T](action: js.Function1[/* dfd */ DurandalDeferred[T], Unit]): DurandalDeferred[T] = js.native
  
  /**
    * Logs an error.
    * @param {string} obj The error to report.
    */
  def error(error: String): Unit = js.native
  /**
    * Logs an error.
    * @param {Error} obj The error to report.
    */
  def error(error: Error): Unit = js.native
  
  /**
    * Extends the first object with the properties of the following objects.
    * @param {object} obj The target object to extend.
    * @param {object} extension* Uses to extend the target object.
    */
  def extend(obj: js.Any, extensions: js.Any*): js.Any = js.native
  
  /**
    * Gets the module id for the specified object.
    * @param {object} obj The object whose module id you wish to determine.
    * @returns {string} The module id.
    */
  def getModuleId(obj: js.Any): String = js.native
  
  /**
    * Creates a simple V4 UUID. This should not be used as a PK in your database. It can be used to generate internal, unique ids. For a more robust solution see [node-uuid](https://github.com/broofa/node-uuid).
    * @returns {string} The guid.
    */
  def guid(): String = js.native
  
  /**
    * Determines if the specified object is a function arguments object.
    * @param {object} object The object to check.
    * @returns {boolean} True if matches the type, false otherwise.
    */
  def isArguments(obj: js.Any): Boolean = js.native
  
  /**
    * Determines if the specified object is an array.
    * @param {object} object The object to check.
    * @returns {boolean} True if matches the type, false otherwise.
    */
  def isArray(obj: js.Any): Boolean = js.native
  
  /**
    * Determines if the specified object is a boolean.
    * @param {object} object The object to check.
    * @returns {boolean} True if matches the type, false otherwise.
    */
  def isBoolean(obj: js.Any): Boolean = js.native
  
  /**
    * Determines if the specified object is a date.
    * @param {object} object The object to check.
    * @returns {boolean} True if matches the type, false otherwise.
    */
  def isDate(obj: js.Any): Boolean = js.native
  
  /**
    * Determines if the specified object is an html element.
    * @param {object} object The object to check.
    * @returns {boolean} True if matches the type, false otherwise.
    */
  def isElement(obj: js.Any): Boolean = js.native
  
  /**
    * Determines if the specified object is a function.
    * @param {object} object The object to check.
    * @returns {boolean} True if matches the type, false otherwise.
    */
  def isFunction(obj: js.Any): Boolean = js.native
  
  /**
    * Determines if the specified object is a number.
    * @param {object} object The object to check.
    * @returns {boolean} True if matches the type, false otherwise.
    */
  def isNumber(obj: js.Any): Boolean = js.native
  
  /**
    * Determines if the specified object is a boolean.
    * @param {object} object The object to check.
    * @returns {boolean} True if matches the type, false otherwise.
    */
  def isObject(obj: js.Any): Boolean = js.native
  
  /**
    * Determines if the specified object is a promise.
    * @param {object} object The object to check.
    * @returns {boolean} True if matches the type, false otherwise.
    */
  def isPromise(obj: js.Any): Boolean = js.native
  
  /**
    * Determines if the specified object is a string.
    * @param {object} object The object to check.
    * @returns {boolean} True if matches the type, false otherwise.
    */
  def isString(obj: js.Any): Boolean = js.native
  
  /**
    * Gets all the owned keys of the specified object.
    * @param {object} object The object whose owned keys should be returned.
    * @returns {string[]} The keys.
    */
  def keys(obj: js.Any): js.Array[String] = js.native
  
  /**
    * Logs data to the console. Pass any number of parameters to be logged. Log output is not processed if the framework is not running in debug mode.
    * @param {object} info* The objects to log.
    */
  def log(msgs: js.Any*): Unit = js.native
  
  /**
    * A noop function.
    */
  var noop: js.Function = js.native
  
  /**
    * Resolves the default object instance for a module. If the module is an object, the module is returned. If the module is a function, that function is called with `new` and it's result is returned.
    * @param {object} module The module to use to get/create the default object for.
    * @returns {object} The default object for the module.
    */
  def resolveObject(module: js.Any): js.Any = js.native
  
  /**
    * Sets the module id for the specified object.
    * @param {object} obj The object whose module id you wish to set.
    * @param {string} id The id to set for the specified object.
    */
  def setModuleId(obj: js.Any, id: String): Unit = js.native
  
  /**
    * Durandal's version.
    */
  var version: String = js.native
  
  /**
    * Uses a setTimeout to wait the specified milliseconds.
    * @param {number} milliseconds The number of milliseconds to wait.
    * @returns {Promise}
    */
  def wait(milliseconds: Double): DurandalPromise[_] = js.native
}
