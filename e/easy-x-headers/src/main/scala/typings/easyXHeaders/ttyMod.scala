package typings.easyXHeaders

import typings.easyXHeaders.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ttyMod {
  
  @JSImport("tty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isatty(fd: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isatty")(fd.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait ReadStream extends Socket {
    
    var isRaw: Boolean = js.native
    
    def setRawMode(mode: Boolean): Unit = js.native
  }
  
  @js.native
  trait WriteStream extends Socket {
    
    var columns: Double = js.native
    
    var rows: Double = js.native
  }
}
