package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimate extends IBase {
  /** [Method] Performs custom animation on this object. ... */
  var animate: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
  		* @returns Object this
  		*/
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
  		* @returns Object this
  		*/
  var syncFx: js.UndefOr[js.Function0[_]] = js.undefined
}

object IAnimate {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    animate: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: String = null,
    getActiveAnimation: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    hasActiveFx: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IAnimate = null,
    mixins: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    sequenceFx: () => _ = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stopAnimation: () => IElement = null,
    stopFx: () => IElement = null,
    syncFx: () => _ = null,
    uses: Array = null
  ): IAnimate = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getActiveAnimation != null) __obj.updateDynamic("getActiveAnimation")(js.Any.fromFunction0(getActiveAnimation))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (hasActiveFx != null) __obj.updateDynamic("hasActiveFx")(js.Any.fromFunction0(hasActiveFx))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (sequenceFx != null) __obj.updateDynamic("sequenceFx")(js.Any.fromFunction0(sequenceFx))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (stopAnimation != null) __obj.updateDynamic("stopAnimation")(js.Any.fromFunction0(stopAnimation))
    if (stopFx != null) __obj.updateDynamic("stopFx")(js.Any.fromFunction0(stopFx))
    if (syncFx != null) __obj.updateDynamic("syncFx")(js.Any.fromFunction0(syncFx))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimate]
  }
}

