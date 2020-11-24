package typings.fridaGum.global

import typings.fridaGum.ModuleMapFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  extends typings.fridaGum.ModuleMap {
  def this(filter: ModuleMapFilter) = this()
}
