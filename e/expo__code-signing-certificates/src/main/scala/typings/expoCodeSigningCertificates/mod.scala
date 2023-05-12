package typings.expoCodeSigningCertificates

import typings.expoCodeSigningCertificates.anon.PrivateKeyPEM
import typings.node.bufferMod.global.Buffer
import typings.nodeForge.mod.pki.Certificate
import typings.nodeForge.mod.pki.CertificateRequest
import typings.nodeForge.mod.pki.rsa.KeyPair
import typings.nodeForge.mod.pki.rsa.PrivateKey
import typings.nodeForge.mod.pki.rsa.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@expo/code-signing-certificates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertCSRPEMToCSR(CSRPEM: String): CertificateRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCSRPEMToCSR")(CSRPEM.asInstanceOf[js.Any]).asInstanceOf[CertificateRequest]
  
  inline def convertCSRToCSRPEM(csr: CertificateRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCSRToCSRPEM")(csr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertCertificatePEMToCertificate(certificatePEM: String): Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCertificatePEMToCertificate")(certificatePEM.asInstanceOf[js.Any]).asInstanceOf[Certificate]
  
  inline def convertCertificateToCertificatePEM(certificate: Certificate): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCertificateToCertificatePEM")(certificate.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertKeyPairPEMToKeyPair(param0: PrivateKeyPEM): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("convertKeyPairPEMToKeyPair")(param0.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def convertKeyPairToPEM(keyPair: KeyPair): PrivateKeyPEM = ^.asInstanceOf[js.Dynamic].applyDynamic("convertKeyPairToPEM")(keyPair.asInstanceOf[js.Any]).asInstanceOf[PrivateKeyPEM]
  
  inline def convertPrivateKeyPEMToPrivateKey(privateKeyPEM: String): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPrivateKeyPEMToPrivateKey")(privateKeyPEM.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
  
  inline def convertPublicKeyPEMToPublicKey(publicKeyPEM: String): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPublicKeyPEMToPublicKey")(publicKeyPEM.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
  
  @JSImport("@expo/code-signing-certificates", "expoProjectInformationOID")
  @js.native
  val expoProjectInformationOID: /* "1.2.840.113556.1.8000.2554.43437.254.128.102.157.7894389.20439.2.1" */ String = js.native
  
  inline def generateCSR(keyPair: KeyPair, commonName: String): CertificateRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCSR")(keyPair.asInstanceOf[js.Any], commonName.asInstanceOf[js.Any])).asInstanceOf[CertificateRequest]
  
  inline def generateDevelopmentCertificateFromCSR(
    issuerPrivateKey: PrivateKey,
    issuerCertificate: Certificate,
    csr: CertificateRequest,
    appId: String,
    scopeKey: String
  ): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDevelopmentCertificateFromCSR")(issuerPrivateKey.asInstanceOf[js.Any], issuerCertificate.asInstanceOf[js.Any], csr.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], scopeKey.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  
  inline def generateKeyPair(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[KeyPair]
  
  inline def generateSelfSignedCodeSigningCertificate(param0: GenerateParameters): Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSelfSignedCodeSigningCertificate")(param0.asInstanceOf[js.Any]).asInstanceOf[Certificate]
  
  inline def signBufferRSASHA256AndVerify(privateKey: PrivateKey, certificate: Certificate, bufferToSign: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signBufferRSASHA256AndVerify")(privateKey.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any], bufferToSign.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def validateSelfSignedCertificate(certificate: Certificate, keyPair: KeyPair): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSelfSignedCertificate")(certificate.asInstanceOf[js.Any], keyPair.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait GenerateParameters extends StObject {
    
    /**
      * CN issuer and subject Distinguished Name (DN).
      * Used for both issuer and subject in the case of self-signed certificates.
      */
    var commonName: String
    
    /**
      * Public/private key pair generated via {@link generateKeyPair}.
      */
    var keyPair: KeyPair
    
    /**
      * Certificate validity range end.
      */
    var validityNotAfter: js.Date
    
    /**
      * Certificate validity range start.
      */
    var validityNotBefore: js.Date
  }
  object GenerateParameters {
    
    inline def apply(commonName: String, keyPair: KeyPair, validityNotAfter: js.Date, validityNotBefore: js.Date): GenerateParameters = {
      val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any], keyPair = keyPair.asInstanceOf[js.Any], validityNotAfter = validityNotAfter.asInstanceOf[js.Any], validityNotBefore = validityNotBefore.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateParameters] (val x: Self) extends AnyVal {
      
      inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      inline def setKeyPair(value: KeyPair): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
      
      inline def setValidityNotAfter(value: js.Date): Self = StObject.set(x, "validityNotAfter", value.asInstanceOf[js.Any])
      
      inline def setValidityNotBefore(value: js.Date): Self = StObject.set(x, "validityNotBefore", value.asInstanceOf[js.Any])
    }
  }
}
