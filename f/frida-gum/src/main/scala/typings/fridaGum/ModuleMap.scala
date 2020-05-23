package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleMap extends js.Object {
  /**
    * Looks up a module by address. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def find(address: NativePointerValue): Module | Null
  /**
    * Just like `find()`, but only returns the `name` field, which means less overhead when you don’t need the
    * other details. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def findName(address: NativePointerValue): String | Null
  /**
    * Just like `find()`, but only returns the `path` field, which means less overhead when you don’t need the
    * other details. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def findPath(address: NativePointerValue): String | Null
  /**
    * Looks up a module by address. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def get(address: NativePointerValue): Module
  /**
    * Just like `get()`, but only returns the `name` field, which means less overhead when you don’t need the
    * other details. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def getName(address: NativePointerValue): String
  /**
    * Just like `get()`, but only returns the `path` field, which means less overhead when you don’t need the
    * other details. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def getPath(address: NativePointerValue): String
  /**
    * Determines if `address` belongs to any of the contained modules.
    *
    * @param address Address that might belong to a module in the map.
    */
  def has(address: NativePointerValue): Boolean
  /**
    * Updates the map.
    *
    * You should call this after a module has been loaded or unloaded to avoid operating on stale data.
    */
  def update(): Unit
  /**
    * Gets the modules currently in the map. The returned array is a deep copy and will not mutate after a
    * call to `update()`.
    */
  def values(): js.Array[Module]
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
}

