package typings.firebaseFirestore

import typings.firebaseFirestore.modelDocumentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/document_comparator", JSImport.Namespace)
@js.native
object modelDocumentComparatorMod extends js.Object {
  def compareByKey(doc1: Document, doc2: Document): Double = js.native
  type DocumentComparator = js.Function2[/* doc1 */ Document, /* doc2 */ Document, Double]
}

