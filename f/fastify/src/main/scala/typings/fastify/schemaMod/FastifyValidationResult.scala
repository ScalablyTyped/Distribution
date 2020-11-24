package typings.fastify.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyValidationResult extends js.Object {
  
  var errors: js.UndefOr[js.Array[FastifySchemaValidationError] | Null] = js.native
}
object FastifyValidationResult {
  
  @scala.inline
  def apply(): FastifyValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastifyValidationResult]
  }
  
  @scala.inline
  implicit class FastifyValidationResultOps[Self <: FastifyValidationResult] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: FastifySchemaValidationError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[FastifySchemaValidationError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setErrorsNull: Self = this.set("errors", null)
  }
}
