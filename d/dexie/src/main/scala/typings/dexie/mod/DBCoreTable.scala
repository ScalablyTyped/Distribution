package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBCoreTable extends js.Object {
  
  def count(req: DBCoreCountRequest): js.Promise[Double] = js.native
  
  def get(req: DBCoreGetRequest): js.Promise[_] = js.native
  
  def getMany(req: DBCoreGetManyRequest): js.Promise[js.Array[_]] = js.native
  
  def mutate(req: DBCoreMutateRequest): js.Promise[DBCoreMutateResponse] = js.native
  
  val name: String = js.native
  
  def openCursor(req: DBCoreOpenCursorRequest): js.Promise[DBCoreCursor | Null] = js.native
  
  def query(req: DBCoreQueryRequest): js.Promise[DBCoreQueryResponse] = js.native
  
  val schema: DBCoreTableSchema = js.native
}
object DBCoreTable {
  
  @scala.inline
  def apply(
    count: DBCoreCountRequest => js.Promise[Double],
    get: DBCoreGetRequest => js.Promise[_],
    getMany: DBCoreGetManyRequest => js.Promise[js.Array[_]],
    mutate: DBCoreMutateRequest => js.Promise[DBCoreMutateResponse],
    name: String,
    openCursor: DBCoreOpenCursorRequest => js.Promise[DBCoreCursor | Null],
    query: DBCoreQueryRequest => js.Promise[DBCoreQueryResponse],
    schema: DBCoreTableSchema
  ): DBCoreTable = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction1(count), get = js.Any.fromFunction1(get), getMany = js.Any.fromFunction1(getMany), mutate = js.Any.fromFunction1(mutate), name = name.asInstanceOf[js.Any], openCursor = js.Any.fromFunction1(openCursor), query = js.Any.fromFunction1(query), schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreTable]
  }
  
  @scala.inline
  implicit class DBCoreTableOps[Self <: DBCoreTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: DBCoreCountRequest => js.Promise[Double]): Self = this.set("count", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: DBCoreGetRequest => js.Promise[_]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMany(value: DBCoreGetManyRequest => js.Promise[js.Array[_]]): Self = this.set("getMany", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMutate(value: DBCoreMutateRequest => js.Promise[DBCoreMutateResponse]): Self = this.set("mutate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenCursor(value: DBCoreOpenCursorRequest => js.Promise[DBCoreCursor | Null]): Self = this.set("openCursor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuery(value: DBCoreQueryRequest => js.Promise[DBCoreQueryResponse]): Self = this.set("query", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSchema(value: DBCoreTableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
}
