package typings.electronUniversal

import typings.electronUniversal.anon.Algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asarUtilsMod {
  
  @JSImport("@electron/universal/dist/cjs/asar-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait AsarMode extends StObject
  @JSImport("@electron/universal/dist/cjs/asar-utils", "AsarMode")
  @js.native
  object AsarMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AsarMode & Double] = js.native
    
    @js.native
    sealed trait HAS_ASAR
      extends StObject
         with AsarMode
    /* 1 */ val HAS_ASAR: typings.electronUniversal.asarUtilsMod.AsarMode.HAS_ASAR & Double = js.native
    
    @js.native
    sealed trait NO_ASAR
      extends StObject
         with AsarMode
    /* 0 */ val NO_ASAR: typings.electronUniversal.asarUtilsMod.AsarMode.NO_ASAR & Double = js.native
  }
  
  inline def detectAsarMode(appPath: String): js.Promise[AsarMode] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectAsarMode")(appPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AsarMode]]
  
  inline def generateAsarIntegrity(asarPath: String): Algorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAsarIntegrity")(asarPath.asInstanceOf[js.Any]).asInstanceOf[Algorithm]
  
  inline def mergeASARs(hasX64AsarPathArm64AsarPathOutputAsarPathSingleArchFiles: MergeASARsOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeASARs")(hasX64AsarPathArm64AsarPathOutputAsarPathSingleArchFiles.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait MergeASARsOptions extends StObject {
    
    var arm64AsarPath: String
    
    var outputAsarPath: String
    
    var singleArchFiles: js.UndefOr[String] = js.undefined
    
    var x64AsarPath: String
  }
  object MergeASARsOptions {
    
    inline def apply(arm64AsarPath: String, outputAsarPath: String, x64AsarPath: String): MergeASARsOptions = {
      val __obj = js.Dynamic.literal(arm64AsarPath = arm64AsarPath.asInstanceOf[js.Any], outputAsarPath = outputAsarPath.asInstanceOf[js.Any], x64AsarPath = x64AsarPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeASARsOptions]
    }
    
    extension [Self <: MergeASARsOptions](x: Self) {
      
      inline def setArm64AsarPath(value: String): Self = StObject.set(x, "arm64AsarPath", value.asInstanceOf[js.Any])
      
      inline def setOutputAsarPath(value: String): Self = StObject.set(x, "outputAsarPath", value.asInstanceOf[js.Any])
      
      inline def setSingleArchFiles(value: String): Self = StObject.set(x, "singleArchFiles", value.asInstanceOf[js.Any])
      
      inline def setSingleArchFilesUndefined: Self = StObject.set(x, "singleArchFiles", js.undefined)
      
      inline def setX64AsarPath(value: String): Self = StObject.set(x, "x64AsarPath", value.asInstanceOf[js.Any])
    }
  }
}
