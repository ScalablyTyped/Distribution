package typings.googleapis.binaryauthorizationV1Mod.binaryauthorizationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttestorPublicKey extends StObject {
  
  /**
    * ASCII-armored representation of a PGP public key, as the entire output by the command `gpg --export --armor foo@example.com` (either LF or CRLF line endings). When using this field, `id` should be left blank. The BinAuthz API handlers will calculate the ID and fill it in automatically. BinAuthz computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as upper-case hex. If `id` is provided by the caller, it will be overwritten by the API-calculated ID.
    */
  var asciiArmoredPgpPublicKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A descriptive comment. This field may be updated.
    */
  var comment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of this public key. Signatures verified by BinAuthz must include the ID of the public key that can be used to verify them, and that ID must match the contents of this field exactly. Additional restrictions on this field can be imposed based on which public key type is encapsulated. See the documentation on `public_key` cases below for details.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A raw PKIX SubjectPublicKeyInfo format public key. NOTE: `id` may be explicitly provided by the caller when using this type of public key, but it MUST be a valid RFC3986 URI. If `id` is left blank, a default one will be computed based on the digest of the DER encoding of the public key.
    */
  var pkixPublicKey: js.UndefOr[SchemaPkixPublicKey] = js.undefined
}
object SchemaAttestorPublicKey {
  
  inline def apply(): SchemaAttestorPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestorPublicKey]
  }
  
  extension [Self <: SchemaAttestorPublicKey](x: Self) {
    
    inline def setAsciiArmoredPgpPublicKey(value: String): Self = StObject.set(x, "asciiArmoredPgpPublicKey", value.asInstanceOf[js.Any])
    
    inline def setAsciiArmoredPgpPublicKeyNull: Self = StObject.set(x, "asciiArmoredPgpPublicKey", null)
    
    inline def setAsciiArmoredPgpPublicKeyUndefined: Self = StObject.set(x, "asciiArmoredPgpPublicKey", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPkixPublicKey(value: SchemaPkixPublicKey): Self = StObject.set(x, "pkixPublicKey", value.asInstanceOf[js.Any])
    
    inline def setPkixPublicKeyUndefined: Self = StObject.set(x, "pkixPublicKey", js.undefined)
  }
}
