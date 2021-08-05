package typings.galactus

import typings.floraColossus.walkerMod.Module
import typings.galactus.anon.RelativePaths
import typings.galactus.anon.RootDirectory
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object destroyerOfModulesMod {
  
  @JSImport("galactus/lib/DestroyerOfModules", "DestroyerOfModules")
  @js.native
  class DestroyerOfModules protected () extends StObject {
    def this(hasRootDirectoryWalkerShouldKeepModuleTest: RootDirectory) = this()
    
    def collectKeptModules(hasRelativePaths: RelativePaths): js.Promise[ModuleMap] = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def destroyModule(modulePath: String, moduleMap: ModuleMap): js.Promise[Unit] = js.native
    
    /* private */ var shouldKeepFn: js.Any = js.native
    
    /* private */ def shouldKeepModule(module: js.Any): js.Any = js.native
    
    /* private */ var walker: js.Any = js.native
  }
  
  type ModuleMap = Map[String, Module]
  
  type ShouldKeepModuleTest = js.Function2[/* module */ Module, /* isDevDep */ Boolean, Boolean]
}
