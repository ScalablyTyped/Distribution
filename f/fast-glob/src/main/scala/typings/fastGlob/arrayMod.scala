package typings.fastGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("fast-glob/out/utils/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def flatten[T](items: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def splitWhen[T](items: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitWhen")(items.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
}
