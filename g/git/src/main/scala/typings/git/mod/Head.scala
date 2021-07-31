package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("git", "Head")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def current(repo: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("current")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def current(repo: js.Any, options: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("current")(repo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def find_all(repo: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def find_all(repo: js.Any, options: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
