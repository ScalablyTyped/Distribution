package typings
package extjsLib.ExtNs.chartNs.seriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.chartNs.IHighlight because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined highlight, highlightCfg, highlightItem, unHighlightItem- extjsLib.ExtNs.chartNs.ILabel because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined label, onCreateLabel, onPlaceLabel */ trait ISeries
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Iterate over each of the records for this series
  		* @param fn Function The function to execute for each record.
  		* @param scope Object Scope for the fn.
  		*/
  var eachRecord: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] For a given x y point relative to the Surface find a corresponding item from this series if any
  		* @param x Number
  		* @param y Number
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain the following:
  		*/
  var getItemForPoint: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], _]
  ] = js.undefined
  /** [Method] Returns a string with the color to be used for the series legend item
  		* @param index Object
  		*/
  var getLegendColor: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Return the number of records being displayed in this series  */
  var getRecordCount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Hides all the elements in the series  */
  var hideAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var highlight: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.undefined
  /** [Method] Highlight the given series item
  		* @param item Object Info about the item; same format as returned by #getItemForPoint.
  		*/
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Determines whether the series item at the given index has been excluded i e
  		* @param index Object
  		*/
  var isExcluded: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Method] Called each time a new label is created
  		* @param storeItem Ext.data.Model The element of the store that is related to the sprite.
  		* @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
  		* @param i Number The index of the element created (i.e the first created label, second created label, etc).
  		* @param display String The label.display type. May be false if the label is hidden
  		* @returns Ext.draw.Sprite The created sprite that will draw the label.
  		*/
  var onCreateLabel: js.UndefOr[
    js.Function4[
      /* storeItem */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[scala.Double], 
      /* display */ js.UndefOr[java.lang.String], 
      extjsLib.ExtNs.drawNs.ISprite
    ]
  ] = js.undefined
  /** [Method] Called for updating the position of the label
  		* @param label Ext.draw.Sprite The sprite that draws the label.
  		* @param storeItem Ext.data.Model The element of the store that is related to the sprite.
  		* @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
  		* @param i Number The index of the element to be updated (i.e. whether it is the first, second, third from the labelGroup)
  		* @param display String The label.display type. May be false if the label is hidden
  		* @param animate Boolean A boolean value to set or unset animations for the labels.
  		* @param index Number The series index.
  		*/
  var onPlaceLabel: js.UndefOr[
    js.Function7[
      /* label */ js.UndefOr[extjsLib.ExtNs.drawNs.ISprite], 
      /* storeItem */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[scala.Double], 
      /* display */ js.UndefOr[java.lang.String], 
      /* animate */ js.UndefOr[scala.Boolean], 
      /* index */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Method] Changes the value of the title for the series
  		* @param index Number
  		* @param title String
  		*/
  var setTitle: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* title */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Array) */
  var shadowAttributes: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Shows all the elements in the series  */
  var showAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var showInLegend: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var tips: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Un highlight any existing highlights */
  var unHighlightItem: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

