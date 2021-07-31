package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionInfo extends StObject {
  
  var content: String
}
object VersionInfo {
  
  @scala.inline
  def apply(content: String): VersionInfo = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionInfo]
  }
  
  @scala.inline
  implicit class VersionInfoMutableBuilder[Self <: VersionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
