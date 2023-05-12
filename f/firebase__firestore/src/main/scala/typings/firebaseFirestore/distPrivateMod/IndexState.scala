package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores the "high water mark" that indicates how updated the Index is for the
  * current user.
  */
trait IndexState extends StObject {
  
  /** The the latest indexed read time, document and batch id. */
  val offset: IndexOffset
  
  /**
    * Indicates when the index was last updated (relative to other indexes).
    */
  val sequenceNumber: Double
}
object IndexState {
  
  inline def apply(offset: IndexOffset, sequenceNumber: Double): IndexState = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexState] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: IndexOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
  }
}
