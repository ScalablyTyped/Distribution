package typings
package electronDashConfigLib.electronDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-config", JSImport.Namespace)
@js.native
class namespaced () extends ElectronConfig {
  def this(options: ElectronConfigOptions) = this()
  /* CompleteClass */
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[
    stdLib.Iterator[
      js.Tuple2[
        java.lang.String, 
        java.lang.String | scala.Double | scala.Boolean | js.Symbol | js.Object
      ]
    ]
  ] = js.native
}

