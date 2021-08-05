package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.parabreak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParabreakToken
  extends StObject
     with Token {
  
  var contents: String
  
  var location: LocationRange
  
  var name: parabreak
}
object ParabreakToken {
  
  inline def apply(contents: String, location: LocationRange): ParabreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "parabreak")
    __obj.asInstanceOf[ParabreakToken]
  }
  
  extension [Self <: ParabreakToken](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: parabreak): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
