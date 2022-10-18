package typings.elasticlunrjs.mod

import typings.elasticlunrjs.elasticlunrjsStrings.AND
import typings.elasticlunrjs.elasticlunrjsStrings.OR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunrjs", "Index")
@js.native
open class Index[T /* <: js.Object */] () extends StObject {
  
  def addDoc(doc: T): Unit = js.native
  def addDoc(doc: T, emitEvent: Boolean): Unit = js.native
  
  def addField(fieldName: /* keyof T */ String): Index[T] = js.native
  
  def coordNorm(scores: SearchScores, docTokens: IndexTokens, n: Double): SearchScores = js.native
  
  var documentStore: DocumentStore[T] = js.native
  
  var eventEmitter: EventEmitter = js.native
  
  def fieldSearch(queryTokens: js.Array[String], fieldName: /* keyof T */ String, config: FieldSearchConfig[T]): SearchScores = js.native
  
  def fieldSearchStats(docTokens: IndexTokens, token: String, docs: IndexDocuments[T]): Unit = js.native
  
  def getFields(): js.Array[/* keyof T */ String] = js.native
  
  def idf(term: String, field: /* keyof T */ String): Double = js.native
  
  var index: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? elasticlunrjs.elasticlunrjs.InvertedIndex} */ js.Any = js.native
  
  def mergeScores(accumScores: Null, scores: SearchScores, op: AND | OR): SearchScores = js.native
  def mergeScores(accumScores: SearchScores, scores: SearchScores, op: AND | OR): SearchScores = js.native
  
  def off(name: EventType, fn: EventHandler): Unit = js.native
  
  def on(e1: EventType, e2: EventType, e3: EventType, fn: EventHandler): Unit = js.native
  def on(e1: EventType, e2: EventType, fn: EventHandler): Unit = js.native
  def on(e1: EventType, fn: EventHandler): Unit = js.native
  
  var pipeline: Pipeline = js.native
  
  def removeDoc(doc: T): Unit = js.native
  def removeDoc(doc: T, emitEvent: Boolean): Unit = js.native
  
  def removeDocByRef(docRef: DocumentReference): Unit = js.native
  def removeDocByRef(docRef: DocumentReference, emitEvent: Boolean): Unit = js.native
  
  def saveDocument(save: Boolean): Index[T] = js.native
  
  def search(query: String): js.Array[SearchResults] = js.native
  def search(query: String, userConfig: SearchConfig[T]): js.Array[SearchResults] = js.native
  
  def setRef(refName: /* keyof T */ String): Index[T] = js.native
  
  def toJSON(): SerialisedIndexData[T] = js.native
  
  def updateDoc(doc: T): Unit = js.native
  def updateDoc(doc: T, emitEvent: Boolean): Unit = js.native
  
  def use(plugin: js.Function1[/* repeated */ Any, Any], args: Any*): Unit = js.native
}
object Index {
  
  @JSImport("elasticlunrjs", "Index")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def load[T /* <: js.Object */](serialisedData: SerialisedIndexData[T]): Index[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialisedData.asInstanceOf[js.Any]).asInstanceOf[Index[T]]
}
