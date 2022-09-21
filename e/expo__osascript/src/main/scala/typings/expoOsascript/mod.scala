package typings.expoOsascript

import typings.expoSpawnAsync.mod.SpawnOptions
import typings.expoSpawnAsync.mod.SpawnResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@expo/osascript/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chooseAppAsync(listOfAppNames: js.Array[String]): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseAppAsync")(listOfAppNames.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  inline def chooseEditorAppAsync(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseEditorAppAsync")().asInstanceOf[js.Promise[String | Null]]
  inline def chooseEditorAppAsync(preferredEditor: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseEditorAppAsync")(preferredEditor.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  inline def chooseTerminalAppAsync(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseTerminalAppAsync")().asInstanceOf[js.Promise[String | Null]]
  
  inline def execAsync(script: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("execAsync")(script.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def execAsync(
    script: String,
    opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExecAsyncOptions */ Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execAsync")(script.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def execAsync(script: js.Array[String]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("execAsync")(script.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def execAsync(
    script: js.Array[String],
    opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExecAsyncOptions */ Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execAsync")(script.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def isAppRunningAsync(appName: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppRunningAsync")(appName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def openFinderToFolderAsync(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openFinderToFolderAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def openFinderToFolderAsync(dir: String, activate: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFinderToFolderAsync")(dir.asInstanceOf[js.Any], activate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def openFolderInTerminalAppAsync(dir: String): js.Promise[SpawnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("openFolderInTerminalAppAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SpawnResult]]
  inline def openFolderInTerminalAppAsync(dir: String, inTab: Boolean): js.Promise[SpawnResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFolderInTerminalAppAsync")(dir.asInstanceOf[js.Any], inTab.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SpawnResult]]
  
  inline def openInAppAsync(appName: String, pth: String): js.Promise[SpawnResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openInAppAsync")(appName.asInstanceOf[js.Any], pth.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SpawnResult]]
  
  inline def openInEditorAsync(pth: String): js.Promise[SpawnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("openInEditorAsync")(pth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SpawnResult]]
  inline def openInEditorAsync(pth: String, preferredEditor: String): js.Promise[SpawnResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openInEditorAsync")(pth.asInstanceOf[js.Any], preferredEditor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SpawnResult]]
  
  inline def openItermToSpecificFolderAsync(dir: String): js.Promise[SpawnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("openItermToSpecificFolderAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SpawnResult]]
  
  inline def openTerminalToSpecificFolderAsync(dir: String): js.Promise[SpawnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("openTerminalToSpecificFolderAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SpawnResult]]
  inline def openTerminalToSpecificFolderAsync(dir: String, inTab: Boolean): js.Promise[SpawnResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openTerminalToSpecificFolderAsync")(dir.asInstanceOf[js.Any], inTab.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SpawnResult]]
  
  inline def safeIdOfAppAsync(appName: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeIdOfAppAsync")(appName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  inline def spawnAsync(script: String): js.Promise[SpawnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnAsync")(script.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SpawnResult]]
  inline def spawnAsync(script: String, opts: SpawnOptions): js.Promise[SpawnResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnAsync")(script.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SpawnResult]]
  inline def spawnAsync(script: js.Array[String]): js.Promise[SpawnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnAsync")(script.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SpawnResult]]
  inline def spawnAsync(script: js.Array[String], opts: SpawnOptions): js.Promise[SpawnResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnAsync")(script.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SpawnResult]]
}
