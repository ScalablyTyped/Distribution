package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IHashMap extends IObservable {
  /** [Method] Adds an item to the collection
  		* @param key String/Object The key to associate with the item, or the new item. If a getKey implementation was specified for this HashMap, or if the key of the stored items is in a property called id, the HashMap will be able to derive the key for the new item. In this case just pass the new item in this parameter.
  		* @param o Object The item to add.
  		* @returns Object The item added.
  		*/
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Removes all items from the hash
  		* @param initial Object
  		* @returns Ext.util.HashMap this
  		*/
  var clear: js.UndefOr[js.Function1[/* initial */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Performs a shallow copy on this hash
  		* @returns Ext.util.HashMap The new hash object.
  		*/
  @JSName("clone")
  var clone_FIHashMap: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Checks whether a value exists in the hash
  		* @param value Object The value to check for.
  		* @returns Boolean True if the value exists in the dictionary.
  		*/
  var contains: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Checks whether a key exists in the hash
  		* @param key String The key to check for.
  		* @returns Boolean True if they key exists in the hash.
  		*/
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Executes the specified function once for each item in the hash
  		* @param fn Function The function to execute.
  		* @param scope Object The scope to execute in. Defaults to this.
  		* @returns Ext.util.HashMap this
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Retrieves an item with a particular key
  		* @param key String The key to lookup.
  		* @returns Object The value at that key. If it doesn't exist, undefined is returned.
  		*/
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Gets the number of items in the hash
  		* @returns Number The number of items in the hash.
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Extracts the key from an object
  		* @param o Object The object to get the key from
  		* @returns String The key to use.
  		*/
  var getKey: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Return all of the keys in the hash
  		* @returns Array An array of keys.
  		*/
  var getKeys: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Return all of the values in the hash
  		* @returns Array An array of values.
  		*/
  var getValues: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Config Option] (Function) */
  var keyFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Remove an item from the hash
  		* @param o Object The value of the item to remove.
  		* @returns Boolean True if the item was successfully removed.
  		*/
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Remove an item from the hash
  		* @param key String The key to remove.
  		* @returns Boolean True if the item was successfully removed.
  		*/
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Replaces an item in the hash
  		* @param key String The key of the item.
  		* @param value Object The new value for the item.
  		* @returns Object The new value of the item.
  		*/
  var replace: js.UndefOr[
    js.Function2[/* key */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], _]
  ] = js.undefined
}

