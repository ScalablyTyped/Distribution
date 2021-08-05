package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Actor")
@js.native
class Actor protected () extends StObject {
  def this(name: String, email: String) = this()
  
  var email: String = js.native
  
  var name: String = js.native
}
/* static members */
object Actor {
  
  @JSImport("git", "Actor")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from_string(str: String): Actor = ^.asInstanceOf[js.Dynamic].applyDynamic("from_string")(str.asInstanceOf[js.Any]).asInstanceOf[Actor]
}
