package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getChangedFilesMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/getChangedFiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getChangedFiles(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChangedFiles")(compiler.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
