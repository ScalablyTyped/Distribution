package typings.fastify.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyRouteSchemaDef extends js.Object {
  
  var httpPart: js.UndefOr[String] = js.native
  
  var httpStatus: js.UndefOr[String] = js.native
  
  var method: String = js.native
  
  var schema: FastifySchema = js.native
  
  var url: String = js.native
}
object FastifyRouteSchemaDef {
  
  @scala.inline
  def apply(method: String, schema: FastifySchema, url: String): FastifyRouteSchemaDef = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastifyRouteSchemaDef]
  }
  
  @scala.inline
  implicit class FastifyRouteSchemaDefOps[Self <: FastifyRouteSchemaDef] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: FastifySchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpPart(value: String): Self = this.set("httpPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpPart: Self = this.set("httpPart", js.undefined)
    
    @scala.inline
    def setHttpStatus(value: String): Self = this.set("httpStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpStatus: Self = this.set("httpStatus", js.undefined)
  }
}
