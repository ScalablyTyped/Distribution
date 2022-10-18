package typings.entities

import typings.entities.libEsmGeneratedEncodeHtmlMod.EncodeTrieNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait N extends StObject {
    
    var n: Double | (Map[Double, EncodeTrieNode])
    
    var o: js.UndefOr[String] = js.undefined
    
    var v: js.UndefOr[String] = js.undefined
  }
  object N {
    
    inline def apply(n: Double | (Map[Double, EncodeTrieNode])): N = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[N]
    }
    
    extension [Self <: N](x: Self) {
      
      inline def setN(value: Double | (Map[Double, EncodeTrieNode])): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setO(value: String): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setOUndefined: Self = StObject.set(x, "o", js.undefined)
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    }
  }
  
  trait O extends StObject {
    
    var n: Double | (Map[Double, typings.entities.libGeneratedEncodeHtmlMod.EncodeTrieNode])
    
    var o: js.UndefOr[String] = js.undefined
    
    var v: js.UndefOr[String] = js.undefined
  }
  object O {
    
    inline def apply(n: Double | (Map[Double, typings.entities.libGeneratedEncodeHtmlMod.EncodeTrieNode])): O = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[O]
    }
    
    extension [Self <: O](x: Self) {
      
      inline def setN(value: Double | (Map[Double, typings.entities.libGeneratedEncodeHtmlMod.EncodeTrieNode])): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setO(value: String): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setOUndefined: Self = StObject.set(x, "o", js.undefined)
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    }
  }
}
