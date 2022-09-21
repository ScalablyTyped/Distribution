package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "BlameLine")
@js.native
open class BlameLine protected () extends StObject {
  def this(lineno: Double, oldlineno: Double, commit: Any, line: String) = this()
  
  var commit: Any = js.native
  
  var line: String = js.native
  
  var lineno: Double = js.native
  
  var oldlineno: Double = js.native
}
