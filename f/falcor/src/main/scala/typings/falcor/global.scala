package typings.falcor

import typings.falcor.mod.ModelOptions
import typings.falcorJsonGraph.mod.Atom_
import typings.falcorJsonGraph.mod.Error_
import typings.falcorJsonGraph.mod.PathSet
import typings.falcorJsonGraph.mod.PathValue_
import typings.falcorJsonGraph.mod.Reference
import typings.falcorJsonGraph.mod.Sentinel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object falcor {
    
    @JSGlobal("falcor")
    @js.native
    val ^ : js.Any = js.native
    
    /* note: abstract class */ @JSGlobal("falcor.DataSource")
    @js.native
    open class DataSource ()
      extends typings.falcor.mod.DataSource
    
    /**
      * A HttpDataSource object is a {@link DataSource} can be used to retrieve data from a remote JSONGraph object using the browser's XMLHttpRequest.
      **/
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FalcorModel.DataSource * / any */ @JSGlobal("falcor.HttpDataSource")
    @js.native
    open class HttpDataSource protected ()
      extends typings.falcor.mod.HttpDataSource {
      def this(jsonGraphUrl: String) = this()
      def this(jsonGraphUrl: String, config: Any) = this()
    }
    
    @JSGlobal("falcor.Model")
    @js.native
    open class Model ()
      extends typings.falcor.mod.Model {
      def this(options: ModelOptions) = this()
    }
    
    @JSGlobal("falcor.ModelResponse")
    @js.native
    open class ModelResponse[T] protected ()
      extends typings.falcor.mod.ModelResponse[T] {
      def this(observable: typings.falcor.mod.Observable[T]) = this()
    }
    
    @JSGlobal("falcor.Observable")
    @js.native
    open class Observable[T] ()
      extends typings.falcor.mod.Observable[T]
    
    @JSGlobal("falcor.Subscription")
    @js.native
    open class Subscription ()
      extends typings.falcor.mod.Subscription
    
    inline def atom(value: Any): Atom_ = ^.asInstanceOf[js.Dynamic].applyDynamic("atom")(value.asInstanceOf[js.Any]).asInstanceOf[Atom_]
    inline def atom(value: Any, props: Sentinel): Atom_ = (^.asInstanceOf[js.Dynamic].applyDynamic("atom")(value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Atom_]
    
    inline def error(errorValue: Any): Error_ = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(errorValue.asInstanceOf[js.Any]).asInstanceOf[Error_]
    inline def error(errorValue: Any, props: Sentinel): Error_ = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(errorValue.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Error_]
    
    inline def pathValue(path: String, value: Any): PathValue_ = (^.asInstanceOf[js.Dynamic].applyDynamic("pathValue")(path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[PathValue_]
    inline def pathValue(path: PathSet, value: Any): PathValue_ = (^.asInstanceOf[js.Dynamic].applyDynamic("pathValue")(path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[PathValue_]
    
    inline def ref(path: String): Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any]).asInstanceOf[Reference]
    inline def ref(path: String, props: Sentinel): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Reference]
    inline def ref(path: PathSet): Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any]).asInstanceOf[Reference]
    inline def ref(path: PathSet, props: Sentinel): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Reference]
  }
}
