package typings.googleapis.anon

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.endpointMod.Target
import typings.googleapisCommon.schemaMod.Schema
import typings.googleapisCommon.schemaMod.SchemaResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<googleapis-common.googleapis-common.Endpoint> */
@js.native
trait ReadonlyEndpoint extends StObject {
  
  val _options: GlobalOptions = js.native
  
  val applyMethodsFromSchema: js.Any = js.native
  
  def applySchema(target: Target, rootSchema: Schema, schema: SchemaResource, context: APIRequestContext): scala.Unit = js.native
  
  val getPathParams: js.Any = js.native
  
  val google: js.Any = js.native
  
  val makeMethod: js.Any = js.native
}
object ReadonlyEndpoint {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ReadonlyEndpointMutableBuilder[Self <: ReadonlyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyMethodsFromSchema(value: js.Any): Self = StObject.set(x, "applyMethodsFromSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplySchema(value: (Target, Schema, SchemaResource, APIRequestContext) => scala.Unit): Self = StObject.set(x, "applySchema", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetPathParams(value: js.Any): Self = StObject.set(x, "getPathParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogle(value: js.Any): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeMethod(value: js.Any): Self = StObject.set(x, "makeMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_options(value: GlobalOptions): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
  }
}
