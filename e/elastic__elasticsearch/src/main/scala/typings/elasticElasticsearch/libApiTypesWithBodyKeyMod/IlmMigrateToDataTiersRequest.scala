package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Legacytemplatetodelete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmMigrateToDataTiersRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Legacytemplatetodelete] = js.undefined
  
  var dry_run: js.UndefOr[Boolean] = js.undefined
}
object IlmMigrateToDataTiersRequest {
  
  inline def apply(): IlmMigrateToDataTiersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IlmMigrateToDataTiersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IlmMigrateToDataTiersRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Legacytemplatetodelete): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDry_run(value: Boolean): Self = StObject.set(x, "dry_run", value.asInstanceOf[js.Any])
    
    inline def setDry_runUndefined: Self = StObject.set(x, "dry_run", js.undefined)
  }
}
