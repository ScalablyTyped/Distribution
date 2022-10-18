package typings.emberTemplate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateHandlebarsMod {
  
  @JSImport("@ember/template/-private/handlebars", "SafeString")
  @js.native
  open class SafeString protected () extends StObject {
    def this(str: String) = this()
    
    def toHTML(): String = js.native
  }
}
