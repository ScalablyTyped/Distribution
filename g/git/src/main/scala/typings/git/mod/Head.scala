package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Head")
@js.native
class Head protected () extends StObject {
  // string or Commit or ...?
  def this(name: String, commit: js.Any) = this()
  
  var commit: js.Any = js.native
  
  var name: String = js.native
}
/* static members */
object Head {
  
  @JSImport("git", "Head.current")
  @js.native
  def current(repo: js.Any, callback: js.Function): Unit = js.native
  @JSImport("git", "Head.current")
  @js.native
  def current(repo: js.Any, options: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "Head.find_all")
  @js.native
  def find_all(repo: js.Any, callback: js.Function): Unit = js.native
  @JSImport("git", "Head.find_all")
  @js.native
  def find_all(repo: js.Any, options: js.Any, callback: js.Function): Unit = js.native
}
