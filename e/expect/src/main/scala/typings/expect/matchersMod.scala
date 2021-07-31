package typings.expect

import org.scalablytyped.runtime.Shortcut
import typings.expect.typesMod.MatchersObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchersMod extends Shortcut {
  
  @JSImport("expect/build/matchers", JSImport.Default)
  @js.native
  val default: MatchersObject = js.native
  
  type _To = MatchersObject
  
  /* This means you don't have to write `default`, but can instead just say `matchersMod.foo` */
  override def _to: MatchersObject = default
}
