package typings.flat.mod.FlatTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnflattenOptions extends js.Object {
  
  var delimiter: js.UndefOr[String] = js.native
  
  var `object`: js.UndefOr[Boolean] = js.native
  
  var overwrite: js.UndefOr[Boolean] = js.native
  
  var transformKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.native
}
object UnflattenOptions {
  
  @scala.inline
  def apply(): UnflattenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnflattenOptions]
  }
  
  @scala.inline
  implicit class UnflattenOptionsOps[Self <: UnflattenOptions] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setObject(value: Boolean): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    
    @scala.inline
    def setTransformKey(value: /* key */ String => String): Self = this.set("transformKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformKey: Self = this.set("transformKey", js.undefined)
  }
}
