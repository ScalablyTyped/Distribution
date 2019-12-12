package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase

import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type.EXAMPLE
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type.TEMPLATE
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type.TYPE_UNSPECIFIED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

/** Type enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait EXAMPLE extends Type
  
  @js.native
  sealed trait TEMPLATE extends Type
  
  @js.native
  sealed trait TYPE_UNSPECIFIED extends Type
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  /* 1 */ @js.native
  object EXAMPLE extends TopLevel[EXAMPLE with Double]
  
  /* 2 */ @js.native
  object TEMPLATE extends TopLevel[TEMPLATE with Double]
  
  /* 0 */ @js.native
  object TYPE_UNSPECIFIED extends TopLevel[TYPE_UNSPECIFIED with Double]
  
}

