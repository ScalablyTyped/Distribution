package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an EntityTypeBatch. */
trait IEntityTypeBatch extends StObject {
  
  /** EntityTypeBatch entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.undefined
}
object IEntityTypeBatch {
  
  inline def apply(): IEntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEntityTypeBatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEntityTypeBatch] (val x: Self) extends AnyVal {
    
    inline def setEntityTypes(value: js.Array[IEntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesNull: Self = StObject.set(x, "entityTypes", null)
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: IEntityType*): Self = StObject.set(x, "entityTypes", js.Array(value*))
  }
}
