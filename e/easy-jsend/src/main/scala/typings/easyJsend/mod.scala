package typings.easyJsend

import typings.easyJsend.anon.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-jsend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  @scala.inline
  def init(conf: Partial): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(conf.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
