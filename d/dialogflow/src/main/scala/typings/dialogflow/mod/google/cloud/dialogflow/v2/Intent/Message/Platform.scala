package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Platform extends js.Object

/** Platform enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Platform")
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
  sealed trait VIBER extends Platform
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Platform with Double] = js.native
  /* 8 */ @js.native
  object ACTIONS_ON_GOOGLE extends TopLevel[ACTIONS_ON_GOOGLE with Double]
  
  /* 1 */ @js.native
  object FACEBOOK extends TopLevel[FACEBOOK with Double]
  
  /* 11 */ @js.native
  object GOOGLE_HANGOUTS extends TopLevel[GOOGLE_HANGOUTS with Double]
  
  /* 4 */ @js.native
  object KIK extends TopLevel[KIK with Double]
  
  /* 6 */ @js.native
  object LINE extends TopLevel[LINE with Double]
  
  /* 0 */ @js.native
  object PLATFORM_UNSPECIFIED extends TopLevel[PLATFORM_UNSPECIFIED with Double]
  
  /* 5 */ @js.native
  object SKYPE extends TopLevel[SKYPE with Double]
  
  /* 2 */ @js.native
  object SLACK extends TopLevel[SLACK with Double]
  
  /* 3 */ @js.native
  object TELEGRAM extends TopLevel[TELEGRAM with Double]
  
  /* 7 */ @js.native
  object VIBER extends TopLevel[VIBER with Double]
  
}

