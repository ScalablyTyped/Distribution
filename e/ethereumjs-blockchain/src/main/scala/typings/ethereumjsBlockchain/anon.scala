package typings.ethereumjsBlockchain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Genesis extends StObject {
    
    var genesis: Any
    
    var heads: Any
    
    var rawHead: Any
  }
  object Genesis {
    
    inline def apply(genesis: Any, heads: Any, rawHead: Any): Genesis = {
      val __obj = js.Dynamic.literal(genesis = genesis.asInstanceOf[js.Any], heads = heads.asInstanceOf[js.Any], rawHead = rawHead.asInstanceOf[js.Any])
      __obj.asInstanceOf[Genesis]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Genesis] (val x: Self) extends AnyVal {
      
      inline def setGenesis(value: Any): Self = StObject.set(x, "genesis", value.asInstanceOf[js.Any])
      
      inline def setHeads(value: Any): Self = StObject.set(x, "heads", value.asInstanceOf[js.Any])
      
      inline def setRawHead(value: Any): Self = StObject.set(x, "rawHead", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var keyEncoding: String
    
    var `type`: String
    
    var value: Any
    
    var valueEncoding: String
  }
  object Key {
    
    inline def apply(key: String, keyEncoding: String, `type`: String, value: Any, valueEncoding: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyEncoding = keyEncoding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueEncoding = valueEncoding.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyEncoding(value: String): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueEncoding(value: String): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
    }
  }
}
