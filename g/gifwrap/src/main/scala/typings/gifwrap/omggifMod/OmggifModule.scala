package typings.gifwrap.omggifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OmggifModule extends js.Object {
  
  var GifReader: typings.gifwrap.omggifMod.GifReader = js.native
  
  var GifWriter: typings.gifwrap.omggifMod.GifWriter = js.native
}
object OmggifModule {
  
  @scala.inline
  def apply(GifReader: GifReader, GifWriter: GifWriter): OmggifModule = {
    val __obj = js.Dynamic.literal(GifReader = GifReader.asInstanceOf[js.Any], GifWriter = GifWriter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmggifModule]
  }
  
  @scala.inline
  implicit class OmggifModuleOps[Self <: OmggifModule] (val x: Self) extends AnyVal {
    
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
    def setGifReader(value: GifReader): Self = this.set("GifReader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGifWriter(value: GifWriter): Self = this.set("GifWriter", value.asInstanceOf[js.Any])
  }
}
