package typings.fpTs.mod

import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadMod.Monad3
import typings.fpTs.readerTMod.ReaderM
import typings.fpTs.readerTMod.ReaderM1
import typings.fpTs.readerTMod.ReaderM2
import typings.fpTs.readerTMod.ReaderM2C
import typings.fpTs.readerTMod.ReaderM3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerT {
  
  @JSImport("fp-ts", "readerT")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReaderM[M](M: Monad[M]): ReaderM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): ReaderM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM1[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): ReaderM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM2[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](M: Monad3[M]): ReaderM3[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM3[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monad2C[M, E]): ReaderM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM2C[M, E]]
}
