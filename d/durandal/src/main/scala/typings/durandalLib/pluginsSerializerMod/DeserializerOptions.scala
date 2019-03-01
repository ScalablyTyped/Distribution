package typings
package durandalLib.pluginsSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializerOptions extends js.Object {
  /**
    * Gets the constructor based on the type id.
    * @param {string} typeId The type id.
    * @returns {Function} The constructor.
    */
  def getConstructor(typeId: java.lang.String): js.Function0[_]
  /**
    * Gets the type id for an object instance, using the configured `typeAttribute`.
    * @param {object} object The object to serialize.
    * @returns {string} The type.
    */
  def getTypeId(`object`: js.Any): java.lang.String
  /**
    * The default reviver function used during deserialization. By default is detects type properties on objects and uses them to re-construct the correct object using the provided constructor mapping.
    * @param {string} key The attribute key.
    * @param {object} value The object value associated with the key.
    * @returns {object} The value.
    */
  def reviver(key: java.lang.String, value: js.Any): js.Any
}

object DeserializerOptions {
  @scala.inline
  def apply(
    getConstructor: js.Function1[java.lang.String, js.Function0[_]],
    getTypeId: js.Function1[js.Any, java.lang.String],
    reviver: js.Function2[java.lang.String, js.Any, js.Any]
  ): DeserializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getConstructor")(getConstructor)
    __obj.updateDynamic("getTypeId")(getTypeId)
    __obj.updateDynamic("reviver")(reviver)
    __obj.asInstanceOf[DeserializerOptions]
  }
}

