package typings.elasticElasticsearch.libHelpersMod

import typings.elasticElasticsearch.libApiTypesMod.BulkRequest
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkHelperOptions[TDocument]
  extends StObject
     with BulkRequest[Any, Any] {
  
  var concurrency: js.UndefOr[Double] = js.undefined
  
  var datasource: js.Array[TDocument] | Buffer | Readable | (AsyncIterator[TDocument, Any, Unit])
  
  var flushBytes: js.UndefOr[Double] = js.undefined
  
  var flushInterval: js.UndefOr[Double] = js.undefined
  
  def onDocument(doc: TDocument): Action
  
  var onDrop: js.UndefOr[js.Function1[/* doc */ OnDropDocument[TDocument], Unit]] = js.undefined
  
  var refreshOnCompletion: js.UndefOr[Boolean | String] = js.undefined
  
  var retries: js.UndefOr[Double] = js.undefined
  
  @JSName("wait")
  var wait_FBulkHelperOptions: js.UndefOr[Double] = js.undefined
}
object BulkHelperOptions {
  
  inline def apply[TDocument](
    datasource: js.Array[TDocument] | Buffer | Readable | (AsyncIterator[TDocument, Any, Unit]),
    onDocument: TDocument => Action
  ): BulkHelperOptions[TDocument] = {
    val __obj = js.Dynamic.literal(datasource = datasource.asInstanceOf[js.Any], onDocument = js.Any.fromFunction1(onDocument))
    __obj.asInstanceOf[BulkHelperOptions[TDocument]]
  }
  
  extension [Self <: BulkHelperOptions[?], TDocument](x: Self & BulkHelperOptions[TDocument]) {
    
    inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    
    inline def setDatasource(value: js.Array[TDocument] | Buffer | Readable | (AsyncIterator[TDocument, Any, Unit])): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
    
    inline def setDatasourceVarargs(value: TDocument*): Self = StObject.set(x, "datasource", js.Array(value*))
    
    inline def setFlushBytes(value: Double): Self = StObject.set(x, "flushBytes", value.asInstanceOf[js.Any])
    
    inline def setFlushBytesUndefined: Self = StObject.set(x, "flushBytes", js.undefined)
    
    inline def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
    
    inline def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
    
    inline def setOnDocument(value: TDocument => Action): Self = StObject.set(x, "onDocument", js.Any.fromFunction1(value))
    
    inline def setOnDrop(value: /* doc */ OnDropDocument[TDocument] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setRefreshOnCompletion(value: Boolean | String): Self = StObject.set(x, "refreshOnCompletion", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnCompletionUndefined: Self = StObject.set(x, "refreshOnCompletion", js.undefined)
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
