package typings.expressBrute.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-brute", "MemoryStore")
@js.native
/**
  * @summary Constructor.
  * @constructor
  * @param {Object} options The options.
  */
class MemoryStore () extends js.Object {
  def this(options: MemoryStoreOptions) = this()
  /**
    * @summary Gets key value.
    * @param {string}      key     The key name.
    * @param {Function}    callbck The callback.
    */
  def get(key: String, callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = js.native
  /**
    * @summary Deletes the key.
    * @param {string}      key      The name.
    * @param {Function}    callback The callback.
    */
  def reset(key: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  /**
    * @summary Sets the key value.
    * @param {string}      key      The name.
    * @param {string}      value    The value.
    * @param {number}      lifetime The lifetime.
    * @param {Function}    callback The callback.
    */
  def set(key: String, value: js.Any, lifetime: Double, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
}

