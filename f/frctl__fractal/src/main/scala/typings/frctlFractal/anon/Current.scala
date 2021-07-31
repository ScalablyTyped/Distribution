package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current extends StObject {
  
  var current: String
  
  var latest: String
  
  var name: String
}
object Current {
  
  @scala.inline
  def apply(current: String, latest: String, name: String): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class CurrentMutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
