package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileContents extends StObject {
  
  var fileContents: String
  
  var filePath: String
  
  var nativeProjectRoot: String
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  var project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
}
object FileContents {
  
  inline def apply(
    fileContents: String,
    filePath: String,
    nativeProjectRoot: String,
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): FileContents = {
    val __obj = js.Dynamic.literal(fileContents = fileContents.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], nativeProjectRoot = nativeProjectRoot.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileContents]
  }
  
  extension [Self <: FileContents](x: Self) {
    
    inline def setFileContents(value: String): Self = StObject.set(x, "fileContents", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setNativeProjectRoot(value: String): Self = StObject.set(x, "nativeProjectRoot", value.asInstanceOf[js.Any])
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setProject(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
