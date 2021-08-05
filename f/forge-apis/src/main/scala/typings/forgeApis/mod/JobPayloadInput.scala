package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobPayloadInput extends StObject {
  
  var compressedUrn: js.UndefOr[Boolean] = js.undefined
  
  var rootFilename: js.UndefOr[String] = js.undefined
  
  var urn: String
}
object JobPayloadInput {
  
  inline def apply(urn: String): JobPayloadInput = {
    val __obj = js.Dynamic.literal(urn = urn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadInput]
  }
  
  extension [Self <: JobPayloadInput](x: Self) {
    
    inline def setCompressedUrn(value: Boolean): Self = StObject.set(x, "compressedUrn", value.asInstanceOf[js.Any])
    
    inline def setCompressedUrnUndefined: Self = StObject.set(x, "compressedUrn", js.undefined)
    
    inline def setRootFilename(value: String): Self = StObject.set(x, "rootFilename", value.asInstanceOf[js.Any])
    
    inline def setRootFilenameUndefined: Self = StObject.set(x, "rootFilename", js.undefined)
    
    inline def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
  }
}
