package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Digest holds a cryptographic message digest.
  */
@js.native
trait SchemaDigest extends StObject {
  
  /**
    * A message digest produced with the SHA-256 algorithm.
    */
  var sha256: js.UndefOr[String] = js.native
  
  /**
    * A message digest produced with the SHA-384 algorithm.
    */
  var sha384: js.UndefOr[String] = js.native
  
  /**
    * A message digest produced with the SHA-512 algorithm.
    */
  var sha512: js.UndefOr[String] = js.native
}
object SchemaDigest {
  
  @scala.inline
  def apply(): SchemaDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDigest]
  }
  
  @scala.inline
  implicit class SchemaDigestMutableBuilder[Self <: SchemaDigest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    @scala.inline
    def setSha384(value: String): Self = StObject.set(x, "sha384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha384Undefined: Self = StObject.set(x, "sha384", js.undefined)
    
    @scala.inline
    def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha512Undefined: Self = StObject.set(x, "sha512", js.undefined)
  }
}
