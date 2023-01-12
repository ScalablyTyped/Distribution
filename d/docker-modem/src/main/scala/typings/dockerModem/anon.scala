package typings.dockerModem

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base64
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var base64: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
  }
  object Base64 {
    
    inline def apply(): Base64 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Base64]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Base64] (val x: Self) extends AnyVal {
      
      inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var _body: js.UndefOr[Any] = js.undefined
    
    var _query: js.UndefOr[js.Object] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def set_body(value: Any): Self = StObject.set(x, "_body", value.asInstanceOf[js.Any])
      
      inline def set_bodyUndefined: Self = StObject.set(x, "_body", js.undefined)
      
      inline def set_query(value: js.Object): Self = StObject.set(x, "_query", value.asInstanceOf[js.Any])
      
      inline def set_queryUndefined: Self = StObject.set(x, "_query", js.undefined)
    }
  }
  
  trait DictkeyBase64
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var base64: js.UndefOr[String] = js.undefined
  }
  object DictkeyBase64 {
    
    inline def apply(): DictkeyBase64 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictkeyBase64]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DictkeyBase64] (val x: Self) extends AnyVal {
      
      inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
    }
  }
}
