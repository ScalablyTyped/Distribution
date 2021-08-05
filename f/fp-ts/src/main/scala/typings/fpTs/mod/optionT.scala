package typings.fpTs.mod

import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.optionTMod.OptionM
import typings.fpTs.optionTMod.OptionM1
import typings.fpTs.optionTMod.OptionM2
import typings.fpTs.optionTMod.OptionM2C
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionT {
  
  @JSImport("fp-ts", "optionT")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOptionM[M](M: Monad[M]): OptionM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM[M]]
  inline def getOptionM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): OptionM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM1[M]]
  inline def getOptionM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): OptionM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM2[M]]
  inline def getOptionM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monad2C[M, E]): OptionM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM2C[M, E]]
}
