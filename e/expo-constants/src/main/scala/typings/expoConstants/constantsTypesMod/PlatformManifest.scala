package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoConstants.anon.Scheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformManifest
  extends /* key */ StringDictionary[js.Any] {
  
  var android: js.UndefOr[AndroidManifest] = js.native
  
  var detach: js.UndefOr[Scheme] = js.native
  
  var developer: js.UndefOr[String] = js.native
  
  var hostUri: js.UndefOr[String] = js.native
  
  var ios: js.UndefOr[IOSManifest] = js.native
  
  var logUrl: js.UndefOr[String] = js.native
  
  var scheme: js.UndefOr[String] = js.native
  
  var web: js.UndefOr[WebManifest] = js.native
}
object PlatformManifest {
  
  @scala.inline
  def apply(): PlatformManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformManifest]
  }
  
  @scala.inline
  implicit class PlatformManifestOps[Self <: PlatformManifest] (val x: Self) extends AnyVal {
    
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
    def setAndroid(value: AndroidManifest): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    
    @scala.inline
    def setDetach(value: Scheme): Self = this.set("detach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetach: Self = this.set("detach", js.undefined)
    
    @scala.inline
    def setDeveloper(value: String): Self = this.set("developer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloper: Self = this.set("developer", js.undefined)
    
    @scala.inline
    def setHostUri(value: String): Self = this.set("hostUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostUri: Self = this.set("hostUri", js.undefined)
    
    @scala.inline
    def setIos(value: IOSManifest): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
    
    @scala.inline
    def setLogUrl(value: String): Self = this.set("logUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogUrl: Self = this.set("logUrl", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    
    @scala.inline
    def setWeb(value: WebManifest): Self = this.set("web", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeb: Self = this.set("web", js.undefined)
  }
}
