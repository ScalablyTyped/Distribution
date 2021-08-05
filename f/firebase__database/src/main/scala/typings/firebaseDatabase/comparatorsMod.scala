package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comparatorsMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/comparators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NAME_COMPARATOR(left: String, right: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("NAME_COMPARATOR")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def NAME_ONLY_COMPARATOR(left: NamedNode, right: NamedNode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("NAME_ONLY_COMPARATOR")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
}
