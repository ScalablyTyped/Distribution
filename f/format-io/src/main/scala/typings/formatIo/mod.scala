package typings.formatIo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("format-io", "addSlashToEnd")
  @js.native
  def addSlashToEnd(path: String): String = js.native
  
  object permissions {
    
    /**
      * Converts Unix-like permissions from symbolic to numeric notation.
      * @param perm A string of Unix-like permission in symbolic notation.
      * @returns A representation of the permissions in numeric notation.
      */
    @JSImport("format-io", "permissions.numeric")
    @js.native
    def numeric(perm: String): String = js.native
    
    /**
      * Converts Unix-like permissions from numeric to symbolic notation.
      * @param perm A string of Unix-like permission in numeric notation.
      * @returns A representation of the permissions in symbolic notation.
      */
    @JSImport("format-io", "permissions.symbolic")
    @js.native
    def symbolic(perm: String): String = js.native
  }
  
  @JSImport("format-io", "size")
  @js.native
  def size(size: Double): String = js.native
}
