package typings
package expiredDashStorageLib.expiredDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpiredStorage extends js.Object {
  /**
     * Clear the entire storage and all keys in it.
     */
  def clear(): scala.Unit = js.native
  /**
     * Clear expired keys.
     * If you never call this function, expired keys will remain until you try to get them / reset a new value.
     *
     * @param return: List of removed keys due to expiration.
     */
  def clearExpired(): js.Array[java.lang.String] = js.native
  /**
     * Get item.
     * @param key: Item key to get (string).
     * @return: Stored value, or undefined if not set / expired.
     */
  def getItem(key: java.lang.String): java.lang.String | scala.Null = js.native
  /**
     * Get a json serializable value. This basically calls JSON.parse on the returned value.
     * @param key Item key to get (string).
     * @return Stored value (JSON.parsed), or undefined if not set / expired.
     */
  def getJson(key: java.lang.String): js.Any = js.native
  /**
     * Get item time left to live.
     * @param key Item key to get (string).
     * @return Time left to expire (in seconds), or null if don't have expiration date.
     */
  def getTimeLeft(key: java.lang.String): scala.Double | scala.Null = js.native
  /**
     * Return if an item is expired (don't remove it, even if expired).
     * @param key Item key to check (string).
     * @return True if expired, False otherwise.
     */
  def isExpired(key: java.lang.String): scala.Boolean = js.native
  /**
     * Get all keys in storage, not including internal keys used to store expiration.
     * @param: includeExpired: if true, will also include expired keys.
     * @return: Array with keys.
     */
  def keys(includeExpired: scala.Boolean): js.Array[java.lang.String] | scala.Null = js.native
  /**
     * Get item + metadata such as time left and if expired.
     * Even if item expired, will not remove it.
     * @param key Item key to get (string).
     * @return PeekInterface with: {value, timeLeft, isExpired}
     */
  def peek(key: java.lang.String): expiredDashStorageLib.expiredDashStorageMod.ExpiredStorageNs.PeekInterface = js.native
  /**
     * Remove an item.
     * @param key Item key to remove (string).
     * @return Storage.removeItem() return code.
     */
  def removeItem(key: java.lang.String): js.Any = js.native
  /**
     * Set item.
     * @param key Item key to set (string).
     * @param value Value to store (string).
     * @param expiration Expiration time, in seconds. If not provided, will not set expiration time.
     * @return Storage.setItem() return code.
     */
  def setItem(key: java.lang.String, value: java.lang.String): js.Any = js.native
  /**
     * Set item.
     * @param key Item key to set (string).
     * @param value Value to store (string).
     * @param expiration Expiration time, in seconds. If not provided, will not set expiration time.
     * @return Storage.setItem() return code.
     */
  def setItem(key: java.lang.String, value: java.lang.String, expiration: scala.Double): js.Any = js.native
  /**
     * Set a json serializable value. This basically calls JSON.stringify on 'val' before setting it.
     * @param key Item key to set (string).
     * @param value Value to store (object, will be JSON.stringified).
     * @param expiration Expiration time, in seconds. If not provided, will not set expiration time.
     * @param return Storage.setItem() return code.
     */
  def setJson(key: java.lang.String, value: js.Object): js.Any = js.native
  /**
     * Set a json serializable value. This basically calls JSON.stringify on 'val' before setting it.
     * @param key Item key to set (string).
     * @param value Value to store (object, will be JSON.stringified).
     * @param expiration Expiration time, in seconds. If not provided, will not set expiration time.
     * @param return Storage.setItem() return code.
     */
  def setJson(key: java.lang.String, value: js.Object, expirationTime: scala.Double): js.Any = js.native
  /**
     * Update expiration time for an item (note: doesn't validate that the item is set).
     * @param key: Item key to update expiration for (string).
     * @param expiration: New expiration time in seconds to set.
     * @return: Storage.setItem() return code for setting new expiration.
     */
  def updateExpiration(key: java.lang.String, expiration: scala.Double): js.Any = js.native
}

