package typings.ethereumjsBlockchain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Genesis extends StObject {
    
    var genesis: js.Any
    
    var heads: js.Any
    
    var rawHead: js.Any
  }
  object Genesis {
    
    inline def apply(genesis: js.Any, heads: js.Any, rawHead: js.Any): Genesis = {
      val __obj = js.Dynamic.literal(genesis = genesis.asInstanceOf[js.Any], heads = heads.asInstanceOf[js.Any], rawHead = rawHead.asInstanceOf[js.Any])
      __obj.asInstanceOf[Genesis]
    }
    
    extension [Self <: Genesis](x: Self) {
      
      inline def setGenesis(value: js.Any): Self = StObject.set(x, "genesis", value.asInstanceOf[js.Any])
      
      inline def setHeads(value: js.Any): Self = StObject.set(x, "heads", value.asInstanceOf[js.Any])
      
      inline def setRawHead(value: js.Any): Self = StObject.set(x, "rawHead", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var keyEncoding: String
    
    var `type`: String
    
    var value: js.Any
    
    var valueEncoding: String
  }
  object Key {
    
    inline def apply(key: String, keyEncoding: String, `type`: String, value: js.Any, valueEncoding: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyEncoding = keyEncoding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueEncoding = valueEncoding.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyEncoding(value: String): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueEncoding(value: String): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
    }
  }
}
