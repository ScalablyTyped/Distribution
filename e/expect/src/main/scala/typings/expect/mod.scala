package typings.expect

import org.scalablytyped.runtime.Shortcut
import typings.expect.typesMod.Expect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("expect", JSImport.Namespace)
  @js.native
  val ^ : Expect = js.native
  
  type MatcherState = typings.expect.typesMod.MatcherState
  
  type Matchers[R] = typings.expect.typesMod.Matchers[R]
  
  type _To = Expect
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Expect = ^
}
