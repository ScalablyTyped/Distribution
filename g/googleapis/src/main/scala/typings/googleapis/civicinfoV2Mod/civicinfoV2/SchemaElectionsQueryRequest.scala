package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaElectionsQueryRequest extends js.Object {
  
  var contextParams: js.UndefOr[SchemaContextParams] = js.native
}
object SchemaElectionsQueryRequest {
  
  @scala.inline
  def apply(): SchemaElectionsQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElectionsQueryRequest]
  }
  
  @scala.inline
  implicit class SchemaElectionsQueryRequestOps[Self <: SchemaElectionsQueryRequest] (val x: Self) extends AnyVal {
    
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
    def setContextParams(value: SchemaContextParams): Self = this.set("contextParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextParams: Self = this.set("contextParams", js.undefined)
  }
}
