package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains floating objects base settings.
  */
trait FloatingObjectInfo extends StObject {
  
  /**
    * Gets the parent sub-document what stores the current floating object.
    */
  val parentSubDocument: SubDocument
  
  /**
    * Gets the position of the floating object's anchor in the parent sub-document.
    */
  val position: Double
}
object FloatingObjectInfo {
  
  @scala.inline
  def apply(parentSubDocument: SubDocument, position: Double): FloatingObjectInfo = {
    val __obj = js.Dynamic.literal(parentSubDocument = parentSubDocument.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectInfo]
  }
  
  @scala.inline
  implicit class FloatingObjectInfoMutableBuilder[Self <: FloatingObjectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentSubDocument(value: SubDocument): Self = StObject.set(x, "parentSubDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
