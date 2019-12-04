package typings.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ServerTimestampBehavior extends js.Object

@JSImport("@firebase/firestore/dist/src/model/field_value", "ServerTimestampBehavior")
@js.native
object ServerTimestampBehavior extends js.Object {
  @js.native
  sealed trait Default extends ServerTimestampBehavior
  
  @js.native
  sealed trait Estimate extends ServerTimestampBehavior
  
  @js.native
  sealed trait Previous extends ServerTimestampBehavior
  
  /* 0 */ val Default: typings.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.ServerTimestampBehavior.Default with Double = js.native
  /* 1 */ val Estimate: typings.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.ServerTimestampBehavior.Estimate with Double = js.native
  /* 2 */ val Previous: typings.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.ServerTimestampBehavior.Previous with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServerTimestampBehavior with Double] = js.native
}

