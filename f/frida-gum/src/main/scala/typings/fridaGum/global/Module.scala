package typings.fridaGum.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Module")
@js.native
class Module ()
  extends typings.fridaGum.Module
object Module {
  
  /**
    * Ensures that initializers of the specified module have been run. This is important during early instrumentation,
    * i.e. code run early in the process lifetime, to be able to safely interact with APIs.
    *
    * One such use-case is interacting with ObjC classes provided by a given module.
    */
  /* static member */
  @JSGlobal("Module.ensureInitialized")
  @js.native
  def ensureInitialized(name: String): Unit = js.native
  
  /**
    * Looks up the base address of the `name` module. Returns null if the module isn’t loaded.
    *
    * @param name Module name or path.
    */
  /* static member */
  @JSGlobal("Module.findBaseAddress")
  @js.native
  def findBaseAddress(name: String): typings.fridaGum.NativePointer | Null = js.native
  
  /**
    * Looks up the absolute address of the export named `exportName` in `moduleName`. If the module isn’t known you may
    * pass null instead of its name, but this can be a costly search and should be avoided.
    *
    * Returns null if the module or export doesn't exist.
    *
    * @param moduleName Module name or path.
    * @param exportName Export name to find the address of.
    */
  /* static member */
  @JSGlobal("Module.findExportByName")
  @js.native
  def findExportByName(moduleName: String, exportName: String): typings.fridaGum.NativePointer | Null = js.native
  @JSGlobal("Module.findExportByName")
  @js.native
  def findExportByName(moduleName: Null, exportName: String): typings.fridaGum.NativePointer | Null = js.native
  
  /**
    * Looks up the base address of the `name` module. Throws an exception if the module isn’t loaded.
    *
    * @param name Module name or path.
    */
  /* static member */
  @JSGlobal("Module.getBaseAddress")
  @js.native
  def getBaseAddress(name: String): typings.fridaGum.NativePointer = js.native
  
  /**
    * Looks up the absolute address of the export named `exportName` in `moduleName`. If the module isn’t known you may
    * pass null instead of its name, but this can be a costly search and should be avoided.
    *
    * Throws an exception if the module or export doesn't exist.
    *
    * @param moduleName Module name or path.
    * @param exportName Export name to find the address of.
    */
  /* static member */
  @JSGlobal("Module.getExportByName")
  @js.native
  def getExportByName(moduleName: String, exportName: String): typings.fridaGum.NativePointer = js.native
  @JSGlobal("Module.getExportByName")
  @js.native
  def getExportByName(moduleName: Null, exportName: String): typings.fridaGum.NativePointer = js.native
  
  /**
    * Loads the specified module.
    */
  /* static member */
  @JSGlobal("Module.load")
  @js.native
  def load(name: String): typings.fridaGum.Module = js.native
}
