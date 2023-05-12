package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath
import typings.firebaseFirestore.firebaseFirestoreStrings.asc
import typings.firebaseFirestore.firebaseFirestoreStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcCoreOrderByMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/order_by", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/order_by", "OrderBy")
  @js.native
  open class OrderBy protected () extends StObject {
    def this(field: FieldPath) = this()
    def this(field: FieldPath, dir: Direction) = this()
    
    val dir: Direction = js.native
    
    val field: FieldPath = js.native
  }
  
  inline def canonifyOrderBy(orderBy: OrderBy): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonifyOrderBy")(orderBy.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def orderByEquals(left: OrderBy, right: OrderBy): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("orderByEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def stringifyOrderBy(orderBy: OrderBy): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyOrderBy")(orderBy.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.asc
    - typings.firebaseFirestore.firebaseFirestoreStrings.desc
  */
  trait Direction extends StObject
  object Direction {
    
    inline def ASCENDING: asc = "asc".asInstanceOf[asc]
    
    inline def DESCENDING: desc = "desc".asInstanceOf[desc]
  }
}
