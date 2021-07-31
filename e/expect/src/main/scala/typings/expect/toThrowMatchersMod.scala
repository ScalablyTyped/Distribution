package typings.expect

import typings.expect.typesMod.MatchersObject
import typings.expect.typesMod.RawMatcherFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toThrowMatchersMod {
  
  @JSImport("expect/build/toThrowMatchers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expect/build/toThrowMatchers", JSImport.Default)
  @js.native
  val default: MatchersObject = js.native
  
  @scala.inline
  def createMatcher(matcherName: String): RawMatcherFn = ^.asInstanceOf[js.Dynamic].applyDynamic("createMatcher")(matcherName.asInstanceOf[js.Any]).asInstanceOf[RawMatcherFn]
  @scala.inline
  def createMatcher(matcherName: String, fromPromise: Boolean): RawMatcherFn = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatcher")(matcherName.asInstanceOf[js.Any], fromPromise.asInstanceOf[js.Any])).asInstanceOf[RawMatcherFn]
}
