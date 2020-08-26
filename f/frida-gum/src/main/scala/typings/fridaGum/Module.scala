package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
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
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
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
    def setBase(value: NativePointer): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnumerateExports(value: () => js.Array[ModuleExportDetails]): Self = this.set("enumerateExports", js.Any.fromFunction0(value))
    @scala.inline
    def setEnumerateImports(value: () => js.Array[ModuleImportDetails]): Self = this.set("enumerateImports", js.Any.fromFunction0(value))
    @scala.inline
    def setEnumerateRanges(value: PageProtection => js.Array[RangeDetails]): Self = this.set("enumerateRanges", js.Any.fromFunction1(value))
    @scala.inline
    def setEnumerateSymbols(value: () => js.Array[ModuleSymbolDetails]): Self = this.set("enumerateSymbols", js.Any.fromFunction0(value))
    @scala.inline
    def setFindExportByName(value: String => NativePointer | Null): Self = this.set("findExportByName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetExportByName(value: String => NativePointer): Self = this.set("getExportByName", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

