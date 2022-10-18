package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcApiFieldPathMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/api/field_path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/api/field_path", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  inline def documentId(): typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiFieldPathMod.FieldPath]
}
