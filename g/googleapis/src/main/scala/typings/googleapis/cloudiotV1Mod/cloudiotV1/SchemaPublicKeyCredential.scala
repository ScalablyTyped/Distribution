package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A public key format and data.
  */
@js.native
trait SchemaPublicKeyCredential extends StObject {
  
  /**
    * The format of the key.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * The key data.
    */
  var key: js.UndefOr[String] = js.native
}
object SchemaPublicKeyCredential {
  
  @scala.inline
  def apply(): SchemaPublicKeyCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKeyCredential]
  }
  
  @scala.inline
  implicit class SchemaPublicKeyCredentialMutableBuilder[Self <: SchemaPublicKeyCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
