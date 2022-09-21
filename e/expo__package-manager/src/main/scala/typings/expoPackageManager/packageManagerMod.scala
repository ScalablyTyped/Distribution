package typings.expoPackageManager

import typings.expoSpawnAsync.mod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageManagerMod {
  
  @JSImport("@expo/package-manager/build/PackageManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPossibleProjectRoot(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPossibleProjectRoot")().asInstanceOf[String]
  
  inline def spawnSudoAsync(command: js.Array[String], spawnOptions: SpawnOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSudoAsync")(command.asInstanceOf[js.Any], spawnOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @js.native
  trait Logger extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait PackageManager extends StObject {
    
    def addAsync(names: String*): js.Promise[Unit]
    
    def addDevAsync(names: String*): js.Promise[Unit]
    
    def addWithParametersAsync(names: js.Array[String], parameters: js.Array[String]): js.Promise[Unit]
    
    def cleanAsync(): js.Promise[Unit]
    
    def getConfigAsync(key: String): js.Promise[String]
    
    def installAsync(): js.Promise[Unit]
    
    def removeLockfileAsync(): js.Promise[Unit]
    
    def versionAsync(): js.Promise[String]
  }
  object PackageManager {
    
    inline def apply(
      addAsync: /* repeated */ String => js.Promise[Unit],
      addDevAsync: /* repeated */ String => js.Promise[Unit],
      addWithParametersAsync: (js.Array[String], js.Array[String]) => js.Promise[Unit],
      cleanAsync: () => js.Promise[Unit],
      getConfigAsync: String => js.Promise[String],
      installAsync: () => js.Promise[Unit],
      removeLockfileAsync: () => js.Promise[Unit],
      versionAsync: () => js.Promise[String]
    ): PackageManager = {
      val __obj = js.Dynamic.literal(addAsync = js.Any.fromFunction1(addAsync), addDevAsync = js.Any.fromFunction1(addDevAsync), addWithParametersAsync = js.Any.fromFunction2(addWithParametersAsync), cleanAsync = js.Any.fromFunction0(cleanAsync), getConfigAsync = js.Any.fromFunction1(getConfigAsync), installAsync = js.Any.fromFunction0(installAsync), removeLockfileAsync = js.Any.fromFunction0(removeLockfileAsync), versionAsync = js.Any.fromFunction0(versionAsync))
      __obj.asInstanceOf[PackageManager]
    }
    
    extension [Self <: PackageManager](x: Self) {
      
      inline def setAddAsync(value: /* repeated */ String => js.Promise[Unit]): Self = StObject.set(x, "addAsync", js.Any.fromFunction1(value))
      
      inline def setAddDevAsync(value: /* repeated */ String => js.Promise[Unit]): Self = StObject.set(x, "addDevAsync", js.Any.fromFunction1(value))
      
      inline def setAddWithParametersAsync(value: (js.Array[String], js.Array[String]) => js.Promise[Unit]): Self = StObject.set(x, "addWithParametersAsync", js.Any.fromFunction2(value))
      
      inline def setCleanAsync(value: () => js.Promise[Unit]): Self = StObject.set(x, "cleanAsync", js.Any.fromFunction0(value))
      
      inline def setGetConfigAsync(value: String => js.Promise[String]): Self = StObject.set(x, "getConfigAsync", js.Any.fromFunction1(value))
      
      inline def setInstallAsync(value: () => js.Promise[Unit]): Self = StObject.set(x, "installAsync", js.Any.fromFunction0(value))
      
      inline def setRemoveLockfileAsync(value: () => js.Promise[Unit]): Self = StObject.set(x, "removeLockfileAsync", js.Any.fromFunction0(value))
      
      inline def setVersionAsync(value: () => js.Promise[String]): Self = StObject.set(x, "versionAsync", js.Any.fromFunction0(value))
    }
  }
}
