package typings.googleCloudStorage.buildSrcStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketQuery extends StObject {
  
  var project: String
  
  var userProject: String
}
object CreateBucketQuery {
  
  inline def apply(project: String, userProject: String): CreateBucketQuery = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], userProject = userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketQuery]
  }
  
  extension [Self <: CreateBucketQuery](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
  }
}
