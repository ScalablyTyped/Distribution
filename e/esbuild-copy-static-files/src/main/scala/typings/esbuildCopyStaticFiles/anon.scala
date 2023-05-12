package typings.esbuildCopyStaticFiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<esbuild-copy-static-files.esbuild-copy-static-files.CopyStaticFilesOptions> */
  trait PartialCopyStaticFilesOpt extends StObject {
    
    var dereference: js.UndefOr[Boolean] = js.undefined
    
    var dest: js.UndefOr[String] = js.undefined
    
    var errorOnExist: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[js.Function2[/* src */ String, /* dest */ String, Boolean]] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var preserveTimestamps: js.UndefOr[Boolean] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object PartialCopyStaticFilesOpt {
    
    inline def apply(): PartialCopyStaticFilesOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCopyStaticFilesOpt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialCopyStaticFilesOpt] (val x: Self) extends AnyVal {
      
      inline def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      inline def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setErrorOnExist(value: Boolean): Self = StObject.set(x, "errorOnExist", value.asInstanceOf[js.Any])
      
      inline def setErrorOnExistUndefined: Self = StObject.set(x, "errorOnExist", js.undefined)
      
      inline def setFilter(value: (/* src */ String, /* dest */ String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setPreserveTimestamps(value: Boolean): Self = StObject.set(x, "preserveTimestamps", value.asInstanceOf[js.Any])
      
      inline def setPreserveTimestampsUndefined: Self = StObject.set(x, "preserveTimestamps", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
