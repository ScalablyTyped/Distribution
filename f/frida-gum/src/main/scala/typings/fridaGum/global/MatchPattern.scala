package typings.fridaGum.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable:no-unnecessary-class
@JSGlobal("MatchPattern")
@js.native
open class MatchPattern protected ()
  extends StObject
     with typings.fridaGum.MatchPattern {
  /**
    * Compiles a match pattern for use with e.g. `Memory.scan()`.
    *
    * @param pattern Match pattern of the form “13 37 ?? ff” to match 0x13 followed by 0x37 followed by any byte
    *                followed by 0xff, or “/Some\s*Pattern/” for matching a regular expression.
    *
    *                For more advanced matching it is also possible to specify an r2-style mask.
    *                The mask is bitwise AND-ed against both the needle and the haystack. To specify the mask append
    *                a `:` character after the needle, followed by the mask using the same syntax.
    *                For example: “13 37 13 37 : 1f ff ff f1”.
    *                For convenience it is also possible to specify nibble-level wildcards, like “?3 37 13 ?7”,
    *                which gets translated into masks behind the scenes.
    */
  def this(pattern: String) = this()
}
