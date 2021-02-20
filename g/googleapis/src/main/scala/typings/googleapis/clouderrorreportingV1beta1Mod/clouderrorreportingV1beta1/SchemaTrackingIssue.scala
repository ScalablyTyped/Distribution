package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information related to tracking the progress on resolving the error.
  */
@js.native
trait SchemaTrackingIssue extends StObject {
  
  /**
    * A URL pointing to a related entry in an issue tracking system. Example:
    * https://github.com/user/project/issues/4
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaTrackingIssue {
  
  @scala.inline
  def apply(): SchemaTrackingIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrackingIssue]
  }
  
  @scala.inline
  implicit class SchemaTrackingIssueMutableBuilder[Self <: SchemaTrackingIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
