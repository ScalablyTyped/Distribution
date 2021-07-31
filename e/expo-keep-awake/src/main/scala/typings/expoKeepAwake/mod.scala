package typings.expoKeepAwake

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-keep-awake", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def activateKeepAwake(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("activateKeepAwake")().asInstanceOf[Unit]
  @scala.inline
  def activateKeepAwake(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("activateKeepAwake")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def deactivateKeepAwake(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deactivateKeepAwake")().asInstanceOf[Unit]
  @scala.inline
  def deactivateKeepAwake(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deactivateKeepAwake")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def useKeepAwake(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeepAwake")().asInstanceOf[Unit]
  @scala.inline
  def useKeepAwake(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeepAwake")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
