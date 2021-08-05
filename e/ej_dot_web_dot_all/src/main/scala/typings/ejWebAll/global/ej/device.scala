package typings.ejWebAll.global.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object device {
  
  @JSGlobal("ej.device")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")().asInstanceOf[Boolean]
  
  inline def isFlat(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlat")().asInstanceOf[Boolean]
  
  inline def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
  
  inline def isIOS7(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS7")().asInstanceOf[Boolean]
  
  inline def isWindows(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindows")().asInstanceOf[Boolean]
}
