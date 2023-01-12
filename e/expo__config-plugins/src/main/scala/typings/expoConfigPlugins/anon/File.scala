package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var file: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXFile */ Any
  
  var project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
}
object File {
  
  inline def apply(
    file: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXFile */ Any,
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    inline def setFile(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXFile */ Any
    ): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setProject(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
