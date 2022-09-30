package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Document. */
trait IDocument extends StObject {
  
  /** Document createTime */
  var createTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Document fields */
  var fields: js.UndefOr[StringDictionary[IValue] | Null] = js.undefined
  
  /** Document name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Document updateTime */
  var updateTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IDocument {
  
  inline def apply(): IDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocument]
  }
  
  extension [Self <: IDocument](x: Self) {
    
    inline def setCreateTime(value: ITimestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFields(value: StringDictionary[IValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: ITimestamp): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
