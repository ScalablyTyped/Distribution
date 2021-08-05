package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.codeFrameDTsMod.BabelCodeFrameOptions
import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeFrameFormatterMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/CodeFrameFormatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCodeFrameFormatter(): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createCodeFrameFormatter")().asInstanceOf[Formatter]
  inline def createCodeFrameFormatter(options: BabelCodeFrameOptions): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createCodeFrameFormatter")(options.asInstanceOf[js.Any]).asInstanceOf[Formatter]
}
