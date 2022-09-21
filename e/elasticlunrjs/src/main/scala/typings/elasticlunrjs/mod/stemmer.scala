package typings.elasticlunrjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stemmer {
  
  inline def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("elasticlunrjs", "stemmer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("elasticlunrjs", "stemmer.label")
  @js.native
  val label: String = js.native
}
