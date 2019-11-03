package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Platform extends js.Object

/** Platform enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Platform")
@js.native
object Platform extends js.Object {
  @js.native
  sealed trait ACTIONS_ON_GOOGLE extends Platform
  
  @js.native
  sealed trait FACEBOOK extends Platform
  
  @js.native
  sealed trait GOOGLE_HANGOUTS extends Platform
  
  @js.native
  sealed trait KIK extends Platform
  
  @js.native
  sealed trait LINE extends Platform
  
  @js.native
  sealed trait PLATFORM_UNSPECIFIED extends Platform
  
  @js.native
  sealed trait SKYPE extends Platform
  
  @js.native
  sealed trait SLACK extends Platform
  
  @js.native
  sealed trait TELEGRAM extends Platform
  
  @js.native
  sealed trait TELEPHONY extends Platform
  
  @js.native
  sealed trait VIBER extends Platform
  
  /* 8 */ val ACTIONS_ON_GOOGLE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.ACTIONS_ON_GOOGLE with Double = js.native
  /* 1 */ val FACEBOOK: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.FACEBOOK with Double = js.native
  /* 11 */ val GOOGLE_HANGOUTS: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.GOOGLE_HANGOUTS with Double = js.native
  /* 4 */ val KIK: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.KIK with Double = js.native
  /* 6 */ val LINE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.LINE with Double = js.native
  /* 0 */ val PLATFORM_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.PLATFORM_UNSPECIFIED with Double = js.native
  /* 5 */ val SKYPE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.SKYPE with Double = js.native
  /* 2 */ val SLACK: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.SLACK with Double = js.native
  /* 3 */ val TELEGRAM: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.TELEGRAM with Double = js.native
  /* 10 */ val TELEPHONY: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.TELEPHONY with Double = js.native
  /* 7 */ val VIBER: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform.VIBER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Platform with Double] = js.native
}

