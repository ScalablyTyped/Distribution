package typings
package extjsLib.ExtNs.gridNs.featureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRowBody extends IFeature {
  /** [Method] Provides additional data to the prepareData call within the grid view
  		* @param data Object The data for this particular record.
  		* @param idx Number The row index for this record.
  		* @param record Ext.data.Model The record instance
  		* @param orig Object The original result from the prepareData call to massage.
  		*/
  var getAdditionalData: js.UndefOr[
    js.Function4[
      /* data */ js.UndefOr[js.Any], 
      /* idx */ js.UndefOr[scala.Double], 
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* orig */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

