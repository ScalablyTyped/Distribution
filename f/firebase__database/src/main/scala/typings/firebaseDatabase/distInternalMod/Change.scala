package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  /** @param childName - The name for this child, if it's a child even */
  var childName: js.UndefOr[String] = js.undefined
  
  /** @param oldSnap - Used for intermediate processing of child changed events */
  var oldSnap: js.UndefOr[Node2] = js.undefined
  
  /**  * @param prevName - The name for the previous child, if applicable */
  var prevName: js.UndefOr[String | Null] = js.undefined
  
  /** @param snapshotNode - The data */
  var snapshotNode: Node2
  
  /** @param type - The event type */
  var `type`: ChangeType
}
object Change {
  
  inline def apply(snapshotNode: Node2, `type`: ChangeType): Change = {
    val __obj = js.Dynamic.literal(snapshotNode = snapshotNode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    inline def setChildName(value: String): Self = StObject.set(x, "childName", value.asInstanceOf[js.Any])
    
    inline def setChildNameUndefined: Self = StObject.set(x, "childName", js.undefined)
    
    inline def setOldSnap(value: Node2): Self = StObject.set(x, "oldSnap", value.asInstanceOf[js.Any])
    
    inline def setOldSnapUndefined: Self = StObject.set(x, "oldSnap", js.undefined)
    
    inline def setPrevName(value: String): Self = StObject.set(x, "prevName", value.asInstanceOf[js.Any])
    
    inline def setPrevNameNull: Self = StObject.set(x, "prevName", null)
    
    inline def setPrevNameUndefined: Self = StObject.set(x, "prevName", js.undefined)
    
    inline def setSnapshotNode(value: Node2): Self = StObject.set(x, "snapshotNode", value.asInstanceOf[js.Any])
    
    inline def setType(value: ChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
