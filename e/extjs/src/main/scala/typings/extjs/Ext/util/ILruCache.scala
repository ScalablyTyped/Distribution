package typings.extjs.Ext.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILruCache extends IHashMap {
  /** [Method] Removes all items from the hash
    * @param initial Object
    * @returns Ext.util.HashMap this
    */
  @JSName("clear")
  var clear_ILruCache: js.UndefOr[js.Function1[/* initial */ js.UndefOr[js.Any], IHashMap]] = js.native
  /** [Method] Performs a shallow copy on this haLruCachesh
    * @returns Ext.util.HashMap The new hash object.
    */
  @JSName("clone")
  var clone_FILruCache: js.UndefOr[js.Function0[IHashMap]] = js.native
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
      /* reverse */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Retrieves an item with a particular key
    * @param key Object
    * @returns Object The value at that key. If it doesn't exist, undefined is returned.
    */
  @JSName("get")
  var get_ILruCache: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Number) */
  var maxSize: js.UndefOr[Double] = js.native
  /** [Method] Purge the least recently used entries if the maxSize has been exceeded  */
  var prune: js.UndefOr[js.Function0[Unit]] = js.native
}

object ILruCache {
  @scala.inline
  def apply(): ILruCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILruCache]
  }
  @scala.inline
  implicit class ILruCacheOps[Self <: ILruCache] (val x: Self) extends AnyVal {
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
    def setClear(value: /* initial */ js.UndefOr[js.Any] => IHashMap): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setClone(value: () => IHashMap): Self = this.set("clone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setEach(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* reverse */ js.UndefOr[Boolean]) => ILruCache
    ): Self = this.set("each", js.Any.fromFunction3(value))
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    @scala.inline
    def setGet(value: /* key */ js.UndefOr[js.Any] => _): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setPrune(value: () => Unit): Self = this.set("prune", js.Any.fromFunction0(value))
    @scala.inline
    def deletePrune: Self = this.set("prune", js.undefined)
  }
  
}

