package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Remote")
@js.native
open class Remote protected () extends StObject {
  def this(name: Any, commit: Any) = this()
  
  def find_all(repo: Any, callback: js.Function): Unit = js.native
  def find_all(repo: Any, options: Any, callback: js.Function): Unit = js.native
}
