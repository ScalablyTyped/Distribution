package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  /**
    * Base address.
    */
  var base: NativePointer
  /**
    * Canonical module name.
    */
  var name: String
  /**
    * Full filesystem path.
    */
  var path: String
  /**
    * Size in bytes.
    */
  var size: Double
  /**
    * Enumerates exports of module.
    */
  def enumerateExports(): js.Array[ModuleExportDetails]
  /**
    * Enumerates imports of module.
    */
  def enumerateImports(): js.Array[ModuleImportDetails]
  /**
    * Enumerates memory ranges of module with the `name` as seen in `Process#enumerateModules()`.
    *
    * @param protection Minimum protection of ranges to include.
    */
  def enumerateRanges(protection: PageProtection): js.Array[RangeDetails]
  /**
    * Enumerates symbols of module.
    */
  def enumerateSymbols(): js.Array[ModuleSymbolDetails]
  /**
    * Looks up the absolute address of the export named `exportName`.
    *
    * Returns null if the export doesn't exist.
    *
    * @param exportName Export name to find the address of.
    */
  def findExportByName(exportName: String): NativePointer | Null
  /**
    * Looks up the absolute address of the export named `exportName`.
    *
    * Throws an exception if the export doesn't exist.
    *
    * @param exportName Export name to find the address of.
    */
  def getExportByName(exportName: String): NativePointer
}

object Module {
  @scala.inline
  def apply(
    base: NativePointer,
    enumerateExports: () => js.Array[ModuleExportDetails],
    enumerateImports: () => js.Array[ModuleImportDetails],
    enumerateRanges: PageProtection => js.Array[RangeDetails],
    enumerateSymbols: () => js.Array[ModuleSymbolDetails],
    findExportByName: String => NativePointer | Null,
    getExportByName: String => NativePointer,
    name: String,
    path: String,
    size: Double
  ): Module = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], enumerateExports = js.Any.fromFunction0(enumerateExports), enumerateImports = js.Any.fromFunction0(enumerateImports), enumerateRanges = js.Any.fromFunction1(enumerateRanges), enumerateSymbols = js.Any.fromFunction0(enumerateSymbols), findExportByName = js.Any.fromFunction1(findExportByName), getExportByName = js.Any.fromFunction1(getExportByName), name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

