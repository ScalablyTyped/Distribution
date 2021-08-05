package typings.googleapis.anon

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.endpointMod.Target
import typings.googleapisCommon.schemaMod.Schema
import typings.googleapisCommon.schemaMod.SchemaResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<googleapis-common.googleapis-common.Endpoint> */
trait ReadonlyEndpoint extends StObject {
  
  val _options: GlobalOptions
  
  val applyMethodsFromSchema: js.Any
  
  def applySchema(target: Target, rootSchema: Schema, schema: SchemaResource, context: APIRequestContext): scala.Unit
  
  val getPathParams: js.Any
  
  val google: js.Any
  
  val makeMethod: js.Any
}
object ReadonlyEndpoint {
  
  inline def apply(
    _options: GlobalOptions,
    applyMethodsFromSchema: js.Any,
    applySchema: (Target, Schema, SchemaResource, APIRequestContext) => scala.Unit,
    getPathParams: js.Any,
    google: js.Any,
    makeMethod: js.Any
  ): ReadonlyEndpoint = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], applyMethodsFromSchema = applyMethodsFromSchema.asInstanceOf[js.Any], applySchema = js.Any.fromFunction4(applySchema), getPathParams = getPathParams.asInstanceOf[js.Any], google = google.asInstanceOf[js.Any], makeMethod = makeMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyEndpoint]
  }
  
  extension [Self <: ReadonlyEndpoint](x: Self) {
    
    inline def setApplyMethodsFromSchema(value: js.Any): Self = StObject.set(x, "applyMethodsFromSchema", value.asInstanceOf[js.Any])
    
    inline def setApplySchema(value: (Target, Schema, SchemaResource, APIRequestContext) => scala.Unit): Self = StObject.set(x, "applySchema", js.Any.fromFunction4(value))
    
    inline def setGetPathParams(value: js.Any): Self = StObject.set(x, "getPathParams", value.asInstanceOf[js.Any])
    
    inline def setGoogle(value: js.Any): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
    
    inline def setMakeMethod(value: js.Any): Self = StObject.set(x, "makeMethod", value.asInstanceOf[js.Any])
    
    inline def set_options(value: GlobalOptions): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
  }
}
