package typings.electronOsxSign

import typings.debug.mod.Debugger
import typings.electronOsxSign.distCjsTypesMod.BaseSignOptions
import typings.electronOsxSign.distCjsTypesMod.ElectronMacPlatform
import typings.node.childProcessMod.ExecFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsUtilMod {
  
  @JSImport("@electron/osx-sign/dist/cjs/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compactFlattenedList[T](list: DeepList[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compactFlattenedList")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @JSImport("@electron/osx-sign/dist/cjs/util", "debugLog")
  @js.native
  val debugLog: Debugger = js.native
  
  @JSImport("@electron/osx-sign/dist/cjs/util", "debugWarn")
  @js.native
  val debugWarn: Debugger = js.native
  
  inline def detectElectronPlatform(opts: BaseSignOptions): js.Promise[ElectronMacPlatform] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectElectronPlatform")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElectronMacPlatform]]
  
  inline def execFileAsync(file: String, args: js.Array[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileAsync")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def execFileAsync(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileAsync")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getAppContentsPath(opts: BaseSignOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppContentsPath")(opts.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getAppFrameworksPath(opts: BaseSignOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppFrameworksPath")(opts.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validateOptsApp(opts: BaseSignOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOptsApp")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def validateOptsPlatform(opts: BaseSignOptions): js.Promise[ElectronMacPlatform] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOptsPlatform")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElectronMacPlatform]]
  
  inline def walkAsync(dirPath: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("walkAsync")(dirPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  type DeepList[T] = js.Array[DeepListItem[T]]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type DeepListItem = null | T | std.Array<@electron/osx-sign.@electron/osx-sign/dist/cjs/util.DeepListItem<T>>
  }}}
  to avoid circular code involving: 
  - @electron/osx-sign.@electron/osx-sign/dist/cjs/util.DeepList
  - @electron/osx-sign.@electron/osx-sign/dist/cjs/util.DeepListItem
  */
  type DeepListItem[T] = Null | T | js.Array[Any]
}
