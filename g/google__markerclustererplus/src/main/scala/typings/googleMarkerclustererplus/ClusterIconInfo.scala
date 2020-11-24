package typings.googleMarkerclustererplus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *      the object that a <code>calculator</code> function returns.
  *
  *      array to be used to style the cluster icon.
  *      If this value is <code>undefined</code> or <code>""</code>, <code>title</code> is set to the
  *      value of the <code>title</code> property passed to the MarkerClusterer.
  */
@js.native
trait ClusterIconInfo extends js.Object {
  
  var index: Double = js.native
  
  var text: java.lang.String = js.native
  
  var title: java.lang.String = js.native
}
object ClusterIconInfo {
  
  @scala.inline
  def apply(index: Double, text: java.lang.String, title: java.lang.String): ClusterIconInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIconInfo]
  }
  
  @scala.inline
  implicit class ClusterIconInfoOps[Self <: ClusterIconInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
