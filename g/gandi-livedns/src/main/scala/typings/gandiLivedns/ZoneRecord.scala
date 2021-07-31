package typings.gandiLivedns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoneRecord extends StObject {
  
  var rrset_name: String
  
  var rrset_ttl: Double
  
  /**
    * One of A, AAA, CNAME, MX, NS, TXT, WKS, SRV, LOC, SPF, SSHFP, DNAME
    */
  var rrset_type: String
  
  var rrset_values: js.Array[String]
}
object ZoneRecord {
  
  @scala.inline
  def apply(rrset_name: String, rrset_ttl: Double, rrset_type: String, rrset_values: js.Array[String]): ZoneRecord = {
    val __obj = js.Dynamic.literal(rrset_name = rrset_name.asInstanceOf[js.Any], rrset_ttl = rrset_ttl.asInstanceOf[js.Any], rrset_type = rrset_type.asInstanceOf[js.Any], rrset_values = rrset_values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneRecord]
  }
  
  @scala.inline
  implicit class ZoneRecordMutableBuilder[Self <: ZoneRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRrset_name(value: String): Self = StObject.set(x, "rrset_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrset_ttl(value: Double): Self = StObject.set(x, "rrset_ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrset_type(value: String): Self = StObject.set(x, "rrset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrset_values(value: js.Array[String]): Self = StObject.set(x, "rrset_values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrset_valuesVarargs(value: String*): Self = StObject.set(x, "rrset_values", js.Array(value :_*))
  }
}
