package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var key: DocumentKey
}
object `30` {
  
  inline def apply(key: DocumentKey): `30` = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[`30`]
  }
  
  extension [Self <: `30`](x: Self) {
    
    inline def setKey(value: DocumentKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
