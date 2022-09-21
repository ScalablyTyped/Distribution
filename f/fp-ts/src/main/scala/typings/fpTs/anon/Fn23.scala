package typings.fpTs.anon

import typings.fpTs.optionMod.Option_
import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn23[K] extends StObject {
  
  def apply(k: K): js.Function1[/* m */ ReadonlyMap[K, Any], Option_[js.Tuple2[K, Any]]] = js.native
  def apply[A](k: K, m: ReadonlyMap[K, A]): Option_[js.Tuple2[K, A]] = js.native
}
