package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupBooleans.`true`
import typings.ecmarkup.libLintCollectNodesMod.CollectNodesReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algorithms
  extends StObject
     with CollectNodesReturnType {
  
  var algorithms: js.Array[Element]
  
  var earlyErrors: js.Array[Grammar]
  
  var headers: js.Array[ContentsElement]
  
  var mainGrammar: js.Array[Source]
  
  var sdos: js.Array[Alg]
  
  var success: `true`
}
object Algorithms {
  
  inline def apply(
    algorithms: js.Array[Element],
    earlyErrors: js.Array[Grammar],
    headers: js.Array[ContentsElement],
    mainGrammar: js.Array[Source],
    sdos: js.Array[Alg]
  ): Algorithms = {
    val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], earlyErrors = earlyErrors.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], mainGrammar = mainGrammar.asInstanceOf[js.Any], sdos = sdos.asInstanceOf[js.Any], success = true)
    __obj.asInstanceOf[Algorithms]
  }
  
  extension [Self <: Algorithms](x: Self) {
    
    inline def setAlgorithms(value: js.Array[Element]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmsVarargs(value: Element*): Self = StObject.set(x, "algorithms", js.Array(value*))
    
    inline def setEarlyErrors(value: js.Array[Grammar]): Self = StObject.set(x, "earlyErrors", value.asInstanceOf[js.Any])
    
    inline def setEarlyErrorsVarargs(value: Grammar*): Self = StObject.set(x, "earlyErrors", js.Array(value*))
    
    inline def setHeaders(value: js.Array[ContentsElement]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: ContentsElement*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMainGrammar(value: js.Array[Source]): Self = StObject.set(x, "mainGrammar", value.asInstanceOf[js.Any])
    
    inline def setMainGrammarVarargs(value: Source*): Self = StObject.set(x, "mainGrammar", js.Array(value*))
    
    inline def setSdos(value: js.Array[Alg]): Self = StObject.set(x, "sdos", value.asInstanceOf[js.Any])
    
    inline def setSdosVarargs(value: Alg*): Self = StObject.set(x, "sdos", js.Array(value*))
    
    inline def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
