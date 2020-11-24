package typings.googleapis.appstateV1Mod.appstateV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template to convert a list-response for app state.
  */
@js.native
trait SchemaListResponse extends js.Object {
  
  /**
    * The app state data.
    */
  var items: js.UndefOr[js.Array[SchemaGetResponse]] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string appstate#listResponse.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of keys allowed for this user.
    */
  var maximumKeyCount: js.UndefOr[Double] = js.native
}
object SchemaListResponse {
  
  @scala.inline
  def apply(): SchemaListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListResponse]
  }
  
  @scala.inline
  implicit class SchemaListResponseOps[Self <: SchemaListResponse] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: SchemaGetResponse*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SchemaGetResponse]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMaximumKeyCount(value: Double): Self = this.set("maximumKeyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumKeyCount: Self = this.set("maximumKeyCount", js.undefined)
  }
}
