package typings.getos.mod

import typings.getos.getosStrings.linux
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinuxOs extends Os {
  
  var codename: js.UndefOr[String] = js.native
  
  var dist: String = js.native
  
  var os: linux = js.native
  
  var release: String = js.native
}
object LinuxOs {
  
  @scala.inline
  def apply(dist: String, os: linux, release: String): LinuxOs = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxOs]
  }
  
  @scala.inline
  implicit class LinuxOsOps[Self <: LinuxOs] (val x: Self) extends AnyVal {
    
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
    def setDist(value: String): Self = this.set("dist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: linux): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodename(value: String): Self = this.set("codename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodename: Self = this.set("codename", js.undefined)
  }
}
