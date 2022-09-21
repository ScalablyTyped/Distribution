package typings.firebaseFirestore.distPrivateMod

import typings.firebaseFirestore.firebaseFirestoreStrings.current_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The different states of a watch target. */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.`not-current`
  - typings.firebaseFirestore.firebaseFirestoreStrings.current_
  - typings.firebaseFirestore.firebaseFirestoreStrings.rejected
*/
trait QueryTargetState extends StObject
object QueryTargetState {
  
  inline def current: current_ = "current".asInstanceOf[current_]
  
  inline def `not-current`: typings.firebaseFirestore.firebaseFirestoreStrings.`not-current` = "not-current".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`not-current`]
  
  inline def rejected: typings.firebaseFirestore.firebaseFirestoreStrings.rejected = "rejected".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.rejected]
}
