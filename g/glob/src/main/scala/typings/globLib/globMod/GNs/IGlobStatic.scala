package typings
package globLib.globMod.GNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlobStatic
  extends nodeLib.eventsMod.EventEmitter
     with ScalablyTyped.runtime.Instantiable1[/* pattern */ java.lang.String, IGlob]
     with ScalablyTyped.runtime.Instantiable3[
      /* pattern */ java.lang.String, 
      /* options */ IOptions, 
      /* cb */ js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* matches */ js.Array[java.lang.String], 
        scala.Unit
      ], 
      IGlob
    ]
     with ScalablyTyped.runtime.Instantiable2[
      /* pattern */ java.lang.String, 
      (/* cb */ js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* matches */ js.Array[java.lang.String], 
        scala.Unit
      ]) | (/* options */ IOptions), 
      IGlob
    ]

