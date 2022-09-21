package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/internal", "_DatabaseId")
@js.native
open class DatabaseId protected () extends StObject {
  def this(projectId: String) = this()
  def this(projectId: String, database: String) = this()
  
  val database: String = js.native
  
  def isDefaultDatabase: Boolean = js.native
  
  def isEqual(other: js.Object): Boolean = js.native
  
  val projectId: String = js.native
}
/* static members */
object DatabaseId {
  
  @JSImport("@firebase/firestore/dist/internal", "_DatabaseId")
  @js.native
  val ^ : js.Any = js.native
  
  inline def empty(): DatabaseId = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[DatabaseId]
}
