package typings.fpTs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallAM[A] extends StObject {
  
  def apply(a: A): js.Function1[/* m */ typings.std.Map[js.Any, A], Boolean] = js.native
  def apply(
    a: A,
    m: typings.std.Map[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K */ js.Any, 
      A
    ]
  ): Boolean = js.native
}
