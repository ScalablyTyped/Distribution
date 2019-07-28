package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Module")
@js.native
class Module () extends js.Object {
  /**
    * Base address.
    */
  var base: NativePointer = js.native
  /**
    * Canonical module name.
    */
  var name: String = js.native
  /**
    * Full filesystem path.
    */
  var path: String = js.native
  /**
    * Size in bytes.
    */
  var size: Double = js.native
  /**
    * Enumerates exports of module.
    */
  def enumerateExports(): js.Array[ModuleExportDetails] = js.native
  /**
    * Enumerates imports of module.
    */
  def enumerateImports(): js.Array[ModuleImportDetails] = js.native
  /**
    * Enumerates memory ranges of module with the `name` as seen in `Process#enumerateModules()`.
    *
    * @param protection Minimum protection of ranges to include.
    */
  def enumerateRanges(protection: PageProtection): js.Array[RangeDetails] = js.native
  /**
    * Enumerates symbols of module.
    */
  def enumerateSymbols(): js.Array[ModuleSymbolDetails] = js.native
  /**
    * Looks up the absolute address of the export named `exportName`.
    *
    * Returns null if the export doesn't exist.
    *
    * @param exportName Export name to find the address of.
    */
  def findExportByName(exportName: String): NativePointer | Null = js.native
  /**
    * Looks up the absolute address of the export named `exportName`.
    *
    * Throws an exception if the export doesn't exist.
    *
    * @param exportName Export name to find the address of.
    */
  def getExportByName(exportName: String): NativePointer = js.native
}

/* static members */
@JSGlobal("Module")
@js.native
object Module extends js.Object {
  /**
    * Ensures that initializers of the specified module have been run. This is important during early instrumentation,
    * i.e. code run early in the process lifetime, to be able to safely interact with APIs.
    *
    * One such use-case is interacting with ObjC classes provided by a given module.
    */
  def ensureInitialized(name: String): Unit = js.native
  /**
    * Looks up the base address of the `name` module. Returns null if the module isn’t loaded.
    *
    * @param name Module name or path.
    */
  def findBaseAddress(name: String): NativePointer | Null = js.native
  /**
    * Looks up the absolute address of the export named `exportName` in `moduleName`. If the module isn’t known you may
    * pass null instead of its name, but this can be a costly search and should be avoided.
    *
    * Returns null if the module or export doesn't exist.
    *
    * @param moduleName Module name or path.
    * @param exportName Export name to find the address of.
    */
  def findExportByName(moduleName: String, exportName: String): NativePointer | Null = js.native
  def findExportByName(moduleName: Null, exportName: String): NativePointer | Null = js.native
  /**
    * Looks up the base address of the `name` module. Throws an exception if the module isn’t loaded.
    *
    * @param name Module name or path.
    */
  def getBaseAddress(name: String): NativePointer = js.native
  /**
    * Looks up the absolute address of the export named `exportName` in `moduleName`. If the module isn’t known you may
    * pass null instead of its name, but this can be a costly search and should be avoided.
    *
    * Throws an exception if the module or export doesn't exist.
    *
    * @param moduleName Module name or path.
    * @param exportName Export name to find the address of.
    */
  def getExportByName(moduleName: String, exportName: String): NativePointer = js.native
  def getExportByName(moduleName: Null, exportName: String): NativePointer = js.native
  /**
    * Loads the specified module.
    */
  def load(name: String): Module = js.native
}

