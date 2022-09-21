package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUuidMod {
  
  @JSImport("@firebase/util/dist/src/uuid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uuidv4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuidv4")().asInstanceOf[String]
}
