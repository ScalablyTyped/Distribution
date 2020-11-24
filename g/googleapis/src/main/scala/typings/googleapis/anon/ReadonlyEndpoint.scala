package typings.googleapis.anon

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.endpointMod.Target
import typings.googleapisCommon.schemaMod.Schema
import typings.googleapisCommon.schemaMod.SchemaResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<googleapis-common.googleapis-common.Endpoint> */
@js.native
trait ReadonlyEndpoint extends js.Object {
  
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
  implicit class ReadonlyEndpointOps[Self <: ReadonlyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_options(value: GlobalOptions): Self = this.set("_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyMethodsFromSchema(value: js.Any): Self = this.set("applyMethodsFromSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplySchema(value: (Target, Schema, SchemaResource, APIRequestContext) => scala.Unit): Self = this.set("applySchema", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetPathParams(value: js.Any): Self = this.set("getPathParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogle(value: js.Any): Self = this.set("google", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeMethod(value: js.Any): Self = this.set("makeMethod", value.asInstanceOf[js.Any])
  }
}
