package typings.fluentLangneg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchesMod {
  
  @JSImport("@fluent/langneg/esm/matches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterMatches(requestedLocales: js.Array[String], availableLocales: js.Array[String], strategy: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterMatches")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
