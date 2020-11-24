package typings.falcor.mod

import typings.falcorJsonGraph.mod.JSONEnvelope
import typings.falcorJsonGraph.mod.JSONGraph
import typings.falcorJsonGraph.mod.Path
import typings.falcorJsonGraph.mod.PathSet
import typings.falcorJsonGraph.mod.PathValue_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("falcor", "Model")
@js.native
class Model () extends js.Object {
  def this(options: ModelOptions) = this()
  
  /**
    * Adapts a Model to the {@link DataSource} interface.
    */
  def asDataSource(): DataSource = js.native
  
  /**
    * Returns a clone of the {@link Model} that enables batching. Within the configured time period, paths for get operations are collected and sent to the {@link DataSource} in a batch.
    * Batching can be more efficient if the {@link DataSource} access the network, potentially reducing the number of HTTP requests to the server.
    */
  def batch(): Model = js.native
  def batch(schedulerOrDelay: Double): Model = js.native
  def batch(schedulerOrDelay: Scheduler): Model = js.native
  
  /**
    * Returns a clone of the {@link Model} that boxes values returning the wrapper ({@link Atom}, {@link Reference}, or {@link Error}), rather than the value inside it.
    * This allows any metadata attached to the wrapper to be inspected.
    */
  def boxValues(): Model = js.native
  
  /**
    * Invokes a function in the JSON Graph.
    */
  // NOTE: In http://netflix.github.io/falcor/doc/Model.html#call, it says that refPaths should be an PathSet[].
  // However, model implementation returns an error with setting refPaths as PathSet[] and it works with refPaths as PathSet.
  // So refPaths is defined as a PathSet in this .d.ts.
  def call(functionPath: String): ModelResponse[JSONEnvelope[_]] = js.native
  def call(
    functionPath: String,
    args: js.UndefOr[scala.Nothing],
    refPaths: js.UndefOr[scala.Nothing],
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[_]] = js.native
  def call(functionPath: String, args: js.UndefOr[scala.Nothing], refPaths: PathSet): ModelResponse[JSONEnvelope[_]] = js.native
  def call(
    functionPath: String,
    args: js.UndefOr[scala.Nothing],
    refPaths: PathSet,
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[_]] = js.native
  def call(functionPath: String, args: js.Array[_]): ModelResponse[JSONEnvelope[_]] = js.native
  def call(
    functionPath: String,
    args: js.Array[_],
    refPaths: js.UndefOr[scala.Nothing],
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[_]] = js.native
  def call(functionPath: String, args: js.Array[_], refPaths: PathSet): ModelResponse[JSONEnvelope[_]] = js.native
  def call(functionPath: String, args: js.Array[_], refPaths: PathSet, thisPaths: js.Array[PathSet]): ModelResponse[JSONEnvelope[_]] = js.native
  def call(functionPath: Path): ModelResponse[JSONEnvelope[_]] = js.native
  def call(
    functionPath: Path,
    args: js.UndefOr[scala.Nothing],
    refPaths: js.UndefOr[scala.Nothing],
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[_]] = js.native
  def call(functionPath: Path, args: js.UndefOr[scala.Nothing], refPaths: PathSet): ModelResponse[JSONEnvelope[_]] = js.native
  def call(
    functionPath: Path,
    args: js.UndefOr[scala.Nothing],
    refPaths: PathSet,
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[_]] = js.native
  def call(functionPath: Path, args: js.Array[_]): ModelResponse[JSONEnvelope[_]] = js.native
  def call(
    functionPath: Path,
    args: js.Array[_],
    refPaths: js.UndefOr[scala.Nothing],
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[_]] = js.native
  def call(functionPath: Path, args: js.Array[_], refPaths: PathSet): ModelResponse[JSONEnvelope[_]] = js.native
  def call(functionPath: Path, args: js.Array[_], refPaths: PathSet, thisPaths: js.Array[PathSet]): ModelResponse[JSONEnvelope[_]] = js.native
  @JSName("call")
  def call_T[T](functionPath: String): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](
    functionPath: String,
    args: js.UndefOr[scala.Nothing],
    refPaths: js.UndefOr[scala.Nothing],
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](functionPath: String, args: js.UndefOr[scala.Nothing], refPaths: PathSet): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](
    functionPath: String,
    args: js.UndefOr[scala.Nothing],
    refPaths: PathSet,
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](functionPath: String, args: js.Array[_]): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](
    functionPath: String,
    args: js.Array[_],
    refPaths: js.UndefOr[scala.Nothing],
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](functionPath: String, args: js.Array[_], refPaths: PathSet): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](functionPath: String, args: js.Array[_], refPaths: PathSet, thisPaths: js.Array[PathSet]): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](functionPath: Path): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](
    functionPath: Path,
    args: js.UndefOr[scala.Nothing],
    refPaths: js.UndefOr[scala.Nothing],
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](functionPath: Path, args: js.UndefOr[scala.Nothing], refPaths: PathSet): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](
    functionPath: Path,
    args: js.UndefOr[scala.Nothing],
    refPaths: PathSet,
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](functionPath: Path, args: js.Array[_]): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](
    functionPath: Path,
    args: js.Array[_],
    refPaths: js.UndefOr[scala.Nothing],
    thisPaths: js.Array[PathSet]
  ): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](functionPath: Path, args: js.Array[_], refPaths: PathSet): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("call")
  def call_T[T](functionPath: Path, args: js.Array[_], refPaths: PathSet, thisPaths: js.Array[PathSet]): ModelResponse[JSONEnvelope[T]] = js.native
  
  /**
    * Returns a new {@link Model} bound to a location within the {@link JSONGraph}.
    * The bound location is never a {@link Reference}: any {@link Reference}s encountered while resolving the bound {@link Path} are always replaced with the {@link Reference}s target value.
    * For subsequent operations on the {@link Model}, all paths will be evaluated relative to the bound path. Deref allows you to:
    * - Expose only a fragment of the {@link JSONGraph} to components, rather than the entire graph
    * - Hide the location of a {@link JSONGraph} fragment from components
    * - Optimize for executing multiple operations and path looksup at/below the same location in the {@link JSONGraph}
    */
  def deref(responseObject: js.Any): Model = js.native
  
  /**
    * The get method retrieves several {@link Path}s or {@link PathSet}s from a {@link Model}. The get method loads each value into a JSON object and returns in a ModelResponse.
    */
  def get(path: (String | PathSet)*): ModelResponse[JSONEnvelope[_]] = js.native
  
  /**
    * Get the local {@link JSONGraph} cache. This method can be a useful to store the state of the cache.
    */
  def getCache(path: PathSet*): JSONGraph = js.native
  
  /**
    * Returns the {@link Path} to the object within the JSON Graph that this Model references.
    */
  def getPath(): Path = js.native
  
  /**
    * Get data for a single {@link Path}.
    */
  def getValue(path: String): ModelResponse[_] = js.native
  def getValue(path: Path): ModelResponse[_] = js.native
  @JSName("getValue")
  def getValue_T[T](path: String): ModelResponse[T] = js.native
  @JSName("getValue")
  def getValue_T[T](path: Path): ModelResponse[T] = js.native
  
  /**
    * Retrieves a number which is incremented every single time a value is changed underneath the Model or the object at an optionally-provided Path beneath the Model.
    */
  def getVersion(): Double = js.native
  def getVersion(path: Path): Double = js.native
  
  @JSName("get")
  def get_T[T](path: (String | PathSet)*): ModelResponse[JSONEnvelope[T]] = js.native
  
  /**
    * The invalidate method synchronously removes several {@link Path}s or {@link PathSet}s from a {@link Model} cache.
    */
  def invalidate(path: PathSet*): Unit = js.native
  
  /**
    * The preload method retrieves several {@link Path}s or {@link PathSet}s from a {@link Model} and loads them into the Model cache.
    */
  def preload(path: PathSet*): Unit = js.native
  
  /**
    * Sets the value at one or more places in the JSONGraph model.
    * The set method accepts one or more {@link PathValue}s, each of which is a combination of a location in the document and the value to place there.
    * In addition to accepting  {@link PathValue}s, the set method also returns the values after the set operation is complete.
    */
  def set(args: PathValue_ *): ModelResponse[JSONEnvelope[_]] = js.native
  def set(jsonGraph: JSONGraph): ModelResponse[JSONEnvelope[_]] = js.native
  
  /**
    * Set the local cache to a {@link JSONGraph} fragment. This method can be a useful way of mocking a remote document, or restoring the local cache from a previously stored state.
    */
  def setCache(jsonGraph: JSONGraph): Unit = js.native
  
  /**
    * Set value for a single {@link Path}.
    */
  def setValue(path: String, value: js.Any): ModelResponse[_] = js.native
  def setValue(path: Path, value: js.Any): ModelResponse[_] = js.native
  @JSName("setValue")
  def setValue_T[T](path: String, value: js.Any): ModelResponse[T] = js.native
  @JSName("setValue")
  def setValue_T[T](path: Path, value: js.Any): ModelResponse[T] = js.native
  
  @JSName("set")
  def set_T[T](args: PathValue_ *): ModelResponse[JSONEnvelope[T]] = js.native
  @JSName("set")
  def set_T[T](jsonGraph: JSONGraph): ModelResponse[JSONEnvelope[T]] = js.native
  
  /**
    * Returns a clone of the {@link Model} that treats errors as values. Errors will be reported in the same callback used to report data.
    * Errors will appear as objects in responses, rather than being sent to the {@link Observable~onErrorCallback} callback of the {@link ModelResponse}.
    */
  def treatErrorsAsValues(): Model = js.native
  
         // FIXME what's a valid type for scheduler?
  /**
    * Returns a clone of the {@link Model} that disables batching. This is the default mode. Each get operation will be executed on the {@link DataSource} separately.
    */
  def unbatch(): Model = js.native
  
  /**
    * Returns a clone of the {@link Model} that unboxes values, returning the value inside of the wrapper ({@link Atom}, {@link Reference}, or {@link Error}), rather than the wrapper itself.
    * This is the default mode.
    */
  def unboxValues(): Model = js.native
  
  /**
    * Returns a clone of the {@link Model} that only uses the local {@link JSONGraph} and never uses a {@link DataSource} to retrieve missing paths.
    */
  def withoutDataSource(): Model = js.native
}
