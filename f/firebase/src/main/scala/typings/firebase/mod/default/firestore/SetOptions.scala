package typings.firebase.mod.default.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetOptions extends StObject {
  
  /**
    * Changes the behavior of a set() call to only replace the values specified
    * in its data argument. Fields omitted from the set() call remain
    * untouched.
    */
  val merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Changes the behavior of set() calls to only replace the specified field
    * paths. Any field path that is not specified is ignored and remains
    * untouched.
    */
  val mergeFields: js.UndefOr[js.Array[String | typings.firebase.mod.firebase.firestore.FieldPath]] = js.undefined
}
object SetOptions {
  
  inline def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  
  extension [Self <: SetOptions](x: Self) {
    
    inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeFields(value: js.Array[String | typings.firebase.mod.firebase.firestore.FieldPath]): Self = StObject.set(x, "mergeFields", value.asInstanceOf[js.Any])
    
    inline def setMergeFieldsUndefined: Self = StObject.set(x, "mergeFields", js.undefined)
    
    inline def setMergeFieldsVarargs(value: (String | typings.firebase.mod.firebase.firestore.FieldPath)*): Self = StObject.set(x, "mergeFields", js.Array(value :_*))
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
  }
}
