package typings
package extjsLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabel
  extends extjsLib.ExtNs.IBase {
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
}

object ILabel {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ILabel] = null,
    label: js.Any = null,
    mixins: js.Any = null,
    onCreateLabel: js.Function4[
      /* storeItem */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[scala.Double], 
      /* display */ js.UndefOr[java.lang.String], 
      extjsLib.ExtNs.drawNs.ISprite
    ] = null,
    onPlaceLabel: js.Function7[
      /* label */ js.UndefOr[extjsLib.ExtNs.drawNs.ISprite], 
      /* storeItem */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[scala.Double], 
      /* display */ js.UndefOr[java.lang.String], 
      /* animate */ js.UndefOr[scala.Boolean], 
      /* index */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): ILabel = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (label != null) __obj.updateDynamic("label")(label)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (onCreateLabel != null) __obj.updateDynamic("onCreateLabel")(onCreateLabel)
    if (onPlaceLabel != null) __obj.updateDynamic("onPlaceLabel")(onPlaceLabel)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ILabel]
  }
}

