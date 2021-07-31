package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Defer")
@js.native
class Defer () extends StObject {
  
  def isRejected(): js.Any = js.native
  
  def isResolved(): js.Any = js.native
  
  def isUnresolved(): js.Any = js.native
  
  def push(happy: js.Any, sad: js.Any): Unit = js.native
}
object Defer {
  
  @JSImport("gitana", "Defer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def all(args: js.Any, obj: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(args.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
