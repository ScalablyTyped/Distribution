package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an IntentBatch. */
trait IIntentBatch extends StObject {
  
  /** IntentBatch intents */
  var intents: js.UndefOr[js.Array[IIntent] | Null] = js.undefined
}
object IIntentBatch {
  
  inline def apply(): IIntentBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIntentBatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IIntentBatch] (val x: Self) extends AnyVal {
    
    inline def setIntents(value: js.Array[IIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsNull: Self = StObject.set(x, "intents", null)
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: IIntent*): Self = StObject.set(x, "intents", js.Array(value*))
  }
}
