package typings.fsevents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Access extends js.Object {
  var access: Boolean
  var finder: Boolean
  var inode: Boolean
  var xattrs: Boolean
}

object Anon_Access {
  @scala.inline
  def apply(access: Boolean, finder: Boolean, inode: Boolean, xattrs: Boolean): Anon_Access = {
    val __obj = js.Dynamic.literal(access = access, finder = finder, inode = inode, xattrs = xattrs)
  
    __obj.asInstanceOf[Anon_Access]
  }
}

