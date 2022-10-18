package typings.fpTs.mod

import typings.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object struct {
  
  @JSImport("fp-ts", "struct")
  @js.native
  val ^ : js.Any = js.native
  
  inline def evolve[A, F /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: (a : A[K]): unknown} */ js.Any */](transformations: F): js.Function1[
    /* a */ A, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof F ]: std.ReturnType<F[K_1]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("evolve")(transformations.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ A, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof F ]: std.ReturnType<F[K_1]>} */ js.Any
  ]]
  
  inline def getAssignSemigroup[A /* <: js.Object */](): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAssignSemigroup")().asInstanceOf[Semigroup[A]]
}
