package typings.domHelpers

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCanUseDOMMod extends Shortcut {
  
  @JSImport("dom-helpers/cjs/canUseDOM", JSImport.Default)
  @js.native
  val default: Boolean = js.native
  
  type _To = Boolean
  
  /* This means you don't have to write `default`, but can instead just say `cjsCanUseDOMMod.foo` */
  override def _to: Boolean = default
}
