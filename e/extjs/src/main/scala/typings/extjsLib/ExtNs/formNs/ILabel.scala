package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabel
  extends extjsLib.ExtNs.IComponent {
  /** [Config Option] (String) */
  var forId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  @JSName("html")
  var html_ILabel: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Updates the label s innerHTML with the specified string
  		* @param text String The new label text
  		* @param encode Boolean False to skip HTML-encoding the text when rendering it to the label. This might be useful if you want to include tags in the label's innerHTML rather than rendering them as string literals per the default logic.
  		* @returns Ext.form.Label this
  		*/
  var setText: js.UndefOr[
    js.Function2[
      /* text */ js.UndefOr[java.lang.String], 
      /* encode */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

