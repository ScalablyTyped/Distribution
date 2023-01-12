package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFileToProject extends StObject {
  
  def addFileToProject(props: File): Unit
  
  var filepath: String
  
  var groupName: String
  
  var project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  
  var targetUuid: js.UndefOr[String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object AddFileToProject {
  
  inline def apply(
    addFileToProject: File => Unit,
    filepath: String,
    groupName: String,
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): AddFileToProject = {
    val __obj = js.Dynamic.literal(addFileToProject = js.Any.fromFunction1(addFileToProject), filepath = filepath.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFileToProject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddFileToProject] (val x: Self) extends AnyVal {
    
    inline def setAddFileToProject(value: File => Unit): Self = StObject.set(x, "addFileToProject", js.Any.fromFunction1(value))
    
    inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setProject(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setTargetUuid(value: String): Self = StObject.set(x, "targetUuid", value.asInstanceOf[js.Any])
    
    inline def setTargetUuidUndefined: Self = StObject.set(x, "targetUuid", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
