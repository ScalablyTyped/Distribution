package typings.eslintVisitorKeys

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVisitorKeysMod extends Shortcut {
  
  /**
    * @typedef {import('./index.js').VisitorKeys} VisitorKeys
    */
  /**
    * @type {VisitorKeys}
    */
  @JSImport("eslint-visitor-keys/dist/visitor-keys", JSImport.Default)
  @js.native
  val default: VisitorKeys = js.native
  
  type VisitorKeys = typings.eslintVisitorKeys.mod.VisitorKeys
  
  type _To = VisitorKeys
  
  /* This means you don't have to write `default`, but can instead just say `distVisitorKeysMod.foo` */
  override def _to: VisitorKeys = default
}
