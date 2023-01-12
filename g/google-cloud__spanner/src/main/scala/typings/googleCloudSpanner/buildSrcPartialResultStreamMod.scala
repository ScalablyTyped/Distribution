package typings.googleCloudSpanner

import typings.googleCloudSpanner.buildSrcCodecMod.Field
import typings.googleCloudSpanner.buildSrcCodecMod.JSONOptions
import typings.googleCloudSpanner.buildSrcCodecMod.Json
import typings.googleCloudSpanner.buildSrcCodecMod.Value
import typings.googleCloudSpanner.googleCloudSpannerStrings.data
import typings.googleCloudSpanner.googleCloudSpannerStrings.response
import typings.googleCloudSpanner.googleCloudSpannerStrings.stats
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPartialResultStreamMod {
  
  @JSImport("@google-cloud/spanner/build/src/partial-result-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/spanner/build/src/partial-result-stream", "PartialResultStream")
  @js.native
  open class PartialResultStream_ ()
    extends Transform
       with ResultEvents {
    def this(options: js.Object) = this()
    
    /**
      * Manages any chunked values.
      *
      * @private
      *
      * @param {object} chunk The partial result set.
      */
    /* private */ var _addChunk: Any = js.native
    
    /**
      * Manages complete values, pushing a completed row into the stream once all
      * values have been received.
      *
      * @private
      *
      * @param {*} value The complete value.
      */
    /* private */ var _addValue: Any = js.native
    
    def _clearPendingValues(): Unit = js.native
    
    /**
      * Converts an array of values into a row.
      *
      * @private
      *
      * @param {Array.<*>} values The row values.
      * @returns {Row}
      */
    /* private */ var _createRow: Any = js.native
    
    /* private */ var _destroyed: Any = js.native
    
    /* private */ var _fields: Any = js.native
    
    /* private */ var _numPushFailed: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _pendingValue: Any = js.native
    
    /* private */ var _pendingValueForResume: Any = js.native
    
    /**
      * Processes each chunk.
      *
      * @private
      *
      * @param {object} chunk The partial result set.
      * @param {string} encoding Chunk encoding (Not used in object streams).
      * @param {function} next Function to be called upon completion.
      */
    def _transform(
      chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.PartialResultSet */ Any,
      enc: String,
      next: js.Function
    ): Unit = js.native
    
    /* private */ var _tryResume: Any = js.native
    
    /* private */ var _values: Any = js.native
    
    /**
      * Destroys the stream.
      *
      * @param {Error} [err] Optional error to destroy stream with.
      */
    def destroy(): this.type = js.native
    def destroy(err: js.Error): this.type = js.native
  }
  /* static members */
  object PartialResultStream_ {
    
    @JSImport("@google-cloud/spanner/build/src/partial-result-stream", "PartialResultStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Attempts to merge chunked values together.
      *
      * @static
      * @private
      *
      * @param {object} type The value type.
      * @param {*} head The head of the combined value.
      * @param {*} tail The tail of the combined value.
      * @returns {Array.<*>}
      */
    inline def merge(
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.Type */ Any,
      head: Value,
      tail: Value
    ): js.Array[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(`type`.asInstanceOf[js.Any], head.asInstanceOf[js.Any], tail.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
    
    /**
      * Attempts to merge chunked lists together.
      *
      * @static
      * @private
      *
      * @param {object} type The list type.
      * @param {Array.<*>} head The beginning of the list.
      * @param {Array.<*>} tail The end of the list.
      * @returns {Array.<*>}
      */
    inline def mergeLists(
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.Type */ Any,
      head: js.Array[Value],
      tail: js.Array[Value]
    ): js.Array[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeLists")(`type`.asInstanceOf[js.Any], head.asInstanceOf[js.Any], tail.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
  }
  
  inline def partialResultStream(requestFn: RequestFunction): PartialResultStream_ = ^.asInstanceOf[js.Dynamic].applyDynamic("partialResultStream")(requestFn.asInstanceOf[js.Any]).asInstanceOf[PartialResultStream_]
  inline def partialResultStream(requestFn: RequestFunction, options: RowOptions): PartialResultStream_ = (^.asInstanceOf[js.Dynamic].applyDynamic("partialResultStream")(requestFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PartialResultStream_]
  
  /**
    * @callback RequestFunction
    * @param {string} [resumeToken] The token used to resume getting results.
    * @returns {Stream}
    */
  type RequestFunction = js.Function1[/* resumeToken */ js.UndefOr[ResumeToken], Readable]
  
  /**
    * @callback PartialResultStream~responseCallback
    * @param {object} response The full API response.
    */
  type ResponseCallback = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.PartialResultSet */ /* response */ Any, 
    Unit
  ]
  
  @js.native
  trait ResultEvents extends StObject {
    
    @JSName("addListener")
    def addListener_data(event: data, listener: RowCallback): this.type = js.native
    @JSName("addListener")
    def addListener_response(event: response, listener: ResponseCallback): this.type = js.native
    @JSName("addListener")
    def addListener_stats(event: stats, listener: StatsCallback): this.type = js.native
    
    @JSName("emit")
    def emit_data(event: data, data: Json): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, data: Row): Boolean = js.native
    @JSName("emit")
    def emit_response(
      event: response,
      data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.PartialResultSet */ Any
    ): Boolean = js.native
    @JSName("emit")
    def emit_stats(
      event: stats,
      data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ResultSetStats */ Any
    ): Boolean = js.native
    
    @JSName("on")
    def on_data(event: data, listener: RowCallback): this.type = js.native
    @JSName("on")
    def on_response(event: response, listener: ResponseCallback): this.type = js.native
    @JSName("on")
    def on_stats(event: stats, listener: StatsCallback): this.type = js.native
    
    @JSName("once")
    def once_data(event: data, listener: RowCallback): this.type = js.native
    @JSName("once")
    def once_response(event: response, listener: ResponseCallback): this.type = js.native
    @JSName("once")
    def once_stats(event: stats, listener: StatsCallback): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_data(event: data, listener: RowCallback): this.type = js.native
    @JSName("prependListener")
    def prependListener_response(event: response, listener: ResponseCallback): this.type = js.native
    @JSName("prependListener")
    def prependListener_stats(event: stats, listener: StatsCallback): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: RowCallback): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_response(event: response, listener: ResponseCallback): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_stats(event: stats, listener: StatsCallback): this.type = js.native
  }
  
  type ResumeToken = String | js.typedarray.Uint8Array
  
  @js.native
  trait Row
    extends StObject
       with Array[Field] {
    
    /**
      * Converts the Row object into a pojo (plain old JavaScript object).
      *
      * @memberof Row
      * @name toJSON
      *
      * @param {JSONOptions} [options] JSON options.
      * @returns {object}
      */
    def toJSON(): Json = js.native
    def toJSON(options: JSONOptions): Json = js.native
  }
  
  /**
    * @callback PartialResultStream~rowCallback
    * @param {Row|object} row The row data.
    */
  type RowCallback = js.Function1[/* row */ Row | Json, Unit]
  
  trait RowOptions extends StObject {
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var jsonOptions: js.UndefOr[JSONOptions] = js.undefined
    
    var maxResumeRetries: js.UndefOr[Double] = js.undefined
  }
  object RowOptions {
    
    inline def apply(): RowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowOptions] (val x: Self) extends AnyVal {
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonOptions(value: JSONOptions): Self = StObject.set(x, "jsonOptions", value.asInstanceOf[js.Any])
      
      inline def setJsonOptionsUndefined: Self = StObject.set(x, "jsonOptions", js.undefined)
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMaxResumeRetries(value: Double): Self = StObject.set(x, "maxResumeRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxResumeRetriesUndefined: Self = StObject.set(x, "maxResumeRetries", js.undefined)
    }
  }
  
  /**
    * @callback PartialResultStream~statsCallback
    * @param {object} stats The result stats.
    */
  type StatsCallback = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ResultSetStats */ /* stats */ Any, 
    Unit
  ]
}
