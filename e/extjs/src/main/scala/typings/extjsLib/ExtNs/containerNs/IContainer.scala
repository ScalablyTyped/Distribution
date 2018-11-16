package typings
package extjsLib.ExtNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IContainer extends IAbstractContainer {
  /** [Config Option] (Number/Object) */
  var anchorSize: js.UndefOr[js.Any] = js.undefined
  /** [Method] Return the immediate child Component in which the passed element is located
  		* @param el Ext.Element/HTMLElement/String The element to test (or ID of element).
  		* @param deep Boolean If true, returns the deepest descendant Component which contains the passed element.
  		* @returns Ext.Component The child item which contains the passed element.
  		*/
  var getChildByElement: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.IComponent
    ]
  ] = js.undefined
}

