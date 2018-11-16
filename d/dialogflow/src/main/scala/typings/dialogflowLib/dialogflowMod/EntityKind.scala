package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntityKind extends js.Object

@JSImport("dialogflow", "EntityKind")
@js.native
object EntityKind extends js.Object {
  @js.native
  sealed trait KIND_LIST
    extends dialogflowLib.dialogflowMod.EntityKind
  
  @js.native
  sealed trait KIND_MAP
    extends dialogflowLib.dialogflowMod.EntityKind
  
  /* "KIND_LIST" */ val KIND_LIST: KIND_LIST with java.lang.String = js.native
  /* "KIND_MAP" */ val KIND_MAP: KIND_MAP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[dialogflowLib.dialogflowMod.EntityKind with java.lang.String] = js.native
}

