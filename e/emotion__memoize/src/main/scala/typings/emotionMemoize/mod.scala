package typings.emotionMemoize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/memoize", JSImport.Default)
  @js.native
  def default[T](fn: Fn[T]): Fn[T] = js.native
  
  type Fn[T] = js.Function1[/* key */ String, T]
}
