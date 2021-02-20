package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.IEntity
import typings.dialogflow.mod.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SessionEntityType. */
@js.native
trait ISessionEntityType extends StObject {
  
  /** SessionEntityType entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.native
  
  /** SessionEntityType entityOverrideMode */
  var entityOverrideMode: js.UndefOr[
    EntityOverrideMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode * / any */ String) | Null
  ] = js.native
  
  /** SessionEntityType name */
  var name: js.UndefOr[String | Null] = js.native
}
object ISessionEntityType {
  
  @scala.inline
  def apply(): ISessionEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISessionEntityType]
  }
  
  @scala.inline
  implicit class ISessionEntityTypeMutableBuilder[Self <: ISessionEntityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[IEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesNull: Self = StObject.set(x, "entities", null)
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: IEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setEntityOverrideMode(
      value: EntityOverrideMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode * / any */ String)
    ): Self = StObject.set(x, "entityOverrideMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityOverrideModeNull: Self = StObject.set(x, "entityOverrideMode", null)
    
    @scala.inline
    def setEntityOverrideModeUndefined: Self = StObject.set(x, "entityOverrideMode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
