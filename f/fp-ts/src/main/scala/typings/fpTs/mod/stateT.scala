package typings.fpTs.mod

import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadMod.Monad3
import typings.fpTs.monadMod.Monad3C
import typings.fpTs.stateTMod.StateM
import typings.fpTs.stateTMod.StateM1
import typings.fpTs.stateTMod.StateM2
import typings.fpTs.stateTMod.StateM2C
import typings.fpTs.stateTMod.StateM3
import typings.fpTs.stateTMod.StateM3C
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateT {
  
  @JSImport("fp-ts", "stateT")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStateM[M](M: Monad[M]): StateM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM[M]]
  @scala.inline
  def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): StateM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM1[M]]
  @scala.inline
  def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): StateM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM2[M]]
  @scala.inline
  def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](M: Monad3[M]): StateM3[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM3[M]]
  @scala.inline
  def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monad2C[M, E]): StateM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM2C[M, E]]
  @scala.inline
  def getStateM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](M: Monad3C[M, E]): StateM3C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateM")(M.asInstanceOf[js.Any]).asInstanceOf[StateM3C[M, E]]
}
