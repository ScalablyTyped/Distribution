package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an EntityType. */
trait IEntityType extends StObject {
  
  /** EntityType autoExpansionMode */
  var autoExpansionMode: js.UndefOr[
    AutoExpansionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode * / any */ String) | Null
  ] = js.undefined
  
  /** EntityType displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /** EntityType enableFuzzyExtraction */
  var enableFuzzyExtraction: js.UndefOr[Boolean | Null] = js.undefined
  
  /** EntityType entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.undefined
  
  /** EntityType kind */
  var kind: js.UndefOr[
    Kind | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.EntityType.Kind * / any */ String) | Null
  ] = js.undefined
  
  /** EntityType name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IEntityType {
  
  inline def apply(): IEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEntityType]
  }
  
  extension [Self <: IEntityType](x: Self) {
    
    inline def setAutoExpansionMode(
      value: AutoExpansionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode * / any */ String)
    ): Self = StObject.set(x, "autoExpansionMode", value.asInstanceOf[js.Any])
    
    inline def setAutoExpansionModeNull: Self = StObject.set(x, "autoExpansionMode", null)
    
    inline def setAutoExpansionModeUndefined: Self = StObject.set(x, "autoExpansionMode", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableFuzzyExtraction(value: Boolean): Self = StObject.set(x, "enableFuzzyExtraction", value.asInstanceOf[js.Any])
    
    inline def setEnableFuzzyExtractionNull: Self = StObject.set(x, "enableFuzzyExtraction", null)
    
    inline def setEnableFuzzyExtractionUndefined: Self = StObject.set(x, "enableFuzzyExtraction", js.undefined)
    
    inline def setEntities(value: js.Array[IEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesNull: Self = StObject.set(x, "entities", null)
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: IEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    inline def setKind(
      value: Kind | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.EntityType.Kind * / any */ String)
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
