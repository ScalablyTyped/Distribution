package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaErrorGroup extends StObject {
  
  /**
    * Group IDs are unique for a given project. If the same kind of error occurs in different service contexts, it will receive the same group ID.
    */
  var groupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The group resource name. Example: projects/my-project-123/groups/CNSgkpnppqKCUw
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Error group's resolution status. An unspecified resolution status will be interpreted as OPEN
    */
  var resolutionStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Associated tracking issues.
    */
  var trackingIssues: js.UndefOr[js.Array[SchemaTrackingIssue]] = js.undefined
}
object SchemaErrorGroup {
  
  inline def apply(): SchemaErrorGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorGroup]
  }
  
  extension [Self <: SchemaErrorGroup](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdNull: Self = StObject.set(x, "groupId", null)
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResolutionStatus(value: String): Self = StObject.set(x, "resolutionStatus", value.asInstanceOf[js.Any])
    
    inline def setResolutionStatusNull: Self = StObject.set(x, "resolutionStatus", null)
    
    inline def setResolutionStatusUndefined: Self = StObject.set(x, "resolutionStatus", js.undefined)
    
    inline def setTrackingIssues(value: js.Array[SchemaTrackingIssue]): Self = StObject.set(x, "trackingIssues", value.asInstanceOf[js.Any])
    
    inline def setTrackingIssuesUndefined: Self = StObject.set(x, "trackingIssues", js.undefined)
    
    inline def setTrackingIssuesVarargs(value: SchemaTrackingIssue*): Self = StObject.set(x, "trackingIssues", js.Array(value*))
  }
}
