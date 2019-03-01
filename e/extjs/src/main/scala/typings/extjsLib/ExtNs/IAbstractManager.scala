package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractManager extends IBase {
  /** [Property] (Ext.util.HashMap) */
  var all: js.UndefOr[extjsLib.ExtNs.utilNs.IHashMap] = js.undefined
  /** [Method] Creates and returns an instance of whatever this manager manages based on the supplied type and config object
  		* @param config Object The config object
  		* @param defaultType String If no type is discovered in the config object, we fall back to this type
  		* @returns Object The instance of whatever this manager is managing
  		*/
  var create: js.UndefOr[
    js.Function2[/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String], _]
  ] = js.undefined
  /** [Method] Executes the specified function once for each item in the collection
  		* @param fn Function The function to execute.
  		* @param scope Object The scope to execute in. Defaults to this.
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Returns an item by id
  		* @param id String The id of the item
  		* @returns Object The item, undefined if not found.
  		*/
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Gets the number of items in the collection
  		* @returns Number The number of items in the collection.
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Checks if an item type is registered
  		* @param type String The mnemonic string by which the class may be looked up
  		* @returns Boolean Whether the type is registered.
  		*/
  var isRegistered: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
  		* @param id String The item id
  		* @param fn Function The callback function. Called with a single parameter, the item.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
  		*/
  var onAvailable: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Registers an item to be managed
  		* @param item Object The item to register
  		*/
  var register: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Registers a new item constructor keyed by a type key
  		* @param type String The mnemonic string by which the class may be looked up.
  		* @param cls Function The new instance class.
  		*/
  var registerType: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Unregisters an item by removing it from this manager
  		* @param item Object The item to unregister
  		*/
  var unregister: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IAbstractManager {
  @scala.inline
  def apply(
    alias: Array = null,
    all: extjsLib.ExtNs.utilNs.IHashMap = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    create: js.Function2[/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String], _] = null,
    each: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    get: js.Function1[/* id */ js.UndefOr[java.lang.String], _] = null,
    getCount: js.Function0[scala.Double] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IAbstractManager] = null,
    isRegistered: js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    mixins: js.Any = null,
    onAvailable: js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    register: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    registerType: js.Function2[/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    unregister: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    uses: Array = null
  ): IAbstractManager = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (all != null) __obj.updateDynamic("all")(all)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (create != null) __obj.updateDynamic("create")(create)
    if (each != null) __obj.updateDynamic("each")(each)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (get != null) __obj.updateDynamic("get")(get)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isRegistered != null) __obj.updateDynamic("isRegistered")(isRegistered)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (onAvailable != null) __obj.updateDynamic("onAvailable")(onAvailable)
    if (register != null) __obj.updateDynamic("register")(register)
    if (registerType != null) __obj.updateDynamic("registerType")(registerType)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (unregister != null) __obj.updateDynamic("unregister")(unregister)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstractManager]
  }
}

