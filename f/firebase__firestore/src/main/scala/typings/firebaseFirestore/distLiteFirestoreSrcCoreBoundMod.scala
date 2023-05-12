package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreOrderByMod.OrderBy
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcCoreBoundMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/bound", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/bound", "Bound")
  @js.native
  open class Bound protected () extends StObject {
    def this(position: js.Array[Value], inclusive: Boolean) = this()
    
    val inclusive: Boolean = js.native
    
    val position: js.Array[Value] = js.native
  }
  
  inline def boundEquals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boundEquals")().asInstanceOf[Boolean]
  inline def boundEquals(left: Null, right: Bound): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def boundEquals(left: Bound): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boundEquals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def boundEquals(left: Bound, right: Bound): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def boundSortsAfterDocument(bound: Bound, orderBy: js.Array[OrderBy], doc: Document): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundSortsAfterDocument")(bound.asInstanceOf[js.Any], orderBy.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def boundSortsBeforeDocument(bound: Bound, orderBy: js.Array[OrderBy], doc: Document): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundSortsBeforeDocument")(bound.asInstanceOf[js.Any], orderBy.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
