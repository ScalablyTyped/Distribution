package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPrivateMod.FieldPath
import typings.firebaseFirestore.distPrivateMod.SetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55`
  extends StObject
     with SetOptions {
  
  val mergeFields: js.UndefOr[js.Array[String | FieldPath]] = js.undefined
}
object `55` {
  
  inline def apply(): `55` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`55`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `55`] (val x: Self) extends AnyVal {
    
    inline def setMergeFields(value: js.Array[String | FieldPath]): Self = StObject.set(x, "mergeFields", value.asInstanceOf[js.Any])
    
    inline def setMergeFieldsUndefined: Self = StObject.set(x, "mergeFields", js.undefined)
    
    inline def setMergeFieldsVarargs(value: (String | FieldPath)*): Self = StObject.set(x, "mergeFields", js.Array(value*))
  }
}
