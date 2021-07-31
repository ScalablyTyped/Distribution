package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief gui 模块
  * @detail 使用方法：,```JavaScript,var gui = require('gui');,```
  */
object guiMod {
  
  @JSImport("gui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gui", "EDGE")
  @js.native
  val EDGE: /* 11001 */ Double = js.native
  
  @JSImport("gui", "IE10")
  @js.native
  val IE10: /* 10000 */ Double = js.native
  
  @JSImport("gui", "IE11")
  @js.native
  val IE11: /* 11000 */ Double = js.native
  
  @JSImport("gui", "IE7")
  @js.native
  val IE7: /* 7000 */ Double = js.native
  
  @JSImport("gui", "IE8")
  @js.native
  val IE8: /* 8000 */ Double = js.native
  
  @JSImport("gui", "IE9")
  @js.native
  val IE9: /* 9000 */ Double = js.native
  
  @scala.inline
  def open(url: String): ClassWebView = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(url.asInstanceOf[js.Any]).asInstanceOf[ClassWebView]
  @scala.inline
  def open(url: String, opt: js.Object): ClassWebView = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(url.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ClassWebView]
  
  @scala.inline
  def setVersion(ver: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersion")(ver.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
