package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerType extends StObject {
  
  var containerType: js.UndefOr[String] = js.native
  
  var sha1Checksum: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
}
object ContainerType {
  
  @scala.inline
  def apply(): ContainerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerType]
  }
  
  @scala.inline
  implicit class ContainerTypeMutableBuilder[Self <: ContainerType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerType(value: String): Self = StObject.set(x, "containerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTypeUndefined: Self = StObject.set(x, "containerType", js.undefined)
    
    @scala.inline
    def setSha1Checksum(value: String): Self = StObject.set(x, "sha1Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1ChecksumUndefined: Self = StObject.set(x, "sha1Checksum", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
