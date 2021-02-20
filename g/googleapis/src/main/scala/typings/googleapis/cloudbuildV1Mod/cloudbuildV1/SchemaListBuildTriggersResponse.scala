package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response containing existing `BuildTriggers`.
  */
@js.native
trait SchemaListBuildTriggersResponse extends StObject {
  
  /**
    * Token to receive the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * `BuildTriggers` for the project, sorted by `create_time` descending.
    */
  var triggers: js.UndefOr[js.Array[SchemaBuildTrigger]] = js.native
}
object SchemaListBuildTriggersResponse {
  
  @scala.inline
  def apply(): SchemaListBuildTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBuildTriggersResponse]
  }
  
  @scala.inline
  implicit class SchemaListBuildTriggersResponseMutableBuilder[Self <: SchemaListBuildTriggersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTriggers(value: js.Array[SchemaBuildTrigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: SchemaBuildTrigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
  }
}
