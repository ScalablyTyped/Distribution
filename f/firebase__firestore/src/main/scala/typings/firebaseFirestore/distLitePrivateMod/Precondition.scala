package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encodes a precondition for a mutation. This follows the model that the
  * backend accepts with the special case of an explicit "empty" precondition
  * (meaning no precondition).
  */
@js.native
trait Precondition extends StObject {
  
  val exists: js.UndefOr[Boolean] = js.native
  
  def isEqual(other: Precondition): Boolean = js.native
  
  /** Returns whether this Precondition is empty. */
  def isNone: Boolean = js.native
  
  val updateTime: js.UndefOr[SnapshotVersion] = js.native
}
