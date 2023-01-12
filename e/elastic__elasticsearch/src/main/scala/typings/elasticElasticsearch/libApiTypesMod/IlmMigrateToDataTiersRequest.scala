package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmMigrateToDataTiersRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var dry_run: js.UndefOr[Boolean] = js.undefined
  
  var legacy_template_to_delete: js.UndefOr[String] = js.undefined
  
  var node_attribute: js.UndefOr[String] = js.undefined
}
object IlmMigrateToDataTiersRequest {
  
  inline def apply(): IlmMigrateToDataTiersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IlmMigrateToDataTiersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IlmMigrateToDataTiersRequest] (val x: Self) extends AnyVal {
    
    inline def setDry_run(value: Boolean): Self = StObject.set(x, "dry_run", value.asInstanceOf[js.Any])
    
    inline def setDry_runUndefined: Self = StObject.set(x, "dry_run", js.undefined)
    
    inline def setLegacy_template_to_delete(value: String): Self = StObject.set(x, "legacy_template_to_delete", value.asInstanceOf[js.Any])
    
    inline def setLegacy_template_to_deleteUndefined: Self = StObject.set(x, "legacy_template_to_delete", js.undefined)
    
    inline def setNode_attribute(value: String): Self = StObject.set(x, "node_attribute", value.asInstanceOf[js.Any])
    
    inline def setNode_attributeUndefined: Self = StObject.set(x, "node_attribute", js.undefined)
  }
}
