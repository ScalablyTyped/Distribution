package typings.fpTs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallKM[K] extends StObject {
  
  def apply(k: K): js.Function1[/* m */ typings.std.Map[K, js.Any], Boolean] = js.native
  def apply(
    k: K,
    m: typings.std.Map[
      K, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify A */ js.Any
    ]
  ): Boolean = js.native
}
