package typings.formatIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("format-io", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addSlashToEnd(path: String): String = js.native
  
  def size(size: Double): String = js.native
  
  @js.native
  object permissions extends js.Object {
    
    /**
      * Converts Unix-like permissions from symbolic to numeric notation.
      * @param perm A string of Unix-like permission in symbolic notation.
      * @returns A representation of the permissions in numeric notation.
      */
    def numeric(perm: String): String = js.native
    
    /**
      * Converts Unix-like permissions from numeric to symbolic notation.
      * @param perm A string of Unix-like permission in numeric notation.
      * @returns A representation of the permissions in symbolic notation.
      */
    def symbolic(perm: String): String = js.native
  }
}
