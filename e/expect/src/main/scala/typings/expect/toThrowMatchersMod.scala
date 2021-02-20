package typings.expect

import org.scalablytyped.runtime.Shortcut
import typings.expect.typesMod.MatchersObject
import typings.expect.typesMod.RawMatcherFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toThrowMatchersMod extends Shortcut {
  
  @JSImport("expect/build/toThrowMatchers", JSImport.Default)
  @js.native
  val default: MatchersObject = js.native
  
  @JSImport("expect/build/toThrowMatchers", "createMatcher")
  @js.native
  def createMatcher(matcherName: String): RawMatcherFn = js.native
  @JSImport("expect/build/toThrowMatchers", "createMatcher")
  @js.native
  def createMatcher(matcherName: String, fromPromise: Boolean): RawMatcherFn = js.native
  
  type _To = MatchersObject
  
  /* This means you don't have to write `default`, but can instead just say `toThrowMatchersMod.foo` */
  override def _to: MatchersObject = default
}
