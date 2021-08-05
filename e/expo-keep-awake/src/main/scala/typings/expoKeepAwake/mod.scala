package typings.expoKeepAwake

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-keep-awake", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def activateKeepAwake(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("activateKeepAwake")().asInstanceOf[Unit]
  inline def activateKeepAwake(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("activateKeepAwake")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def deactivateKeepAwake(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deactivateKeepAwake")().asInstanceOf[Unit]
  inline def deactivateKeepAwake(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deactivateKeepAwake")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useKeepAwake(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeepAwake")().asInstanceOf[Unit]
  inline def useKeepAwake(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeepAwake")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
