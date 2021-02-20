package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an IntentBatch. */
@js.native
trait IIntentBatch extends StObject {
  
  /** IntentBatch intents */
  var intents: js.UndefOr[js.Array[IIntent] | Null] = js.native
}
object IIntentBatch {
  
  @scala.inline
  def apply(): IIntentBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIntentBatch]
  }
  
  @scala.inline
  implicit class IIntentBatchMutableBuilder[Self <: IIntentBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntents(value: js.Array[IIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsNull: Self = StObject.set(x, "intents", null)
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: IIntent*): Self = StObject.set(x, "intents", js.Array(value :_*))
  }
}
