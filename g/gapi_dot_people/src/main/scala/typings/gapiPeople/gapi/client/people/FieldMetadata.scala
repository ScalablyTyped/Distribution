package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldMetadata extends StObject {
  
  var primary: Boolean
  
  var source: Source
  
  var verified: Boolean
}
object FieldMetadata {
  
  @scala.inline
  def apply(primary: Boolean, source: Source, verified: Boolean): FieldMetadata = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMetadata]
  }
  
  @scala.inline
  implicit class FieldMetadataMutableBuilder[Self <: FieldMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
