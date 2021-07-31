package typings.fpTs.anon

import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn4[A] extends StObject {
  
  def apply(a: A): js.Function1[/* m */ ReadonlyMap[js.Any, A], Boolean] = js.native
  def apply(
    a: A,
    m: ReadonlyMap[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K */ js.Any, 
      A
    ]
  ): Boolean = js.native
}
