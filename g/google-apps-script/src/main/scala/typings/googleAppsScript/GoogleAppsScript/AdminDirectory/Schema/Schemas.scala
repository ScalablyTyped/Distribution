package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schemas extends js.Object {
  
  var etag: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var schemas: js.UndefOr[js.Array[typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema]] = js.native
}
object Schemas {
  
  @scala.inline
  def apply(): Schemas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schemas]
  }
  
  @scala.inline
  implicit class SchemasOps[Self <: Schemas] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
  }
}
