package typings.expect

import typings.expect.anon.PartialMatcherState
import typings.expect.typesMod.Expect
import typings.expect.typesMod.MatcherState
import typings.expect.typesMod.MatchersObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestMatchersObjectMod {
  
  @JSImport("expect/build/jestMatchersObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expect/build/jestMatchersObject", "INTERNAL_MATCHER_FLAG")
  @js.native
  val INTERNAL_MATCHER_FLAG: js.Symbol = js.native
  
  inline def getMatchers(): MatchersObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getMatchers")().asInstanceOf[MatchersObject]
  
  inline def getState(): MatcherState = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")().asInstanceOf[MatcherState]
  
  inline def setMatchers(matchers: MatchersObject, isInternal: Boolean, expect: Expect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMatchers")(matchers.asInstanceOf[js.Any], isInternal.asInstanceOf[js.Any], expect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setState(state: PartialMatcherState): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setState")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
