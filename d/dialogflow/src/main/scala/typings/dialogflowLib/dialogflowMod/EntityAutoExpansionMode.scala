package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntityAutoExpansionMode extends js.Object

@JSImport("dialogflow", "EntityAutoExpansionMode")
@js.native
object EntityAutoExpansionMode extends js.Object {
  @js.native
  sealed trait AUTO_EXPANSION_MODE_DEFAULT
    extends dialogflowLib.dialogflowMod.EntityAutoExpansionMode
  
  @js.native
  sealed trait AUTO_EXPANSION_MODE_UNSPECIFIED
    extends dialogflowLib.dialogflowMod.EntityAutoExpansionMode
  
  /* "AUTO_EXPANSION_MODE_DEFAULT" */ val AUTO_EXPANSION_MODE_DEFAULT: AUTO_EXPANSION_MODE_DEFAULT with java.lang.String = js.native
  /* "AUTO_EXPANSION_MODE_UNSPECIFIED" */ val AUTO_EXPANSION_MODE_UNSPECIFIED: AUTO_EXPANSION_MODE_UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[dialogflowLib.dialogflowMod.EntityAutoExpansionMode with java.lang.String] = js.native
}

