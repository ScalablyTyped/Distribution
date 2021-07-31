package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  var Details: ApiVersion
  
  var Name: String
  
  var Version: String
}
object Details {
  
  @scala.inline
  def apply(Details: ApiVersion, Name: String, Version: String): Details = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: ApiVersion): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
