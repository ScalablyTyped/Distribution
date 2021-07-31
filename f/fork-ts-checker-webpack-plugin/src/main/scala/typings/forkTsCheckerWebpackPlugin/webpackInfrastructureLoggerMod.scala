package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackInfrastructureLoggerMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/logger/WebpackInfrastructureLogger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createWebpackInfrastructureLogger(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): js.UndefOr[Logger] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebpackInfrastructureLogger")(compiler.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Logger]]
}
