package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an EntityTypeBatch. */
@js.native
trait IEntityTypeBatch extends StObject {
  
  /** EntityTypeBatch entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.native
}
object IEntityTypeBatch {
  
  @scala.inline
  def apply(): IEntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEntityTypeBatch]
  }
  
  @scala.inline
  implicit class IEntityTypeBatchMutableBuilder[Self <: IEntityTypeBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: js.Array[IEntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesNull: Self = StObject.set(x, "entityTypes", null)
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: IEntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
  }
}
