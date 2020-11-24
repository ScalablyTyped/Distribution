package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains floating objects base settings.
  */
@js.native
trait FloatingObjectInfo extends js.Object {
  
  /**
    * Gets the parent sub-document what stores the current floating object.
    */
  val parentSubDocument: SubDocument = js.native
  
  /**
    * Gets the position of the floating object's anchor in the parent sub-document.
    */
  val position: Double = js.native
}
object FloatingObjectInfo {
  
  @scala.inline
  def apply(parentSubDocument: SubDocument, position: Double): FloatingObjectInfo = {
    val __obj = js.Dynamic.literal(parentSubDocument = parentSubDocument.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectInfo]
  }
  
  @scala.inline
  implicit class FloatingObjectInfoOps[Self <: FloatingObjectInfo] (val x: Self) extends AnyVal {
    
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
    def setParentSubDocument(value: SubDocument): Self = this.set("parentSubDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
