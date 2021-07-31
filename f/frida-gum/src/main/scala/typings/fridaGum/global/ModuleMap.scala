package typings.fridaGum.global

import typings.fridaGum.ModuleMapFilter
import typings.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ModuleMap")
@js.native
/**
  * Creates a new module map optimized for determining which module a given memory address belongs to, if any.
  * Takes a snapshot of the currently loaded modules when created, which may be refreshed by calling `update()`.
  *
  * The `filter` argument is optional and allows you to pass a function used for filtering the list of modules.
  * This is useful if you e.g. only care about modules owned by the application itself, and allows you to quickly
  * check if an address belongs to one of its modules. The filter function is given the module's details and must
  * return true for each module that should be kept in the map. It is called for each loaded module every time the
  * map is updated.
  *
  * @param filter Filter function to decide which modules are kept in the map.
  */
class ModuleMap ()
  extends StObject
     with typings.fridaGum.ModuleMap {
  def this(filter: ModuleMapFilter) = this()
  
  /**
    * Looks up a module by address. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  /* CompleteClass */
  override def find(address: NativePointerValue): typings.fridaGum.Module | Null = js.native
  
  /**
    * Just like `find()`, but only returns the `name` field, which means less overhead when you don’t need the
    * other details. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  /* CompleteClass */
  override def findName(address: NativePointerValue): String | Null = js.native
  
  /**
    * Just like `find()`, but only returns the `path` field, which means less overhead when you don’t need the
    * other details. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  /* CompleteClass */
  override def findPath(address: NativePointerValue): String | Null = js.native
  
  /**
    * Looks up a module by address. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  /* CompleteClass */
  override def get(address: NativePointerValue): typings.fridaGum.Module = js.native
  
  /**
    * Just like `get()`, but only returns the `name` field, which means less overhead when you don’t need the
    * other details. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  /* CompleteClass */
  override def getName(address: NativePointerValue): String = js.native
  
  /**
    * Just like `get()`, but only returns the `path` field, which means less overhead when you don’t need the
    * other details. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  /* CompleteClass */
  override def getPath(address: NativePointerValue): String = js.native
  
  /**
    * Determines if `address` belongs to any of the contained modules.
    *
    * @param address Address that might belong to a module in the map.
    */
  /* CompleteClass */
  override def has(address: NativePointerValue): Boolean = js.native
  
  /**
    * Updates the map.
    *
    * You should call this after a module has been loaded or unloaded to avoid operating on stale data.
    */
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /**
    * Gets the modules currently in the map. The returned array is a deep copy and will not mutate after a
    * call to `update()`.
    */
  /* CompleteClass */
  override def values(): js.Array[typings.fridaGum.Module] = js.native
}
