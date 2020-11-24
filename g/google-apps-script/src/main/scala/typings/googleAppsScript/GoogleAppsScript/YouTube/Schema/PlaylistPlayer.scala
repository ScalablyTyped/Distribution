package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistPlayer extends js.Object {
  
  var embedHtml: js.UndefOr[String] = js.native
}
object PlaylistPlayer {
  
  @scala.inline
  def apply(): PlaylistPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistPlayer]
  }
  
  @scala.inline
  implicit class PlaylistPlayerOps[Self <: PlaylistPlayer] (val x: Self) extends AnyVal {
    
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
    def setEmbedHtml(value: String): Self = this.set("embedHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbedHtml: Self = this.set("embedHtml", js.undefined)
  }
}
