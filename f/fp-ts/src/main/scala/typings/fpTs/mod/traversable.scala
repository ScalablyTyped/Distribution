package typings.fpTs.mod

import typings.fpTs.traversableMod.Traversable
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.traversableMod.TraversableComposition
import typings.fpTs.traversableMod.TraversableComposition11
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traversable {
  
  @JSImport("fp-ts", "traversable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTraversableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Traversable1[F], G: Traversable1[G]): TraversableComposition11[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTraversableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[TraversableComposition11[F, G]]
  inline def getTraversableComposition[F, G](F: Traversable[F], G: Traversable[G]): TraversableComposition[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTraversableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[TraversableComposition[F, G]]
}
