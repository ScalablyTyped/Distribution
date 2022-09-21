package typings.fluentBundle

import typings.fluentBundle.astMod.ComplexPattern
import typings.fluentBundle.scopeMod.Scope
import typings.fluentBundle.typesMod.FluentValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("@fluent/bundle/esm/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveComplexPattern(scope: Scope, ptn: ComplexPattern): FluentValue = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveComplexPattern")(scope.asInstanceOf[js.Any], ptn.asInstanceOf[js.Any])).asInstanceOf[FluentValue]
}
