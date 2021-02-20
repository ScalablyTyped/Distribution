package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Architecture extends StObject {
  
  var Architecture: String = js.native
  
  var OS: String = js.native
}
object Architecture {
  
  @scala.inline
  def apply(Architecture: String, OS: String): Architecture = {
    val __obj = js.Dynamic.literal(Architecture = Architecture.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Architecture]
  }
  
  @scala.inline
  implicit class ArchitectureMutableBuilder[Self <: Architecture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: String): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOS(value: String): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
  }
}
