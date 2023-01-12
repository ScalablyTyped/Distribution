package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSLConfigConfig extends StObject {
  
  /**
    * List of cipher suites which should be explicitly prevented from being used in
    * addition to those disabled by the net built-in policy. Supported literal forms:
    * 0xAABB, where AA is `cipher_suite[0]` and BB is `cipher_suite[1]`, as defined in
    * RFC 2246, Section 7.4.1.2. Unrecognized but parsable cipher suites in this form
    * will not return an error. Ex: To disable TLS_RSA_WITH_RC4_128_MD5, specify
    * 0x0004, while to disable TLS_ECDH_ECDSA_WITH_RC4_128_SHA, specify 0xC002. Note
    * that TLSv1.3 ciphers cannot be disabled using this mechanism.
    */
  var disabledCipherSuites: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Can be `tls1.2` or `tls1.3`. The maximum SSL version to allow when connecting to
    * remote servers. Defaults to `tls1.3`.
    */
  var maxVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Can be `tls1`, `tls1.1`, `tls1.2` or `tls1.3`. The minimum SSL version to allow
    * when connecting to remote servers. Defaults to `tls1`.
    */
  var minVersion: js.UndefOr[String] = js.undefined
}
object SSLConfigConfig {
  
  inline def apply(): SSLConfigConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSLConfigConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SSLConfigConfig] (val x: Self) extends AnyVal {
    
    inline def setDisabledCipherSuites(value: js.Array[Double]): Self = StObject.set(x, "disabledCipherSuites", value.asInstanceOf[js.Any])
    
    inline def setDisabledCipherSuitesUndefined: Self = StObject.set(x, "disabledCipherSuites", js.undefined)
    
    inline def setDisabledCipherSuitesVarargs(value: Double*): Self = StObject.set(x, "disabledCipherSuites", js.Array(value*))
    
    inline def setMaxVersion(value: String): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
    
    inline def setMinVersion(value: String): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
    
    inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
  }
}
