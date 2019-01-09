package typings
package easyDashXDashHeadersLib.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedPath extends js.Object {
  /**
    * The file name including extension (if any) such as 'index.html'
    */
  var base: java.lang.String
  /**
    * The full directory path such as '/home/user/dir' or 'c:\path\dir'
    */
  var dir: java.lang.String
  /**
    * The file extension (if any) such as '.html'
    */
  var ext: java.lang.String
  /**
    * The file name without extension (if any) such as 'index'
    */
  var name: java.lang.String
  /**
    * The root of the path such as '/' or 'c:\'
    */
  var root: java.lang.String
}

