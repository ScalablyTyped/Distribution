package typings.firebaseFirestore

import typings.firebaseFirestore.documentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/model/document_comparator", JSImport.Namespace)
@js.native
object documentComparatorMod extends js.Object {
  def compareByKey(doc1: Document, doc2: Document): Double = js.native
  type DocumentComparator = js.Function2[/* doc1 */ Document, /* doc2 */ Document, Double]
}

