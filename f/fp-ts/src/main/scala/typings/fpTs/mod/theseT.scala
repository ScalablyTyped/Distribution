package typings.fpTs.mod

import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.theseTMod.TheseM
import typings.fpTs.theseTMod.TheseM1
import typings.fpTs.theseTMod.TheseM2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object theseT {
  
  @JSImport("fp-ts", "theseT")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getTheseM[M](M: Monad[M]): TheseM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheseM")(M.asInstanceOf[js.Any]).asInstanceOf[TheseM[M]]
  @scala.inline
  def getTheseM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): TheseM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheseM")(M.asInstanceOf[js.Any]).asInstanceOf[TheseM1[M]]
  @scala.inline
  def getTheseM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): TheseM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheseM")(M.asInstanceOf[js.Any]).asInstanceOf[TheseM2[M]]
}
