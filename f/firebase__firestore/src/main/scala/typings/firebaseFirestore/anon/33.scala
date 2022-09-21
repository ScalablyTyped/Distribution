package typings.firebaseFirestore.anon

import typings.firebaseFirestore.packagesFirestoreSrcLiteApiFieldPathMod.FieldPath
import typings.firebaseFirestore.packagesFirestoreSrcLiteApiReferenceMod.SetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33`
  extends StObject
     with SetOptions {
  
  val mergeFields: js.UndefOr[js.Array[String | FieldPath]] = js.undefined
}
object `33` {
  
  inline def apply(): `33` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`33`]
  }
  
  extension [Self <: `33`](x: Self) {
    
    inline def setMergeFields(value: js.Array[String | FieldPath]): Self = StObject.set(x, "mergeFields", value.asInstanceOf[js.Any])
    
    inline def setMergeFieldsUndefined: Self = StObject.set(x, "mergeFields", js.undefined)
    
    inline def setMergeFieldsVarargs(value: (String | FieldPath)*): Self = StObject.set(x, "mergeFields", js.Array(value*))
  }
}
