package typings.expo.withExpoRootTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expo.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialProps
  extends /* key */ StringDictionary[js.Any] {
  var exp: Dictkey = js.native
  var shell: js.UndefOr[Boolean] = js.native
  var shellManifestUrl: js.UndefOr[String] = js.native
}

object InitialProps {
  @scala.inline
  def apply(exp: Dictkey): InitialProps = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialProps]
  }
  @scala.inline
  implicit class InitialPropsOps[Self <: InitialProps] (val x: Self) extends AnyVal {
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
    def setExp(value: Dictkey): Self = this.set("exp", value.asInstanceOf[js.Any])
    @scala.inline
    def setShell(value: Boolean): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
    @scala.inline
    def setShellManifestUrl(value: String): Self = this.set("shellManifestUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShellManifestUrl: Self = this.set("shellManifestUrl", js.undefined)
  }
  
}

