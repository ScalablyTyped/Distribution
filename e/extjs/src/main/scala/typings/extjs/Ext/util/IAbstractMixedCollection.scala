package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstractMixedCollection extends IObservable {
  
  /** [Method] Adds an item to the collection
    * @param key String/Object The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
    * @param obj Object The item to add.
    * @returns Object The item added.
    */
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[js.Any], /* obj */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Adds all elements of an Array or an Object to the collection
    * @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
    */
  var addAll: js.UndefOr[js.Function1[/* objs */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var allowFunctions: js.UndefOr[Boolean] = js.native
  
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Creates a shallow copy of this collection
    * @returns Ext.util.MixedCollection
    */
  @JSName("clone")
  var clone_FIAbstractMixedCollection: js.UndefOr[js.Function0[IMixedCollection]] = js.native
  
  /** [Method] Collects unique values of a particular property in this MixedCollection
    * @param property String The property to collect on
    * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
    * @param allowBlank Boolean Pass true to allow null, undefined or empty string values
    * @returns Array The unique values
    */
  var collect: js.UndefOr[
    js.Function3[
      /* property */ js.UndefOr[String], 
      /* root */ js.UndefOr[String], 
      /* allowBlank */ js.UndefOr[Boolean], 
      Array
    ]
  ] = js.native
  
  /** [Method] Returns true if the collection contains the passed Object as an item
    * @param o Object The Object to look for in the collection.
    * @returns Boolean True if the collection contains the Object as an item.
    */
  var contains: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Returns true if the collection contains the passed Object as a key
    * @param key String The key to look for in the collection.
    * @returns Boolean True if the collection contains the Object as a key.
    */
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.native
  
  /** [Method] Executes the specified function once for every item in the collection
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  var eachKey: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
    * @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
    * @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property
    * @param anyMatch Boolean True to match any part of the string, not just the beginning
    * @param caseSensitive Boolean True for case sensitive comparison.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  var filter: js.UndefOr[
    js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      IMixedCollection
    ]
  ] = js.native
  
  /** [Method] Filter by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  var filterBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.native
  
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function  */
  var find: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    * @returns Object The first item in the collection which returned true from the selection function, or null if none was found.
    */
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Finds the index of the first matching object in this collection by a specific property value
    * @param property String The name of a property on your objects.
    * @param value String/RegExp A string that the property values should start with or a RegExp to test against the property.
    * @param start Number The index to start searching at.
    * @param anyMatch Boolean True to match any part of the string, not just the beginning.
    * @param caseSensitive Boolean True for case sensitive comparison.
    * @returns Number The matched index or -1
    */
  var findIndex: js.UndefOr[
    js.Function5[
      /* property */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  
  /** [Method] Find the index of the first matching object in this collection by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @param start Number The index to start searching at.
    * @returns Number The matched index or -1
    */
  var findIndexBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  
  /** [Method] Returns the first item in the collection
    * @returns Object the first item in the collection..
    */
  var first: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the item associated with the passed key OR index
    * @param key String/Number The key or index of the item.
    * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
    */
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the item at the specified index
    * @param index Number The index of the item.
    * @returns Object The item at the specified index.
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  
  /** [Method] Returns the item associated with the passed key
    * @param key String/Number The key of the item.
    * @returns Object The item associated with the passed key.
    */
  var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] A function which will be called passing a newly added object when the object is added without a separate id
    * @param item Object The item for which to find the key.
    * @returns Object The key for the passed item.
    */
  var getKey: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns a range of items in this collection
    * @param startIndex Number The starting index. Defaults to 0.
    * @param endIndex Number The ending index. Defaults to the last item.
    * @returns Array An array of items
    */
  var getRange: js.UndefOr[
    js.Function2[/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double], Array]
  ] = js.native
  
  /** [Method] Returns index within the collection of the passed Object
    * @param o Object The item to find the index of.
    * @returns Number index of the item. Returns -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Double]] = js.native
  
  /** [Method] Returns index within the collection of the passed key
    * @param key String The key to find the index of.
    * @returns Number index of the key.
    */
  var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Double]] = js.native
  
  /** [Method] Inserts an item at the specified index in the collection
    * @param index Number The index to insert the item at.
    * @param key String/Object/String[]/Object[] The key to associate with the new item, or the item itself. May also be an array of either to insert multiple items at once.
    * @param o Object/Object[] If the second parameter was a key, the new item. May also be an array to insert multiple items at once.
    * @returns Object The item inserted or an array of items inserted.
    */
  var insert: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* key */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Property] (Boolean) */
  var isMixedCollection: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the last item in the collection
    * @returns Object the last item in the collection..
    */
  var last: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Remove an item from the collection
    * @param o Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Remove all items in the collection
    * @param items Array An array of items to be removed.
    * @returns Ext.util.MixedCollection this object
    */
  var removeAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], IMixedCollection]] = js.native
  
  /** [Method] Remove an item from a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  
  /** [Method] Removes an item associated with the passed key fom the collection
    * @param key String The key of the item to remove. If null is passed, all objects which yielded no key from the configured getKey function are removed.
    * @returns Object Only returned if removing at a specified key. The item removed or false if no item was removed.
    */
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.native
  
  /** [Method] Remove a range of items starting at a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @param removeCount Number The nuber of items to remove beginning at the specified index.
    * @returns Object The last item removed or false if no item was removed.
    */
  var removeRange: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double], _]
  ] = js.native
  
  /** [Method] Replaces an item in the collection
    * @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
    * @param o Object {Object} o (optional) If the first parameter passed was a key, the item to associate with that key.
    * @returns Object The new item.
    */
  var replace: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* o */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Collects all of the values of the given property and returns their sum
    * @param property String The property to sum by
    * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
    * @param start Number The record index to start at
    * @param end Number The record index to end at
    * @returns Number The total
    */
  var sum: js.UndefOr[
    js.Function4[
      /* property */ js.UndefOr[String], 
      /* root */ js.UndefOr[String], 
      /* start */ js.UndefOr[Double], 
      /* end */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  
  /** [Method] Change the key for an existing item in the collection
    * @param oldKey Object The old key
    * @param newKey Object The new key
    */
  var updateKey: js.UndefOr[
    js.Function2[/* oldKey */ js.UndefOr[js.Any], /* newKey */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object IAbstractMixedCollection {
  
  @scala.inline
  def apply(): IAbstractMixedCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractMixedCollection]
  }
  
  @scala.inline
  implicit class IAbstractMixedCollectionMutableBuilder[Self <: IAbstractMixedCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (/* key */ js.UndefOr[js.Any], /* obj */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddAll(value: /* objs */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddAllUndefined: Self = StObject.set(x, "addAll", js.undefined)
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAllowFunctions(value: Boolean): Self = StObject.set(x, "allowFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFunctionsUndefined: Self = StObject.set(x, "allowFunctions", js.undefined)
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setClone_(value: () => IMixedCollection): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    @scala.inline
    def setCollect(
      value: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* allowBlank */ js.UndefOr[Boolean]) => Array
    ): Self = StObject.set(x, "collect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
    
    @scala.inline
    def setContains(value: /* o */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsKey(value: /* key */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsKeyUndefined: Self = StObject.set(x, "containsKey", js.undefined)
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachKey(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachKeyUndefined: Self = StObject.set(x, "eachKey", js.undefined)
    
    @scala.inline
    def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => IMixedCollection
    ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = StObject.set(x, "filterBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFind(value: () => Unit): Self = StObject.set(x, "find", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "findBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindByUndefined: Self = StObject.set(x, "findBy", js.undefined)
    
    @scala.inline
    def setFindIndex(
      value: (/* property */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => Double
    ): Self = StObject.set(x, "findIndex", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFindIndexBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "findIndexBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindIndexByUndefined: Self = StObject.set(x, "findIndexBy", js.undefined)
    
    @scala.inline
    def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
    
    @scala.inline
    def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
    @scala.inline
    def setFirst(value: () => _): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    @scala.inline
    def setGet(value: /* key */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAt(value: /* index */ js.UndefOr[Double] => _): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAtUndefined: Self = StObject.set(x, "getAt", js.undefined)
    
    @scala.inline
    def setGetByKey(value: /* key */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getByKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByKeyUndefined: Self = StObject.set(x, "getByKey", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    @scala.inline
    def setGetKey(value: /* item */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    
    @scala.inline
    def setGetRange(value: (/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "getRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRangeUndefined: Self = StObject.set(x, "getRange", js.undefined)
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setIndexOf(value: /* o */ js.UndefOr[js.Any] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOfKey(value: /* key */ js.UndefOr[String] => Double): Self = StObject.set(x, "indexOfKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOfKeyUndefined: Self = StObject.set(x, "indexOfKey", js.undefined)
    
    @scala.inline
    def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    @scala.inline
    def setInsert(
      value: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any]) => _
    ): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    @scala.inline
    def setIsMixedCollection(value: Boolean): Self = StObject.set(x, "isMixedCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMixedCollectionUndefined: Self = StObject.set(x, "isMixedCollection", js.undefined)
    
    @scala.inline
    def setLast(value: () => _): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setRemove(value: /* o */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAll(value: /* items */ js.UndefOr[Array] => IMixedCollection): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    @scala.inline
    def setRemoveAt(value: /* index */ js.UndefOr[Double] => _): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAtKey(value: /* key */ js.UndefOr[String] => _): Self = StObject.set(x, "removeAtKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAtKeyUndefined: Self = StObject.set(x, "removeAtKey", js.undefined)
    
    @scala.inline
    def setRemoveAtUndefined: Self = StObject.set(x, "removeAt", js.undefined)
    
    @scala.inline
    def setRemoveRange(value: (/* index */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double]) => _): Self = StObject.set(x, "removeRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveRangeUndefined: Self = StObject.set(x, "removeRange", js.undefined)
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setReplace(value: (/* key */ js.UndefOr[String], /* o */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setSum(
      value: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "sum", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    @scala.inline
    def setUpdateKey(value: (/* oldKey */ js.UndefOr[js.Any], /* newKey */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updateKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateKeyUndefined: Self = StObject.set(x, "updateKey", js.undefined)
  }
}
