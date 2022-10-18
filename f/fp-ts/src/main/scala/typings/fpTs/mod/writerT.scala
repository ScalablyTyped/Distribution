package typings.fpTs.mod

import typings.fpTs.libMonadMod.Monad
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libMonadMod.Monad2
import typings.fpTs.libMonadMod.Monad2C
import typings.fpTs.libMonadMod.Monad3
import typings.fpTs.libWriterTMod.WriterM
import typings.fpTs.libWriterTMod.WriterM1
import typings.fpTs.libWriterTMod.WriterM2
import typings.fpTs.libWriterTMod.WriterM2C
import typings.fpTs.libWriterTMod.WriterM3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerT {
  
  @JSImport("fp-ts", "writerT")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWriterM[M](M: Monad[M]): WriterM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): WriterM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM1[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): WriterM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM2[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): WriterM3[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM3[M]]
  inline def getWriterM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): WriterM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriterM")(M.asInstanceOf[js.Any]).asInstanceOf[WriterM2C[M, E]]
}
