package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`object`
import typings.devtoolsProtocol.devtoolsProtocolStrings.accessor
import typings.devtoolsProtocol.devtoolsProtocolStrings.array
import typings.devtoolsProtocol.devtoolsProtocolStrings.arraybuffer
import typings.devtoolsProtocol.devtoolsProtocolStrings.bigint
import typings.devtoolsProtocol.devtoolsProtocolStrings.boolean
import typings.devtoolsProtocol.devtoolsProtocolStrings.dataview
import typings.devtoolsProtocol.devtoolsProtocolStrings.date
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.function
import typings.devtoolsProtocol.devtoolsProtocolStrings.generator
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
import typings.devtoolsProtocol.devtoolsProtocolStrings.wasmvalue
import typings.devtoolsProtocol.devtoolsProtocolStrings.weakmap
import typings.devtoolsProtocol.devtoolsProtocolStrings.weakset
import typings.devtoolsProtocol.devtoolsProtocolStrings.webassemblymemory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyPreview extends StObject {
  
  /**
    * Property name.
    */
  var name: String
  
  /**
    * Object subtype hint. Specified for `object` type values only. (PropertyPreviewSubtype enum)
    */
  var subtype: js.UndefOr[
    array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | webassemblymemory | wasmvalue
  ] = js.undefined
  
  /**
    * Object type. Accessor means that the property itself is an accessor property. (PropertyPreviewType enum)
    */
  var `type`: `object` | function | undefined | string | number | boolean | symbol | accessor | bigint
  
  /**
    * User-friendly property value string.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * Nested value preview.
    */
  var valuePreview: js.UndefOr[ObjectPreview] = js.undefined
}
object PropertyPreview {
  
  inline def apply(
    name: String,
    `type`: `object` | function | undefined | string | number | boolean | symbol | accessor | bigint
  ): PropertyPreview = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPreview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyPreview] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubtype(
      value: array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | webassemblymemory | wasmvalue
    ): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setType(value: `object` | function | undefined | string | number | boolean | symbol | accessor | bigint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValuePreview(value: ObjectPreview): Self = StObject.set(x, "valuePreview", value.asInstanceOf[js.Any])
    
    inline def setValuePreviewUndefined: Self = StObject.set(x, "valuePreview", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
