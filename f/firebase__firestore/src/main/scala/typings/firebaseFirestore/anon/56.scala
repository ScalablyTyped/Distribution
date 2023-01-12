package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPrivateMod.FieldPath
import typings.firebaseFirestore.distPrivateMod.SetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56`
  extends StObject
     with SetOptions {
  
  val mergeFields: js.UndefOr[js.Array[String | FieldPath]] = js.undefined
}
object `56` {
  
  inline def apply(): `56` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`56`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `56`] (val x: Self) extends AnyVal {
    
    inline def setMergeFields(value: js.Array[String | FieldPath]): Self = StObject.set(x, "mergeFields", value.asInstanceOf[js.Any])
    
    inline def setMergeFieldsUndefined: Self = StObject.set(x, "mergeFields", js.undefined)
    
    inline def setMergeFieldsVarargs(value: (String | FieldPath)*): Self = StObject.set(x, "mergeFields", js.Array(value*))
  }
}
