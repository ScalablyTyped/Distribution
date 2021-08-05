package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief tty 模块
  * @detail 使用方法：,```JavaScript,const tty = require('tty');,```
  */
object ttyMod {
  
  @JSImport("tty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isatty(fd: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isatty")(fd.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
