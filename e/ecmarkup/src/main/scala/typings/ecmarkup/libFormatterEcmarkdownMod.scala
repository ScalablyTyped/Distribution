package typings.ecmarkup

import typings.ecmarkdown.distNodeTypesMod.FragmentNode
import typings.ecmarkup.libFormatterLineBuilderMod.LineBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterEcmarkdownMod {
  
  @JSImport("ecmarkup/lib/formatter/ecmarkdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printAlgorithm(
    source: String,
    alg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlgorithmNode */ Any,
    indent: Double
  ): js.Promise[LineBuilder] = (^.asInstanceOf[js.Dynamic].applyDynamic("printAlgorithm")(source.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LineBuilder]]
  
  inline def printFragments(source: String, contents: js.Array[FragmentNode], indent: Double): js.Promise[LineBuilder] = (^.asInstanceOf[js.Dynamic].applyDynamic("printFragments")(source.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LineBuilder]]
}
