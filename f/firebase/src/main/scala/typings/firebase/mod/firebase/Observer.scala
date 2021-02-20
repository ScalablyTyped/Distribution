package typings.firebase.mod.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  */
@js.native
trait Observer[T, E] extends StObject {
  
  def complete(): Unit = js.native
  @JSName("complete")
  var complete_Original: CompleteFn = js.native
  
  def error(error: E): Unit = js.native
  @JSName("error")
  var error_Original: ErrorFn[E] = js.native
  
  def next(value: T): Unit = js.native
  @JSName("next")
  var next_Original: NextFn[T] = js.native
}
