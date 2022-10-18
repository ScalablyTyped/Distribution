package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectName extends StObject {
  
  var project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  
  var projectName: String
}
object ProjectName {
  
  inline def apply(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
    projectName: String
  ): ProjectName = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectName]
  }
  
  extension [Self <: ProjectName](x: Self) {
    
    inline def setProject(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
