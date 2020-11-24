package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/snap/comparators", JSImport.Namespace)
@js.native
object comparatorsMod extends js.Object {
  
  def NAME_COMPARATOR(left: String, right: String): Double = js.native
  
  def NAME_ONLY_COMPARATOR(left: NamedNode, right: NamedNode): Double = js.native
}
