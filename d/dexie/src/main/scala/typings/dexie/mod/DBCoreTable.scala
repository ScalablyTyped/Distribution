package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreTable extends StObject {
  
  def count(req: DBCoreCountRequest): js.Promise[Double]
  
  def get(req: DBCoreGetRequest): js.Promise[Any]
  
  def getMany(req: DBCoreGetManyRequest): js.Promise[js.Array[Any]]
  
  def mutate(req: DBCoreMutateRequest): js.Promise[DBCoreMutateResponse]
  
  val name: String
  
  def openCursor(req: DBCoreOpenCursorRequest): js.Promise[DBCoreCursor | Null]
  
  def query(req: DBCoreQueryRequest): js.Promise[DBCoreQueryResponse]
  
  val schema: DBCoreTableSchema
}
object DBCoreTable {
  
  inline def apply(
    count: DBCoreCountRequest => js.Promise[Double],
    get: DBCoreGetRequest => js.Promise[Any],
    getMany: DBCoreGetManyRequest => js.Promise[js.Array[Any]],
    mutate: DBCoreMutateRequest => js.Promise[DBCoreMutateResponse],
    name: String,
    openCursor: DBCoreOpenCursorRequest => js.Promise[DBCoreCursor | Null],
    query: DBCoreQueryRequest => js.Promise[DBCoreQueryResponse],
    schema: DBCoreTableSchema
  ): DBCoreTable = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction1(count), get = js.Any.fromFunction1(get), getMany = js.Any.fromFunction1(getMany), mutate = js.Any.fromFunction1(mutate), name = name.asInstanceOf[js.Any], openCursor = js.Any.fromFunction1(openCursor), query = js.Any.fromFunction1(query), schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreTable]
  }
  
  extension [Self <: DBCoreTable](x: Self) {
    
    inline def setCount(value: DBCoreCountRequest => js.Promise[Double]): Self = StObject.set(x, "count", js.Any.fromFunction1(value))
    
    inline def setGet(value: DBCoreGetRequest => js.Promise[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetMany(value: DBCoreGetManyRequest => js.Promise[js.Array[Any]]): Self = StObject.set(x, "getMany", js.Any.fromFunction1(value))
    
    inline def setMutate(value: DBCoreMutateRequest => js.Promise[DBCoreMutateResponse]): Self = StObject.set(x, "mutate", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpenCursor(value: DBCoreOpenCursorRequest => js.Promise[DBCoreCursor | Null]): Self = StObject.set(x, "openCursor", js.Any.fromFunction1(value))
    
    inline def setQuery(value: DBCoreQueryRequest => js.Promise[DBCoreQueryResponse]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
    
    inline def setSchema(value: DBCoreTableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
