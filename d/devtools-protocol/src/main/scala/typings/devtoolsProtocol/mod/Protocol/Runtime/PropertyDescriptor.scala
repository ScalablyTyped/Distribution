package typings.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyDescriptor extends js.Object {
  /**
    * True if the type of this property descriptor may be changed and if the property may be
    * deleted from the corresponding object.
    */
  var configurable: Boolean = js.native
  /**
    * True if this property shows up during enumeration of the properties on the corresponding
    * object.
    */
  var enumerable: Boolean = js.native
  /**
    * A function which serves as a getter for the property, or `undefined` if there is no getter
    * (accessor descriptors only).
    */
  var get: js.UndefOr[RemoteObject] = js.native
  /**
    * True if the property is owned for the object.
    */
  var isOwn: js.UndefOr[Boolean] = js.native
  /**
    * Property name or symbol description.
    */
  var name: String = js.native
  /**
    * A function which serves as a setter for the property, or `undefined` if there is no setter
    * (accessor descriptors only).
    */
  var set: js.UndefOr[RemoteObject] = js.native
  /**
    * Property symbol object, if the property is of the `symbol` type.
    */
  var symbol: js.UndefOr[RemoteObject] = js.native
  /**
    * The value associated with the property.
    */
  var value: js.UndefOr[RemoteObject] = js.native
  /**
    * True if the result was thrown during the evaluation.
    */
  var wasThrown: js.UndefOr[Boolean] = js.native
  /**
    * True if the value associated with the property may be changed (data descriptors only).
    */
  var writable: js.UndefOr[Boolean] = js.native
}

object PropertyDescriptor {
  @scala.inline
  def apply(configurable: Boolean, enumerable: Boolean, name: String): PropertyDescriptor = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDescriptor]
  }
  @scala.inline
  implicit class PropertyDescriptorOps[Self <: PropertyDescriptor] (val x: Self) extends AnyVal {
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
    def setConfigurable(value: Boolean): Self = this.set("configurable", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnumerable(value: Boolean): Self = this.set("enumerable", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: RemoteObject): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setIsOwn(value: Boolean): Self = this.set("isOwn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOwn: Self = this.set("isOwn", js.undefined)
    @scala.inline
    def setSet(value: RemoteObject): Self = this.set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    @scala.inline
    def setSymbol(value: RemoteObject): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setValue(value: RemoteObject): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWasThrown(value: Boolean): Self = this.set("wasThrown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWasThrown: Self = this.set("wasThrown", js.undefined)
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
  }
  
}

