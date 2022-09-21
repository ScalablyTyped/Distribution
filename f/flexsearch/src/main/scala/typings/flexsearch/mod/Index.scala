package typings.flexsearch.mod

import typings.flexsearch.flexsearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flexsearch", "Index")
@js.native
open class Index () extends StObject {
  def this(x: IndexOptions[String, `false`]) = this()
  def this(x: Preset) = this()
  
  def add(id: Id, item: String): this.type = js.native
  
  // Async Methods
  def addAsync(id: Id, item: String): js.Promise[this.type] = js.native
  def addAsync(id: Id, item: String, callback: AsyncCallback[this.type]): js.Promise[this.type] = js.native
  
  def append(id: Id, item: String): this.type = js.native
  
  def appendAsync(id: Id, item: String): js.Promise[this.type] = js.native
  def appendAsync(id: Id, item: String, callback: AsyncCallback[this.type]): js.Promise[this.type] = js.native
  
  // https://github.com/nextapps-de/flexsearch#check-existence-of-already-indexed-ids
  def contain(id: Id): Boolean = js.native
  
  def `export`(handler: ExportHandler[String]): js.Promise[Unit] = js.native
  
  def `import`(id: Id, item: String): js.Promise[Unit] = js.native
  
  def remove(target: Id): this.type = js.native
  
  def removeAsync(target: Id): js.Promise[this.type] = js.native
  def removeAsync(target: Id, callback: AsyncCallback[this.type]): js.Promise[this.type] = js.native
  
  def search(options: SearchOptions): IndexSearchResult = js.native
  def search(query: String): IndexSearchResult = js.native
  def search(query: String, limit: Double, options: SearchOptions): IndexSearchResult = js.native
  def search(query: String, options: Limit): IndexSearchResult = js.native
  def search(query: String, options: SearchOptions): IndexSearchResult = js.native
  
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
  
  def update(id: Id, item: String): this.type = js.native
  
  def updateAsync(id: Id, item: String): js.Promise[this.type] = js.native
  def updateAsync(id: Id, item: String, callback: AsyncCallback[this.type]): js.Promise[this.type] = js.native
}
