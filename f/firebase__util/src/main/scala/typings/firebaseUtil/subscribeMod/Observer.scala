package typings.firebaseUtil.subscribeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observer[T] extends js.Object {
  
  def complete(): Unit = js.native
  @JSName("complete")
  var complete_Original: CompleteFn = js.native
  
  def error(error: Error): Unit = js.native
  @JSName("error")
  var error_Original: ErrorFn = js.native
  
  def next(value: T): Unit = js.native
  @JSName("next")
  var next_Original: NextFn[T] = js.native
}
