package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Defer")
@js.native
open class Defer () extends StObject {
  
  def isRejected(): Any = js.native
  
  def isResolved(): Any = js.native
  
  def isUnresolved(): Any = js.native
  
  def push(happy: Any, sad: Any): Unit = js.native
}
object Defer {
  
  @JSImport("gitana", "Defer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def all(args: Any, obj: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(scala.List(args.asInstanceOf[js.Any]).`++`(obj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
}
