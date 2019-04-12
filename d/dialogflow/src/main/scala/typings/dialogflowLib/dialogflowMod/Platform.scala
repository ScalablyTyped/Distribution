package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Platform extends js.Object

@JSImport("dialogflow", "Platform")
@js.native
object Platform extends js.Object {
  @js.native
  sealed trait ACTIONS_ON_GOOGLE
    extends dialogflowLib.dialogflowMod.Platform
  
  @js.native
  sealed trait FACEBOOK
    extends dialogflowLib.dialogflowMod.Platform
  
  @js.native
  sealed trait KIK
    extends dialogflowLib.dialogflowMod.Platform
  
  @js.native
  sealed trait LINE
    extends dialogflowLib.dialogflowMod.Platform
  
  @js.native
  sealed trait PLATFORM_UNSPECIFIED
    extends dialogflowLib.dialogflowMod.Platform
  
  @js.native
  sealed trait SKYPE
    extends dialogflowLib.dialogflowMod.Platform
  
  @js.native
  sealed trait SLACK
    extends dialogflowLib.dialogflowMod.Platform
  
  @js.native
  sealed trait TELEGRAM
    extends dialogflowLib.dialogflowMod.Platform
  
  @js.native
  sealed trait VIBER
    extends dialogflowLib.dialogflowMod.Platform
  
  val ACTIONS_ON_GOOGLE: ACTIONS_ON_GOOGLE with java.lang.String = js.native
  val FACEBOOK: FACEBOOK with java.lang.String = js.native
  val KIK: KIK with java.lang.String = js.native
  val LINE: LINE with java.lang.String = js.native
  val PLATFORM_UNSPECIFIED: PLATFORM_UNSPECIFIED with java.lang.String = js.native
  val SKYPE: SKYPE with java.lang.String = js.native
  val SLACK: SLACK with java.lang.String = js.native
  val TELEGRAM: TELEGRAM with java.lang.String = js.native
  val VIBER: VIBER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[dialogflowLib.dialogflowMod.Platform with java.lang.String] = js.native
}

