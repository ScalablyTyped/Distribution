package typings.emotionWeakMemoize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/weak-memoize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Arg /* <: js.Object */, Return](func: UnaryFn[Arg, Return]): UnaryFn[Arg, Return] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any]).asInstanceOf[UnaryFn[Arg, Return]]
  
  type UnaryFn[Arg, Return] = js.Function1[/* arg */ Arg, Return]
}
