package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Tag")
@js.native
open class Tag protected () extends StObject {
  def this(name: Any, commit: Any) = this()
  
  var commit: Any = js.native
  
  var name: Any = js.native
}
/* static members */
object Tag {
  
  @JSImport("git", "Tag")
  @js.native
  val ^ : js.Any = js.native
  
  inline def find_all(repo: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def find_all(repo: Any, options: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
