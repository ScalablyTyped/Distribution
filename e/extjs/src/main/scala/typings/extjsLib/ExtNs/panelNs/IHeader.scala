package typings
package extjsLib.ExtNs.panelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeader
  extends extjsLib.ExtNs.containerNs.IContainer {
  /** [Method] Add a tool to the header
  		* @param tool Object
  		*/
  var addTool: js.UndefOr[js.Function1[/* tool */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("addUIClsToElement")
  var addUIClsToElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components  */
  @JSName("afterLayout")
  var afterLayout_IHeader: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets the tools for this header
  		* @returns Ext.panel.Tool[] The tools
  		*/
  var getTools: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var isHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Set up the tools lt tool type gt link in the owning Panel
  		* @param component Object
  		* @param index Object
  		*/
  @JSName("onAdd")
  var onAdd_IHeader: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("removeUIClsFromElement")
  var removeUIClsFromElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets glyph that provides the icon image for this header
  		* @param glyph Number/String the numeric charCode or string charCode/font-family. This parameter expects a format consistent with that of glyph
  		*/
  var setGlyph: js.UndefOr[js.Function1[/* glyph */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the image path that provides the icon image for this header
  		* @param icon String The new icon path
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the CSS class that provides the icon image for this header
  		* @param cls String The new CSS class name
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the title of the header
  		* @param title String The title to be set
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var titlePosition: js.UndefOr[scala.Double] = js.undefined
}

