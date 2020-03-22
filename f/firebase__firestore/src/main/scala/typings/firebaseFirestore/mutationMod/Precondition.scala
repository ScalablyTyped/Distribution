package typings.firebaseFirestore.mutationMod

import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/mutation", "Precondition")
@js.native
class Precondition protected () extends js.Object {
  val exists: js.UndefOr[Boolean] = js.native
  val updateTime: js.UndefOr[SnapshotVersion] = js.native
  def isEqual(other: Precondition): Boolean = js.native
  /** Returns whether this Precondition is empty. */
  def isNone(): Boolean = js.native
  def isValidFor(): Boolean = js.native
  /**
    * Returns true if the preconditions is valid for the given document
    * (or null if no document is available).
    */
  def isValidFor(maybeDoc: MaybeDocument): Boolean = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/model/mutation", "Precondition")
@js.native
object Precondition extends js.Object {
  val NONE: Precondition = js.native
  /** Creates a new Precondition with an exists flag. */
  def exists(exists: Boolean): Precondition = js.native
  /** Creates a new Precondition based on a version a document exists at. */
  def updateTime(version: SnapshotVersion): Precondition = js.native
}

