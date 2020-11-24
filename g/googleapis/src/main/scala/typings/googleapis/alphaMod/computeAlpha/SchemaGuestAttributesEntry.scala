package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A guest attributes namespace/key/value entry.
  */
@js.native
trait SchemaGuestAttributesEntry extends js.Object {
  
  /**
    * Key for the guest attribute entry.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Namespace for the guest attribute entry.
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * Value for the guest attribute entry.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaGuestAttributesEntry {
  
  @scala.inline
  def apply(): SchemaGuestAttributesEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestAttributesEntry]
  }
  
  @scala.inline
  implicit class SchemaGuestAttributesEntryOps[Self <: SchemaGuestAttributesEntry] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
