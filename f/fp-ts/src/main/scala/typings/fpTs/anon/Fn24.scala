package typings.fpTs.anon

import typings.fpTs.libOptionMod.Option_
import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn24[K] extends StObject {
  
  def apply(k: K): js.Function1[/* m */ ReadonlyMap[K, Any], Option_[Any]] = js.native
  def apply[A](k: K, m: ReadonlyMap[K, A]): Option_[A] = js.native
}
