package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  /**
    * The text color for the video watch pages branded area.
    */
  var backgroundColor: String
  
  /**
    * An ID that uniquely identifies a playlist that displays next to the video player on the video watch page.
    */
  var featuredPlaylistId: String
  
  /**
    * The background color for the video watch pages branded area.
    */
  var textColor: String
}
object BackgroundColor {
  
  @scala.inline
  def apply(backgroundColor: String, featuredPlaylistId: String, textColor: String): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], featuredPlaylistId = featuredPlaylistId.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedPlaylistId(value: String): Self = StObject.set(x, "featuredPlaylistId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
  }
}
