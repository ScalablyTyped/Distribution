package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a KnowledgeOperationMetadata. */
trait IKnowledgeOperationMetadata extends StObject {
  
  /** KnowledgeOperationMetadata state */
  var state: js.UndefOr[
    State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State * / any */ String) | Null
  ] = js.undefined
}
object IKnowledgeOperationMetadata {
  
  @scala.inline
  def apply(): IKnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKnowledgeOperationMetadata]
  }
  
  @scala.inline
  implicit class IKnowledgeOperationMetadataMutableBuilder[Self <: IKnowledgeOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(
      value: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State * / any */ String)
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
