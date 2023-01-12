package typings.extjs.Ext.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILruCache
  extends StObject
     with IHashMap {
  
  /** [Method] Removes all items from the hash
    * @param initial Object
    * @returns Ext.util.HashMap this
    */
  @JSName("clear")
  var clear_ILruCache: js.UndefOr[js.Function1[/* initial */ js.UndefOr[Any], IHashMap]] = js.undefined
  
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
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* reverse */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  
  /** [Method] Retrieves an item with a particular key
    * @param key Object
    * @returns Object The value at that key. If it doesn't exist, undefined is returned.
    */
  @JSName("get")
  var get_ILruCache: js.UndefOr[js.Function1[/* key */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Config Option] (Number) */
  var maxSize: js.UndefOr[Double] = js.undefined
  
  /** [Method] Purge the least recently used entries if the maxSize has been exceeded  */
  var prune: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ILruCache {
  
  inline def apply(): ILruCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILruCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILruCache] (val x: Self) extends AnyVal {
    
    inline def setClear(value: /* initial */ js.UndefOr[Any] => IHashMap): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setClone_(value: () => IHashMap): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setEach(
      value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* reverse */ js.UndefOr[Boolean]) => ILruCache
    ): Self = StObject.set(x, "each", js.Any.fromFunction3(value))
    
    inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    inline def setGet(value: /* key */ js.UndefOr[Any] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setPrune(value: () => Unit): Self = StObject.set(x, "prune", js.Any.fromFunction0(value))
    
    inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
  }
}
