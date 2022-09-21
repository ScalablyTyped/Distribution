package typings.fakeLodashPureJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fake-lodash-pure-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def head[T](array: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(array.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def isArray(input: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tail[T](array: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(array.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
}
