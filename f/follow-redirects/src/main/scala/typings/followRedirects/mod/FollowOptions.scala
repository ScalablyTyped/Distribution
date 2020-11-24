package typings.followRedirects.mod

import typings.followRedirects.anon.Http
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowOptions[Options] extends js.Object {
  
  var agents: js.UndefOr[Http] = js.native
  
  var beforeRedirect: js.UndefOr[
    js.Function2[
      /* options */ Options with FollowOptions[Options], 
      /* responseDetails */ ResponseDetails, 
      Unit
    ]
  ] = js.native
  
  var followRedirects: js.UndefOr[Boolean] = js.native
  
  var maxBodyLength: js.UndefOr[Double] = js.native
  
  var maxRedirects: js.UndefOr[Double] = js.native
  
  var trackRedirects: js.UndefOr[Boolean] = js.native
}
object FollowOptions {
  
  @scala.inline
  def apply[Options](): FollowOptions[Options] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FollowOptions[Options]]
  }
  
  @scala.inline
  implicit class FollowOptionsOps[Self <: FollowOptions[_], Options] (val x: Self with FollowOptions[Options]) extends AnyVal {
    
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
    def setAgents(value: Http): Self = this.set("agents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgents: Self = this.set("agents", js.undefined)
    
    @scala.inline
    def setBeforeRedirect(
      value: (/* options */ Options with FollowOptions[Options], /* responseDetails */ ResponseDetails) => Unit
    ): Self = this.set("beforeRedirect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeRedirect: Self = this.set("beforeRedirect", js.undefined)
    
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    
    @scala.inline
    def setMaxBodyLength(value: Double): Self = this.set("maxBodyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBodyLength: Self = this.set("maxBodyLength", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    
    @scala.inline
    def setTrackRedirects(value: Boolean): Self = this.set("trackRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackRedirects: Self = this.set("trackRedirects", js.undefined)
  }
}
