package typings.emotionCache.mod

import typings.emotionStylis.mod.Plugin
import typings.emotionStylis.mod.Prefix
import typings.emotionStylis.mod.PrefixContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var container: js.UndefOr[HTMLElement] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[Prefix] = js.native
  
  var speedy: js.UndefOr[Boolean] = js.native
  
  var stylisPlugins: js.UndefOr[Plugin | js.Array[Plugin]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ PrefixContext) => Boolean): Self = this.set("prefix", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSpeedy(value: Boolean): Self = this.set("speedy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeedy: Self = this.set("speedy", js.undefined)
    
    @scala.inline
    def setStylisPluginsVarargs(value: Plugin*): Self = this.set("stylisPlugins", js.Array(value :_*))
    
    @scala.inline
    def setStylisPlugins(value: Plugin | js.Array[Plugin]): Self = this.set("stylisPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylisPlugins: Self = this.set("stylisPlugins", js.undefined)
  }
}
