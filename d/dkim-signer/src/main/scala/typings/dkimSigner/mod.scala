package typings.dkimSigner

import typings.dkimSigner.anon.FieldNames
import typings.dkimSigner.anon.Key
import typings.node.Buffer
import typings.node.cryptoMod.HexBase64Latin1Encoding
import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.SignPrivateKeyInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dkim-signer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DKIMCanonicalizer {
    
    @JSImport("dkim-signer", "DKIMCanonicalizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** Relaxed body canonicalization by rfc4871 #3.4.4 */
    @scala.inline
    def relaxedBody(body: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("relaxedBody")(body.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** Relaxed header canonicalization for single header line */
    @scala.inline
    def relaxedHeaderLine(line: String): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("relaxedHeaderLine")(line.asInstanceOf[js.Any]).asInstanceOf[Key]
    
    /** Relaxed headers canonicalization by rfc4871 #3.4.2 with filtering */
    @scala.inline
    def relaxedHeaders(headers: String): FieldNames = ^.asInstanceOf[js.Dynamic].applyDynamic("relaxedHeaders")(headers.asInstanceOf[js.Any]).asInstanceOf[FieldNames]
    @scala.inline
    def relaxedHeaders(headers: String, fieldNames: String): FieldNames = (^.asInstanceOf[js.Dynamic].applyDynamic("relaxedHeaders")(headers.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[FieldNames]
    
    /** Simple body canonicalization by rfc4871 #3.4.3 */
    @scala.inline
    def simpleBody(body: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleBody")(body.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @scala.inline
  def DKIMSign(email: String, options: DKIMSignOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("DKIMSign")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def DKIMSign(email: Buffer, options: DKIMSignOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("DKIMSign")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def generateDKIMHeader(domainName: String, keySelector: String, headerFieldNames: String, headers: String, body: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDKIMHeader")(domainName.asInstanceOf[js.Any], keySelector.asInstanceOf[js.Any], headerFieldNames.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def sha256(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def sha256(str: String, encoding: HexBase64Latin1Encoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait DKIMSignOptions extends StObject {
    
    /** Domain name to use for signing (ie: 'domain.com') */
    var domainName: String
    
    /** Header fields to sign (ie: 'from:to:cc:subject') */
    var headerFieldNames: js.UndefOr[String] = js.undefined
    
    /** Selector for the DKMI public key (ie. 'dkim' if you have set up a TXT record for 'dkim._domainkey.domain.com') */
    var keySelector: String
    
    /** DKIM private key */
    var privateKey: SignPrivateKeyInput | KeyLike
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
