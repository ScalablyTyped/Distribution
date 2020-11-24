package typings.formSerialize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[Result] extends js.Object {
  
  /** If true serialize disabled fields. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** If true serialize empty fields */
  var empty: js.UndefOr[Boolean] = js.native
  
  /** Configure the output type. If true, the output will be a js object. */
  var hash: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional serializer function to override the default one. The function takes 3 arguments (result, key,
    * value) and should return new result hash and url encoded str serializers are provided with this module
    */
  var serializer: js.UndefOr[js.Function3[/* result */ Result, /* key */ String, /* value */ String, Result]] = js.native
}
object Options {
  
  @scala.inline
  def apply[Result](): Options[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Result]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], Result] (val x: Self with Options[Result]) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setHash(value: Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setSerializer(value: (/* result */ Result, /* key */ String, /* value */ String) => Result): Self = this.set("serializer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSerializer: Self = this.set("serializer", js.undefined)
  }
}
