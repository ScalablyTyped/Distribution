package typings.fluxStandardAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxStandardAction[Type /* <: String */, Payload, Meta] extends _FluxStandardActionAuto[Type, Payload, Meta] {
  /**
    * The optional `error` property MAY be set to true if the action represents an error.
    * An action whose `error` is true is analogous to a rejected Promise.
    * By convention, the `payload` SHOULD be an error object.
    * If `error` has any other value besides `true`, including `undefined`, the action MUST NOT be interpreted as an error.
    */
  var error: js.UndefOr[Boolean] = js.undefined
  /**
    * The optional `meta` property MAY be any type of value.
    * It is intended for any extra information that is not part of the payload.
    */
  var meta: js.UndefOr[Meta] = js.undefined
  /**
    * The optional `payload` property MAY be any type of value.
    * It represents the payload of the action.
    * Any information about the action that is not the type or status of the action should be part of the `payload` field.
    * By convention, if `error` is `true`, the `payload` SHOULD be an error object.
    * This is akin to rejecting a promise with an error object.
    */
  var payload: js.UndefOr[Payload] = js.undefined
  /**
    * The `type` of an action identifies to the consumer the nature of the action that has occurred.
    * Two actions with the same `type` MUST be strictly equivalent (using `===`)
    */
  var `type`: Type
}

object FluxStandardAction {
  @scala.inline
  def apply[/* <: java.lang.String */ Type, Payload, Meta](
    `type`: Type,
    error: js.UndefOr[Boolean] = js.undefined,
    meta: Meta = null,
    payload: Payload = null
  ): FluxStandardAction[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxStandardAction[Type, Payload, Meta]]
  }
}

