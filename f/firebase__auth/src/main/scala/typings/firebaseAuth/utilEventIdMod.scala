package typings.firebaseAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilEventIdMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/core/util/event_id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateEventId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_generateEventId")().asInstanceOf[String]
  inline def generateEventId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_generateEventId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateEventId(prefix: String, digits: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_generateEventId")(prefix.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateEventId(prefix: Unit, digits: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_generateEventId")(prefix.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[String]
}
