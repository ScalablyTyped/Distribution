package typings.firebaseFirestore.anon

import typings.firebaseFirestore.firestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  var key: DocumentKey
}
object `34` {
  
  inline def apply(key: DocumentKey): `34` = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setKey(value: DocumentKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
