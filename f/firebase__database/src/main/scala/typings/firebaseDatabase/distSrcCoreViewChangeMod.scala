package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.firebaseDatabaseStrings.child_added
import typings.firebaseDatabase.firebaseDatabaseStrings.child_changed
import typings.firebaseDatabase.firebaseDatabaseStrings.child_moved
import typings.firebaseDatabase.firebaseDatabaseStrings.child_removed
import typings.firebaseDatabase.firebaseDatabaseStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreViewChangeMod {
  
  @JSImport("@firebase/database/dist/src/core/view/Change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def changeChildAdded(childName: String, snapshotNode: Node): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("changeChildAdded")(childName.asInstanceOf[js.Any], snapshotNode.asInstanceOf[js.Any])).asInstanceOf[Change]
  
  inline def changeChildChanged(childName: String, snapshotNode: Node, oldSnap: Node): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("changeChildChanged")(childName.asInstanceOf[js.Any], snapshotNode.asInstanceOf[js.Any], oldSnap.asInstanceOf[js.Any])).asInstanceOf[Change]
  
  inline def changeChildMoved(childName: String, snapshotNode: Node): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("changeChildMoved")(childName.asInstanceOf[js.Any], snapshotNode.asInstanceOf[js.Any])).asInstanceOf[Change]
  
  inline def changeChildRemoved(childName: String, snapshotNode: Node): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("changeChildRemoved")(childName.asInstanceOf[js.Any], snapshotNode.asInstanceOf[js.Any])).asInstanceOf[Change]
  
  inline def changeValue(snapshotNode: Node): Change = ^.asInstanceOf[js.Dynamic].applyDynamic("changeValue")(snapshotNode.asInstanceOf[js.Any]).asInstanceOf[Change]
  
  trait Change extends StObject {
    
    /** @param childName - The name for this child, if it's a child even */
    var childName: js.UndefOr[String] = js.undefined
    
    /** @param oldSnap - Used for intermediate processing of child changed events */
    var oldSnap: js.UndefOr[Node] = js.undefined
    
    /**  * @param prevName - The name for the previous child, if applicable */
    var prevName: js.UndefOr[String | Null] = js.undefined
    
    /** @param snapshotNode - The data */
    var snapshotNode: Node
    
    /** @param type - The event type */
    var `type`: ChangeType
  }
  object Change {
    
    inline def apply(snapshotNode: Node, `type`: ChangeType): Change = {
      val __obj = js.Dynamic.literal(snapshotNode = snapshotNode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Change]
    }
    
    extension [Self <: Change](x: Self) {
      
      inline def setChildName(value: String): Self = StObject.set(x, "childName", value.asInstanceOf[js.Any])
      
      inline def setChildNameUndefined: Self = StObject.set(x, "childName", js.undefined)
      
      inline def setOldSnap(value: Node): Self = StObject.set(x, "oldSnap", value.asInstanceOf[js.Any])
      
      inline def setOldSnapUndefined: Self = StObject.set(x, "oldSnap", js.undefined)
      
      inline def setPrevName(value: String): Self = StObject.set(x, "prevName", value.asInstanceOf[js.Any])
      
      inline def setPrevNameNull: Self = StObject.set(x, "prevName", null)
      
      inline def setPrevNameUndefined: Self = StObject.set(x, "prevName", js.undefined)
      
      inline def setSnapshotNode(value: Node): Self = StObject.set(x, "snapshotNode", value.asInstanceOf[js.Any])
      
      inline def setType(value: ChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_added
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_removed
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_changed
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_moved
    - typings.firebaseDatabase.firebaseDatabaseStrings.value
  */
  trait ChangeType extends StObject
  object ChangeType {
    
    /** Event type for a child added */
    inline def CHILD_ADDED: child_added = "child_added".asInstanceOf[child_added]
    
    /** Event type for a child changed */
    inline def CHILD_CHANGED: child_changed = "child_changed".asInstanceOf[child_changed]
    
    /** Event type for a child moved */
    inline def CHILD_MOVED: child_moved = "child_moved".asInstanceOf[child_moved]
    
    /** Event type for a child removed */
    inline def CHILD_REMOVED: child_removed = "child_removed".asInstanceOf[child_removed]
    
    /** Event type for a value change */
    inline def VALUE: value = "value".asInstanceOf[value]
  }
}
