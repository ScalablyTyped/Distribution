package typings.falcorHttpDatasource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A HttpDataSource object is a {@link DataSource} can be used to retrieve data from a remote JSONGraph object using the browser's XMLHttpRequest.
    **/
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FalcorModel.DataSource * / any */ @JSImport("falcor-http-datasource", JSImport.Default)
  @js.native
  class default protected () extends StObject {
    def this(jsonGraphUrl: String) = this()
    def this(jsonGraphUrl: String, config: js.Any) = this()
  }
  
  /**
    * A HttpDataSource object is a {@link DataSource} can be used to retrieve data from a remote JSONGraph object using the browser's XMLHttpRequest.
    **/
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FalcorModel.DataSource * / any */ @JSImport("falcor-http-datasource", "XMlHttpSource")
  @js.native
  class XMlHttpSource protected () extends StObject {
    def this(jsonGraphUrl: String) = this()
    def this(jsonGraphUrl: String, config: js.Any) = this()
  }
  
  object FalcorHttpDataSource {
    
    /**
      * A HttpDataSource object is a {@link DataSource} can be used to retrieve data from a remote JSONGraph object using the browser's XMLHttpRequest.
      **/
    type XMlHttpSource = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FalcorModel.DataSource */ js.Any
  }
}
