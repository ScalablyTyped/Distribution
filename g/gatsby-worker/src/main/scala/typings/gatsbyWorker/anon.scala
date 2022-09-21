package typings.gatsbyWorker

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait All[ExposedFunctions] extends StObject {
    
    var all: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ FunctionName in keyof ExposedFunctions ]: gatsby-worker.gatsby-worker/dist.WrapReturnInArray<gatsby-worker.gatsby-worker/dist.EnsureFunctionReturnsAPromise<ExposedFunctions[FunctionName]>>}
      */ typings.gatsbyWorker.gatsbyWorkerStrings.All & TopLevel[ExposedFunctions]
  }
  object All {
    
    inline def apply[ExposedFunctions](
      all: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ FunctionName in keyof ExposedFunctions ]: gatsby-worker.gatsby-worker/dist.WrapReturnInArray<gatsby-worker.gatsby-worker/dist.EnsureFunctionReturnsAPromise<ExposedFunctions[FunctionName]>>}
      */ typings.gatsbyWorker.gatsbyWorkerStrings.All & TopLevel[ExposedFunctions]
    ): All[ExposedFunctions] = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[All[ExposedFunctions]]
    }
    
    extension [Self <: All[?], ExposedFunctions](x: Self & All[ExposedFunctions]) {
      
      inline def setAll(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ FunctionName in keyof ExposedFunctions ]: gatsby-worker.gatsby-worker/dist.WrapReturnInArray<gatsby-worker.gatsby-worker/dist.EnsureFunctionReturnsAPromise<ExposedFunctions[FunctionName]>>}
        */ typings.gatsbyWorker.gatsbyWorkerStrings.All & TopLevel[ExposedFunctions]
      ): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    }
  }
}
