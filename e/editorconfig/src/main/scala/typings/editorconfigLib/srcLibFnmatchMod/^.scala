package typings
package editorconfigLib.srcLibFnmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("editorconfig/src/lib/fnmatch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Minimatch: IMinimatchStatic = js.native
  def apply(target: java.lang.String, pattern: java.lang.String): scala.Boolean = js.native
  def apply(target: java.lang.String, pattern: java.lang.String, options: IOptions): scala.Boolean = js.native
  /**
    * Returns a function that tests its supplied argument, suitable for use with Array.filter
    */
  def filter(pattern: java.lang.String): js.Function3[
    /* element */ java.lang.String, 
    /* indexed */ scala.Double, 
    /* array */ js.Array[java.lang.String], 
    scala.Boolean
  ] = js.native
  def filter(pattern: java.lang.String, options: IOptions): js.Function3[
    /* element */ java.lang.String, 
    /* indexed */ scala.Double, 
    /* array */ js.Array[java.lang.String], 
    scala.Boolean
  ] = js.native
  /**
    * Make a regular expression object from the pattern.
    */
  def makeRe(pattern: java.lang.String): stdLib.RegExp = js.native
  def makeRe(pattern: java.lang.String, options: IOptions): stdLib.RegExp = js.native
  /**
    * Match against the list of files, in the style of fnmatch or glob.
    * If nothing is matched, and options.nonull is set,
    * then return a list containing the pattern itself.
    */
  def `match`(list: js.Array[java.lang.String], pattern: java.lang.String): js.Array[java.lang.String] = js.native
  def `match`(list: js.Array[java.lang.String], pattern: java.lang.String, options: IOptions): js.Array[java.lang.String] = js.native
}

