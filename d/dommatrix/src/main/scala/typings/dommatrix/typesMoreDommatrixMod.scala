package typings.dommatrix

import typings.dommatrix.srcDommatrixMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMoreDommatrixMod {
  
  /**
    * Creates and returns a new `DOMMatrix` compatible instance
    * with equivalent instance.
    * @class CSSMatrix
    *
    * @author thednp <https://github.com/thednp/DOMMatrix/>
    * @see https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix
    */
  @JSImport("dommatrix/types/more/dommatrix", "CSSMatrix")
  @js.native
  open class CSSMatrix protected () extends default {
    /**
      * @constructor
      * @param {any} args accepts all parameter configurations:
      * * valid CSS transform string,
      * * CSSMatrix/DOMMatrix instance,
      * * a 6/16 elements *Array*.
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any) = this()
  }
  
  /**
    * A global namespace for library version.
    * @type {string}
    */
  @JSImport("dommatrix/types/more/dommatrix", "Version")
  @js.native
  val Version: String = js.native
}
