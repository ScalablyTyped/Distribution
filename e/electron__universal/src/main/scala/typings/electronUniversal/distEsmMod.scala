package typings.electronUniversal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmMod {
  
  @JSImport("@electron/universal/dist/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeUniversalApp(opts: MakeUniversalOpts): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeUniversalApp")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait MakeUniversalOpts extends StObject {
    
    /**
      * Absolute file system path to the arm64 version of your application.  E.g. /Foo/bar/MyApp_arm64.app
      */
    var arm64AppPath: String
    
    /**
      * Forcefully overwrite any existing files that are in the way of generating the universal application
      */
    var force: Boolean
    
    /**
      * Merge x64 and arm64 ASARs into one.
      */
    var mergeASARs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Absolute file system path you want the universal app to be written to.  E.g. /Foo/var/MyApp_universal.app
      *
      * If this file exists it will be overwritten ONLY if "force" is set to true
      */
    var outAppPath: String
    
    /**
      * Minimatch pattern of paths that are allowed to be present in one of the ASAR files, but not in the other.
      */
    var singleArchFiles: js.UndefOr[String] = js.undefined
    
    /**
      * Absolute file system path to the x64 version of your application.  E.g. /Foo/bar/MyApp_x64.app
      */
    var x64AppPath: String
    
    /**
      * Minimatch pattern of binaries that are expected to be the same x64 binary in both of the ASAR files.
      */
    var x64ArchFiles: js.UndefOr[String] = js.undefined
  }
  object MakeUniversalOpts {
    
    inline def apply(arm64AppPath: String, force: Boolean, outAppPath: String, x64AppPath: String): MakeUniversalOpts = {
      val __obj = js.Dynamic.literal(arm64AppPath = arm64AppPath.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], outAppPath = outAppPath.asInstanceOf[js.Any], x64AppPath = x64AppPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[MakeUniversalOpts]
    }
    
    extension [Self <: MakeUniversalOpts](x: Self) {
      
      inline def setArm64AppPath(value: String): Self = StObject.set(x, "arm64AppPath", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setMergeASARs(value: Boolean): Self = StObject.set(x, "mergeASARs", value.asInstanceOf[js.Any])
      
      inline def setMergeASARsUndefined: Self = StObject.set(x, "mergeASARs", js.undefined)
      
      inline def setOutAppPath(value: String): Self = StObject.set(x, "outAppPath", value.asInstanceOf[js.Any])
      
      inline def setSingleArchFiles(value: String): Self = StObject.set(x, "singleArchFiles", value.asInstanceOf[js.Any])
      
      inline def setSingleArchFilesUndefined: Self = StObject.set(x, "singleArchFiles", js.undefined)
      
      inline def setX64AppPath(value: String): Self = StObject.set(x, "x64AppPath", value.asInstanceOf[js.Any])
      
      inline def setX64ArchFiles(value: String): Self = StObject.set(x, "x64ArchFiles", value.asInstanceOf[js.Any])
      
      inline def setX64ArchFilesUndefined: Self = StObject.set(x, "x64ArchFiles", js.undefined)
    }
  }
}
