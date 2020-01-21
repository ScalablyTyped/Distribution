package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an interaction between a user and an item.
  */
@js.native
trait SchemaInteraction extends js.Object {
  /**
    * The time when the user acted on the item.  If multiple actions of the
    * same type exist for a single user, only the most recent action is
    * recorded.
    */
  var interactionTime: js.UndefOr[String] = js.native
  /**
    * The user that acted on the item.
    */
  var principal: js.UndefOr[SchemaPrincipal] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaInteraction {
  @scala.inline
  def apply(interactionTime: String = null, principal: SchemaPrincipal = null, `type`: String = null): SchemaInteraction = {
    val __obj = js.Dynamic.literal()
    if (interactionTime != null) __obj.updateDynamic("interactionTime")(interactionTime.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInteraction]
  }
}

