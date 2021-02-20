package typings.dkimSigner

import typings.dkimSigner.anon.FieldNames
import typings.dkimSigner.anon.Key
import typings.node.Buffer
import typings.node.cryptoMod.HexBase64Latin1Encoding
import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.SignPrivateKeyInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object DKIMCanonicalizer {
    
    /** Relaxed body canonicalization by rfc4871 #3.4.4 */
    @JSImport("dkim-signer", "DKIMCanonicalizer.relaxedBody")
    @js.native
    def relaxedBody(body: String): String = js.native
    
    /** Relaxed header canonicalization for single header line */
    @JSImport("dkim-signer", "DKIMCanonicalizer.relaxedHeaderLine")
    @js.native
    def relaxedHeaderLine(line: String): Key = js.native
    
    /** Relaxed headers canonicalization by rfc4871 #3.4.2 with filtering */
    @JSImport("dkim-signer", "DKIMCanonicalizer.relaxedHeaders")
    @js.native
    def relaxedHeaders(headers: String): FieldNames = js.native
    @JSImport("dkim-signer", "DKIMCanonicalizer.relaxedHeaders")
    @js.native
    def relaxedHeaders(headers: String, fieldNames: String): FieldNames = js.native
    
    /** Simple body canonicalization by rfc4871 #3.4.3 */
    @JSImport("dkim-signer", "DKIMCanonicalizer.simpleBody")
    @js.native
    def simpleBody(body: String): String = js.native
  }
  
  @JSImport("dkim-signer", "DKIMSign")
  @js.native
  def DKIMSign(email: String, options: DKIMSignOptions): String = js.native
  @JSImport("dkim-signer", "DKIMSign")
  @js.native
  def DKIMSign(email: Buffer, options: DKIMSignOptions): String = js.native
  
  @JSImport("dkim-signer", "generateDKIMHeader")
  @js.native
  def generateDKIMHeader(domainName: String, keySelector: String, headerFieldNames: String, headers: String, body: String): String = js.native
  
  @JSImport("dkim-signer", "sha256")
  @js.native
  def sha256(str: String): String = js.native
  @JSImport("dkim-signer", "sha256")
  @js.native
  def sha256(str: String, encoding: HexBase64Latin1Encoding): String = js.native
  
  @js.native
  trait DKIMSignOptions extends StObject {
    
    /** Domain name to use for signing (ie: 'domain.com') */
    var domainName: String = js.native
    
    /** Header fields to sign (ie: 'from:to:cc:subject') */
    var headerFieldNames: js.UndefOr[String] = js.native
    
    /** Selector for the DKMI public key (ie. 'dkim' if you have set up a TXT record for 'dkim._domainkey.domain.com') */
    var keySelector: String = js.native
    
    /** DKIM private key */
    var privateKey: SignPrivateKeyInput | KeyLike = js.native
  }
  object DKIMSignOptions {
    
    @scala.inline
    def apply(domainName: String, keySelector: String, privateKey: SignPrivateKeyInput | KeyLike): DKIMSignOptions = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DKIMSignOptions]
    }
    
    @scala.inline
    implicit class DKIMSignOptionsMutableBuilder[Self <: DKIMSignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFieldNames(value: String): Self = StObject.set(x, "headerFieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFieldNamesUndefined: Self = StObject.set(x, "headerFieldNames", js.undefined)
      
      @scala.inline
      def setKeySelector(value: String): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKey(value: SignPrivateKeyInput | KeyLike): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
}
