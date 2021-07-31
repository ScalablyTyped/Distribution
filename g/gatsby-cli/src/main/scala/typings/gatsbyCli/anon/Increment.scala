package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Increment extends StObject {
  
  var id: String
  
  var increment: Double
}
object Increment {
  
  @scala.inline
  def apply(id: String, increment: Double): Increment = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Increment]
  }
  
  @scala.inline
  implicit class IncrementMutableBuilder[Self <: Increment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
  }
}
