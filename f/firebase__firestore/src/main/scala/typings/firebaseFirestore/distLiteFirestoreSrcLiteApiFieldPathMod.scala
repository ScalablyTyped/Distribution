package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLiteApiFieldPathMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/field_path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/field_path", "FieldPath")
  @js.native
  open class FieldPath protected () extends StObject {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
    
    /** Internal representation of a Firestore field path. */
    val _internalPath: typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath = js.native
    
    /**
      * Returns true if this `FieldPath` is equal to the provided one.
      *
      * @param other - The `FieldPath` to compare against.
      * @returns true if this `FieldPath` is equal to the provided one.
      */
    def isEqual(other: FieldPath): Boolean = js.native
  }
  
  inline def documentId(): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[FieldPath]
}
