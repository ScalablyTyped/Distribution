package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.IEntity
import typings.dialogflow.mod.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SessionEntityType. */
trait ISessionEntityType extends StObject {
  
  /** SessionEntityType entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.undefined
  
  /** SessionEntityType entityOverrideMode */
  var entityOverrideMode: js.UndefOr[
    EntityOverrideMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode * / any */ String) | Null
  ] = js.undefined
  
  /** SessionEntityType name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object ISessionEntityType {
  
  inline def apply(): ISessionEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISessionEntityType]
  }
  
  extension [Self <: ISessionEntityType](x: Self) {
    
    inline def setEntities(value: js.Array[IEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesNull: Self = StObject.set(x, "entities", null)
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: IEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setEntityOverrideMode(
      value: EntityOverrideMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode * / any */ String)
    ): Self = StObject.set(x, "entityOverrideMode", value.asInstanceOf[js.Any])
    
    inline def setEntityOverrideModeNull: Self = StObject.set(x, "entityOverrideMode", null)
    
    inline def setEntityOverrideModeUndefined: Self = StObject.set(x, "entityOverrideMode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
