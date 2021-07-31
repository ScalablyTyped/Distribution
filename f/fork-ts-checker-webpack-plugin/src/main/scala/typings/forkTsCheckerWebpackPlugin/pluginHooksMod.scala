package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Canceled
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginHooksMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/pluginHooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getForkTsCheckerWebpackPluginHooks(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.MultiCompiler */ js.Any
  ): Canceled = ^.asInstanceOf[js.Dynamic].applyDynamic("getForkTsCheckerWebpackPluginHooks")(compiler.asInstanceOf[js.Any]).asInstanceOf[Canceled]
  
  type ForkTsCheckerWebpackPluginHooks = ReturnType[js.Function0[Canceled]]
}
