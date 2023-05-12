package typings.firebaseFirestore.distLiteFirestoreTestUnitSpecsSpecTestRunnerMod

import typings.firebaseFirestore.distLiteFirestoreSrcModelObjectValueMod.JsonObject
import typings.firebaseFirestore.distLiteFirestoreTestUtilHelpersMod.TestSnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecDocument extends StObject {
  
  var createTime: TestSnapshotVersion
  
  var key: String
  
  var options: js.UndefOr[DocumentOptions] = js.undefined
  
  var value: JsonObject[Any] | Null
  
  var version: TestSnapshotVersion
}
object SpecDocument {
  
  inline def apply(createTime: TestSnapshotVersion, key: String, version: TestSnapshotVersion): SpecDocument = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[SpecDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecDocument] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: TestSnapshotVersion): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: DocumentOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setValue(value: JsonObject[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setVersion(value: TestSnapshotVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
