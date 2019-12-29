package typings.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServerTimestampBehavior with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object Estimate extends TopLevel[Estimate with Double]
  
  /* 2 */ @js.native
  object Previous extends TopLevel[Previous with Double]
  
}

