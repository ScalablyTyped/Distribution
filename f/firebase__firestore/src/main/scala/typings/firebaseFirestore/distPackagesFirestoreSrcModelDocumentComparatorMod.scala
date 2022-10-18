package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcModelDocumentComparatorMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/document_comparator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareByKey(doc1: Document, doc2: Document): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareByKey")(doc1.asInstanceOf[js.Any], doc2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type DocumentComparator = js.Function2[/* doc1 */ Document, /* doc2 */ Document, Double]
}
