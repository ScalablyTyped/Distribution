package typings.firebaseFirestore.viewSnapshotMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeType extends js.Object

@JSImport("@firebase/firestore/dist/lib/src/core/view_snapshot", "ChangeType")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeType with Double] = js.native
  /* 0 */ @js.native
  object Added extends TopLevel[Added with Double]
  
  /* 3 */ @js.native
  object Metadata extends TopLevel[Metadata with Double]
  
  /* 2 */ @js.native
  object Modified extends TopLevel[Modified with Double]
  
  /* 1 */ @js.native
  object Removed extends TopLevel[Removed with Double]
  
}

