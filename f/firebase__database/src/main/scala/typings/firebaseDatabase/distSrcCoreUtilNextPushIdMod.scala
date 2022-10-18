package typings.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreUtilNextPushIdMod {
  
  @JSImport("@firebase/database/dist/src/core/util/NextPushId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nextPushId(now: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nextPushId")(now.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def predecessor(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("predecessor")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def successor(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("successor")(key.asInstanceOf[js.Any]).asInstanceOf[String]
}
