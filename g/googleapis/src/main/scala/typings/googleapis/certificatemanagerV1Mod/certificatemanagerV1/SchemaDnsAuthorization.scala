package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsAuthorization extends StObject {
  
  /**
    * Output only. The creation timestamp of a DnsAuthorization.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One or more paragraphs of text description of a DnsAuthorization.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. DNS Resource Record that needs to be added to DNS configuration.
    */
  var dnsResourceRecord: js.UndefOr[SchemaDnsResourceRecord] = js.undefined
  
  /**
    * Required. Immutable. A domain which is being authorized. A DnsAuthorization resource covers a single domain and its wildcard, e.g. authorization for `example.com` can be used to issue certificates for `example.com` and `*.example.com`.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of labels associated with a DnsAuthorization.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * A user-defined name of the dns authorization. DnsAuthorization names must be unique globally and match pattern `projects/x/locations/x/dnsAuthorizations/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last update timestamp of a DnsAuthorization.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaDnsAuthorization {
  
  inline def apply(): SchemaDnsAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsAuthorization]
  }
  
  extension [Self <: SchemaDnsAuthorization](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDnsResourceRecord(value: SchemaDnsResourceRecord): Self = StObject.set(x, "dnsResourceRecord", value.asInstanceOf[js.Any])
    
    inline def setDnsResourceRecordUndefined: Self = StObject.set(x, "dnsResourceRecord", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
