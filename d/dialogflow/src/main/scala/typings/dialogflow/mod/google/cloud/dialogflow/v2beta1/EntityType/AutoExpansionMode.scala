package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoExpansionMode extends js.Object

/** AutoExpansionMode enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode")
@js.native
object AutoExpansionMode extends js.Object {
  @js.native
  sealed trait AUTO_EXPANSION_MODE_DEFAULT extends AutoExpansionMode
  
  @js.native
  sealed trait AUTO_EXPANSION_MODE_UNSPECIFIED extends AutoExpansionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoExpansionMode with Double] = js.native
  /* 1 */ @js.native
  object AUTO_EXPANSION_MODE_DEFAULT extends TopLevel[AUTO_EXPANSION_MODE_DEFAULT with Double]
  
  /* 0 */ @js.native
  object AUTO_EXPANSION_MODE_UNSPECIFIED extends TopLevel[AUTO_EXPANSION_MODE_UNSPECIFIED with Double]
  
}

