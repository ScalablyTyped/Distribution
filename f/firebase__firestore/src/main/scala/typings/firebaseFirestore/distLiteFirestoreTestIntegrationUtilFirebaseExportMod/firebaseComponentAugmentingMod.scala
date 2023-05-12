package typings.firebaseFirestore.distLiteFirestoreTestIntegrationUtilFirebaseExportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object firebaseComponentAugmentingMod {
  
  trait NameServiceMapping extends StObject {
    
    var firestore: typings.firebaseFirestore.distLiteFirestoreSrcApiDatabaseMod.Firestore
  }
  object NameServiceMapping {
    
    inline def apply(firestore: typings.firebaseFirestore.distLiteFirestoreSrcApiDatabaseMod.Firestore): NameServiceMapping = {
      val __obj = js.Dynamic.literal(firestore = firestore.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameServiceMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
      
      inline def setFirestore(value: typings.firebaseFirestore.distLiteFirestoreSrcApiDatabaseMod.Firestore): Self = StObject.set(x, "firestore", value.asInstanceOf[js.Any])
    }
  }
}
