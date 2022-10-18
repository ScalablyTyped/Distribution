package typings.firebaseFirestoreCompat

import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiFieldPathMod {
  
  @JSImport("@firebase/firestore-compat/dist/src/api/field_path", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.firebaseFirestoreTypes.mod.FieldPath
       with Compat[typings.firebaseFirestore.mod.FieldPath] {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
    
    /* CompleteClass */
    var _delegate: typings.firebaseFirestore.mod.FieldPath = js.native
  }
  /* static members */
  object FieldPath {
    
    @JSImport("@firebase/firestore-compat/dist/src/api/field_path", "FieldPath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def documentId(): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[FieldPath]
  }
}
