package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEncryptionConfiguration extends StObject {
  
  /**
    * [Optional] Describes the Cloud KMS encryption key that will be used to
    * protect destination BigQuery table. The BigQuery Service Account
    * associated with your project requires access to this encryption key.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
}
object SchemaEncryptionConfiguration {
  
  @scala.inline
  def apply(): SchemaEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class SchemaEncryptionConfigurationMutableBuilder[Self <: SchemaEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
