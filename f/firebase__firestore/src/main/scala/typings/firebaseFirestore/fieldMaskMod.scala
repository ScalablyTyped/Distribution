package typings.firebaseFirestore

import typings.firebaseFirestore.pathMod.FieldPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldMaskMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/model/field_mask", "FieldMask")
  @js.native
  open class FieldMask protected () extends StObject {
    def this(fields: js.Array[FieldPath]) = this()
    
    /**
      * Verifies that `fieldPath` is included by at least one field in this field
      * mask.
      *
      * This is an O(n) operation, where `n` is the size of the field mask.
      */
    def covers(fieldPath: FieldPath): Boolean = js.native
    
    val fields: js.Array[FieldPath] = js.native
    
    def isEqual(other: FieldMask): Boolean = js.native
    
    /**
      * Returns a new FieldMask object that is the result of adding all the given
      * fields paths to this field mask.
      */
    def unionWith(extraFields: js.Array[FieldPath]): FieldMask = js.native
  }
  /* static members */
  object FieldMask {
    
    @JSImport("@firebase/firestore/dist/firestore/src/model/field_mask", "FieldMask")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[FieldMask]
  }
}
