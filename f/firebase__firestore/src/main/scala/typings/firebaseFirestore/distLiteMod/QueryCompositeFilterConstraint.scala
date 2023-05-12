package typings.firebaseFirestore.distLiteMod

import typings.firebaseFirestore.firebaseFirestoreStrings.and_
import typings.firebaseFirestore.firebaseFirestoreStrings.or_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite", "QueryCompositeFilterConstraint")
@js.native
open class QueryCompositeFilterConstraint ()
  extends StObject
     with QueryFilterConstraint {
  
  /** The type of this query constraint */
  val `type`: or_ | and_ = js.native
}
