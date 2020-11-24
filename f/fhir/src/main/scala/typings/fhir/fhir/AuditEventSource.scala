package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audit Event Reporter
  */
@js.native
trait AuditEventSource extends BackboneElement {
  
  /**
    * Contains extended information for property 'site'.
    */
  var _site: js.UndefOr[Element] = js.native
  
  /**
    * The identity of source detecting the event
    */
  var identifier: Identifier = js.native
  
  /**
    * Logical source location within the enterprise
    */
  var site: js.UndefOr[String] = js.native
  
  /**
    * The type of source where event originated
    */
  var `type`: js.UndefOr[js.Array[Coding]] = js.native
}
object AuditEventSource {
  
  @scala.inline
  def apply(identifier: Identifier): AuditEventSource = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventSource]
  }
  
  @scala.inline
  implicit class AuditEventSourceOps[Self <: AuditEventSource] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_site(value: Element): Self = this.set("_site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_site: Self = this.set("_site", js.undefined)
    
    @scala.inline
    def setSite(value: String): Self = this.set("site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: Coding*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[Coding]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
