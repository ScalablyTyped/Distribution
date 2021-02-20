package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunr", "InvertedIndex")
@js.native
class InvertedIndex () extends StObject {
  
  def addToken(token: String, tokenInfo: TokenInfo): Unit = js.native
  def addToken(token: String, tokenInfo: TokenInfo, root: InvertedIndexNode): Unit = js.native
  
  def expandToken(token: String): js.Array[String] = js.native
  def expandToken(token: String, memo: js.UndefOr[scala.Nothing], root: InvertedIndexNode): js.Array[String] = js.native
  def expandToken(token: String, memo: js.Array[String]): js.Array[String] = js.native
  def expandToken(token: String, memo: js.Array[String], root: InvertedIndexNode): js.Array[String] = js.native
  
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
  
  /* static member */
  @JSImport("elasticlunr", "InvertedIndex.load")
  @js.native
  def load(serialisedData: SerialisedInvertedIndex): InvertedIndex = js.native
}
