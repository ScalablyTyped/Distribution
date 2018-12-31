package typings
package extjsLib.ExtNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractQuery
  extends extjsLib.ExtNs.IBase {
  /** [Method] Returns true if the passed element s match the passed simple selector e g
  		* @param el String/HTMLElement/Array An element id, element or array of elements
  		* @param selector String The simple selector to test
  		* @returns Boolean
  		*/
  var is: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[js.Any], 
      /* selector */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] Selects a group of elements
  		* @param selector String The selector/xpath query (can be a comma separated list of selectors)
  		* @param root HTMLElement/String The start of the query (defaults to document).
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  var select: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* root */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Selects a single element
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement/String The start of the query (defaults to document).
  		* @returns HTMLElement The DOM element which matched the selector.
  		*/
  var selectNode: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* root */ js.UndefOr[js.Any], 
      stdLib.HTMLElement
    ]
  ] = js.undefined
}

