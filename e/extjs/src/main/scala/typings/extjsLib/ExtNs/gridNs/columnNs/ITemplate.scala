package typings
package extjsLib.ExtNs.gridNs.columnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITemplate extends IColumn {
  /** [Method] When defined this will take precedence over the renderer config
  		* @param value Object
  		* @param meta Object
  		* @param record Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_ITemplate: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

