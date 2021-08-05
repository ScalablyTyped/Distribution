package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A public key format and data.
  */
trait SchemaPublicKeyCredential extends StObject {
  
  /**
    * The format of the key.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * The key data.
    */
  var key: js.UndefOr[String] = js.undefined
}
object SchemaPublicKeyCredential {
  
  inline def apply(): SchemaPublicKeyCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKeyCredential]
  }
  
  extension [Self <: SchemaPublicKeyCredential](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
