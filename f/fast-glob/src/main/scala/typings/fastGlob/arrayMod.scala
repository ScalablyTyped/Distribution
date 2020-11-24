package typings.fastGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-glob/out/utils/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  
  def flatten[T](items: js.Array[js.Array[T]]): js.Array[T] = js.native
  
  def splitWhen[T](items: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): js.Array[js.Array[T]] = js.native
}
