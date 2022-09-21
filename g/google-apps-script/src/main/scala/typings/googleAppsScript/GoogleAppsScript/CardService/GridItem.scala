package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The items users interact with within a grid widget.
  */
trait GridItem extends StObject {
  
  /**
    * Sets the identifier for the grid item. When a user clicks this grid item,
    * this ID is returned in the parent grid's on_click call back parameters.
    */
  def setIdentifier(id: String): GridItem
  
  /**
    * Sets the image for this grid item.
    */
  def setImage(image: ImageComponent): GridItem
  
  /**
    * Sets the layout of text and image for the grid item. Default is TEXT_BELOW
    */
  def setLayout(layout: GridItemLayout): GridItem
  
  /**
    * Sets the subtitle of the grid item.
    */
  def setSubtitle(subtitle: String): GridItem
  
  /**
    * Sets the horizontal alignment of the grid item. Default is START.
    */
  def setTextAlignment(alignment: HorizontalAlignment): GridItem
  
  /**
    * Sets the title text of the grid item.
    */
  def setTitle(title: String): GridItem
}
object GridItem {
  
  inline def apply(
    setIdentifier: String => GridItem,
    setImage: ImageComponent => GridItem,
    setLayout: GridItemLayout => GridItem,
    setSubtitle: String => GridItem,
    setTextAlignment: HorizontalAlignment => GridItem,
    setTitle: String => GridItem
  ): GridItem = {
    val __obj = js.Dynamic.literal(setIdentifier = js.Any.fromFunction1(setIdentifier), setImage = js.Any.fromFunction1(setImage), setLayout = js.Any.fromFunction1(setLayout), setSubtitle = js.Any.fromFunction1(setSubtitle), setTextAlignment = js.Any.fromFunction1(setTextAlignment), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[GridItem]
  }
  
  extension [Self <: GridItem](x: Self) {
    
    inline def setSetIdentifier(value: String => GridItem): Self = StObject.set(x, "setIdentifier", js.Any.fromFunction1(value))
    
    inline def setSetImage(value: ImageComponent => GridItem): Self = StObject.set(x, "setImage", js.Any.fromFunction1(value))
    
    inline def setSetLayout(value: GridItemLayout => GridItem): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
    
    inline def setSetSubtitle(value: String => GridItem): Self = StObject.set(x, "setSubtitle", js.Any.fromFunction1(value))
    
    inline def setSetTextAlignment(value: HorizontalAlignment => GridItem): Self = StObject.set(x, "setTextAlignment", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => GridItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
