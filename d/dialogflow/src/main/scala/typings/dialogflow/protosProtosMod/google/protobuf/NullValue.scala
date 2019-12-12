package typings.dialogflow.protosProtosMod.google.protobuf

import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.protosProtosMod.google.protobuf.NullValue.NULL_VALUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NullValue extends js.Object

/** NullValue enum. */
@JSImport("dialogflow/protos/protos", "google.protobuf.NullValue")
@js.native
object NullValue extends js.Object {
  @js.native
  sealed trait NULL_VALUE extends NullValue
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NullValue with Double] = js.native
  /* 0 */ @js.native
  object NULL_VALUE extends TopLevel[NULL_VALUE with Double]
  
}

