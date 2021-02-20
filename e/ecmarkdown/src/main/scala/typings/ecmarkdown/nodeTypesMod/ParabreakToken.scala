package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.parabreak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParabreakToken extends Token {
  
  var contents: String = js.native
  
  var location: LocationRange = js.native
  
  var name: parabreak = js.native
}
object ParabreakToken {
  
  @scala.inline
  def apply(contents: String, location: LocationRange, name: parabreak): ParabreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParabreakToken]
  }
  
  @scala.inline
  implicit class ParabreakTokenMutableBuilder[Self <: ParabreakToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: parabreak): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
