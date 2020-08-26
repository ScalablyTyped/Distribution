package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashMap extends IObservable {
  /** [Method] Adds an item to the collection
    * @param key String/Object The key to associate with the item, or the new item. If a getKey implementation was specified for this HashMap, or if the key of the stored items is in a property called id, the HashMap will be able to derive the key for the new item. In this case just pass the new item in this parameter.
    * @param o Object The item to add.
    * @returns Object The item added.
    */
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Removes all items from the hash
    * @param initial Object
    * @returns Ext.util.HashMap this
    */
  var clear: js.UndefOr[js.Function1[/* initial */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Performs a shallow copy on this hash
    * @returns Ext.util.HashMap The new hash object.
    */
  @JSName("clone")
  var clone_FIHashMap: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Checks whether a value exists in the hash
    * @param value Object The value to check for.
    * @returns Boolean True if the value exists in the dictionary.
    */
  var contains: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Checks whether a key exists in the hash
    * @param key String The key to check for.
    * @returns Boolean True if they key exists in the hash.
    */
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Executes the specified function once for each item in the hash
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in. Defaults to this.
    * @returns Ext.util.HashMap this
    */
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Method] Retrieves an item with a particular key
    * @param key String The key to lookup.
    * @returns Object The value at that key. If it doesn't exist, undefined is returned.
    */
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.native
  /** [Method] Gets the number of items in the hash
    * @returns Number The number of items in the hash.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Extracts the key from an object
    * @param o Object The object to get the key from
    * @returns String The key to use.
    */
  var getKey: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], String]] = js.native
  /** [Method] Return all of the keys in the hash
    * @returns Array An array of keys.
    */
  var getKeys: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Return all of the values in the hash
    * @returns Array An array of values.
    */
  var getValues: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (Function) */
  var keyFn: js.UndefOr[js.Any] = js.native
  /** [Method] Remove an item from the hash
    * @param o Object The value of the item to remove.
    * @returns Boolean True if the item was successfully removed.
    */
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Remove an item from the hash
    * @param key String The key to remove.
    * @returns Boolean True if the item was successfully removed.
    */
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Replaces an item in the hash
    * @param key String The key of the item.
    * @param value Object The new value for the item.
    * @returns Object The new value of the item.
    */
  var replace: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], _]] = js.native
}

object IHashMap {
  @scala.inline
  def apply(): IHashMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHashMap]
  }
  @scala.inline
  implicit class IHashMapOps[Self <: IHashMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (/* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any]) => _): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setClear(value: /* initial */ js.UndefOr[js.Any] => IHashMap): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setClone(value: () => IHashMap): Self = this.set("clone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setContains(value: /* value */ js.UndefOr[js.Any] => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setContainsKey(value: /* key */ js.UndefOr[String] => Boolean): Self = this.set("containsKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContainsKey: Self = this.set("containsKey", js.undefined)
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IHashMap): Self = this.set("each", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    @scala.inline
    def setGet(value: /* key */ js.UndefOr[String] => _): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    @scala.inline
    def setGetKey(value: /* o */ js.UndefOr[js.Any] => String): Self = this.set("getKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetKey: Self = this.set("getKey", js.undefined)
    @scala.inline
    def setGetKeys(value: () => Array): Self = this.set("getKeys", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetKeys: Self = this.set("getKeys", js.undefined)
    @scala.inline
    def setGetValues(value: () => Array): Self = this.set("getValues", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValues: Self = this.set("getValues", js.undefined)
    @scala.inline
    def setKeyFn(value: js.Any): Self = this.set("keyFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyFn: Self = this.set("keyFn", js.undefined)
    @scala.inline
    def setRemove(value: /* o */ js.UndefOr[js.Any] => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRemoveAtKey(value: /* key */ js.UndefOr[String] => Boolean): Self = this.set("removeAtKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAtKey: Self = this.set("removeAtKey", js.undefined)
    @scala.inline
    def setReplace(value: (/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => _): Self = this.set("replace", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
  }
  
}

