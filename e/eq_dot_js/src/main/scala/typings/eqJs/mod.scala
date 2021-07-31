package typings.eqJs

import org.scalablytyped.runtime.Shortcut
import typings.eqJs.eq_.EqjsStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Support AMD require
object mod extends Shortcut {
  
  @JSImport("eq.js", JSImport.Namespace)
  @js.native
  val ^ : EqjsStatic = js.native
  
  type _To = EqjsStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: EqjsStatic = ^
}
