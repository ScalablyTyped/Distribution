package typings.digitalLinkJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Match extends StObject {
    
    var `match`: String
    
    var remainder: String
    
    var rule: String
  }
  object Match {
    
    inline def apply(`match`: String, remainder: String, rule: String): Match = {
      val __obj = js.Dynamic.literal(remainder = remainder.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    extension [Self <: Match](x: Self) {
      
      inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setRemainder(value: String): Self = StObject.set(x, "remainder", value.asInstanceOf[js.Any])
      
      inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<digital-link.js.digital-link.js.RuleName, string> */
  trait RecordRuleNamestring extends StObject {
    
    var billTo: String
    
    var canonicalGS1webURI: String
    
    var cpid: String
    
    var cpsn: String
    
    var cpv: String
    
    var customGS1webURI: String
    
    var extensionParameter: String
    
    var gcn: String
    
    var gdti: String
    
    var giai: String
    
    var ginc: String
    
    var gln: String
    
    var glnProd: String
    
    var glnx: String
    
    var gmn: String
    
    var grai: String
    
    var gsin: String
    
    var gsrn: String
    
    var gsrnp: String
    
    var gtin: String
    
    var itip: String
    
    var lot: String
    
    var partyGln: String
    
    var payTo: String
    
    var purchasedFrom: String
    
    var refno: String
    
    var ser: String
    
    var shipFor: String
    
    var shipTo: String
    
    var srin: String
    
    var sscc: String
  }
  object RecordRuleNamestring {
    
    inline def apply(
      billTo: String,
      canonicalGS1webURI: String,
      cpid: String,
      cpsn: String,
      cpv: String,
      customGS1webURI: String,
      extensionParameter: String,
      gcn: String,
      gdti: String,
      giai: String,
      ginc: String,
      gln: String,
      glnProd: String,
      glnx: String,
      gmn: String,
      grai: String,
      gsin: String,
      gsrn: String,
      gsrnp: String,
      gtin: String,
      itip: String,
      lot: String,
      partyGln: String,
      payTo: String,
      purchasedFrom: String,
      refno: String,
      ser: String,
      shipFor: String,
      shipTo: String,
      srin: String,
      sscc: String
    ): RecordRuleNamestring = {
      val __obj = js.Dynamic.literal(billTo = billTo.asInstanceOf[js.Any], canonicalGS1webURI = canonicalGS1webURI.asInstanceOf[js.Any], cpid = cpid.asInstanceOf[js.Any], cpsn = cpsn.asInstanceOf[js.Any], cpv = cpv.asInstanceOf[js.Any], customGS1webURI = customGS1webURI.asInstanceOf[js.Any], extensionParameter = extensionParameter.asInstanceOf[js.Any], gcn = gcn.asInstanceOf[js.Any], gdti = gdti.asInstanceOf[js.Any], giai = giai.asInstanceOf[js.Any], ginc = ginc.asInstanceOf[js.Any], gln = gln.asInstanceOf[js.Any], glnProd = glnProd.asInstanceOf[js.Any], glnx = glnx.asInstanceOf[js.Any], gmn = gmn.asInstanceOf[js.Any], grai = grai.asInstanceOf[js.Any], gsin = gsin.asInstanceOf[js.Any], gsrn = gsrn.asInstanceOf[js.Any], gsrnp = gsrnp.asInstanceOf[js.Any], gtin = gtin.asInstanceOf[js.Any], itip = itip.asInstanceOf[js.Any], lot = lot.asInstanceOf[js.Any], partyGln = partyGln.asInstanceOf[js.Any], payTo = payTo.asInstanceOf[js.Any], purchasedFrom = purchasedFrom.asInstanceOf[js.Any], refno = refno.asInstanceOf[js.Any], ser = ser.asInstanceOf[js.Any], shipFor = shipFor.asInstanceOf[js.Any], shipTo = shipTo.asInstanceOf[js.Any], srin = srin.asInstanceOf[js.Any], sscc = sscc.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordRuleNamestring]
    }
    
    extension [Self <: RecordRuleNamestring](x: Self) {
      
      inline def setBillTo(value: String): Self = StObject.set(x, "billTo", value.asInstanceOf[js.Any])
      
      inline def setCanonicalGS1webURI(value: String): Self = StObject.set(x, "canonicalGS1webURI", value.asInstanceOf[js.Any])
      
      inline def setCpid(value: String): Self = StObject.set(x, "cpid", value.asInstanceOf[js.Any])
      
      inline def setCpsn(value: String): Self = StObject.set(x, "cpsn", value.asInstanceOf[js.Any])
      
      inline def setCpv(value: String): Self = StObject.set(x, "cpv", value.asInstanceOf[js.Any])
      
      inline def setCustomGS1webURI(value: String): Self = StObject.set(x, "customGS1webURI", value.asInstanceOf[js.Any])
      
      inline def setExtensionParameter(value: String): Self = StObject.set(x, "extensionParameter", value.asInstanceOf[js.Any])
      
      inline def setGcn(value: String): Self = StObject.set(x, "gcn", value.asInstanceOf[js.Any])
      
      inline def setGdti(value: String): Self = StObject.set(x, "gdti", value.asInstanceOf[js.Any])
      
      inline def setGiai(value: String): Self = StObject.set(x, "giai", value.asInstanceOf[js.Any])
      
      inline def setGinc(value: String): Self = StObject.set(x, "ginc", value.asInstanceOf[js.Any])
      
      inline def setGln(value: String): Self = StObject.set(x, "gln", value.asInstanceOf[js.Any])
      
      inline def setGlnProd(value: String): Self = StObject.set(x, "glnProd", value.asInstanceOf[js.Any])
      
      inline def setGlnx(value: String): Self = StObject.set(x, "glnx", value.asInstanceOf[js.Any])
      
      inline def setGmn(value: String): Self = StObject.set(x, "gmn", value.asInstanceOf[js.Any])
      
      inline def setGrai(value: String): Self = StObject.set(x, "grai", value.asInstanceOf[js.Any])
      
      inline def setGsin(value: String): Self = StObject.set(x, "gsin", value.asInstanceOf[js.Any])
      
      inline def setGsrn(value: String): Self = StObject.set(x, "gsrn", value.asInstanceOf[js.Any])
      
      inline def setGsrnp(value: String): Self = StObject.set(x, "gsrnp", value.asInstanceOf[js.Any])
      
      inline def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
      
      inline def setItip(value: String): Self = StObject.set(x, "itip", value.asInstanceOf[js.Any])
      
      inline def setLot(value: String): Self = StObject.set(x, "lot", value.asInstanceOf[js.Any])
      
      inline def setPartyGln(value: String): Self = StObject.set(x, "partyGln", value.asInstanceOf[js.Any])
      
      inline def setPayTo(value: String): Self = StObject.set(x, "payTo", value.asInstanceOf[js.Any])
      
      inline def setPurchasedFrom(value: String): Self = StObject.set(x, "purchasedFrom", value.asInstanceOf[js.Any])
      
      inline def setRefno(value: String): Self = StObject.set(x, "refno", value.asInstanceOf[js.Any])
      
      inline def setSer(value: String): Self = StObject.set(x, "ser", value.asInstanceOf[js.Any])
      
      inline def setShipFor(value: String): Self = StObject.set(x, "shipFor", value.asInstanceOf[js.Any])
      
      inline def setShipTo(value: String): Self = StObject.set(x, "shipTo", value.asInstanceOf[js.Any])
      
      inline def setSrin(value: String): Self = StObject.set(x, "srin", value.asInstanceOf[js.Any])
      
      inline def setSscc(value: String): Self = StObject.set(x, "sscc", value.asInstanceOf[js.Any])
    }
  }
}
