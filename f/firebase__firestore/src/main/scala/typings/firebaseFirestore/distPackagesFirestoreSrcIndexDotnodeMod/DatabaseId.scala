package typings.firebaseFirestore.distPackagesFirestoreSrcIndexDotnodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_DatabaseId")
@js.native
open class DatabaseId protected ()
  extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.DatabaseId {
  def this(projectId: String) = this()
  def this(projectId: String, database: String) = this()
}
/* static members */
object DatabaseId {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_DatabaseId")
  @js.native
  val ^ : js.Any = js.native
  
  inline def empty(): typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseId = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseId]
}
