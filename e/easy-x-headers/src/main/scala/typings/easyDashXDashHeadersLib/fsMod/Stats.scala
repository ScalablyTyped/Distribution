package typings
package easyDashXDashHeadersLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var atime: stdLib.Date
  var blksize: scala.Double
  var blocks: scala.Double
  var ctime: stdLib.Date
  var dev: scala.Double
  var gid: scala.Double
  var ino: scala.Double
  var mode: scala.Double
  var mtime: stdLib.Date
  var nlink: scala.Double
  var rdev: scala.Double
  var size: scala.Double
  var uid: scala.Double
  def isBlockDevice(): scala.Boolean
  def isCharacterDevice(): scala.Boolean
  def isDirectory(): scala.Boolean
  def isFIFO(): scala.Boolean
  def isFile(): scala.Boolean
  def isSocket(): scala.Boolean
  def isSymbolicLink(): scala.Boolean
}

object Stats {
  @scala.inline
  def apply(
    atime: stdLib.Date,
    blksize: scala.Double,
    blocks: scala.Double,
    ctime: stdLib.Date,
    dev: scala.Double,
    gid: scala.Double,
    ino: scala.Double,
    isBlockDevice: js.Function0[scala.Boolean],
    isCharacterDevice: js.Function0[scala.Boolean],
    isDirectory: js.Function0[scala.Boolean],
    isFIFO: js.Function0[scala.Boolean],
    isFile: js.Function0[scala.Boolean],
    isSocket: js.Function0[scala.Boolean],
    isSymbolicLink: js.Function0[scala.Boolean],
    mode: scala.Double,
    mtime: stdLib.Date,
    nlink: scala.Double,
    rdev: scala.Double,
    size: scala.Double,
    uid: scala.Double
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime, blksize = blksize, blocks = blocks, ctime = ctime, dev = dev, gid = gid, ino = ino, isBlockDevice = isBlockDevice, isCharacterDevice = isCharacterDevice, isDirectory = isDirectory, isFIFO = isFIFO, isFile = isFile, isSocket = isSocket, isSymbolicLink = isSymbolicLink, mode = mode, mtime = mtime, nlink = nlink, rdev = rdev, size = size, uid = uid)
  
    __obj.asInstanceOf[Stats]
  }
}

