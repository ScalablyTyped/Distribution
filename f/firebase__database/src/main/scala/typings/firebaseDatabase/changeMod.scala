package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object changeMod {
  
  @JSImport("@firebase/database/dist/src/core/view/Change", "Change")
  @js.native
  class Change protected () extends StObject {
    def this(`type`: String, snapshotNode: Node) = this()
    def this(`type`: String, snapshotNode: Node, childName: String) = this()
    def this(`type`: String, snapshotNode: Node, childName: String, oldSnap: Node) = this()
    def this(`type`: String, snapshotNode: Node, childName: Unit, oldSnap: Node) = this()
    def this(`type`: String, snapshotNode: Node, childName: String, oldSnap: Unit, prevName: String) = this()
    def this(`type`: String, snapshotNode: Node, childName: String, oldSnap: Node, prevName: String) = this()
    def this(`type`: String, snapshotNode: Node, childName: Unit, oldSnap: Unit, prevName: String) = this()
    def this(`type`: String, snapshotNode: Node, childName: Unit, oldSnap: Node, prevName: String) = this()
    
    var childName: js.UndefOr[String] = js.native
    
    var oldSnap: js.UndefOr[Node] = js.native
    
    var prevName: js.UndefOr[String | Null] = js.native
    
    var snapshotNode: Node = js.native
    
    var `type`: String = js.native
  }
  /* static members */
  object Change {
    
    @JSImport("@firebase/database/dist/src/core/view/Change", "Change")
    @js.native
    val ^ : js.Any = js.native
    
    /** Event type for a child added */
    @JSImport("@firebase/database/dist/src/core/view/Change", "Change.CHILD_ADDED")
    @js.native
    def CHILD_ADDED: String = js.native
    @scala.inline
    def CHILD_ADDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHILD_ADDED")(x.asInstanceOf[js.Any])
    
    /** Event type for a child changed */
    @JSImport("@firebase/database/dist/src/core/view/Change", "Change.CHILD_CHANGED")
    @js.native
    def CHILD_CHANGED: String = js.native
    @scala.inline
    def CHILD_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHILD_CHANGED")(x.asInstanceOf[js.Any])
    
    /** Event type for a child moved */
    @JSImport("@firebase/database/dist/src/core/view/Change", "Change.CHILD_MOVED")
    @js.native
    def CHILD_MOVED: String = js.native
    @scala.inline
    def CHILD_MOVED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHILD_MOVED")(x.asInstanceOf[js.Any])
    
    /** Event type for a child removed */
    @JSImport("@firebase/database/dist/src/core/view/Change", "Change.CHILD_REMOVED")
    @js.native
    def CHILD_REMOVED: String = js.native
    @scala.inline
    def CHILD_REMOVED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHILD_REMOVED")(x.asInstanceOf[js.Any])
    
    /** Event type for a value change */
    @JSImport("@firebase/database/dist/src/core/view/Change", "Change.VALUE")
    @js.native
    def VALUE: String = js.native
    @scala.inline
    def VALUE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE")(x.asInstanceOf[js.Any])
    
    /**
      * @param {string} childKey
      * @param {!Node} snapshot
      * @return {!Change}
      */
    @scala.inline
    def childAddedChange(childKey: String, snapshot: Node): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("childAddedChange")(childKey.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Change]
    
    /**
      * @param {string} childKey
      * @param {!Node} newSnapshot
      * @param {!Node} oldSnapshot
      * @return {!Change}
      */
    @scala.inline
    def childChangedChange(childKey: String, newSnapshot: Node, oldSnapshot: Node): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("childChangedChange")(childKey.asInstanceOf[js.Any], newSnapshot.asInstanceOf[js.Any], oldSnapshot.asInstanceOf[js.Any])).asInstanceOf[Change]
    
    /**
      * @param {string} childKey
      * @param {!Node} snapshot
      * @return {!Change}
      */
    @scala.inline
    def childMovedChange(childKey: String, snapshot: Node): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("childMovedChange")(childKey.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Change]
    
    /**
      * @param {string} childKey
      * @param {!Node} snapshot
      * @return {!Change}
      */
    @scala.inline
    def childRemovedChange(childKey: String, snapshot: Node): Change = (^.asInstanceOf[js.Dynamic].applyDynamic("childRemovedChange")(childKey.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Change]
    
    /**
      * @param {!Node} snapshot
      * @return {!Change}
      */
    @scala.inline
    def valueChange(snapshot: Node): Change = ^.asInstanceOf[js.Dynamic].applyDynamic("valueChange")(snapshot.asInstanceOf[js.Any]).asInstanceOf[Change]
  }
}
