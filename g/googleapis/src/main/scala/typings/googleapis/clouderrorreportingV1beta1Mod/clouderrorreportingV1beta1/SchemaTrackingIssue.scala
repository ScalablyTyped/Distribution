package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrackingIssue extends StObject {
  
  /**
    * A URL pointing to a related entry in an issue tracking system. Example: `https://github.com/user/project/issues/4`
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaTrackingIssue {
  
  inline def apply(): SchemaTrackingIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrackingIssue]
  }
  
  extension [Self <: SchemaTrackingIssue](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
