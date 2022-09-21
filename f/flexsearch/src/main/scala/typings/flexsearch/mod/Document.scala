package typings.flexsearch.mod

import typings.flexsearch.anon.PartialDocumentSearchOpti
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flexsearch", "Document")
@js.native
open class Document[T, Store /* <: StoreOption */] protected () extends StObject {
  def this(options: IndexOptionsForDocumentSearch[T, Store]) = this()
  def this(options: IndexOptionsForDocumentSearch[T, Store], typeHack: T) = this()
  
  def add(document: T): this.type = js.native
  def add(id: Id, document: T): this.type = js.native
  
  // Async Methods
  def addAsync(id: Id, document: T): js.Promise[this.type] = js.native
  def addAsync(id: Id, document: T, callback: AsyncCallback[Unit]): js.Promise[this.type] = js.native
  
  def append(document: T): this.type = js.native
  def append(id: Id, document: T): this.type = js.native
  
  def appendAsync(id: Id, document: T): js.Promise[this.type] = js.native
  def appendAsync(id: Id, document: T, callback: AsyncCallback[Unit]): js.Promise[this.type] = js.native
  
  def `export`(handler: ExportHandler[T]): js.Promise[Unit] = js.native
  
  def `import`(id: Id, document: T): js.Promise[Unit] = js.native
  
  def remove(target: Id | T): this.type = js.native
  
  def removeAsync(target: Id | T): js.Promise[this.type] = js.native
  def removeAsync(target: Id | T, callback: AsyncCallback[Unit]): js.Promise[this.type] = js.native
  
  def search(options: PartialDocumentSearchOpti): js.Array[SimpleDocumentSearchResultSetUnit] = js.native
  def search(query: String): js.Array[SimpleDocumentSearchResultSetUnit] = js.native
  def search(query: String, limit: Double): js.Array[SimpleDocumentSearchResultSetUnit] = js.native
  // https://github.com/nextapps-de/flexsearch#field-search
  def search(query: String, options: js.Array[String]): js.Array[SimpleDocumentSearchResultSetUnit] = js.native
  def search(query: String, options: PartialDocumentSearchOpti): js.Array[SimpleDocumentSearchResultSetUnit] = js.native
  def search[Enrich /* <: Boolean */](query: String, limit: Double, options: Partial[DocumentSearchOptions[Enrich]]): DocumentSearchResult[T, Store, Enrich] = js.native
  def search[Enrich /* <: Boolean */](query: String, limit: Unit, options: Partial[DocumentSearchOptions[Enrich]]): DocumentSearchResult[T, Store, Enrich] = js.native
  
  def searchAsync(query: String): js.Promise[js.Array[SimpleDocumentSearchResultSetUnit]] = js.native
  def searchAsync(query: String, limit: Double): js.Promise[js.Array[SimpleDocumentSearchResultSetUnit]] = js.native
  def searchAsync(query: String, limit: Double, callback: AsyncCallback[js.Array[SimpleDocumentSearchResultSetUnit]]): js.Promise[this.type] = js.native
  def searchAsync[Enrich /* <: Boolean */](options: Partial[DocumentSearchOptions[Enrich]]): js.Promise[DocumentSearchResult[T, Store, Enrich]] = js.native
  def searchAsync[Enrich /* <: Boolean */](
    options: Partial[DocumentSearchOptions[Enrich]],
    callback: AsyncCallback[DocumentSearchResult[T, Store, Enrich]]
  ): js.Promise[this.type] = js.native
  def searchAsync[Enrich /* <: Boolean */](query: String, options: js.Array[String]): js.Promise[DocumentSearchResult[T, Store, Enrich]] = js.native
  def searchAsync[Enrich /* <: Boolean */](query: String, options: Partial[DocumentSearchOptions[Enrich]]): js.Promise[DocumentSearchResult[T, Store, Enrich]] = js.native
  def searchAsync[Enrich /* <: Boolean */](
    query: String,
    options: Partial[DocumentSearchOptions[Enrich]],
    callback: AsyncCallback[DocumentSearchResult[T, Store, Enrich]]
  ): js.Promise[this.type] = js.native
  
  @JSName("search")
  def search_Enrich_Boolean_DocumentSearchResult[Enrich /* <: Boolean */](query: String): DocumentSearchResult[T, Store, Enrich] = js.native
  @JSName("search")
  def search_Enrich_Boolean_DocumentSearchResult[Enrich /* <: Boolean */](query: String, limit: Double): DocumentSearchResult[T, Store, Enrich] = js.native
  
  def update(document: T): this.type = js.native
  def update(id: Id, document: T): this.type = js.native
  
  def updateAsync(id: Id, document: T): js.Promise[this.type] = js.native
  def updateAsync(id: Id, document: T, callback: AsyncCallback[Unit]): js.Promise[this.type] = js.native
}
