package typings.firebase.mod.firebase.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for asserting ownership of a second factor. This is used to
  * facilitate enrollment of a second factor on an existing user
  * or sign-in of a user who already verified the first factor.
  *
  */
@js.native
trait MultiFactorAssertion extends js.Object {
  
  /**
    * The identifier of the second factor.
    */
  var factorId: String = js.native
}
object MultiFactorAssertion {
  
  @scala.inline
  def apply(factorId: String): MultiFactorAssertion = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorAssertion]
  }
  
  @scala.inline
  implicit class MultiFactorAssertionOps[Self <: MultiFactorAssertion] (val x: Self) extends AnyVal {
    
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
    def setFactorId(value: String): Self = this.set("factorId", value.asInstanceOf[js.Any])
  }
}
