package typings.fastGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("fast-glob/out/utils/array", "flatten")
  @js.native
  def flatten[T](items: js.Array[js.Array[T]]): js.Array[T] = js.native
  
  @JSImport("fast-glob/out/utils/array", "splitWhen")
  @js.native
  def splitWhen[T](items: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): js.Array[js.Array[T]] = js.native
}
