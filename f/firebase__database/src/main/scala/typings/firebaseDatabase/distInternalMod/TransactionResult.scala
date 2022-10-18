package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/internal", "TransactionResult")
@js.native
open class TransactionResult protected () extends StObject {
  /** @hideconstructor */
  def this(
    /** Whether the transaction was successfully committed. */
  committed: Boolean,
    /** The resulting data snapshot. */
  snapshot: DataSnapshot
  ) = this()
  
  /** Whether the transaction was successfully committed. */
  val committed: Boolean = js.native
  
  /** The resulting data snapshot. */
  val snapshot: DataSnapshot = js.native
  
  /** Returns a JSON-serializable representation of this object. */
  def toJSON(): js.Object = js.native
}
