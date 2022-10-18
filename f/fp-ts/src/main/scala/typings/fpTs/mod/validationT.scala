package typings.fpTs.mod

import typings.fpTs.libMonadMod.Monad
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libMonadMod.Monad2
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libValidationTMod.ValidationM
import typings.fpTs.libValidationTMod.ValidationM1
import typings.fpTs.libValidationTMod.ValidationM2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationT {
  
  @JSImport("fp-ts", "validationT")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getValidationM[E, M](S: Semigroup[E], M: Monad[M]): ValidationM[M, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationM")(S.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[ValidationM[M, E]]
  inline def getValidationM[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](S: Semigroup[E], M: Monad1[M]): ValidationM1[M, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationM")(S.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[ValidationM1[M, E]]
  inline def getValidationM[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](S: Semigroup[E], M: Monad2[M]): ValidationM2[M, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationM")(S.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[ValidationM2[M, E]]
}
