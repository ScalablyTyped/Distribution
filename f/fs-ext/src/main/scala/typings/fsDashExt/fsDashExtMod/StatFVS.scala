package typings.fsDashExt.fsDashExtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatFVS extends js.Object {
  /** Number of free blocks for unprivileged users. */
  var f_bavail: Double
  /** Number of free blocks. */
  var f_bfree: Double
  /** Size of fs in f_frsize units. */
  var f_blocks: Double
  /** File system block size. */
  var f_bsize: Double
  /** Number of free inodes for unprivileged users. */
  var f_favail: Double
  /** Number of free inodes. */
  var f_ffree: Double
  /** Number of inodes. */
  var f_files: Double
  /** Mount flags. */
  var f_flag: Double
  /** Fragment size. */
  var f_frsize: Double
  /** Filesystem ID. */
  var f_fsid: Double
  /** Maximum filename length. */
  var f_namemax: Double
}

object StatFVS {
  @scala.inline
  def apply(
    f_bavail: Double,
    f_bfree: Double,
    f_blocks: Double,
    f_bsize: Double,
    f_favail: Double,
    f_ffree: Double,
    f_files: Double,
    f_flag: Double,
    f_frsize: Double,
    f_fsid: Double,
    f_namemax: Double
  ): StatFVS = {
    val __obj = js.Dynamic.literal(f_bavail = f_bavail, f_bfree = f_bfree, f_blocks = f_blocks, f_bsize = f_bsize, f_favail = f_favail, f_ffree = f_ffree, f_files = f_files, f_flag = f_flag, f_frsize = f_frsize, f_fsid = f_fsid, f_namemax = f_namemax)
  
    __obj.asInstanceOf[StatFVS]
  }
}

