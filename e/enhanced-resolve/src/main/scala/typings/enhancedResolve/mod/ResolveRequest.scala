package typings.enhancedResolve.mod

import typings.enhancedResolve.enhancedResolveBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined enhanced-resolve.enhanced-resolve.BaseResolveRequest & std.Partial<enhanced-resolve.enhanced-resolve.ParsedIdentifier> */
trait ResolveRequest extends StObject {
  
  var descriptionFileData: js.UndefOr[js.Object] = js.undefined
  
  var descriptionFilePath: js.UndefOr[String] = js.undefined
  
  var descriptionFileRoot: js.UndefOr[String] = js.undefined
  
  var directory: js.UndefOr[Boolean] = js.undefined
  
  var file: js.UndefOr[Boolean] = js.undefined
  
  var fragment: js.UndefOr[String] = js.undefined
  
  var fullySpecified: js.UndefOr[Boolean] = js.undefined
  
  var ignoreSymlinks: js.UndefOr[Boolean] = js.undefined
  
  var internal: js.UndefOr[Boolean] = js.undefined
  
  var module: js.UndefOr[Boolean] = js.undefined
  
  var path: String | `false`
  
  var query: js.UndefOr[String] = js.undefined
  
  var relativePath: js.UndefOr[String] = js.undefined
  
  var request: js.UndefOr[String] = js.undefined
}
object ResolveRequest {
  
  inline def apply(path: String | `false`): ResolveRequest = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveRequest] (val x: Self) extends AnyVal {
    
    inline def setDescriptionFileData(value: js.Object): Self = StObject.set(x, "descriptionFileData", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFileDataUndefined: Self = StObject.set(x, "descriptionFileData", js.undefined)
    
    inline def setDescriptionFilePath(value: String): Self = StObject.set(x, "descriptionFilePath", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFilePathUndefined: Self = StObject.set(x, "descriptionFilePath", js.undefined)
    
    inline def setDescriptionFileRoot(value: String): Self = StObject.set(x, "descriptionFileRoot", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFileRootUndefined: Self = StObject.set(x, "descriptionFileRoot", js.undefined)
    
    inline def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setFullySpecified(value: Boolean): Self = StObject.set(x, "fullySpecified", value.asInstanceOf[js.Any])
    
    inline def setFullySpecifiedUndefined: Self = StObject.set(x, "fullySpecified", js.undefined)
    
    inline def setIgnoreSymlinks(value: Boolean): Self = StObject.set(x, "ignoreSymlinks", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSymlinksUndefined: Self = StObject.set(x, "ignoreSymlinks", js.undefined)
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setPath(value: String | `false`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
