package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IProgressBar extends IComponent {
  /** [Method] Returns true if the progress bar is currently in a wait operation
  		* @returns Boolean True if waiting, else false
  		*/
  var isWaiting: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IProgressBar: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Resets the progress bar value to 0 and text to empty string
  		* @param hide Boolean True to hide the progress bar.
  		* @returns Ext.ProgressBar this
  		*/
  var reset: js.UndefOr[js.Function1[/* hide */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var textEl: js.UndefOr[js.Any] = js.undefined
  /** [Method] Updates the progress bar value and optionally its text
  		* @param value Number A floating point value between 0 and 1 (e.g., .5)
  		* @param text String The string to display in the progress text element
  		* @param animate Boolean Whether to animate the transition of the progress bar. If this value is not specified, the default for the class is used
  		* @returns Ext.ProgressBar this
  		*/
  var updateProgress: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[scala.Double], 
      /* text */ js.UndefOr[java.lang.String], 
      /* animate */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Updates the progress bar text
  		* @param text String The string to display in the progress text element
  		* @returns Ext.ProgressBar this
  		*/
  var updateText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Config Option] (Number) */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Initiates an auto updating progress bar
  		* @param config Object Configuration options
  		* @returns Ext.ProgressBar this
  		*/
  @JSName("wait")
  var wait_FIProgressBar: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.undefined
}

