package typings
package extjsLib.ExtNs.directNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IJsonProvider extends IProvider {
  /** [Method] Create an event from a response object
  		* @param response Object Response object
  		* @returns Ext.direct.Event The event
  		*/
  var createEvent: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IEvent]] = js.undefined
  /** [Method] Creates a set of events based on the XHR response
  		* @param response Object The XHR response
  		* @returns Ext.direct.Event[] An array of Ext.direct.Event
  		*/
  var createEvents: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], extjsLib.ExtNs.Array]] = js.undefined
}

