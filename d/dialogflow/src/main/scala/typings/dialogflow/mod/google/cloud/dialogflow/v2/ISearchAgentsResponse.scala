package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SearchAgentsResponse. */
trait ISearchAgentsResponse extends StObject {
  
  /** SearchAgentsResponse agents */
  var agents: js.UndefOr[js.Array[IAgent] | Null] = js.undefined
  
  /** SearchAgentsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object ISearchAgentsResponse {
  
  @scala.inline
  def apply(): ISearchAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISearchAgentsResponse]
  }
  
  @scala.inline
  implicit class ISearchAgentsResponseMutableBuilder[Self <: ISearchAgentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgents(value: js.Array[IAgent]): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentsNull: Self = StObject.set(x, "agents", null)
    
    @scala.inline
    def setAgentsUndefined: Self = StObject.set(x, "agents", js.undefined)
    
    @scala.inline
    def setAgentsVarargs(value: IAgent*): Self = StObject.set(x, "agents", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
