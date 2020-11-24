package typings.durandal.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializerOptions extends js.Object {
  
  /**
    * The default replacer function used during serialization. By default properties starting with '_' or '$' are removed from the serialized object.
    * @param {string} key The object key to check.
    * @param {object} value The object value to check.
    * @returns {object} The value to serialize.
    */
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  
  /**
    * The amount of space to use for indentation when writing out JSON.
    * @default undefined
    */
  var space: js.Any = js.native
}
object SerializerOptions {
  
  @scala.inline
  def apply(space: js.Any): SerializerOptions = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializerOptions]
  }
  
  @scala.inline
  implicit class SerializerOptionsOps[Self <: SerializerOptions] (val x: Self) extends AnyVal {
    
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
    def setSpace(value: js.Any): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("replacer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
  }
}
