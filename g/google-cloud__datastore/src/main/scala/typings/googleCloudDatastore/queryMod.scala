package typings.googleCloudDatastore

import typings.googleCloudDatastore.entityMod.DatastoreKey
import typings.googleCloudDatastore.googleCloudDatastoreStrings.MORE_RESULTS_AFTER_CURSOR
import typings.googleCloudDatastore.googleCloudDatastoreStrings.MORE_RESULTS_AFTER_LIMIT
import typings.googleCloudDatastore.googleCloudDatastoreStrings.NO_MORE_RESULTS
import typings.googleCloudDatastore.googleCloudDatastoreStrings.eventual
import typings.googleCloudDatastore.googleCloudDatastoreStrings.strong
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("@google-cloud/datastore/query", "Query")
  @js.native
  open class Query protected () extends StObject {
    def this(scope: String, kinds: String, namespace: String) = this()
    
    def end(cursorToken: String): this.type = js.native
    
    def filter(property: String, operator: QueryFilterOperator, value: Any): this.type = js.native
    def filter(property: String, value: Any): this.type = js.native
    
    def groupBy(properties: String): this.type = js.native
    def groupBy(properties: js.Array[String]): this.type = js.native
    
    def hasAncestor(key: DatastoreKey): this.type = js.native
    
    def limit(n: Double): this.type = js.native
    
    def offset(n: Double): this.type = js.native
    
    def order(property: String): this.type = js.native
    def order(property: String, options: OrderOptions): this.type = js.native
    
    def run(): js.Promise[QueryResult] = js.native
    def run(callback: QueryCallback): Unit = js.native
    def run(options: QueryOptions): js.Promise[QueryResult] = js.native
    def run(options: QueryOptions, callback: QueryCallback): Unit = js.native
    
    def runStream(): ReadableStream = js.native
    
    def select(properties: String): this.type = js.native
    def select(properties: js.Array[String]): this.type = js.native
    
    def start(cursorToken: String): this.type = js.native
  }
  
  type MoreResultsAfterCursor = MORE_RESULTS_AFTER_CURSOR
  
  type MoreResultsAfterLimit = MORE_RESULTS_AFTER_LIMIT
  
  type NoMoreResults = NO_MORE_RESULTS
  
  trait OrderOptions extends StObject {
    
    var descending: Boolean
  }
  object OrderOptions {
    
    inline def apply(descending: Boolean): OrderOptions = {
      val __obj = js.Dynamic.literal(descending = descending.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrderOptions]
    }
    
    extension [Self <: OrderOptions](x: Self) {
      
      inline def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryCallback = js.Function3[/* err */ js.Error, /* entities */ js.Array[js.Object], /* info */ QueryInfo, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign
    - typings.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign
    - typings.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign
    - typings.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign
    - typings.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign
  */
  trait QueryFilterOperator extends StObject
  object QueryFilterOperator {
    
    inline def Equalssign: typings.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign = "=".asInstanceOf[typings.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign]
    
    inline def Greaterthansign: typings.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign = ">".asInstanceOf[typings.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typings.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typings.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign = "<".asInstanceOf[typings.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typings.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign]
  }
  
  trait QueryInfo extends StObject {
    
    var endCursor: js.UndefOr[String] = js.undefined
    
    val moreResults: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults
  }
  object QueryInfo {
    
    inline def apply(moreResults: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults): QueryInfo = {
      val __obj = js.Dynamic.literal(moreResults = moreResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryInfo]
    }
    
    extension [Self <: QueryInfo](x: Self) {
      
      inline def setEndCursor(value: String): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
      
      inline def setEndCursorUndefined: Self = StObject.set(x, "endCursor", js.undefined)
      
      inline def setMoreResults(value: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults): Self = StObject.set(x, "moreResults", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryOptions extends StObject {
    
    var consistency: js.UndefOr[strong | eventual] = js.undefined
    
    var maxApiCalls: js.UndefOr[Double] = js.undefined
  }
  object QueryOptions {
    
    inline def apply(): QueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOptions]
    }
    
    extension [Self <: QueryOptions](x: Self) {
      
      inline def setConsistency(value: strong | eventual): Self = StObject.set(x, "consistency", value.asInstanceOf[js.Any])
      
      inline def setConsistencyUndefined: Self = StObject.set(x, "consistency", js.undefined)
      
      inline def setMaxApiCalls(value: Double): Self = StObject.set(x, "maxApiCalls", value.asInstanceOf[js.Any])
      
      inline def setMaxApiCallsUndefined: Self = StObject.set(x, "maxApiCalls", js.undefined)
    }
  }
  
  type QueryResult = js.Tuple2[js.Array[js.Object], QueryInfo]
}
