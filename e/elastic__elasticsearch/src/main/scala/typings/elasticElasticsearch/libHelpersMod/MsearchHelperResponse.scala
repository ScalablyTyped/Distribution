package typings.elasticElasticsearch.libHelpersMod

import typings.elasticElasticsearch.libApiTypesMod.AggregateName
import typings.elasticElasticsearch.libApiTypesMod.AggregationsAggregate
import typings.elasticElasticsearch.libApiTypesMod.MsearchResponse
import typings.elasticElasticsearch.libApiTypesMod.SearchResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsearchHelperResponse[TDocument] extends StObject {
  
  var body: SearchResponse[TDocument, Record[AggregateName, AggregationsAggregate]]
  
  var documents: js.Array[TDocument]
  
  var responses: MsearchResponse[Any, Record[AggregateName, AggregationsAggregate]]
  
  var status: Double
}
object MsearchHelperResponse {
  
  inline def apply[TDocument](
    body: SearchResponse[TDocument, Record[AggregateName, AggregationsAggregate]],
    documents: js.Array[TDocument],
    responses: MsearchResponse[Any, Record[AggregateName, AggregationsAggregate]],
    status: Double
  ): MsearchHelperResponse[TDocument] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsearchHelperResponse[TDocument]]
  }
  
  extension [Self <: MsearchHelperResponse[?], TDocument](x: Self & MsearchHelperResponse[TDocument]) {
    
    inline def setBody(value: SearchResponse[TDocument, Record[AggregateName, AggregationsAggregate]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDocuments(value: js.Array[TDocument]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsVarargs(value: TDocument*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setResponses(value: MsearchResponse[Any, Record[AggregateName, AggregationsAggregate]]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
