package typings.fsExt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatFVS extends js.Object {
  
  /** Number of free blocks for unprivileged users. */
  var f_bavail: Double = js.native
  
  /** Number of free blocks. */
  var f_bfree: Double = js.native
  
  /** Size of fs in f_frsize units. */
  var f_blocks: Double = js.native
  
  /** File system block size. */
  var f_bsize: Double = js.native
  
  /** Number of free inodes for unprivileged users. */
  var f_favail: Double = js.native
  
  /** Number of free inodes. */
  var f_ffree: Double = js.native
  
  /** Number of inodes. */
  var f_files: Double = js.native
  
  /** Mount flags. */
  var f_flag: Double = js.native
  
  /** Fragment size. */
  var f_frsize: Double = js.native
  
  /** Filesystem ID. */
  var f_fsid: Double = js.native
  
  /** Maximum filename length. */
  var f_namemax: Double = js.native
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
  
  @scala.inline
  implicit class StatFVSOps[Self <: StatFVS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setF_bavail(value: Double): Self = this.set("f_bavail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_bfree(value: Double): Self = this.set("f_bfree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_blocks(value: Double): Self = this.set("f_blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_bsize(value: Double): Self = this.set("f_bsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_favail(value: Double): Self = this.set("f_favail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_ffree(value: Double): Self = this.set("f_ffree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_files(value: Double): Self = this.set("f_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_flag(value: Double): Self = this.set("f_flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_frsize(value: Double): Self = this.set("f_frsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_fsid(value: Double): Self = this.set("f_fsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_namemax(value: Double): Self = this.set("f_namemax", value.asInstanceOf[js.Any])
  }
}
