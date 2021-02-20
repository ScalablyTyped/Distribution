package typings.googleCloudStorage.fileMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionKeyOptions extends StObject {
  
  var encryptionKey: js.UndefOr[String | Buffer] = js.native
  
  var kmsKeyName: js.UndefOr[String] = js.native
}
object EncryptionKeyOptions {
  
  @scala.inline
  def apply(): EncryptionKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionKeyOptions]
  }
  
  @scala.inline
  implicit class EncryptionKeyOptionsMutableBuilder[Self <: EncryptionKeyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionKey(value: String | Buffer): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    @scala.inline
    def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
