package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libFormatterFormatterMod.Formatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterCodeFrameFormatterMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/code-frame-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCodeFrameFormatter(): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createCodeFrameFormatter")().asInstanceOf[Formatter]
  inline def createCodeFrameFormatter(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelCodeFrameOptions */ Any
  ): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createCodeFrameFormatter")(options.asInstanceOf[js.Any]).asInstanceOf[Formatter]
}
