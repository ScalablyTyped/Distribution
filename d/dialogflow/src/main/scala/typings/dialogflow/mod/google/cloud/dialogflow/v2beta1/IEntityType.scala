package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an EntityType. */
@js.native
trait IEntityType extends StObject {
  
  /** EntityType autoExpansionMode */
  var autoExpansionMode: js.UndefOr[
    AutoExpansionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode * / any */ String) | Null
  ] = js.native
  
  /** EntityType displayName */
  var displayName: js.UndefOr[String | Null] = js.native
  
  /** EntityType enableFuzzyExtraction */
  var enableFuzzyExtraction: js.UndefOr[Boolean | Null] = js.native
  
  /** EntityType entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.native
  
  /** EntityType kind */
  var kind: js.UndefOr[
    Kind | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.EntityType.Kind * / any */ String) | Null
  ] = js.native
  
  /** EntityType name */
  var name: js.UndefOr[String | Null] = js.native
}
object IEntityType {
  
  @scala.inline
  def apply(): IEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEntityType]
  }
  
  @scala.inline
  implicit class IEntityTypeMutableBuilder[Self <: IEntityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoExpansionMode(
      value: AutoExpansionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode * / any */ String)
    ): Self = StObject.set(x, "autoExpansionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoExpansionModeNull: Self = StObject.set(x, "autoExpansionMode", null)
    
    @scala.inline
    def setAutoExpansionModeUndefined: Self = StObject.set(x, "autoExpansionMode", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnableFuzzyExtraction(value: Boolean): Self = StObject.set(x, "enableFuzzyExtraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableFuzzyExtractionNull: Self = StObject.set(x, "enableFuzzyExtraction", null)
    
    @scala.inline
    def setEnableFuzzyExtractionUndefined: Self = StObject.set(x, "enableFuzzyExtraction", js.undefined)
    
    @scala.inline
    def setEntities(value: js.Array[IEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesNull: Self = StObject.set(x, "entities", null)
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: IEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setKind(
      value: Kind | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.EntityType.Kind * / any */ String)
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindNull: Self = StObject.set(x, "kind", null)
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
