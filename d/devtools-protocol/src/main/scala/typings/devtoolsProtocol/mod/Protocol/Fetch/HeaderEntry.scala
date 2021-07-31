package typings.devtoolsProtocol.mod.Protocol.Fetch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderEntry extends StObject {
  
  var name: String
  
  var value: String
}
object HeaderEntry {
  
  @scala.inline
  def apply(name: String, value: String): HeaderEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderEntry]
  }
  
  @scala.inline
  implicit class HeaderEntryMutableBuilder[Self <: HeaderEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
