package typings.googleMarkerclustererplus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *      the object that a <code>calculator</code> function returns.
  *
  *      array to be used to style the cluster icon.
  *      If this value is <code>undefined</code> or <code>""</code>, <code>title</code> is set to the
  *      value of the <code>title</code> property passed to the MarkerClusterer.
  */
trait ClusterIconInfo extends StObject {
  
  var index: Double
  
  var text: java.lang.String
  
  var title: java.lang.String
}
object ClusterIconInfo {
  
  @scala.inline
  def apply(index: Double, text: java.lang.String, title: java.lang.String): ClusterIconInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIconInfo]
  }
  
  @scala.inline
  implicit class ClusterIconInfoMutableBuilder[Self <: ClusterIconInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
