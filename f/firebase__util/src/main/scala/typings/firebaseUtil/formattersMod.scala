package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattersMod {
  
  @JSImport("@firebase/util/dist/src/formatters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ordinal(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinal")(i.asInstanceOf[js.Any]).asInstanceOf[String]
}
