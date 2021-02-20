package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Tag")
@js.native
class Tag protected () extends StObject {
  def this(name: js.Any, commit: js.Any) = this()
  
  var commit: js.Any = js.native
  
  var name: js.Any = js.native
}
/* static members */
object Tag {
  
  @JSImport("git", "Tag.find_all")
  @js.native
  def find_all(repo: js.Any, callback: js.Function): Unit = js.native
  @JSImport("git", "Tag.find_all")
  @js.native
  def find_all(repo: js.Any, options: js.Any, callback: js.Function): Unit = js.native
}
