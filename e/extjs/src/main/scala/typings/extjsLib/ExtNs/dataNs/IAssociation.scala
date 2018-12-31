package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociation
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var associatedModel: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var associatedName: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var associationKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Get a specialized reader for reading associated data
  		* @returns Ext.data.reader.Reader The reader, null if not supplied
  		*/
  var getReader: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.readerNs.IReader]] = js.undefined
  /** [Config Option] (String) */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var ownerModel: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var ownerName: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.data.reader.Reader) */
  var reader: js.UndefOr[extjsLib.ExtNs.dataNs.readerNs.IReader] = js.undefined
}

