package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleMap extends StObject {
  
  /**
    * Looks up a module by address. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def find(address: NativePointerValue): Module | Null = js.native
  
  /**
    * Just like `find()`, but only returns the `name` field, which means less overhead when you don’t need the
    * other details. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def findName(address: NativePointerValue): String | Null = js.native
  
  /**
    * Just like `find()`, but only returns the `path` field, which means less overhead when you don’t need the
    * other details. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def findPath(address: NativePointerValue): String | Null = js.native
  
  /**
    * Looks up a module by address. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def get(address: NativePointerValue): Module = js.native
  
  /**
    * Just like `get()`, but only returns the `name` field, which means less overhead when you don’t need the
    * other details. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def getName(address: NativePointerValue): String = js.native
  
  /**
    * Just like `get()`, but only returns the `path` field, which means less overhead when you don’t need the
    * other details. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def getPath(address: NativePointerValue): String = js.native
  
  /**
    * Determines if `address` belongs to any of the contained modules.
    *
    * @param address Address that might belong to a module in the map.
    */
  def has(address: NativePointerValue): Boolean = js.native
  
  /**
    * Updates the map.
    *
    * You should call this after a module has been loaded or unloaded to avoid operating on stale data.
    */
  def update(): Unit = js.native
  
  /**
    * Gets the modules currently in the map. The returned array is a deep copy and will not mutate after a
    * call to `update()`.
    */
  def values(): js.Array[Module] = js.native
}
object ModuleMap {
  
  @scala.inline
  def apply(
    find: NativePointerValue => Module | Null,
    findName: NativePointerValue => String | Null,
    findPath: NativePointerValue => String | Null,
    get: NativePointerValue => Module,
    getName: NativePointerValue => String,
    getPath: NativePointerValue => String,
    has: NativePointerValue => Boolean,
    update: () => Unit,
    values: () => js.Array[Module]
  ): ModuleMap = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), findName = js.Any.fromFunction1(findName), findPath = js.Any.fromFunction1(findPath), get = js.Any.fromFunction1(get), getName = js.Any.fromFunction1(getName), getPath = js.Any.fromFunction1(getPath), has = js.Any.fromFunction1(has), update = js.Any.fromFunction0(update), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ModuleMap]
  }
  
  @scala.inline
  implicit class ModuleMapMutableBuilder[Self <: ModuleMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFind(value: NativePointerValue => Module | Null): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindName(value: NativePointerValue => String | Null): Self = StObject.set(x, "findName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindPath(value: NativePointerValue => String | Null): Self = StObject.set(x, "findPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: NativePointerValue => Module): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetName(value: NativePointerValue => String): Self = StObject.set(x, "getName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPath(value: NativePointerValue => String): Self = StObject.set(x, "getPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: NativePointerValue => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValues(value: () => js.Array[Module]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
