package typings.eslintVisitorKeys

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eslint-visitor-keys", "KEYS")
  @js.native
  val KEYS: VisitorKeys = js.native
  
  @JSImport("eslint-visitor-keys", "getKeys")
  @js.native
  def getKeys(node: js.Object): js.Array[String] = js.native
  
  @JSImport("eslint-visitor-keys", "unionWith")
  @js.native
  def unionWith(keys: VisitorKeys): VisitorKeys = js.native
  
  type VisitorKeys = StringDictionary[js.UndefOr[js.Array[String]]]
}
