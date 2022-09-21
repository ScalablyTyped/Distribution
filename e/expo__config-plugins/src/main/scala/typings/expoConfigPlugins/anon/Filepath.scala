package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filepath extends StObject {
  
  var filepath: String
  
  var groupName: String
  
  var isBuildFile: js.UndefOr[Boolean] = js.undefined
  
  var project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  
  var targetUuid: js.UndefOr[String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object Filepath {
  
  inline def apply(
    filepath: String,
    groupName: String,
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): Filepath = {
    val __obj = js.Dynamic.literal(filepath = filepath.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filepath]
  }
  
  extension [Self <: Filepath](x: Self) {
    
    inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setIsBuildFile(value: Boolean): Self = StObject.set(x, "isBuildFile", value.asInstanceOf[js.Any])
    
    inline def setIsBuildFileUndefined: Self = StObject.set(x, "isBuildFile", js.undefined)
    
    inline def setProject(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setTargetUuid(value: String): Self = StObject.set(x, "targetUuid", value.asInstanceOf[js.Any])
    
    inline def setTargetUuidUndefined: Self = StObject.set(x, "targetUuid", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
