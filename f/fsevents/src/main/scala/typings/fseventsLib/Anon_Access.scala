package typings
package fseventsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Access extends js.Object {
  var access: scala.Boolean
  var finder: scala.Boolean
  var inode: scala.Boolean
  var xattrs: scala.Boolean
}

object Anon_Access {
  @scala.inline
  def apply(access: scala.Boolean, finder: scala.Boolean, inode: scala.Boolean, xattrs: scala.Boolean): Anon_Access = {
    val __obj = js.Dynamic.literal(access = access, finder = finder, inode = inode, xattrs = xattrs)
  
    __obj.asInstanceOf[Anon_Access]
  }
}

