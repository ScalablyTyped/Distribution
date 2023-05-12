package typings.expressValidator

import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcChainContextRunnerMod.ContextRunningOptions
import typings.expressValidator.srcChainContextRunnerMod.ResultWithContext
import typings.expressValidator.srcChainValidationChainMod.ValidationChainLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("express-validator/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindAll[T](`object`: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any]
  
  inline def runAllChains(req: Request, chains: js.Array[ValidationChainLike]): js.Promise[js.Array[ResultWithContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAllChains")(req.asInstanceOf[js.Any], chains.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ResultWithContext]]]
  inline def runAllChains(req: Request, chains: js.Array[ValidationChainLike], runOpts: ContextRunningOptions): js.Promise[js.Array[ResultWithContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAllChains")(req.asInstanceOf[js.Any], chains.asInstanceOf[js.Any], runOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ResultWithContext]]]
  
  inline def toString_(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
