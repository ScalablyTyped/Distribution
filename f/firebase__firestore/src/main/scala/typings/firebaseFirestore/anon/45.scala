package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var key: DocumentKey
}
object `45` {
  
  inline def apply(key: DocumentKey): `45` = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[`45`]
  }
  
  extension [Self <: `45`](x: Self) {
    
    inline def setKey(value: DocumentKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
