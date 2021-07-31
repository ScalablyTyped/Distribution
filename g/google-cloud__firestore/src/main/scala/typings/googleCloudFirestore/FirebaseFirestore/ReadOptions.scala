package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOptions extends StObject {
  
  /**
    * Specifies the set of fields to return and reduces the amount of data
    * transmitted by the backend.
    *
    * Adding a field mask does not filter results. Documents do not need to
    * contain values for all the fields in the mask to be part of the result
    * set.
    */
  val fieldMask: js.UndefOr[js.Array[String | FieldPath]] = js.undefined
}
object ReadOptions {
  
  @scala.inline
  def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  
  @scala.inline
  implicit class ReadOptionsMutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldMask(value: js.Array[String | FieldPath]): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    @scala.inline
    def setFieldMaskVarargs(value: (String | FieldPath)*): Self = StObject.set(x, "fieldMask", js.Array(value :_*))
  }
}
