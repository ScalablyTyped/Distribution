package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An organized grid to display a collection of grid items.
  */
trait Grid extends StObject {
  
  /**
    * Adds a new grid item to the grid.
    */
  def addItem(gridItem: GridItem): Grid
  
  /**
    * Sets an authorization action that opens a URL to the authorization flow when the object is clicked.
    */
  def setAuthorizationAction(action: AuthorizationAction): Grid
  
  /**
    * Sets the border style applied to each grid item.
    */
  def setBorderStyle(borderStyle: BorderStyle): Grid
  
  /**
    * Sets an action that composes a draft email when the object is clicked.
    */
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Grid
  
  /**
    * The number of columns to display in the grid.
    */
  def setNumColumns(numColumns: Double): Grid
  
  /**
    * Sets an action that executes when the object is clicked.
    */
  def setOnClickAction(action: Action): Grid
  
  /**
    * Sets an action that opens a URL in a tab when the object is clicked.
    */
  def setOnClickOpenLinkAction(action: Action): Grid
  
  /**
    * Sets a URL to be opened when the object is clicked.
    */
  def setOpenLink(openLink: OpenLink): Grid
  
  /**
    * Sets the title text of the grid.
    */
  def setTitle(title: String): Grid
}
object Grid {
  
  inline def apply(
    addItem: GridItem => Grid,
    setAuthorizationAction: AuthorizationAction => Grid,
    setBorderStyle: BorderStyle => Grid,
    setComposeAction: (Action, ComposedEmailType) => Grid,
    setNumColumns: Double => Grid,
    setOnClickAction: Action => Grid,
    setOnClickOpenLinkAction: Action => Grid,
    setOpenLink: OpenLink => Grid,
    setTitle: String => Grid
  ): Grid = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setBorderStyle = js.Any.fromFunction1(setBorderStyle), setComposeAction = js.Any.fromFunction2(setComposeAction), setNumColumns = js.Any.fromFunction1(setNumColumns), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[Grid]
  }
  
  extension [Self <: Grid](x: Self) {
    
    inline def setAddItem(value: GridItem => Grid): Self = StObject.set(x, "addItem", js.Any.fromFunction1(value))
    
    inline def setSetAuthorizationAction(value: AuthorizationAction => Grid): Self = StObject.set(x, "setAuthorizationAction", js.Any.fromFunction1(value))
    
    inline def setSetBorderStyle(value: BorderStyle => Grid): Self = StObject.set(x, "setBorderStyle", js.Any.fromFunction1(value))
    
    inline def setSetComposeAction(value: (Action, ComposedEmailType) => Grid): Self = StObject.set(x, "setComposeAction", js.Any.fromFunction2(value))
    
    inline def setSetNumColumns(value: Double => Grid): Self = StObject.set(x, "setNumColumns", js.Any.fromFunction1(value))
    
    inline def setSetOnClickAction(value: Action => Grid): Self = StObject.set(x, "setOnClickAction", js.Any.fromFunction1(value))
    
    inline def setSetOnClickOpenLinkAction(value: Action => Grid): Self = StObject.set(x, "setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    
    inline def setSetOpenLink(value: OpenLink => Grid): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => Grid): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
