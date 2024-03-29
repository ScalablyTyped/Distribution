package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyDocumentKey extends StObject {
  
  var key: DocumentKey
}
object KeyDocumentKey {
  
  inline def apply(key: DocumentKey): KeyDocumentKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyDocumentKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyDocumentKey] (val x: Self) extends AnyVal {
    
    inline def setKey(value: DocumentKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
