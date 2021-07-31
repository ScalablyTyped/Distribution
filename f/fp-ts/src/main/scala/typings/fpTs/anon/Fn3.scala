package typings.fpTs.anon

import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn3[K] extends StObject {
  
  def apply(k: K): js.Function1[/* m */ ReadonlyMap[K, js.Any], Boolean] = js.native
  def apply(
    k: K,
    m: ReadonlyMap[
      K, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify A */ js.Any
    ]
  ): Boolean = js.native
}
