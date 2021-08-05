package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectId extends StObject {
  
  var projectId: js.UndefOr[String | Double] = js.undefined
}
object ProjectId {
  
  inline def apply(): ProjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectId]
  }
  
  extension [Self <: ProjectId](x: Self) {
    
    inline def setProjectId(value: String | Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
