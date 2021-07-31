package typings.formatIo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("format-io", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addSlashToEnd(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addSlashToEnd")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object permissions {
    
    @JSImport("format-io", "permissions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts Unix-like permissions from symbolic to numeric notation.
      * @param perm A string of Unix-like permission in symbolic notation.
      * @returns A representation of the permissions in numeric notation.
      */
    @scala.inline
    def numeric(perm: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numeric")(perm.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts Unix-like permissions from numeric to symbolic notation.
      * @param perm A string of Unix-like permission in numeric notation.
      * @returns A representation of the permissions in symbolic notation.
      */
    @scala.inline
    def symbolic(perm: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("symbolic")(perm.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @scala.inline
  def size(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(size.asInstanceOf[js.Any]).asInstanceOf[String]
}
