package typings.getSslCertificate

import typings.node.NodeJS.Dict
import typings.node.bufferMod.global.Buffer
import typings.node.tlsMod.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined node.tls.PeerCertificate & {  pemEncoded :string} */
  trait PeerCertificatepemEncoded extends StObject {
    
    /**
      * The ASN.1 name of the OID of the elliptic curve.
      * Well-known curves are identified by an OID.
      * While it is unusual, it is possible that the curve
      * is identified by its mathematical properties,
      * in which case it will not have an OID.
      */
    var asn1Curve: js.UndefOr[String] = js.undefined
    
    /**
      * For RSA keys: The RSA bit size.
      *
      * For EC keys: The key size in bits.
      */
    var bits: js.UndefOr[Double] = js.undefined
    
    /**
      * `true` if a Certificate Authority (CA), `false` otherwise.
      * @since v18.13.0
      */
    var ca: Boolean
    
    /**
      * The RSA exponent, as a string in hexadecimal number notation.
      */
    var exponent: js.UndefOr[String] = js.undefined
    
    /**
      * The extended key usage, a set of OIDs.
      */
    var ext_key_usage: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The SHA-1 digest of the DER encoded certificate.
      * It is returned as a `:` separated hexadecimal string.
      */
    var fingerprint: String
    
    /**
      * The SHA-256 digest of the DER encoded certificate.
      * It is returned as a `:` separated hexadecimal string.
      */
    var fingerprint256: String
    
    /**
      * The SHA-512 digest of the DER encoded certificate.
      * It is returned as a `:` separated hexadecimal string.
      */
    var fingerprint512: String
    
    /**
      * An array describing the AuthorityInfoAccess, used with OCSP.
      */
    var infoAccess: js.UndefOr[Dict[js.Array[String]]] = js.undefined
    
    /**
      * The certificate issuer, described in the same terms as the `subject`.
      */
    var issuer: Certificate
    
    /**
      * The RSA modulus, as a hexadecimal string.
      */
    var modulus: js.UndefOr[String] = js.undefined
    
    /**
      * The NIST name for the elliptic curve,if it has one
      * (not all well-known curves have been assigned names by NIST).
      */
    var nistCurve: js.UndefOr[String] = js.undefined
    
    var pemEncoded: String
    
    /**
      * The public key.
      */
    var pubkey: js.UndefOr[Buffer] = js.undefined
    
    /**
      * The DER encoded X.509 certificate data.
      */
    var raw: Buffer
    
    /**
      * The certificate serial number, as a hex string.
      */
    var serialNumber: String
    
    /**
      * The certificate subject.
      */
    var subject: Certificate
    
    /**
      * A string containing concatenated names for the subject,
      * an alternative to the `subject` names.
      */
    var subjectaltname: js.UndefOr[String] = js.undefined
    
    /**
      * The date-time the certificate is valid from.
      */
    var valid_from: String
    
    /**
      * The date-time the certificate is valid to.
      */
    var valid_to: String
  }
  object PeerCertificatepemEncoded {
    
    inline def apply(
      ca: Boolean,
      fingerprint: String,
      fingerprint256: String,
      fingerprint512: String,
      issuer: Certificate,
      pemEncoded: String,
      raw: Buffer,
      serialNumber: String,
      subject: Certificate,
      valid_from: String,
      valid_to: String
    ): PeerCertificatepemEncoded = {
      val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], fingerprint256 = fingerprint256.asInstanceOf[js.Any], fingerprint512 = fingerprint512.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], pemEncoded = pemEncoded.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], valid_from = valid_from.asInstanceOf[js.Any], valid_to = valid_to.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerCertificatepemEncoded]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerCertificatepemEncoded] (val x: Self) extends AnyVal {
      
      inline def setAsn1Curve(value: String): Self = StObject.set(x, "asn1Curve", value.asInstanceOf[js.Any])
      
      inline def setAsn1CurveUndefined: Self = StObject.set(x, "asn1Curve", js.undefined)
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
      
      inline def setCa(value: Boolean): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setExponent(value: String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      inline def setExt_key_usage(value: js.Array[String]): Self = StObject.set(x, "ext_key_usage", value.asInstanceOf[js.Any])
      
      inline def setExt_key_usageUndefined: Self = StObject.set(x, "ext_key_usage", js.undefined)
      
      inline def setExt_key_usageVarargs(value: String*): Self = StObject.set(x, "ext_key_usage", js.Array(value*))
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprint256(value: String): Self = StObject.set(x, "fingerprint256", value.asInstanceOf[js.Any])
      
      inline def setFingerprint512(value: String): Self = StObject.set(x, "fingerprint512", value.asInstanceOf[js.Any])
      
      inline def setInfoAccess(value: Dict[js.Array[String]]): Self = StObject.set(x, "infoAccess", value.asInstanceOf[js.Any])
      
      inline def setInfoAccessUndefined: Self = StObject.set(x, "infoAccess", js.undefined)
      
      inline def setIssuer(value: Certificate): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setModulus(value: String): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
      
      inline def setModulusUndefined: Self = StObject.set(x, "modulus", js.undefined)
      
      inline def setNistCurve(value: String): Self = StObject.set(x, "nistCurve", value.asInstanceOf[js.Any])
      
      inline def setNistCurveUndefined: Self = StObject.set(x, "nistCurve", js.undefined)
      
      inline def setPemEncoded(value: String): Self = StObject.set(x, "pemEncoded", value.asInstanceOf[js.Any])
      
      inline def setPubkey(value: Buffer): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
      
      inline def setPubkeyUndefined: Self = StObject.set(x, "pubkey", js.undefined)
      
      inline def setRaw(value: Buffer): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: Certificate): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectaltname(value: String): Self = StObject.set(x, "subjectaltname", value.asInstanceOf[js.Any])
      
      inline def setSubjectaltnameUndefined: Self = StObject.set(x, "subjectaltname", js.undefined)
      
      inline def setValid_from(value: String): Self = StObject.set(x, "valid_from", value.asInstanceOf[js.Any])
      
      inline def setValid_to(value: String): Self = StObject.set(x, "valid_to", value.asInstanceOf[js.Any])
    }
  }
}
