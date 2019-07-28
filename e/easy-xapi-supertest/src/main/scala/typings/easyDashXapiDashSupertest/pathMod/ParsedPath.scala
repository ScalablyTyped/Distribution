package typings.easyDashXapiDashSupertest.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedPath extends js.Object {
  /**
    * The file name including extension (if any) such as 'index.html'
    */
  var base: String
  /**
    * The full directory path such as '/home/user/dir' or 'c:\path\dir'
    */
  var dir: String
  /**
    * The file extension (if any) such as '.html'
    */
  var ext: String
  /**
    * The file name without extension (if any) such as 'index'
    */
  var name: String
  /**
    * The root of the path such as '/' or 'c:\'
    */
  var root: String
}

object ParsedPath {
  @scala.inline
  def apply(base: String, dir: String, ext: String, name: String, root: String): ParsedPath = {
    val __obj = js.Dynamic.literal(base = base, dir = dir, ext = ext, name = name, root = root)
  
    __obj.asInstanceOf[ParsedPath]
  }
}

