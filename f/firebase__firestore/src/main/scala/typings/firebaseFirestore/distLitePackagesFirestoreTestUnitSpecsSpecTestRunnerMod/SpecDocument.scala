package typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelObjectValueMod.JsonObject
import typings.firebaseFirestore.distLitePackagesFirestoreTestUtilHelpersMod.TestSnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecDocument extends StObject {
  
  var key: String
  
  var options: js.UndefOr[DocumentOptions] = js.undefined
  
  var value: JsonObject[Any] | Null
  
  var version: TestSnapshotVersion
}
object SpecDocument {
  
  inline def apply(key: String, version: TestSnapshotVersion): SpecDocument = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[SpecDocument]
  }
  
  extension [Self <: SpecDocument](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: DocumentOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setValue(value: JsonObject[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setVersion(value: TestSnapshotVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
