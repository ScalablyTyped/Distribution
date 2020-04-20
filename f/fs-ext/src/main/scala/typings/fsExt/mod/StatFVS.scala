package typings.fsExt.mod

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
    val __obj = js.Dynamic.literal(f_bavail = f_bavail.asInstanceOf[js.Any], f_bfree = f_bfree.asInstanceOf[js.Any], f_blocks = f_blocks.asInstanceOf[js.Any], f_bsize = f_bsize.asInstanceOf[js.Any], f_favail = f_favail.asInstanceOf[js.Any], f_ffree = f_ffree.asInstanceOf[js.Any], f_files = f_files.asInstanceOf[js.Any], f_flag = f_flag.asInstanceOf[js.Any], f_frsize = f_frsize.asInstanceOf[js.Any], f_fsid = f_fsid.asInstanceOf[js.Any], f_namemax = f_namemax.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatFVS]
  }
}

