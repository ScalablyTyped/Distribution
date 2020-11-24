package typings.fluxStandardAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluxStandardAction[Type /* <: String */, Payload, Meta] extends _FluxStandardActionAuto[Type, Payload, Meta] {
  
  /**
    * The optional `error` property MAY be set to true if the action represents an error.
    * An action whose `error` is true is analogous to a rejected Promise.
    * By convention, the `payload` SHOULD be an error object.
    * If `error` has any other value besides `true`, including `undefined`, the action MUST NOT be interpreted as an error.
    */
  var error: js.UndefOr[Boolean] = js.native
  
  /**
    * The optional `meta` property MAY be any type of value.
    * It is intended for any extra information that is not part of the payload.
    */
  var meta: js.UndefOr[Meta] = js.native
  
  /**
    * The optional `payload` property MAY be any type of value.
    * It represents the payload of the action.
    * Any information about the action that is not the type or status of the action should be part of the `payload` field.
    * By convention, if `error` is `true`, the `payload` SHOULD be an error object.
    * This is akin to rejecting a promise with an error object.
    */
  var payload: js.UndefOr[Payload] = js.native
  
  /**
    * The `type` of an action identifies to the consumer the nature of the action that has occurred.
    * Two actions with the same `type` MUST be strictly equivalent (using `===`)
    */
  var `type`: Type = js.native
}
object FluxStandardAction {
  
  @scala.inline
  def apply[Type /* <: String */, Payload, Meta](`type`: Type): FluxStandardAction[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxStandardAction[Type, Payload, Meta]]
  }
  
  @scala.inline
  implicit class FluxStandardActionOps[Self <: FluxStandardAction[_, _, _], Type /* <: String */, Payload, Meta] (val x: Self with (FluxStandardAction[Type, Payload, Meta])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setMeta(value: Meta): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
