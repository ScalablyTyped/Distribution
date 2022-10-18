package typings.galactus

import typings.floraColossus.libWalkerMod.Module
import typings.galactus.anon.RelativePaths
import typings.galactus.anon.RootDirectory
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDestroyerOfModulesMod {
  
  @JSImport("galactus/lib/DestroyerOfModules", "DestroyerOfModules")
  @js.native
  open class DestroyerOfModules protected () extends StObject {
    def this(hasRootDirectoryWalkerShouldKeepModuleTest: RootDirectory) = this()
    
    def collectKeptModules(hasRelativePaths: RelativePaths): js.Promise[ModuleMap] = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def destroyModule(modulePath: String, moduleMap: ModuleMap): js.Promise[Unit] = js.native
    
    /* private */ var shouldKeepFn: Any = js.native
    
    /* private */ def shouldKeepModule(module: Any): Any = js.native
    
    /* private */ var walker: Any = js.native
  }
  
  type ModuleMap = Map[String, Module]
  
  type ShouldKeepModuleTest = js.Function2[/* module */ Module, /* isDevDep */ Boolean, Boolean]
}
