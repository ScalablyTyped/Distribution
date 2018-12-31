package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBase extends IClass {
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  var callOverridden: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  var callParent: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  var callSuper: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  var getInitialConfig: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  var initConfig: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Property] (Ext.Class) */
  var self: js.UndefOr[IClass] = js.undefined
}

