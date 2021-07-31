package typings.googleCloudFirestore.FirebaseFirestore

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
    *
    * It is an error to pass a SetOptions object to a set() call that is
    * missing a value for any of the fields specified here.
    */
  val mergeFields: js.UndefOr[js.Array[String | FieldPath]] = js.undefined
}
object SetOptions {
  
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  
  @scala.inline
  implicit class SetOptionsMutableBuilder[Self <: SetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeFields(value: js.Array[String | FieldPath]): Self = StObject.set(x, "mergeFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeFieldsUndefined: Self = StObject.set(x, "mergeFields", js.undefined)
    
    @scala.inline
    def setMergeFieldsVarargs(value: (String | FieldPath)*): Self = StObject.set(x, "mergeFields", js.Array(value :_*))
    
    @scala.inline
    def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
  }
}
