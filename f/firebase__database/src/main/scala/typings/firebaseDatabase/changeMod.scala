package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object changeMod {
  
  @JSImport("@firebase/database/dist/src/core/view/Change", "Change")
  @js.native
  class Change protected () extends StObject {
    def this(`type`: String, snapshotNode: Node) = this()
    def this(`type`: String, snapshotNode: Node, childName: String) = this()
    def this(`type`: String, snapshotNode: Node, childName: js.UndefOr[scala.Nothing], oldSnap: Node) = this()
    def this(`type`: String, snapshotNode: Node, childName: String, oldSnap: Node) = this()
    def this(
      `type`: String,
      snapshotNode: Node,
      childName: js.UndefOr[scala.Nothing],
      oldSnap: js.UndefOr[scala.Nothing],
      prevName: String
    ) = this()
    def this(
      `type`: String,
      snapshotNode: Node,
      childName: js.UndefOr[scala.Nothing],
      oldSnap: Node,
      prevName: String
    ) = this()
    def this(
      `type`: String,
      snapshotNode: Node,
      childName: String,
      oldSnap: js.UndefOr[scala.Nothing],
      prevName: String
    ) = this()
    def this(`type`: String, snapshotNode: Node, childName: String, oldSnap: Node, prevName: String) = this()
    
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
    @JSImport("@firebase/database/dist/src/core/view/Change", "Change.childAddedChange")
    @js.native
    def childAddedChange(childKey: String, snapshot: Node): Change = js.native
    
    /**
      * @param {string} childKey
      * @param {!Node} newSnapshot
      * @param {!Node} oldSnapshot
      * @return {!Change}
      */
    @JSImport("@firebase/database/dist/src/core/view/Change", "Change.childChangedChange")
    @js.native
    def childChangedChange(childKey: String, newSnapshot: Node, oldSnapshot: Node): Change = js.native
    
    /**
      * @param {string} childKey
      * @param {!Node} snapshot
      * @return {!Change}
      */
    @JSImport("@firebase/database/dist/src/core/view/Change", "Change.childMovedChange")
    @js.native
    def childMovedChange(childKey: String, snapshot: Node): Change = js.native
    
    /**
      * @param {string} childKey
      * @param {!Node} snapshot
      * @return {!Change}
      */
    @JSImport("@firebase/database/dist/src/core/view/Change", "Change.childRemovedChange")
    @js.native
    def childRemovedChange(childKey: String, snapshot: Node): Change = js.native
    
    /**
      * @param {!Node} snapshot
      * @return {!Change}
      */
    @JSImport("@firebase/database/dist/src/core/view/Change", "Change.valueChange")
    @js.native
    def valueChange(snapshot: Node): Change = js.native
  }
}
