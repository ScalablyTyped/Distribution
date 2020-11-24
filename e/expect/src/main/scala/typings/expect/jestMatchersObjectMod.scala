package typings.expect

import typings.expect.anon.PartialMatcherState
import typings.expect.typesMod.Expect
import typings.expect.typesMod.MatcherState
import typings.expect.typesMod.MatchersObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expect/build/jestMatchersObject", JSImport.Namespace)
@js.native
object jestMatchersObjectMod extends js.Object {
  
  val INTERNAL_MATCHER_FLAG: js.Symbol = js.native
  
  def getMatchers(): MatchersObject = js.native
  
  def getState(): MatcherState = js.native
  
  def setMatchers(matchers: MatchersObject, isInternal: Boolean, expect: Expect): Unit = js.native
  
  def setState(state: PartialMatcherState): Unit = js.native
}
