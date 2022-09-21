package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateMapEntry extends StObject {
  
  /**
    * A set of Certificates defines for the given `hostname`. There can be defined up to fifteen certificates in each Certificate Map Entry. Each certificate must match pattern `projects/x/locations/x/certificates/x`.
    */
  var certificates: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The creation timestamp of a Certificate Map Entry.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One or more paragraphs of text description of a certificate map entry.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A Hostname (FQDN, e.g. `example.com`) or a wildcard hostname expression (`*.example.com`) for a set of hostnames with common suffix. Used as Server Name Indication (SNI) for selecting a proper certificate.
    */
  var hostname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of labels associated with a Certificate Map Entry.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * A predefined matcher for particular cases, other than SNI selection.
    */
  var matcher: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A user-defined name of the Certificate Map Entry. Certificate Map Entry names must be unique globally and match pattern `projects/x/locations/x/certificateMaps/x/certificateMapEntries/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A serving state of this Certificate Map Entry.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The update timestamp of a Certificate Map Entry.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertificateMapEntry {
  
  inline def apply(): SchemaCertificateMapEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateMapEntry]
  }
  
  extension [Self <: SchemaCertificateMapEntry](x: Self) {
    
    inline def setCertificates(value: js.Array[String]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesNull: Self = StObject.set(x, "certificates", null)
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: String*): Self = StObject.set(x, "certificates", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMatcher(value: String): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    inline def setMatcherNull: Self = StObject.set(x, "matcher", null)
    
    inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
