package typings.fpTs.mod

import typings.fpTs.eitherTMod.EitherM
import typings.fpTs.eitherTMod.EitherM1
import typings.fpTs.eitherTMod.EitherM2
import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherT {
  
  @JSImport("fp-ts", "eitherT")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getEitherM[M](M: Monad[M]): EitherM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEitherM")(M.asInstanceOf[js.Any]).asInstanceOf[EitherM[M]]
  @scala.inline
  def getEitherM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): EitherM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEitherM")(M.asInstanceOf[js.Any]).asInstanceOf[EitherM1[M]]
  @scala.inline
  def getEitherM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): EitherM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEitherM")(M.asInstanceOf[js.Any]).asInstanceOf[EitherM2[M]]
}
