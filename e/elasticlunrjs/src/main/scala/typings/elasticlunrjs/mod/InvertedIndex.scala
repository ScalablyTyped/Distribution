package typings.elasticlunrjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunrjs", "InvertedIndex")
@js.native
open class InvertedIndex () extends StObject {
  
  def addToken(token: String, tokenInfo: TokenInfo): Unit = js.native
  def addToken(token: String, tokenInfo: TokenInfo, root: InvertedIndexNode): Unit = js.native
  
  def expandToken(token: String): js.Array[String] = js.native
  def expandToken(token: String, memo: js.Array[String]): js.Array[String] = js.native
  def expandToken(token: String, memo: js.Array[String], root: InvertedIndexNode): js.Array[String] = js.native
  def expandToken(token: String, memo: Unit, root: InvertedIndexNode): js.Array[String] = js.native
  
  def getDocFreq(token: String): Double = js.native
  
  def getDocs(token: String): InvertedIndexDocs = js.native
  
  def getNode(token: String): InvertedIndexNode = js.native
  
  def getTermFrequency(token: String, docRef: String): Double = js.native
  def getTermFrequency(token: String, docRef: Double): Double = js.native
  
  def hasToken(token: String): Boolean = js.native
  
  def removeToken(token: String, ref: String): Unit = js.native
  def removeToken(token: String, ref: Double): Unit = js.native
  
  def toJSON(): SerialisedInvertedIndex = js.native
}
object InvertedIndex {
  
  @JSImport("elasticlunrjs", "InvertedIndex")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def load(serialisedData: SerialisedInvertedIndex): InvertedIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialisedData.asInstanceOf[js.Any]).asInstanceOf[InvertedIndex]
}
