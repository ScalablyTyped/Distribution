package typings.dojo.dijit.form

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_ComboBoxMenuMixin.html
  *
  * 
  */
@JSGlobal("dijit.form._ComboBoxMenuMixin")
@js.native
class ComboBoxMenuMixin () extends js.Object {
  /**
    * 
    */
  def buildRendering(): Unit = js.native
  /**
    * Clears the entries in the drop down list, but of course keeps the previous and next buttons.
    * 
    */
  def clearResultList(): Unit = js.native
  /**
    * Fills in the items in the drop down list
    * 
    * @param results Array of items             
    * @param options The options to the query function of the store             
    * @param labelFunc Function to produce a label in the drop down list from a dojo.data item             
    */
  def createOptions(results: js.Any, options: js.Any, labelFunc: js.Any): Unit = js.native
  /**
    * 
    */
  def getHighlightedOption(): js.Any = js.native
  /**
    * Highlight the first real item in the list (not Previous Choices).
    * 
    */
  def highlightFirstOption(): Unit = js.native
  /**
    * Highlight the last real item in the list (not More Choices).
    * 
    */
  def highlightLastOption(): Unit = js.native
  /**
    * Notifies ComboBox/FilteringSelect that user selected an option.
    * 
    * @param direction             
    */
  def onChange(direction: Double): Unit = js.native
  /**
    * 
    * @param node             
    */
  def onClick(node: HTMLElement): Unit = js.native
  /**
    * Notifies ComboBox/FilteringSelect that user clicked to advance to next/previous page.
    * 
    * @param direction             
    */
  def onPage(direction: Double): Unit = js.native
  /**
    * 
    */
  def postMixInProperties(): Unit = js.native
  /**
    * 
    */
  def selectFirstNode(): Unit = js.native
  /**
    * 
    */
  def selectLastNode(): Unit = js.native
}

