package typings.firebaseFirestore

import typings.firebaseFirestore.srcApiParseContextMod.ParseContext
import typings.firebaseFirestore.srcModelMutationMod.FieldTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreSrcLiteApiFieldValueMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/lite-api/field_value", "FieldValue")
  @js.native
  abstract class FieldValue protected () extends StObject {
    /**
      * @param _methodName - The public API endpoint that returns this class.
      * @hideconstructor
      */
    def this(_methodName: String) = this()
    
    var _methodName: String = js.native
    
    def _toFieldTransform(context: ParseContext): FieldTransform | Null = js.native
    
    /** Compares `FieldValue`s for equality. */
    def isEqual(other: FieldValue): Boolean = js.native
  }
}
