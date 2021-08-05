package typings.googleCloudKms.mod.v1

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Digest extends StObject {
  
  var sha256: js.UndefOr[Buffer] = js.undefined
  
  var sha384: js.UndefOr[Buffer] = js.undefined
  
  var sha512: js.UndefOr[Buffer] = js.undefined
}
object Digest {
  
  inline def apply(): Digest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Digest]
  }
  
  extension [Self <: Digest](x: Self) {
    
    inline def setSha256(value: Buffer): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    inline def setSha384(value: Buffer): Self = StObject.set(x, "sha384", value.asInstanceOf[js.Any])
    
    inline def setSha384Undefined: Self = StObject.set(x, "sha384", js.undefined)
    
    inline def setSha512(value: Buffer): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
    
    inline def setSha512Undefined: Self = StObject.set(x, "sha512", js.undefined)
  }
}
