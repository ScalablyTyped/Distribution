package typings.esbuildCopyStaticFiles

import typings.esbuildCopyStaticFiles.anon.PartialCopyStaticFilesOpt
import typings.esbuildCopyStaticFiles.esbuildCopyStaticFilesStrings.`copy-static-files`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esbuild-copy-static-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): CopyStaticFilesPluginInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[CopyStaticFilesPluginInstance]
  inline def default(options: PartialCopyStaticFilesOpt): CopyStaticFilesPluginInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[CopyStaticFilesPluginInstance]
  
  trait CopyStaticFilesOptions extends StObject {
    
    var dereference: Boolean
    
    var dest: String
    
    var errorOnExist: Boolean
    
    def filter(src: String, dest: String): Boolean
    
    var force: Boolean
    
    var preserveTimestamps: Boolean
    
    var recursive: Boolean
    
    var src: String
  }
  object CopyStaticFilesOptions {
    
    inline def apply(
      dereference: Boolean,
      dest: String,
      errorOnExist: Boolean,
      filter: (String, String) => Boolean,
      force: Boolean,
      preserveTimestamps: Boolean,
      recursive: Boolean,
      src: String
    ): CopyStaticFilesOptions = {
      val __obj = js.Dynamic.literal(dereference = dereference.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], errorOnExist = errorOnExist.asInstanceOf[js.Any], filter = js.Any.fromFunction2(filter), force = force.asInstanceOf[js.Any], preserveTimestamps = preserveTimestamps.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyStaticFilesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CopyStaticFilesOptions] (val x: Self) extends AnyVal {
      
      inline def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setErrorOnExist(value: Boolean): Self = StObject.set(x, "errorOnExist", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: (String, String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setPreserveTimestamps(value: Boolean): Self = StObject.set(x, "preserveTimestamps", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait CopyStaticFilesPluginInstance extends StObject {
    
    var name: `copy-static-files`
    
    def setup(build: Any): Unit
  }
  object CopyStaticFilesPluginInstance {
    
    inline def apply(setup: Any => Unit): CopyStaticFilesPluginInstance = {
      val __obj = js.Dynamic.literal(name = "copy-static-files", setup = js.Any.fromFunction1(setup))
      __obj.asInstanceOf[CopyStaticFilesPluginInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CopyStaticFilesPluginInstance] (val x: Self) extends AnyVal {
      
      inline def setName(value: `copy-static-files`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSetup(value: Any => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
    }
  }
}
