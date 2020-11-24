package typings.googleMapsReact.mod

import typings.googleMapsReact.anon.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAPI extends js.Object {
  
  val maps: Typeofmaps = js.native
}
object GoogleAPI {
  
  @scala.inline
  def apply(maps: Typeofmaps): GoogleAPI = {
    val __obj = js.Dynamic.literal(maps = maps.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAPI]
  }
  
  @scala.inline
  implicit class GoogleAPIOps[Self <: GoogleAPI] (val x: Self) extends AnyVal {
    
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
    def setMaps(value: Typeofmaps): Self = this.set("maps", value.asInstanceOf[js.Any])
  }
}
