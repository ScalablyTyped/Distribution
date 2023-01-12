package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectName extends StObject {
  
  var bridgingHeader: String
  
  var project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  
  var projectName: String
  
  var projectRoot: String
}
object ProjectName {
  
  inline def apply(
    bridgingHeader: String,
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
    projectName: String,
    projectRoot: String
  ): ProjectName = {
    val __obj = js.Dynamic.literal(bridgingHeader = bridgingHeader.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectName] (val x: Self) extends AnyVal {
    
    inline def setBridgingHeader(value: String): Self = StObject.set(x, "bridgingHeader", value.asInstanceOf[js.Any])
    
    inline def setProject(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
  }
}
