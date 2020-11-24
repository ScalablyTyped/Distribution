package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of string parameters to supply when the action method is invoked. For
  * example, consider three snooze buttons: snooze now, snooze 1 day, snooze
  * next week. You might use action method = snooze(), passing the snooze type
  * and snooze time in the list of string parameters.
  */
@js.native
trait SchemaActionParameter extends js.Object {
  
  /**
    * The name of the parameter for the action script.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * The value of the parameter.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaActionParameter {
  
  @scala.inline
  def apply(): SchemaActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActionParameter]
  }
  
  @scala.inline
  implicit class SchemaActionParameterOps[Self <: SchemaActionParameter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
