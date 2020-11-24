package typings.expressBruteMemcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-brute-memcached", JSImport.Default)
@js.native
class default protected () extends MemcachedStore {
  /**
    * @summary Constructor.
    * @constructor
    * @param {string|Array}    hosts   The collection.
    * @param {Object}          options The otpions.
    */
  def this(hosts: String) = this()
  def this(hosts: js.Array[String]) = this()
  def this(hosts: String, options: MemcachedStoreOptions) = this()
  def this(hosts: js.Array[String], options: MemcachedStoreOptions) = this()
}
