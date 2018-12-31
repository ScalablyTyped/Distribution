package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downshiftLib {
  type Callback = js.Function0[scala.Unit]
  type StateChangeFunction[Item] = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify DownshiftState<Item> */ /* state */ js.Any, 
    stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify StateChangeOptions<Item> */ js.Any
    ]
  ]
}
