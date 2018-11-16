package typings
package dvaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dva/fetch", JSImport.Namespace)
@js.native
object fetchMod
  extends ScalablyTyped.runtime.TopLevel[
      js.Function2[
        /* input */ stdLib.RequestInfo, 
        /* init */ stdLib.RequestInit, 
        stdLib.Promise[stdLib.Response]
      ]
    ]

