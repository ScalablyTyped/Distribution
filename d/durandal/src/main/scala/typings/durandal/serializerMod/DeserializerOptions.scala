package typings.durandal.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeserializerOptions extends js.Object {
  
  /**
    * Gets the constructor based on the type id.
    * @param {string} typeId The type id.
    * @returns {Function} The constructor.
    */
  def getConstructor(typeId: String): js.Function0[_] = js.native
  
  /**
    * Gets the type id for an object instance, using the configured `typeAttribute`.
    * @param {object} object The object to serialize.
    * @returns {string} The type.
    */
  def getTypeId(`object`: js.Any): String = js.native
  
  /**
    * The default reviver function used during deserialization. By default is detects type properties on objects and uses them to re-construct the correct object using the provided constructor mapping.
    * @param {string} key The attribute key.
    * @param {object} value The object value associated with the key.
    * @returns {object} The value.
    */
  def reviver(key: String, value: js.Any): js.Any = js.native
}
object DeserializerOptions {
  
  @scala.inline
  def apply(
    getConstructor: String => js.Function0[_],
    getTypeId: js.Any => String,
    reviver: (String, js.Any) => js.Any
  ): DeserializerOptions = {
    val __obj = js.Dynamic.literal(getConstructor = js.Any.fromFunction1(getConstructor), getTypeId = js.Any.fromFunction1(getTypeId), reviver = js.Any.fromFunction2(reviver))
    __obj.asInstanceOf[DeserializerOptions]
  }
  
  @scala.inline
  implicit class DeserializerOptionsOps[Self <: DeserializerOptions] (val x: Self) extends AnyVal {
    
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
    def setGetConstructor(value: String => js.Function0[_]): Self = this.set("getConstructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTypeId(value: js.Any => String): Self = this.set("getTypeId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReviver(value: (String, js.Any) => js.Any): Self = this.set("reviver", js.Any.fromFunction2(value))
  }
}
