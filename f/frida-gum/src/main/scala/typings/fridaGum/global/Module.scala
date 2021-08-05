package typings.fridaGum.global

import typings.fridaGum.ModuleExportDetails
import typings.fridaGum.ModuleImportDetails
import typings.fridaGum.ModuleSymbolDetails
import typings.fridaGum.PageProtection
import typings.fridaGum.RangeDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Module")
@js.native
class Module ()
  extends StObject
     with typings.fridaGum.Module {
  
  /**
    * Base address.
    */
  /* CompleteClass */
  var base: typings.fridaGum.NativePointer = js.native
  
  /**
    * Enumerates exports of module.
    */
  /* CompleteClass */
  override def enumerateExports(): js.Array[ModuleExportDetails] = js.native
  
  /**
    * Enumerates imports of module.
    */
  /* CompleteClass */
  override def enumerateImports(): js.Array[ModuleImportDetails] = js.native
  
  /**
    * Enumerates memory ranges of module with the `name` as seen in `Process#enumerateModules()`.
    *
    * @param protection Minimum protection of ranges to include.
    */
  /* CompleteClass */
  override def enumerateRanges(protection: PageProtection): js.Array[RangeDetails] = js.native
  
  /**
    * Enumerates symbols of module.
    */
  /* CompleteClass */
  override def enumerateSymbols(): js.Array[ModuleSymbolDetails] = js.native
  
  /**
    * Looks up the absolute address of the export named `exportName`.
    *
    * Returns null if the export doesn't exist.
    *
    * @param exportName Export name to find the address of.
    */
  /* CompleteClass */
  override def findExportByName(exportName: String): typings.fridaGum.NativePointer | Null = js.native
  
  /**
    * Looks up the absolute address of the export named `exportName`.
    *
    * Throws an exception if the export doesn't exist.
    *
    * @param exportName Export name to find the address of.
    */
  /* CompleteClass */
  override def getExportByName(exportName: String): typings.fridaGum.NativePointer = js.native
  
  /**
    * Canonical module name.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Full filesystem path.
    */
  /* CompleteClass */
  var path: String = js.native
  
  /**
    * Size in bytes.
    */
  /* CompleteClass */
  var size: Double = js.native
}
object Module {
  
  @JSGlobal("Module")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Ensures that initializers of the specified module have been run. This is important during early instrumentation,
    * i.e. code run early in the process lifetime, to be able to safely interact with APIs.
    *
    * One such use-case is interacting with ObjC classes provided by a given module.
    */
  /* static member */
  inline def ensureInitialized(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureInitialized")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Looks up the base address of the `name` module. Returns null if the module isn’t loaded.
    *
    * @param name Module name or path.
    */
  /* static member */
  inline def findBaseAddress(name: String): typings.fridaGum.NativePointer | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findBaseAddress")(name.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.NativePointer | Null]
  
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
  inline def findExportByName(moduleName: String, exportName: String): typings.fridaGum.NativePointer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExportByName")(moduleName.asInstanceOf[js.Any], exportName.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.NativePointer | Null]
  inline def findExportByName(moduleName: Null, exportName: String): typings.fridaGum.NativePointer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExportByName")(moduleName.asInstanceOf[js.Any], exportName.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.NativePointer | Null]
  
  /**
    * Looks up the base address of the `name` module. Throws an exception if the module isn’t loaded.
    *
    * @param name Module name or path.
    */
  /* static member */
  inline def getBaseAddress(name: String): typings.fridaGum.NativePointer = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseAddress")(name.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.NativePointer]
  
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
  inline def getExportByName(moduleName: String, exportName: String): typings.fridaGum.NativePointer = (^.asInstanceOf[js.Dynamic].applyDynamic("getExportByName")(moduleName.asInstanceOf[js.Any], exportName.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.NativePointer]
  inline def getExportByName(moduleName: Null, exportName: String): typings.fridaGum.NativePointer = (^.asInstanceOf[js.Dynamic].applyDynamic("getExportByName")(moduleName.asInstanceOf[js.Any], exportName.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.NativePointer]
  
  /**
    * Loads the specified module.
    */
  /* static member */
  inline def load(name: String): typings.fridaGum.Module = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.Module]
}
