package typings.eslintVisitorKeys

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eslint-visitor-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {import('./index.js').VisitorKeys} VisitorKeys
    */
  /**
    * @type {VisitorKeys}
    */
  @JSImport("eslint-visitor-keys", "KEYS")
  @js.native
  val KEYS: typings.eslintVisitorKeys.visitorKeysMod.VisitorKeys = js.native
  
  inline def getKeys(node: js.Object): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def unionWith(additionalKeys: VisitorKeys): VisitorKeys = ^.asInstanceOf[js.Dynamic].applyDynamic("unionWith")(additionalKeys.asInstanceOf[js.Any]).asInstanceOf[VisitorKeys]
  
  type VisitorKeys = StringDictionary[js.Array[String]]
}
