package typings.expoKeepAwake

import typings.expoKeepAwake.anon.SuppressDeactivateWarnings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-keep-awake", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-keep-awake", "ExpoKeepAwakeTag")
  @js.native
  val ExpoKeepAwakeTag: /* "ExpoKeepAwakeDefaultTag" */ String = js.native
  
  inline def activateKeepAwake(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("activateKeepAwake")().asInstanceOf[js.Promise[Unit]]
  inline def activateKeepAwake(tag: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("activateKeepAwake")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deactivateKeepAwake(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deactivateKeepAwake")().asInstanceOf[js.Promise[Unit]]
  inline def deactivateKeepAwake(tag: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deactivateKeepAwake")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def useKeepAwake(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeepAwake")().asInstanceOf[Unit]
  inline def useKeepAwake(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeepAwake")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useKeepAwake(tag: String, options: SuppressDeactivateWarnings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeepAwake")(tag.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useKeepAwake(tag: Unit, options: SuppressDeactivateWarnings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeepAwake")(tag.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
