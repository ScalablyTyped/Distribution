package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`object`
import typings.devtoolsProtocol.devtoolsProtocolStrings.accessor
import typings.devtoolsProtocol.devtoolsProtocolStrings.array
import typings.devtoolsProtocol.devtoolsProtocolStrings.bigint
import typings.devtoolsProtocol.devtoolsProtocolStrings.boolean
import typings.devtoolsProtocol.devtoolsProtocolStrings.date
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.function
import typings.devtoolsProtocol.devtoolsProtocolStrings.generator
import typings.devtoolsProtocol.devtoolsProtocolStrings.iterator
import typings.devtoolsProtocol.devtoolsProtocolStrings.map
import typings.devtoolsProtocol.devtoolsProtocolStrings.node
import typings.devtoolsProtocol.devtoolsProtocolStrings.number
import typings.devtoolsProtocol.devtoolsProtocolStrings.regexp
import typings.devtoolsProtocol.devtoolsProtocolStrings.set
import typings.devtoolsProtocol.devtoolsProtocolStrings.string
import typings.devtoolsProtocol.devtoolsProtocolStrings.symbol
import typings.devtoolsProtocol.devtoolsProtocolStrings.undefined
import typings.devtoolsProtocol.devtoolsProtocolStrings.weakmap
import typings.devtoolsProtocol.devtoolsProtocolStrings.weakset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyPreview extends js.Object {
  
  /**
    * Property name.
    */
  var name: String = js.native
  
  /**
    * Object subtype hint. Specified for `object` type values only. (PropertyPreviewSubtype enum)
    */
  var subtype: js.UndefOr[
    array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error
  ] = js.native
  
  /**
    * Object type. Accessor means that the property itself is an accessor property. (PropertyPreviewType enum)
    */
  var `type`: `object` | function | undefined | string | number | boolean | symbol | accessor | bigint = js.native
  
  /**
    * User-friendly property value string.
    */
  var value: js.UndefOr[String] = js.native
  
  /**
    * Nested value preview.
    */
  var valuePreview: js.UndefOr[ObjectPreview] = js.native
}
object PropertyPreview {
  
  @scala.inline
  def apply(
    name: String,
    `type`: `object` | function | undefined | string | number | boolean | symbol | accessor | bigint
  ): PropertyPreview = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPreview]
  }
  
  @scala.inline
  implicit class PropertyPreviewOps[Self <: PropertyPreview] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `object` | function | undefined | string | number | boolean | symbol | accessor | bigint): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtype(
      value: array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error
    ): Self = this.set("subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValuePreview(value: ObjectPreview): Self = this.set("valuePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuePreview: Self = this.set("valuePreview", js.undefined)
  }
}
