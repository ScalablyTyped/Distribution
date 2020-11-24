package typings.fastifyError.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationResult extends js.Object {
  
  var dataPath: String = js.native
  
  var keyword: String = js.native
  
  var message: String = js.native
  
  var params: Record[String, String | js.Array[String]] = js.native
  
  var schemaPath: String = js.native
}
object ValidationResult {
  
  @scala.inline
  def apply(
    dataPath: String,
    keyword: String,
    message: String,
    params: Record[String, String | js.Array[String]],
    schemaPath: String
  ): ValidationResult = {
    val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult]
  }
  
  @scala.inline
  implicit class ValidationResultOps[Self <: ValidationResult] (val x: Self) extends AnyVal {
    
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
    def setDataPath(value: String): Self = this.set("dataPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: Record[String, String | js.Array[String]]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaPath(value: String): Self = this.set("schemaPath", value.asInstanceOf[js.Any])
  }
}
