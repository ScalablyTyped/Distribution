package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Status")
@js.native
open class Status protected () extends StObject {
  def this(repo: Any, callback: js.Function) = this()
  
  var files: js.Array[Any] = js.native
  
  def index(file: Any): Any = js.native
  
  var repo: Any = js.native
}
