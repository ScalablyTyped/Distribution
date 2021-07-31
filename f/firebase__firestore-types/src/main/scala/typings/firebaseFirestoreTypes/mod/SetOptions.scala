package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetOptions extends StObject {
  
  val merge: js.UndefOr[Boolean] = js.undefined
  
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
