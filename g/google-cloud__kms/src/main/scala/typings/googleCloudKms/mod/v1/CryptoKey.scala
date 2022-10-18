package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleProtobuf.googleProtobufTimestampPbMod.Timestamp.AsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKey extends StObject {
  
  var createTime: AsObject
  
  var labels: StringDictionary[String]
  
  var name: String
  
  var nextRotationTime: js.UndefOr[AsObject] = js.undefined
  
  var primary: CryptoKeyVersion
  
  var purpose: CryptoKeyPurpose
  
  var versionTemplate: CryptoKeyVersionTemplate
}
object CryptoKey {
  
  inline def apply(
    createTime: AsObject,
    labels: StringDictionary[String],
    name: String,
    primary: CryptoKeyVersion,
    purpose: CryptoKeyPurpose,
    versionTemplate: CryptoKeyVersionTemplate
  ): CryptoKey = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], versionTemplate = versionTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
  
  extension [Self <: CryptoKey](x: Self) {
    
    inline def setCreateTime(value: AsObject): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNextRotationTime(value: AsObject): Self = StObject.set(x, "nextRotationTime", value.asInstanceOf[js.Any])
    
    inline def setNextRotationTimeUndefined: Self = StObject.set(x, "nextRotationTime", js.undefined)
    
    inline def setPrimary(value: CryptoKeyVersion): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPurpose(value: CryptoKeyPurpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setVersionTemplate(value: CryptoKeyVersionTemplate): Self = StObject.set(x, "versionTemplate", value.asInstanceOf[js.Any])
  }
}
