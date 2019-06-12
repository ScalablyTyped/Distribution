package typings
package fridaDashGumLib

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
  var name: java.lang.String = js.native
  /**
    * Full filesystem path.
    */
  var path: java.lang.String = js.native
  /**
    * Size in bytes.
    */
  var size: scala.Double = js.native
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
  def findExportByName(exportName: java.lang.String): NativePointer | scala.Null = js.native
  /**
    * Looks up the absolute address of the export named `exportName`.
    *
    * Throws an exception if the export doesn't exist.
    *
    * @param exportName Export name to find the address of.
    */
  def getExportByName(exportName: java.lang.String): NativePointer = js.native
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
  def ensureInitialized(name: java.lang.String): scala.Unit = js.native
  /**
    * Looks up the base address of the `name` module. Returns null if the module isn’t loaded.
    *
    * @param name Module name or path.
    */
  def findBaseAddress(name: java.lang.String): fridaDashGumLib.NativePointer | scala.Null = js.native
  /**
    * Looks up the absolute address of the export named `exportName` in `moduleName`. If the module isn’t known you may
    * pass null instead of its name, but this can be a costly search and should be avoided.
    *
    * Returns null if the module or export doesn't exist.
    *
    * @param moduleName Module name or path.
    * @param exportName Export name to find the address of.
    */
  def findExportByName(moduleName: java.lang.String, exportName: java.lang.String): fridaDashGumLib.NativePointer | scala.Null = js.native
  def findExportByName(moduleName: scala.Null, exportName: java.lang.String): fridaDashGumLib.NativePointer | scala.Null = js.native
  /**
    * Looks up the base address of the `name` module. Throws an exception if the module isn’t loaded.
    *
    * @param name Module name or path.
    */
  def getBaseAddress(name: java.lang.String): fridaDashGumLib.NativePointer = js.native
  /**
    * Looks up the absolute address of the export named `exportName` in `moduleName`. If the module isn’t known you may
    * pass null instead of its name, but this can be a costly search and should be avoided.
    *
    * Throws an exception if the module or export doesn't exist.
    *
    * @param moduleName Module name or path.
    * @param exportName Export name to find the address of.
    */
  def getExportByName(moduleName: java.lang.String, exportName: java.lang.String): fridaDashGumLib.NativePointer = js.native
  def getExportByName(moduleName: scala.Null, exportName: java.lang.String): fridaDashGumLib.NativePointer = js.native
  /**
    * Loads the specified module.
    */
  def load(name: java.lang.String): fridaDashGumLib.Module = js.native
}

