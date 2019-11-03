package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase

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
  
  /* 1 */ val EXAMPLE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type.EXAMPLE with Double = js.native
  /* 2 */ val TEMPLATE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type.TEMPLATE with Double = js.native
  /* 0 */ val TYPE_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type.TYPE_UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
}

