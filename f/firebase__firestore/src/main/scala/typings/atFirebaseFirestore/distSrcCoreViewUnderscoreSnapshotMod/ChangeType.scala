package typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeType extends js.Object

@JSImport("@firebase/firestore/dist/src/core/view_snapshot", "ChangeType")
@js.native
object ChangeType extends js.Object {
  @js.native
  sealed trait Added extends ChangeType
  
  @js.native
  sealed trait Metadata extends ChangeType
  
  @js.native
  sealed trait Modified extends ChangeType
  
  @js.native
  sealed trait Removed extends ChangeType
  
  /* 0 */ val Added: typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ChangeType.Added with Double = js.native
  /* 3 */ val Metadata: typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ChangeType.Metadata with Double = js.native
  /* 2 */ val Modified: typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ChangeType.Modified with Double = js.native
  /* 1 */ val Removed: typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ChangeType.Removed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeType with Double] = js.native
}

