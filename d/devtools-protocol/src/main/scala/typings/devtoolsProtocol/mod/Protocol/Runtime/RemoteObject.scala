package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`object`
import typings.devtoolsProtocol.devtoolsProtocolStrings.array
import typings.devtoolsProtocol.devtoolsProtocolStrings.arraybuffer
import typings.devtoolsProtocol.devtoolsProtocolStrings.bigint
import typings.devtoolsProtocol.devtoolsProtocolStrings.boolean
import typings.devtoolsProtocol.devtoolsProtocolStrings.dataview
import typings.devtoolsProtocol.devtoolsProtocolStrings.date
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.externref
import typings.devtoolsProtocol.devtoolsProtocolStrings.f32
import typings.devtoolsProtocol.devtoolsProtocolStrings.f64
import typings.devtoolsProtocol.devtoolsProtocolStrings.function
import typings.devtoolsProtocol.devtoolsProtocolStrings.generator
import typings.devtoolsProtocol.devtoolsProtocolStrings.i32
import typings.devtoolsProtocol.devtoolsProtocolStrings.i64
import typings.devtoolsProtocol.devtoolsProtocolStrings.iterator
import typings.devtoolsProtocol.devtoolsProtocolStrings.map
import typings.devtoolsProtocol.devtoolsProtocolStrings.node
import typings.devtoolsProtocol.devtoolsProtocolStrings.number
import typings.devtoolsProtocol.devtoolsProtocolStrings.promise
import typings.devtoolsProtocol.devtoolsProtocolStrings.proxy_
import typings.devtoolsProtocol.devtoolsProtocolStrings.regexp
import typings.devtoolsProtocol.devtoolsProtocolStrings.set
import typings.devtoolsProtocol.devtoolsProtocolStrings.string
import typings.devtoolsProtocol.devtoolsProtocolStrings.symbol
import typings.devtoolsProtocol.devtoolsProtocolStrings.typedarray
import typings.devtoolsProtocol.devtoolsProtocolStrings.undefined
import typings.devtoolsProtocol.devtoolsProtocolStrings.v128
import typings.devtoolsProtocol.devtoolsProtocolStrings.wasm
import typings.devtoolsProtocol.devtoolsProtocolStrings.weakmap
import typings.devtoolsProtocol.devtoolsProtocolStrings.weakset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteObject extends js.Object {
  
  /**
    * Object class (constructor) name. Specified for `object` type values only.
    */
  var className: js.UndefOr[String] = js.native
  
  var customPreview: js.UndefOr[CustomPreview] = js.native
  
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Unique object identifier (for non-primitive values).
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  
  /**
    * Preview containing abbreviated property values. Specified for `object` type values only.
    */
  var preview: js.UndefOr[ObjectPreview] = js.native
  
  /**
    * Object subtype hint. Specified for `object` or `wasm` type values only. (RemoteObjectSubtype enum)
    */
  var subtype: js.UndefOr[
    array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | i32 | i64 | f32 | f64 | v128 | externref
  ] = js.native
  
  /**
    * Object type. (RemoteObjectType enum)
    */
  var `type`: `object` | function | undefined | string | number | boolean | symbol | bigint | wasm = js.native
  
  /**
    * Primitive value which can not be JSON-stringified does not have `value`, but gets this
    * property.
    */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.native
  
  /**
    * Remote object value in case of primitive values or JSON values (if it was requested).
    */
  var value: js.UndefOr[js.Any] = js.native
}
object RemoteObject {
  
  @scala.inline
  def apply(`type`: `object` | function | undefined | string | number | boolean | symbol | bigint | wasm): RemoteObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteObject]
  }
  
  @scala.inline
  implicit class RemoteObjectOps[Self <: RemoteObject] (val x: Self) extends AnyVal {
    
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
    def setType(value: `object` | function | undefined | string | number | boolean | symbol | bigint | wasm): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCustomPreview(value: CustomPreview): Self = this.set("customPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomPreview: Self = this.set("customPreview", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setPreview(value: ObjectPreview): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setSubtype(
      value: array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | i32 | i64 | f32 | f64 | v128 | externref
    ): Self = this.set("subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
    
    @scala.inline
    def setUnserializableValue(value: UnserializableValue): Self = this.set("unserializableValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnserializableValue: Self = this.set("unserializableValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
