package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcApiFieldPathMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/field_path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/field_path", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldPathMod.FieldPath {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  inline def documentId(): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldPathMod.FieldPath]
}
