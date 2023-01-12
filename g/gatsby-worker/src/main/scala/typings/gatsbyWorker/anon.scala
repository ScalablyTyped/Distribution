package typings.gatsbyWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait All[ExposedFunctions] extends StObject {
    
    var all: /* import warning: importer.ImportType#apply Failed type conversion: {[ FunctionName in keyof ExposedFunctions ]: gatsby-worker.gatsby-worker/dist.WrapReturnInArray<gatsby-worker.gatsby-worker/dist.EnsureFunctionReturnsAPromise<ExposedFunctions[FunctionName]>>} */ js.Any
  }
  object All {
    
    inline def apply[ExposedFunctions](
      all: /* import warning: importer.ImportType#apply Failed type conversion: {[ FunctionName in keyof ExposedFunctions ]: gatsby-worker.gatsby-worker/dist.WrapReturnInArray<gatsby-worker.gatsby-worker/dist.EnsureFunctionReturnsAPromise<ExposedFunctions[FunctionName]>>} */ js.Any
    ): All[ExposedFunctions] = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[All[ExposedFunctions]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: All[?], ExposedFunctions] (val x: Self & All[ExposedFunctions]) extends AnyVal {
      
      inline def setAll(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ FunctionName in keyof ExposedFunctions ]: gatsby-worker.gatsby-worker/dist.WrapReturnInArray<gatsby-worker.gatsby-worker/dist.EnsureFunctionReturnsAPromise<ExposedFunctions[FunctionName]>>} */ js.Any
      ): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    }
  }
}
