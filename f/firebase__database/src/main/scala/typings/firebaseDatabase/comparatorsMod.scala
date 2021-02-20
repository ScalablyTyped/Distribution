package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comparatorsMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/comparators", "NAME_COMPARATOR")
  @js.native
  def NAME_COMPARATOR(left: String, right: String): Double = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/comparators", "NAME_ONLY_COMPARATOR")
  @js.native
  def NAME_ONLY_COMPARATOR(left: NamedNode, right: NamedNode): Double = js.native
}
