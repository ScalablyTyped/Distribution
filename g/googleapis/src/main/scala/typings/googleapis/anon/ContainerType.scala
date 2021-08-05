package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerType extends StObject {
  
  var containerType: js.UndefOr[String] = js.undefined
  
  var sha1Checksum: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
}
object ContainerType {
  
  inline def apply(): ContainerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerType]
  }
  
  extension [Self <: ContainerType](x: Self) {
    
    inline def setContainerType(value: String): Self = StObject.set(x, "containerType", value.asInstanceOf[js.Any])
    
    inline def setContainerTypeUndefined: Self = StObject.set(x, "containerType", js.undefined)
    
    inline def setSha1Checksum(value: String): Self = StObject.set(x, "sha1Checksum", value.asInstanceOf[js.Any])
    
    inline def setSha1ChecksumUndefined: Self = StObject.set(x, "sha1Checksum", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
