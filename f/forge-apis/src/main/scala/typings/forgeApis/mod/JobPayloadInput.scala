package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobPayloadInput extends StObject {
  
  var compressedUrn: js.UndefOr[Boolean] = js.native
  
  var rootFilename: js.UndefOr[String] = js.native
  
  var urn: String = js.native
}
object JobPayloadInput {
  
  @scala.inline
  def apply(urn: String): JobPayloadInput = {
    val __obj = js.Dynamic.literal(urn = urn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadInput]
  }
  
  @scala.inline
  implicit class JobPayloadInputMutableBuilder[Self <: JobPayloadInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompressedUrn(value: Boolean): Self = StObject.set(x, "compressedUrn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressedUrnUndefined: Self = StObject.set(x, "compressedUrn", js.undefined)
    
    @scala.inline
    def setRootFilename(value: String): Self = StObject.set(x, "rootFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFilenameUndefined: Self = StObject.set(x, "rootFilename", js.undefined)
    
    @scala.inline
    def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
  }
}
