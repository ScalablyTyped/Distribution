package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidManifest
  extends /* key */ StringDictionary[js.Any] {
  
  var versionCode: Double = js.native
}
object AndroidManifest {
  
  @scala.inline
  def apply(versionCode: Double): AndroidManifest = {
    val __obj = js.Dynamic.literal(versionCode = versionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifest]
  }
  
  @scala.inline
  implicit class AndroidManifestOps[Self <: AndroidManifest] (val x: Self) extends AnyVal {
    
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
    def setVersionCode(value: Double): Self = this.set("versionCode", value.asInstanceOf[js.Any])
  }
}
