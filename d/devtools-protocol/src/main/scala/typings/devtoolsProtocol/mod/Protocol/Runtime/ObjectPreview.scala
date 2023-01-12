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

trait ObjectPreview extends StObject {
  
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * List of the entries. Specified for `map` and `set` subtype values only.
    */
  var entries: js.UndefOr[js.Array[EntryPreview]] = js.undefined
  
  /**
    * True iff some of the properties or entries of the original object did not fit.
    */
  var overflow: Boolean
  
  /**
    * List of the properties.
    */
  var properties: js.Array[PropertyPreview]
  
  /**
    * Object subtype hint. Specified for `object` type values only. (ObjectPreviewSubtype enum)
    */
  var subtype: js.UndefOr[
    array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | webassemblymemory | wasmvalue
  ] = js.undefined
  
  /**
    * Object type. (ObjectPreviewType enum)
    */
  var `type`: `object` | function | undefined | string | number | boolean | symbol | bigint
}
object ObjectPreview {
  
  inline def apply(
    overflow: Boolean,
    properties: js.Array[PropertyPreview],
    `type`: `object` | function | undefined | string | number | boolean | symbol | bigint
  ): ObjectPreview = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPreview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectPreview] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntries(value: js.Array[EntryPreview]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: EntryPreview*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[PropertyPreview]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: PropertyPreview*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setSubtype(
      value: array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | webassemblymemory | wasmvalue
    ): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setType(value: `object` | function | undefined | string | number | boolean | symbol | bigint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
