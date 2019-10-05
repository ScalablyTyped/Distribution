package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultPath.html
  *
  * Defines the default Path prototype object.
  *
  */
trait defaultPath extends js.Object {
  /**
    * The path commands. See W32C SVG 1.0 specification.
    * Defaults to empty string value.
    *
    */
  var path: String
  /**
    * Specifies this object is a Path, default value 'path'.
    *
    */
  var `type`: String
}

object defaultPath {
  @scala.inline
  def apply(path: String, `type`: String): defaultPath = {
    val __obj = js.Dynamic.literal(path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[defaultPath]
  }
}

