package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILruCache extends IHashMap {
  /** [Method] Removes all items from the hash
  		* @param initial Object
  		* @returns Ext.util.HashMap this
  		*/
  @JSName("clear")
  var clear_ILruCache: js.UndefOr[js.Function1[/* initial */ js.UndefOr[js.Any], IHashMap]] = js.undefined
  /** [Method] Performs a shallow copy on this haLruCachesh
  		* @returns Ext.util.HashMap The new hash object.
  		*/
  @JSName("clone")
  var clone_FILruCache: js.UndefOr[js.Function0[IHashMap]] = js.undefined
  /** [Method] Executes the specified function once for each item in the cache
  		* @param fn Function The function to execute.
  		* @param scope Object The scope (this reference) to execute in. Defaults to this LruCache.
  		* @param reverse Boolean Pass true to iterate the list in reverse (most recent first) order.
  		* @returns Ext.util.LruCache this
  		*/
  @JSName("each")
  var each_ILruCache: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* reverse */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Retrieves an item with a particular key
  		* @param key Object
  		* @returns Object The value at that key. If it doesn't exist, undefined is returned.
  		*/
  @JSName("get")
  var get_ILruCache: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Number) */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Purge the least recently used entries if the maxSize has been exceeded  */
  var prune: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

