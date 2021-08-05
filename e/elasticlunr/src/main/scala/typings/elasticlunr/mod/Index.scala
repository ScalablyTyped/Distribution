package typings.elasticlunr.mod

import org.scalablytyped.runtime.TopLevel
import typings.elasticlunr.elasticlunrStrings.AND
import typings.elasticlunr.elasticlunrStrings.OR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunr", "Index")
@js.native
class Index[T] () extends StObject {
  
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
  
  var index: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
    */ typings.elasticlunr.elasticlunrStrings.Index & TopLevel[js.Any] = js.native
  
  @JSName("mergeScores")
  def mergeScores_AND(accumScores: Null, scores: SearchScores, op: AND): SearchScores = js.native
  @JSName("mergeScores")
  def mergeScores_AND(accumScores: SearchScores, scores: SearchScores, op: AND): SearchScores = js.native
  @JSName("mergeScores")
  def mergeScores_OR(accumScores: Null, scores: SearchScores, op: OR): SearchScores = js.native
  @JSName("mergeScores")
  def mergeScores_OR(accumScores: SearchScores, scores: SearchScores, op: OR): SearchScores = js.native
  
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
  
  def use(plugin: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): Unit = js.native
}
object Index {
  
  @JSImport("elasticlunr", "Index")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def load[T](serialisedData: SerialisedIndexData[T]): Index[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialisedData.asInstanceOf[js.Any]).asInstanceOf[Index[T]]
}
