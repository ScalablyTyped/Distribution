package typings.ejWebAll.global.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object device {
  
  @JSGlobal("ej.device")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")().asInstanceOf[Boolean]
  
  @scala.inline
  def isFlat(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlat")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIOS7(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS7")().asInstanceOf[Boolean]
  
  @scala.inline
  def isWindows(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindows")().asInstanceOf[Boolean]
}
