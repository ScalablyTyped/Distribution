package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a bookmark in the document.
  */
@js.native
trait Bookmark extends StObject {
  
  /**
    * Gets the text buffer interval occupied by the current bookmark element.
    */
  val interval: Interval = js.native
  
  /**
    * Gets the bookmark's length.
    */
  val length: Double = js.native
  
  /**
    * Gets the name of a bookmark in the document.
    */
  val name: String = js.native
  
  /**
    * Gets the bookmark's start position in a document.
    */
  val start: Double = js.native
}
object Bookmark {
  
  @scala.inline
  def apply(interval: Interval, length: Double, name: String, start: Double): Bookmark = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookmark]
  }
  
  @scala.inline
  implicit class BookmarkMutableBuilder[Self <: Bookmark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
