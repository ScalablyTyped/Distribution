package typings.flexsearch.mod

import typings.flexsearch.flexsearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flexsearch", "Worker")
@js.native
open class Worker () extends StObject {
  def this(x: IndexOptions[String, `false`]) = this()
  def this(x: Preset) = this()
  
  def add(id: Id, item: String): js.Promise[this.type] = js.native
  def add(id: Id, item: String, callback: AsyncCallback[Worker]): js.Promise[this.type] = js.native
  
  // Async Methods
  def addAsync(id: Id, item: String): js.Promise[this.type] = js.native
  def addAsync(id: Id, item: String, callback: AsyncCallback[this.type]): js.Promise[this.type] = js.native
  
  def append(id: Id, item: String): js.Promise[this.type] = js.native
  def append(id: Id, item: String, callback: AsyncCallback[this.type]): js.Promise[this.type] = js.native
  
  def appendAsync(id: Id, item: String): js.Promise[this.type] = js.native
  def appendAsync(id: Id, item: String, callback: AsyncCallback[this.type]): js.Promise[this.type] = js.native
  
  def remove(target: Id): js.Promise[this.type] = js.native
  def remove(target: Id, callback: AsyncCallback[this.type]): js.Promise[this.type] = js.native
  
  def removeAsync(target: Id): js.Promise[this.type] = js.native
  def removeAsync(target: Id, callback: AsyncCallback[this.type]): js.Promise[this.type] = js.native
  
  def search(options: SearchOptions): js.Promise[IndexSearchResult] = js.native
  def search(query: String): js.Promise[IndexSearchResult] = js.native
  def search(query: String, limit: Double, options: Limit): IndexSearchResult = js.native
  def search(query: String, limit: Double, options: SearchOptions): IndexSearchResult = js.native
  def search(query: String, options: Unit, callback: AsyncCallback[IndexSearchResult]): js.Promise[IndexSearchResult] = js.native
  def search(query: String, options: Limit): js.Promise[IndexSearchResult] = js.native
  def search(query: String, options: Limit, callback: AsyncCallback[IndexSearchResult]): js.Promise[IndexSearchResult] = js.native
  def search(query: String, options: SearchOptions): js.Promise[IndexSearchResult] = js.native
  def search(query: String, options: SearchOptions, callback: AsyncCallback[IndexSearchResult]): js.Promise[IndexSearchResult] = js.native
  
  def searchAsync(options: SearchOptions): js.Promise[IndexSearchResult] = js.native
  def searchAsync(query: String): js.Promise[IndexSearchResult] = js.native
  def searchAsync(query: String, limit: Double, options: Limit): IndexSearchResult = js.native
  def searchAsync(query: String, limit: Double, options: SearchOptions): IndexSearchResult = js.native
  def searchAsync(query: String, options: Unit, callback: AsyncCallback[IndexSearchResult]): js.Promise[IndexSearchResult] = js.native
  def searchAsync(query: String, options: Limit): js.Promise[IndexSearchResult] = js.native
  def searchAsync(query: String, options: Limit, callback: AsyncCallback[IndexSearchResult]): js.Promise[IndexSearchResult] = js.native
  def searchAsync(query: String, options: SearchOptions): js.Promise[IndexSearchResult] = js.native
  def searchAsync(query: String, options: SearchOptions, callback: AsyncCallback[IndexSearchResult]): js.Promise[IndexSearchResult] = js.native
  @JSName("searchAsync")
  def searchAsync_IndexSearchResult(query: String, limit: Double): IndexSearchResult = js.native
  
  @JSName("search")
  def search_IndexSearchResult(query: String, limit: Double): IndexSearchResult = js.native
  
  def update(id: Id, item: String): js.Promise[this.type] = js.native
  def update(id: Id, item: String, callback: AsyncCallback[this.type]): js.Promise[this.type] = js.native
  
  def updateAsync(id: Id, item: String): js.Promise[this.type] = js.native
  def updateAsync(id: Id, item: String, callback: AsyncCallback[this.type]): js.Promise[this.type] = js.native
}
