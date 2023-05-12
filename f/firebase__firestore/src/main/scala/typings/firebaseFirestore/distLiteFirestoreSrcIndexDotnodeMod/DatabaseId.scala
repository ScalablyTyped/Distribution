package typings.firebaseFirestore.distLiteFirestoreSrcIndexDotnodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/index.node", "_DatabaseId")
@js.native
open class DatabaseId protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcApiMod.DatabaseId {
  def this(projectId: String) = this()
  def this(projectId: String, database: String) = this()
}
/* static members */
object DatabaseId {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/index.node", "_DatabaseId")
  @js.native
  val ^ : js.Any = js.native
  
  inline def empty(): typings.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseId = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseId]
}
