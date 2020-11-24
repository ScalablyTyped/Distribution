package typings.fastJsonStringify.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Configure Ajv, which is used to evaluate conditional schemas and combined (anyOf) schemas
    */
  var ajv: js.UndefOr[typings.ajv.mod.Options] = js.native
  
  /**
    * Optionally add an external definition to reference from your schema
    */
  var schema: js.UndefOr[Record[String, Schema]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAjv(value: typings.ajv.mod.Options): Self = this.set("ajv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjv: Self = this.set("ajv", js.undefined)
    
    @scala.inline
    def setSchema(value: Record[String, Schema]): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
